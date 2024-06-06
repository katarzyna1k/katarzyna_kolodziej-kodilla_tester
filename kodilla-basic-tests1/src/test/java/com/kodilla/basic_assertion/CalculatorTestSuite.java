package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calc = new Calculator(13, 8, 5, 5);
        Calculator calc2 = new Calculator(-1, 2, 6, 6);

        //int sumResult = calc.addition();
        assertEquals(21, calc.addition());//sumResult );
        assertEquals(1,calc2.addition());
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
        Calculator calc2= new Calculator(1,1,-2,2);
        Calculator calc3= new Calculator(1,1,0,2);
        //double doubleResult = calc.pow();
        double delta = 0.001;
        assertEquals(33.64, calc.pow(), delta);
        assertEquals(4,calc2.pow(),delta);
        assertEquals(0,calc3.pow(),delta);
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