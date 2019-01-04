package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_SELECTDAY="//div[contains(@class,\"_5k_5\")]/span/span/select[1]";
    public static final String XPATH_SELECTMONTH="//div[contains(@class,\"_5k_5\")]/span/span/select[2]";
    public static final String XPATH_SELECTYEAR="//div[contains(@class,\"_5k_5\")]/span/span/select[3]";

    public static void main(String[]args){
        WebDriver driver= WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com");

        WebElement selectCombo = driver.findElement(By.xpath(XPATH_SELECTDAY));
        Select selectDay = new Select(selectCombo);
        selectDay.selectByValue("20");

        WebElement selectCombo1 = driver.findElement(By.xpath(XPATH_SELECTMONTH));
        Select selectMonth = new Select(selectCombo1);
        selectMonth.selectByValue("3");

        WebElement selectCombo2 = driver.findElement(By.xpath(XPATH_SELECTYEAR));
        Select selectYear = new Select(selectCombo2);
        selectYear.selectByValue("1986");
    }
}
