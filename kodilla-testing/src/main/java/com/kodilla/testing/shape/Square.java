package com.kodilla.testing.shape;

public abstract class Square implements Shape{
    double a;


    public Square(double a) {
        this.a=a;

    }

    public double getA() {
        return a;
    }



    public void getShapeName() {
        System.out.println("Squaer");
    }

    public double getField(double a) {
        return a*a;
    }
}
