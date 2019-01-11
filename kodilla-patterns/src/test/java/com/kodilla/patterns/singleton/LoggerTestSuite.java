package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testGetLastLog(){
        //Given
        String log="test";
        String log1="mama";
        Logger.getInstance().log(log);
        Logger.getInstance().log(log1);
        String result=Logger.getInstance().getLastLog();

        //when
        //then
        Assert.assertEquals("mama",log1);
        Assert.assertEquals("test",log);
        Assert.assertEquals("mama",result);

   }
}
