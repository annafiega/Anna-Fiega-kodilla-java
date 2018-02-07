package com.kodilla.good.patterns.Food2Door;

import java.time.LocalDate;
import java.util.List;

public class HealthyShop implements OrderService {
    private String mail = "healthyshop@gmail.com";

    public boolean orderDelivery (final Supplier supplier, final LocalDate supplyDate,final List<Product> orderList){
        System.out.println("You placed an order with the supplier " + supplier.getName()+"\n"+""+"\n" +"You ordered the product: " );
        orderList.stream().map(n->n.getName() + "(price: "+n.getPrice()+ ", quantity: "+n.getQuantity()+", total amount: "+n.getPrice()*n.getQuantity()+" )").forEach(System.out::println);
        System.out.println( "Date of supply: " + supplyDate.toString()+"\n"+"\n" + "The order has been sent to the e-mail address "+mail);

        return true;
    }
}
