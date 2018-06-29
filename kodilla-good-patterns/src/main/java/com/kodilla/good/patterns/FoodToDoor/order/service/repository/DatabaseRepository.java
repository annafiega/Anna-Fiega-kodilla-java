package service.repository;


import order.Order;

public class DatabaseRepository implements Repository {

    @Override
    public void logOrder(Order order) {
        System.out.println("Loging order information to database");
    }
}
