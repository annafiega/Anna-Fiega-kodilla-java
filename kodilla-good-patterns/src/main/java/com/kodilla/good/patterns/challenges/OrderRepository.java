package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public interface OrderRepository {
    boolean createOrder (final User user, final LocalDate orderDate, final Product product);
}
