package com.kodilla.testing.shape;

public abstract class Triangle implements Shape {
    double heigh;
    double base;

    public Triangle(double heigh, double base) {
        this.heigh=heigh;
        this.base=base;
    }

    public double getHeigh() {
        return heigh;
    }

    public double getBase() {
        return base;
    }

    public void getShapeName() {
        System.out.println("Triangle");

    }

    public double getField(double heigh, double base) {
        return(heigh*base/2);
    }

}
