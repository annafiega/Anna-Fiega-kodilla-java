package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class OrderRequest {
    public User user;
    public LocalDate orderDate;
    public Product product;

    public OrderRequest(User user, LocalDate orderDate, Product product) {
        this.user = user;
        this.orderDate = orderDate;
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public Product getProduct() {
        return product;
    }
}
