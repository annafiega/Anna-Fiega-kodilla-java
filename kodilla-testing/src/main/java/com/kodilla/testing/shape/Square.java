package com.kodilla.testing.shape;

class Square implements Shape{
    double a;
    String shapeName;



    public Square(String shapeName, double a) {
        this.a=a;
        this.shapeName=shapeName;

    }

    public double getA() {
        return a;
    }



    public String getShapeName() {
       return shapeName;
    }

    public double getField(double a) {
                return a*a;
    }
}
