package com.kodilla.abstracts.homework;

public class Circle extends Shape {
    private static double PI = 3.14159265;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;

    }

    @Override
    public double getArea() {
        return PI * radius* radius;
    }

    @Override
    public double getPerimeter() {
        return 2*PI*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
