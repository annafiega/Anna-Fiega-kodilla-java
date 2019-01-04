package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After()
    public void after() {
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        OddNumbersExterminator tester = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList();
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);


        ArrayList<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(4);
        expectedResult.add(6);
        expectedResult.add(8);


        ArrayList<Integer> actual = tester.exterminate(numbers);

        Assert.assertEquals(expectedResult, actual);


    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //given
        OddNumbersExterminator tester = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList();
        //when
        ArrayList<Integer> actual = tester.exterminate(numbers);
        //then
        Assert.assertEquals(0,actual.size());
    }
}
