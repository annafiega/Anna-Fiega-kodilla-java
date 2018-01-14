package com.kodilla.testing.shape;
class Circle implements Shape{
    double radius;
    double pi;
    String shapeName;

    public Circle (String shapeName,double radius, double pi){
        this.shapeName=shapeName;
        this.radius=radius;
        this.pi=pi;

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
     double getField(double radius, double pi) {

        return radius*radius*pi;
    }
}
