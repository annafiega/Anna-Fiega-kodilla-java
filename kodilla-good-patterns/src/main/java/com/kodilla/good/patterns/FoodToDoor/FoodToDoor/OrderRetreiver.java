package com.kodilla.good.patterns.FoodToDoor.FoodToDoor;

import com.kodilla.good.patterns.FoodToDoor.FoodToDoor.product.cart.ShoppingCart;
import com.kodilla.good.patterns.FoodToDoor.FoodToDoor.supplier.Supplier;
import com.kodilla.good.patterns.FoodToDoor.FoodToDoor.supplier.repository.SupplierRepository;
import com.kodilla.good.patterns.FoodToDoor.FoodToDoor.supplier.repository.SuppliersFileDatabase;
import com.kodilla.good.patterns.FoodToDoor.FoodToDoor.user.User;

public class OrderRetreiver {

    public Order getSampleOrder(String supplierName) {
        User user = new User("Jan", "Kowalski", "jkowalski@gmail.com");
        ShoppingCart cart = new ShoppingCart();
        SupplierRepository supplierRepository = new SuppliersFileDatabase();
        Supplier supplier = supplierRepository.getSupplier(supplierName);

        return new Order(user, cart.getSampleShoppingCart(), supplier);

    }
}
