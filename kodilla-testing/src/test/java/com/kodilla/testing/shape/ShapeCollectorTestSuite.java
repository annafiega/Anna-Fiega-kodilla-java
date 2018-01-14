package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Test
    public void testAddFigure (){
        Circle circle = new Circle("circle", 2.5);
        ShapeCollector shapeCollector = new ShapeCollector (circle);
        shapeCollector.addFigure(circle);
        Assert.assertEquals(1, shapeCollector.getFiguresQuantity());

    }
    @Test
    public void testRemoveFigure(){
        Circle circle = new Circle("circle", 2.5);
        ShapeCollector shapeCollector = new ShapeCollector(circle);
        shapeCollector.addFigure(circle);
        //When
        boolean result = shapeCollector.removeFigure(circle);
        //then
        Assert.assertTrue(result);
        Assert.assertEquals(0, shapeCollector.getFiguresQuantity());

    }
    @Test
    public void testGetFigure(){

        Circle circle = new Circle("circle", 2.5);
        ShapeCollector shapeCollector = new ShapeCollector(circle);
        shapeCollector.addFigure(circle);
        //when
        Shape retrievedShape;
        retrievedShape= shapeCollector.getFigure(0);
        //then
        Assert.assertEquals(shapeCollector, retrievedShape);

    }

}
