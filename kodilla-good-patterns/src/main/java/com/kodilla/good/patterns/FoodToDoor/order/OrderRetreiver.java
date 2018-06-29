package order;

import product.cart.ShoppingCart;
import supplier.Supplier;
import supplier.repository.SupplierRepository;
import supplier.repository.SuppliersFileDatabase;
import user.User;

public class OrderRetreiver {

    public Order getSampleOrder(String supplierName) {
        User user = new User("Jan", "Kowalski", "jkowalski@gmail.com");
        ShoppingCart cart = new ShoppingCart();
        SupplierRepository supplierRepository = new SuppliersFileDatabase();
        Supplier supplier = supplierRepository.getSupplier(supplierName);

        return new Order(user, cart.getSampleShoppingCart(), supplier);

    }
}
