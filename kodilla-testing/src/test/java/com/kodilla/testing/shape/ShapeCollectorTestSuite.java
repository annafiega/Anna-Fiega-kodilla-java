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
        //given
        Circle circle = new Circle("circle", 2.5);
        ShapeCollector shapeCollector = new ShapeCollector ();
        //when
        shapeCollector.addFigure(circle);
        //then
        Assert.assertEquals(1, shapeCollector.getFiguresQuantity());

    }
    @Test
    public void testRemoveFigure(){
        //given
        Circle circle = new Circle("circle", 2.5);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(circle);
        //When
        boolean result = shapeCollector.removeFigure(circle);
        //then
        Assert.assertTrue(result);
        Assert.assertEquals(0, shapeCollector.getFiguresQuantity());

    }
    @Test
    public void testGetFigure(){
        //given
        Circle circle = new Circle("circle", 2.5);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(circle);
        //when
        Shape retrievedShape= shapeCollector.getFigure(0);
        //then
        Assert.assertEquals(circle, retrievedShape);

    }
    @Test
    public void testShowFigures(){
        //given
        Circle circle = new Circle("circle", 2);
        Square square =new Square ("square", 5);
        Triangle triangle=new Triangle ("triangle", 8, 5);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);

        String expected =("circle=12.56"+ "\n"+"square=25.0"+"\n"+"triangle=20.0"+"\n");
        //when
        String actual = shapeCollector.showFigures();
        //then
        Assert.assertEquals(expected, actual);

    }
}
