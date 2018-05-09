package com.kodilla.patterns2.facade.api;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class OrderFacadeWatcher {

    private  static final Logger LOGGER= LoggerFactory.getLogger(OrderFacadeWatcher.class);

    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))"+"&& args(order, userID)")
    public  void logEvent(OrderDto order, Long userID){
        LOGGER.info("Order is processing for user "+ userID);
    }
}
