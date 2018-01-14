package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private String shapeName;
    private Shape shape;
    public ShapeCollector(Shape shape){
        this.shape=shape;

    }
    ArrayList<String> shapes=new ArrayList();

    public void addFigure(Shape shape){


    }
    public boolean removeFigure(Shape shape){

    }
    public ShapeCollector getFigure(int n){

        return null;
    }
    public ShapeCollector showFigures(Shape shape){
        return null;
    }
    public int getFiguresQuantity() {
        return shapes.size();
    }
}
