package com.kodilla.parametrized_tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringValidatorTestSuit {
    private StringValidator validator = new StringValidator();

    //1.
    @Test
    public void shouldReturnTrueIfStringIsEmpty() {
        assertTrue(validator.isBlank(""));
    }

    @Test
    public void shouldReturnTrueIfStringHasOnlySpaces() {
        assertTrue(validator.isBlank("   "));
    }

    @Test
    public void shouldReturnTrueIfStringIsNull() {
        assertTrue(validator.isBlank(null));
    }

    @Test
    public void shouldReturnFalseIfStringNotEmpty() {
        assertFalse(validator.isBlank("text"));
    }

    //2.testy parametryzowane
    @ParameterizedTest
    @ValueSource(strings = {"", "   "})
    public void shouldReturnTrueIfStringIsEmptyOrWithSpaces(String text) {
        assertTrue(validator.isBlank(text));
    }

    @ParameterizedTest
    @NullSource
    public void shouldReturnTrueIfStringIsNull(String text){
        assertTrue(validator.isBlank(null));
    }
    @ParameterizedTest
    @EmptySource
    public void shouldReturnTrueIfStringEmpty(String text){
        assertTrue(validator.isBlank(text));
    }

    //2.1.testy parametryzowane gdy null i empty
    @ParameterizedTest
    @NullAndEmptySource
    public void shouldReturnTrueIfStringEmptyOrNull(String text){
        System.out.println("|"+text+"|");
        assertTrue(validator.isBlank(text));
    }

}