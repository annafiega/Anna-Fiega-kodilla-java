package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    ArrayList<Shape> shapes=new ArrayList<Shape>();

    public void addFigure(Shape shape){
        shapes.add(shape);

    }
    public boolean removeFigure(Shape shape){
        boolean result = false;
        if (shapes.contains(shape)){
            shapes.remove (shape);
            result = true;
        }
    return result;
    }
    public Shape getFigure(int shapeNumber){
        Shape shape = null;
        if (shapeNumber>=0 && shapeNumber <shapes.size()){
            shape = shapes.get(shapeNumber);
        }

        return shape;
    }
   public String showFigures() {
        String result ="";
       for (Shape figure : shapes){
           result+= figure.getShapeName()+"="+figure.getField()+ "/n";
       }
       return result;
   }

   public int getFiguresQuantity() {
        return shapes.size();
    }

}
