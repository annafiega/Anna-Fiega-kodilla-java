package com.kodilla.good.patterns.Food2Door;

import java.time.LocalDate;
import java.util.List;

public interface OrderService {
    boolean orderDelivery (final Supplier supplier, final LocalDate supplyDate, final List<Product> orderList);
}
