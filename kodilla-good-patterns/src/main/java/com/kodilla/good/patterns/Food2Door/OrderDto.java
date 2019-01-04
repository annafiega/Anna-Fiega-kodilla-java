package com.kodilla.good.patterns.Food2Door;

public class OrderDto {
    public Supplier supplier;
    public boolean isDelivered;

    public OrderDto(Supplier supplier, boolean isDelivered) {
        this.supplier = supplier;
        this.isDelivered = isDelivered;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public boolean isDelivered() {
        return isDelivered;
    }
}
