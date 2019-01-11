package com.kodilla.testing2.crudapp;

import com.kodilla.testing2.config.WebDriverConfig;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;
import java.util.stream.Collectors;

import static com.kodilla.testing2.config.WebDriverConfig.CHROME;
import static org.junit.Assert.assertTrue;

public class CrudAppTestSuite {
    private static final String BASE_URL ="https://annafiega.github.io/";
    private WebDriver driver;
    private Random generator;

    @Before
    public void initTest(){
        driver = WebDriverConfig.getDriver(CHROME);
        driver.get(BASE_URL);
        generator=new Random();

    }

    @After
    public  void cleanUpAfterTest() {
        driver.close();
    }

    public String createCrudAppTestTask() throws  InterruptedException{
        final String XPATH_TASK_NAME ="//form[contains(@action,\"createTask\")]/fieldset[1]/input";
        final String XPATH_TASK_CONTENT ="//form[contains(@action,\"createTask\")]/fieldset[2]/textarea";
        final String XPATH_ADD_BUTTON="//form[contains(@action,\"createTask\")]/fieldset[3]/button";
        String taskName="Task numbers "+ generator.nextInt(100000);
        String taskContent = taskName + " content";

        WebElement name =driver.findElement(By.xpath(XPATH_TASK_NAME));
        name.sendKeys(taskName);

        WebElement content =driver.findElement(By.xpath(XPATH_TASK_CONTENT));
        content.sendKeys(taskContent);

        WebElement addButton =driver.findElement(By.xpath(XPATH_ADD_BUTTON));
        addButton.click();
        Thread.sleep(2000);

        return taskName;
    }

    private void sendTestTaskToTrello(String taskName) throws InterruptedException{
    driver.navigate().refresh();

    while(!driver.findElement(By.xpath("//select[1]")).isDisplayed());

        driver.findElements(By.xpath("//form[@class=\"datatable__row\"]")).stream()
                .filter(anyForm -> anyForm.findElement(By.xpath(".//p[@class=\"datatable__field-value\"]"))
                .getText().equals(taskName))
                .forEach(theForm-> {WebElement selectElement=theForm.findElement(By.xpath(".//select[1]"));
                    Select select =new Select(selectElement);
                    select.selectByIndex(1);

                    WebElement buttonCreateCard = theForm.findElement(By.xpath(".//button[contains(@class, \"card-creation\")]"));
                    buttonCreateCard.click();
                });
        Thread.sleep(5000);
    }

    private boolean checkTaskExistsInTrello(String taskName) throws InterruptedException{
        final String TRELLO_URL = "https://trello.com/login";
        boolean result = false;

        WebDriver driverTrello = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driverTrello.get(TRELLO_URL);

        driverTrello.findElement(By.id("user")).sendKeys("annafiega@gmail.com");
        driverTrello.findElement(By.id("password")).sendKeys("kodillatrello1");
        driverTrello.findElement(By.id("login")).submit();

        Thread.sleep(2000);
        driverTrello.findElement(By.xpath("//a[@href=\"/annafiega/boards\"]/span/span")).click();

        Thread.sleep(2000);


        driverTrello.findElements(By.xpath("//a[@class=\"board-tile\"]")).stream()
                .filter(aHref -> aHref.findElements(By.xpath(".//span[@title=\"Kodilla Application\"]")).size()>0)
                .forEach(aHref -> aHref.click());

        Thread.sleep(2000);

        result = driverTrello.findElements(By.xpath("//span[contains(@class, \"list-card-title\")]")).stream()
                .filter(theSpan -> theSpan.getText().contains(taskName))
                .collect(Collectors.toList())
                .size() > 0;

        driverTrello.close();
        return result;
    }

    private void deleteCrudTestTask(String taskName) throws InterruptedException {
        driver.switchTo().alert().accept();

        while (!driver.findElement(By.xpath(("//select[1]"))).isDisplayed());

        driver.findElements(By.xpath("//form[@class=\"datatable__row\"]")).stream()
                .filter(anyForm -> anyForm.findElement(By.xpath(".//p[@class=\"datatable__field-value\"]")).getText().equals(taskName))
                .forEach(theForm -> {
                    WebElement deleteButton = theForm.findElement(By.xpath(".//fieldset[contains(@class, \"row-section--button-section\")]/button[4]"));
                    deleteButton.click();
                });

        Thread.sleep(2000);
    }
@Ignore
    @Test
    public void shouldCreateTrelloCard() throws InterruptedException{
        String taskName=createCrudAppTestTask();
        sendTestTaskToTrello(taskName);
        assertTrue(checkTaskExistsInTrello(taskName));
        deleteCrudTestTask(taskName);
    }
}
