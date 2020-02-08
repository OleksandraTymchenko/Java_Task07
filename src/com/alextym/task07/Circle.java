package com.alextym.task07;

public class Circle extends Shape {
    private double radius;
    Circle(String color, double radius){
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString() +
                " radius = ...:" + radius;
    }

    @Override
    public double calcArea(){
        double square = radius*radius*Math.PI;
        return square;
    }
}
