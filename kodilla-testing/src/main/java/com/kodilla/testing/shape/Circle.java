package com.kodilla.testing.shape;

import java.util.ArrayList;

class Circle extends ArrayList<String> implements Shape{
    double radius;
    double pi = 3.14;
    String shapeName;

    public Circle (String shapeName,double radius){
        this.shapeName=shapeName;
        this.radius=radius;


    }
    public double getRadious(){
        return radius;
    }

    public double getPi() {
        return pi;
    }

    public String getShapeName() {
        return shapeName;

    }
    @Override
     public double getField() {

        return radius*radius*pi;
    }
}
