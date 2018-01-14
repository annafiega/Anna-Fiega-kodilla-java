package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {


    ArrayList<String> shapes=new ArrayList();

    public ShapeCollector(ArrayList<String> shapes) {
        this.shapes = shapes;
    }

    public void addFigure(Shape shape){

    }
    public boolean removeFigure(Shape shape){
    return false;
    }
    public Shape getFigure(int n){

        return null;
    }
    public String showFigures(Shape shape){
        return shape.getShapeName() + shape.getField();
    }
    public int getFiguresQuantity() {
        return shapes.size();
    }
}
