package com.kodilla.testing.shape;

class Triangle implements Shape {
    String shapeName;
    double height;
    double base;

    public Triangle(String shapeName, double height, double base) {
        this.shapeName=shapeName;
        this.height=height;
        this.base=base;
    }

    public double getHeight() {
        return height;
    }

    public double getBase() {
        return base;
    }

    public String getShapeName() {
        return shapeName;

    }
    @Override
    public double getField() {
        return(height*base/2);
    }

}
