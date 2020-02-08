package com.alextym.task07;

public class Shape {
    private String color;

    Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "class =...: " + this.getClass().getSimpleName() +" color = ...:" + color;
    }
    public double calcArea(){
        double i = 0.0;
        return i;
    }
}

