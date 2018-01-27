package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.OptionalDouble;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //given
       int[] numbers = new int[]{4, 6, 5, 5};

        //when
        OptionalDouble average = ArrayOperations.getAverage(numbers);

       //then
        Assert.assertEquals(5.0,average.orElse(-1),0);
    }
}