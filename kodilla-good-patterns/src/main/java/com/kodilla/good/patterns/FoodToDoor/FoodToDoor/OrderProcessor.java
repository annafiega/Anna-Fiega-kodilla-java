package com.kodilla.good.patterns.FoodToDoor.FoodToDoor;

import com.kodilla.good.patterns.FoodToDoor.FoodToDoor.service.information.InformationService;
import com.kodilla.good.patterns.FoodToDoor.FoodToDoor.service.repository.Repository;

public class OrderProcessor {

    private Order order;
    private InformationService informationService;
    private Repository repository;

    public OrderProcessor(Order order, InformationService informationService, Repository repository) {
        this.order = order;
        this.informationService = informationService;
        this.repository = repository;
    }

    public OrderProcessDto processOrder() {
        if (order != null && order.getSupplier() != null) {
            OrderProcessDto orderResult = order.process();
            if (orderResult.isOrderOK()) {
                informationService.notifieUser(order);
                repository.logOrder(order);
            }
            return orderResult;
        }
        return new OrderProcessDto(false, order);
    }
}
