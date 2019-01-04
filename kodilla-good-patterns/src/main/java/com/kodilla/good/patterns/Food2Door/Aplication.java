package com.kodilla.good.patterns.Food2Door;

public class Aplication {
    public static void main (String [] args){
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest= orderRequestRetriever.retrive();

        OrderProcessor orderProcessor =new OrderProcessor( new ExtraFoodShop());
        orderProcessor.orderRequestProcess(orderRequest);
    }
}
