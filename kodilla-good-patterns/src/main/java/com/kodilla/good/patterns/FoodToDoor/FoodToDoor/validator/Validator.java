package com.kodilla.good.patterns.FoodToDoor.FoodToDoor.validator;


import com.kodilla.good.patterns.FoodToDoor.FoodToDoor.OrderProcessDto;

public interface Validator {

    void validateOrder(OrderProcessDto processDto);
}
