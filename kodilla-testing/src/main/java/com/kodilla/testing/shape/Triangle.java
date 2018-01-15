package com.kodilla.testing.shape;

class Triangle implements Shape {
    String shapeName;
    double heigh;
    double base;

    public Triangle(String shapeName, double heigh, double base) {
        this.shapeName=shapeName;
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
    @Override
    public double getField() {
        return(heigh*base/2);
    }

}
