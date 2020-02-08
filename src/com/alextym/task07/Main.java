package com.alextym.task07;

public class Main {
    static void printShapes(Shape[] shapes) {
        for (Shape obj : shapes) {
            System.out.println(obj);
        }
    }

    static void calcShapesSquare(Shape[] shapes) {
        for (Shape obj : shapes) {
            System.out.println(obj);
            System.out.println("Square = " + obj.calcArea());
        }
    }

    static double calcAllShapesSquare(Shape[] shapes) {
        double Square = 0;
        for (Shape obj : shapes) {
            Square += obj.calcArea();
        }
        System.out.println("All square of shapes = " + Square);
        return Square;
    }

    static double[] calcUniqueShapesSquare(Shape[] shapes) {
        double circleSquare = 0;
        double triangleSquare = 0;
        double rectangleSquare = 0;

        for (Shape obj : shapes) {
            if (obj instanceof Rectangle) {
                rectangleSquare += obj.calcArea();
            } else if (obj instanceof Circle) {
                circleSquare += obj.calcArea();
            } else {
                triangleSquare += obj.calcArea();
            }
        }

        double[] specificSquares = {rectangleSquare, triangleSquare, circleSquare};
        for (double i : specificSquares) {
            System.out.println("Rectangles square: " + specificSquares[0] + " Triangles square: " + specificSquares[1] +
                    " Circles square: " + specificSquares[2]);
            break;
        }
        return specificSquares;
    }

    public static void main(String[] args) {
        Shape[] shapes = {new Rectangle("blue", 10, 20), new Rectangle("pink", 15, 25),
                new Rectangle("red", 30, 20), new Rectangle("white", 40, 10),
                new Circle("pink", 20), new Circle("blue", 10), new Circle("black", 30),
                new Triangle("red", 15, 20, 30), new Triangle("blue", 25, 20, 20)};

        printShapes(shapes);
        calcShapesSquare(shapes);
        calcAllShapesSquare(shapes);
        calcUniqueShapesSquare(shapes);
    }
}





