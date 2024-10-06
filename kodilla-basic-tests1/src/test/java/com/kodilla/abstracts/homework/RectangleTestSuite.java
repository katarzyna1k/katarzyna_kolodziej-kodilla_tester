package com.kodilla.abstracts.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTestSuite {

    private double delta = 0.001;
    private Rectangle rectangle = new Rectangle(14.2, 8.3);

    @Test
    void shouldGetArea() {

        double resultArea = rectangle.getArea();
        assertEquals(117.86, resultArea, delta);
    }

    @Test
    void shouldGetPerimeter() {

        double resultPerimeter = rectangle.getPerimeter();
        assertEquals(45, resultPerimeter, delta);
    }

    @Test
    void areaShouldGet0IfWidthIs0() {
        Rectangle rectangle1 = new Rectangle(0, 12.0);
        double resultZero = rectangle1.getArea();

        assertEquals(0, resultZero);
    }

}