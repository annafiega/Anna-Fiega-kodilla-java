package com.kodilla.good.patterns.FoodToDoor.FoodToDoor.supplier.repository;

import com.kodilla.good.patterns.FoodToDoor.FoodToDoor.supplier.Supplier;

public interface SupplierRepository {
    Supplier getSupplier(String name);
}
