package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testGetLastLog(){
        //Given
        Logger.getInstance().log("zasdkokk");
        Logger.getInstance().log("aaaaaaa");

        //when
        //then
        Assert.assertEquals("aaaaaaa", Logger.getInstance().getLastLog());
   }
}
