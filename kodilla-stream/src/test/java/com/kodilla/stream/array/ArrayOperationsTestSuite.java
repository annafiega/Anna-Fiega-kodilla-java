package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.OptionalDouble;
import java.util.Random;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        OptionalDouble average = ArrayOperations.getAverage(new int[]{4, 6, 5, 5});
       //then
        Assert.assertEquals(5.0,average.orElse(-1),0);
    }
}