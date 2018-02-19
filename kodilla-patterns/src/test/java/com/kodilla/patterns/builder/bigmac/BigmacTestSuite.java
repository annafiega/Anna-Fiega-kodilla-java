package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmac(){
        //given
        Bigmac bigmac= new Bigmac.BigmacBuilder()
                .roll("standard")
                .burgers(2)
                .ingredient("salad")
                .ingredient("onion")
                .ingredient("cheese")
                .ingredient("tomato")
                .build();
        System.out.println(bigmac);
        //when
        int howManyIngredients = bigmac.getIngredients().size();
        //then
        Assert.assertEquals(4,howManyIngredients);
    }
}
