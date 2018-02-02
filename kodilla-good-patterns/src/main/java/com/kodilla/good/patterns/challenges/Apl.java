package com.kodilla.good.patterns.challenges;

public class Apl {
    public static void main (String [] args){
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest= orderRequestRetriever.retrive();

        OrderProcessor orderProcessor=new OrderProcessor(new MailService(), new ProductOrderService(), new ProductOrderRepository());
        orderProcessor.process(orderRequest);
    }
}
