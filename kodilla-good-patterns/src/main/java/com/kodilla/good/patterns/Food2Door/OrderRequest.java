package com.kodilla.good.patterns.Food2Door;

import java.time.LocalDate;
import java.util.List;

public class OrderRequest {
    public Supplier supplier;
    public LocalDate orderDate;
    List<Product> orderList;

    public OrderRequest(Supplier supplier, LocalDate orderDate, List<Product> orderList) {
        this.supplier=supplier;
        this.orderDate = orderDate;
        this.orderList=orderList;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public List<Product> getOrderList() {
        return orderList;
    }
}
