package com.kodilla.good.patterns.FoodToDoor.FoodToDoor.service.repository;


import com.kodilla.good.patterns.FoodToDoor.FoodToDoor.Order;

public class DatabaseRepository implements Repository {

    @Override
    public void logOrder(Order order) {
        System.out.println("Loging order information to database");
    }
}
