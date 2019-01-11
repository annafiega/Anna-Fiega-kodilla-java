package com.kodilla.good.patterns.FoodToDoor.FoodToDoor;

import com.kodilla.good.patterns.FoodToDoor.FoodToDoor.product.Product;
import com.kodilla.good.patterns.FoodToDoor.FoodToDoor.supplier.Supplier;
import com.kodilla.good.patterns.FoodToDoor.FoodToDoor.user.User;

import java.util.ArrayList;

public class Order {

    private User user;
    private ArrayList<Product> products;
    private Supplier supplier;

    public Order(User user, ArrayList<Product> products, Supplier supplier) {
        this.user = user;
        this.products = products;
        this.supplier = supplier;
    }

    public OrderProcessDto process(){
        return supplier.process(this);
    }

    public User getUser() {
        return user;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public Supplier getSupplier() {
        return supplier;
    }
}
