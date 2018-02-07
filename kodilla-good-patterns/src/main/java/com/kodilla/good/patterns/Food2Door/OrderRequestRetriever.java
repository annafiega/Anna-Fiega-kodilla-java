package com.kodilla.good.patterns.Food2Door;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OrderRequestRetriever {

    public OrderRequest retrive(){
        Supplier supplier=new Supplier("ExtraFoodShop");
        LocalDate orderDate= LocalDate.of(2018, 2,1);
        List<Product> orderList=new ArrayList<>();
        orderList.add(new Product("apple",10.0,3.25));
        orderList.add(new Product("eggs",100.0,1.00));
        orderList.add(new Product("milk",20.0,3.50));


        return new OrderRequest(supplier, orderDate,orderList) ;
    }
}
