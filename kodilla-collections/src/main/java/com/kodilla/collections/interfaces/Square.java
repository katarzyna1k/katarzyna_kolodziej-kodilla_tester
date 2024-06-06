package com.kodilla.collections.interfaces;

public class Square implements Shape {
    private double width;

    public Square(double width) {
        this.width = width;
    }

    public double getPerimeter() {
        return width * 4;
    }

    public double getArea() {
        return width * width;
    }
}
