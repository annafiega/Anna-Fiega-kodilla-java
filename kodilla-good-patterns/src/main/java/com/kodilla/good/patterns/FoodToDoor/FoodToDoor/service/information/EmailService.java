package com.kodilla.good.patterns.FoodToDoor.FoodToDoor.service.information;


import com.kodilla.good.patterns.FoodToDoor.FoodToDoor.Order;

public class EmailService implements InformationService {

    @Override
    public void notifieUser(Order order) {
        System.out.println("Sending email to: " + order.getUser().getEmail());
    }
}
