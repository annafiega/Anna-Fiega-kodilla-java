package com.kodilla.good.patterns.Food2Door;

public class OrderProcessor {

    private OrderService orderService;

    public OrderProcessor( OrderService orderService) {
        this.orderService = orderService;
    }

    public OrderDto orderRequestProcess(final OrderRequest orderRequest){
        boolean isDelivered = orderService.orderDelivery(orderRequest.getSupplier(),orderRequest.getOrderDate(), orderRequest.getOrderList());
        if (isDelivered){
            return new OrderDto(orderRequest.getSupplier(), true);
        }else{
            return new OrderDto(orderRequest.getSupplier(), false);
        }
    }
}

