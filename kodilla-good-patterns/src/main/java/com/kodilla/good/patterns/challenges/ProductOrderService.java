package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;


public class ProductOrderService implements OrderService {

    public boolean order(final User user, final LocalDate orderDate, final Product product) {
        System.out.println("User: " + user.getName() +" "+ user.getSurname() + " ordered: " + product.getName() + ", item " + product.getQuantity() + ", the price: " + product.getPrice() + ". Order date: " + orderDate.toString());
        return true;
    }
}




