package com.kodilla.good.patterns.FoodToDoor.FoodToDoor;

import com.kodilla.good.patterns.FoodToDoor.FoodToDoor.service.information.EmailService;
import com.kodilla.good.patterns.FoodToDoor.FoodToDoor.service.repository.DatabaseRepository;
import com.kodilla.good.patterns.FoodToDoor.FoodToDoor.validator.OrderValidator;
import com.kodilla.good.patterns.FoodToDoor.FoodToDoor.validator.Validator;

import java.math.BigDecimal;

public class Food2DoorRunner {

    public static void main(String[] args) {

        OrderRetreiver orderRetreiver = new OrderRetreiver();
        Order order = orderRetreiver.getSampleOrder("ExtraFoodShop");

        OrderProcessor orderProcessor = new OrderProcessor(order,new EmailService(),new DatabaseRepository());
        OrderProcessDto orderProcessDto = orderProcessor.processOrder();

        Validator validator = new OrderValidator();
        validator.validateOrder(orderProcessDto);

    } BigDecimal number = new BigDecimal(152.6);
}
