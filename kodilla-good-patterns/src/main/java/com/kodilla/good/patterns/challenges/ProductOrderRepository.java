package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class ProductOrderRepository implements OrderRepository{
    public boolean createOrder (final User user, final LocalDate orderDate, final Product product){
        return true;
    }
}
