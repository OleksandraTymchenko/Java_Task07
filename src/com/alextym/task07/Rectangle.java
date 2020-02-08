package com.alextym.task07;

public class Rectangle extends Shape {
    private double width;
    private double height;
    Rectangle(String color, double width, double height){
        super(color);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString() +
                " width = ...:" + width +
                " height = ..." + height;
    }

    @Override
    public double calcArea(){
        double square = width * height;
        return square;
    }
}
