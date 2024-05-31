package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calc = new Calculator(13, 8, 5, 5);

        int sumResult = calc.addition();
        assertEquals(21, sumResult);
    }

    @Test
    public void testSub() {
        Calculator calc = new Calculator(14, 5, 10, 11);
        int subResult = calc.subtraction();
        assertEquals(9, subResult);
    }

    @Test
    public void testPow() {
        Calculator calc = new Calculator(2, 2, 5.8, 2);
        double doubleResult = calc.pow();
        double delta = 0;
        assertEquals(33.64, doubleResult, delta);
    }

    @Test
    public void testPowZero() {
        Calculator calc = new Calculator(2, 2, 0, 2);
        double doubleResult = calc.pow();
        double delta = 0;
        assertEquals(0, doubleResult, delta);
    }

    @Test
    public void testPowNegative() {
        Calculator calc = new Calculator(2, 2, -125, 2);
        double doubleResult = calc.pow();
        double delta = 0;
        assertEquals(15625, doubleResult, delta);
    }

}