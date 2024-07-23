package com.kodilla.parametrized_tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class NumberCheckerTestSuit {

    NumberChecker numberChecker = new NumberChecker();

    //1.
    @Test
    public void shouldReturnTrueIfNumberEqualsThree() {
        boolean result = numberChecker.isDivisibleByThree(3);
        assertTrue(result);
    }

    @Test
    public void shouldReturnTrueIfNumberIsMultipleOfThree() {
        boolean result = numberChecker.isDivisibleByThree(6);
        assertTrue(result);
    }

    @Test
    public void shouldReturnTrueIfNumberIsEqualsZero() {
        boolean result = numberChecker.isDivisibleByThree(0);
        assertTrue(result);
    }

    @Test
    public void shouldReturnTrueIsNumberIsNEgativeMultipleOfThree() {
        boolean result = numberChecker.isDivisibleByThree(-6);
        assertTrue(result);
    }

    @Test
    public void shouldReturnFalseIfNumberIsNotDevisibleByThree() {
        boolean result = numberChecker.isDivisibleByThree(2);
        assertFalse(result);
    }

    //2. testy parametryzowane
    @ParameterizedTest
    @ValueSource(ints = {0, 3, 6, -3, -12, 15})
    public void shouldReturnTrueIfNumberDivisibleByThree(int number) {
        boolean result = numberChecker.isDivisibleByThree(number);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(ints = {-2, -1, 2, 4, 5})
    public void shouldReturnFalseIfNumberNotDivisibleByThree(int number) {
        boolean result = numberChecker.isDivisibleByThree(number);
        assertFalse(result);
    }
}