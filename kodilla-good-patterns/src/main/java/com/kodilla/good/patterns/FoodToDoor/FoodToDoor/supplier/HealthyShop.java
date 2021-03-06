package com.kodilla.good.patterns.FoodToDoor.FoodToDoor.supplier;


import com.kodilla.good.patterns.FoodToDoor.FoodToDoor.Order;
import com.kodilla.good.patterns.FoodToDoor.FoodToDoor.OrderProcessDto;
import com.kodilla.good.patterns.FoodToDoor.FoodToDoor.product.Product;

import java.util.ArrayList;

public class HealthyShop extends Supplier {

    private static final String SUPPLIER_NAME = "HealthyShop";

    public HealthyShop(ArrayList<Product> products) {
        super(SUPPLIER_NAME, products);
    }

    @Override
    public OrderProcessDto process(Order order) {
        System.out.println("Processing order in " + SUPPLIER_NAME);
        //Specific actions for supplier
        boolean orderOK = checkOrder(order);

        return new OrderProcessDto(orderOK, order);
    }
}
