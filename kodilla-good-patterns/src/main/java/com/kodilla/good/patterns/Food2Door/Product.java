package com.kodilla.good.patterns.Food2Door;

public class Product {
    private String name;
    private double quantity;
    private double price;


    public Product(String name, double quantity,double price) {
        this.name = name;
        this.quantity = quantity;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
