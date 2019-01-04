package com.kodilla.spring.calculator;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest

public class CalculatorTestSuite {
    @Test
    public void testCalculations(){
        //given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator=context.getBean(Calculator.class);
        //when
        double sumResult = calculator.add(3.0, 2.0);
        double subResult = calculator.sub(3.0, 2.0);
        double mulResult = calculator.mul(3.0, 2.0);
        double divResult = calculator.div(3.0, 2.0);

        //then
       Assert.assertEquals(5.0, sumResult,0);
       Assert.assertEquals(1.0, subResult,0);
       Assert.assertEquals(6.0, mulResult,0);
       Assert.assertEquals(1.5, divResult,0);

    }
}
