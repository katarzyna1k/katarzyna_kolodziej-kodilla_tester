package com.kodilla.abstracts.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTestSuite {
    double delta = 0.001;

    @Test
    void shouldGetArea() {
        Square square = new Square(15.5);
        double resultArea = square.getArea();
        assertEquals(240.25, resultArea, delta);
    }

    @Test
    void shouldGetPerimeter() {
        Square square = new Square(12.25);
        double resultPerimeter = square.getPerimeter();
        assertEquals(49, resultPerimeter, delta);
    }

    @Test
    void perimeterShouldBeZeroIfSideIsO() {
        Square square = new Square(0.0);
        double resultZero = square.getPerimeter();

        assertEquals(0, resultZero,delta);
    }

}