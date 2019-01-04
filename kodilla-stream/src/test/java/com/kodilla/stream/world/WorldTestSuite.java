package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;



public class WorldTestSuite {
    @Test

    public void testGetPeopleQuantity(){
        //given
        World earth=new World ();
        Continent europe=new Continent();
        Continent asia=new Continent();
        earth.addContinent(europe);
        earth.addContinent(asia);

        //when
        europe.addCountry(new Country("Poland",new BigDecimal(36000000)));
        europe.addCountry(new Country("Germany",new BigDecimal(1)));
        asia.addCountry(new Country("Thailand",new BigDecimal(10)));
        asia.addCountry(new Country("Nepal", new BigDecimal(100)));


        //then
        BigDecimal expected = new BigDecimal("36000111");
        Assert.assertEquals(expected, earth.getPeopleQuantity());
    }
}