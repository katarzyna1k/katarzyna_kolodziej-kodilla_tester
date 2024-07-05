package com.kodilla.abstracts.homework;

public class Application {

    public static void main(String[] args) {
        Circle circle = new Circle(2.5);
        circle.getArea();
        circle.getPerimeter();
        getShapeDetails(circle);

        Square square = new Square(15);
        square.getArea();
        square.getPerimeter();
        getShapeDetails(square);

        Rectangle rectangle = new Rectangle(18.0, 19.2);
        rectangle.getArea();
        rectangle.getPerimeter();
        getShapeDetails(rectangle);


    }

    public static void getShapeDetails(Shape shape) {
        System.out.println("THE shape of: "+shape.toString()+ " has aria: " + shape.getArea()+" perimeter: "+shape.getPerimeter());
    }
}
