package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;


public class OrderRequestRetriever {
    public OrderRequest retrive(){
        User user=new User ("Adam", "Kowalski");
        LocalDate orderDate=LocalDate.of(2018, 2,1);
        Product product=new Product ("shose", 1,150.99);
        return new OrderRequest(user, orderDate,product) ;
    }
}
