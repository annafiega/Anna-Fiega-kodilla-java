package com.kodilla.testing.shape;
public abstract class Circle implements Shape{
    double radius;
    double pi;

    public Circle (double radius, double pi){
        this.radius=radius;
        this.pi=pi;

    }
    public double getRadious(){
        return radius;
    }

    public double getPi() {
        return pi;
    }

    public void getShapeName() {
        System.out.println("Circle");

    }
     double getField(double radius, double pi) {


        return radius*radius*pi;
    }
}
