package com.kodilla.good.patterns.FoodToDoor.FoodToDoor.validator;

import com.kodilla.good.patterns.FoodToDoor.FoodToDoor.OrderProcessDto;

public class OrderValidator implements Validator {

    @Override
    public void validateOrder(OrderProcessDto processDto) {
        if (processDto.isOrderOK()) {
            System.out.println("Order finished successfully");
        } else {
            System.out.println("Order unsuccessful");
        }
    }
}
