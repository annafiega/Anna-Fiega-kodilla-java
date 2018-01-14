package com.kodilla.testing.shape;

class Triangle implements Shape {
    String shapeName;
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

    public String getShapeName() {
        return shapeName;

    }

    public double getField(double heigh, double base) {
        return(heigh*base/2);
    }

}
