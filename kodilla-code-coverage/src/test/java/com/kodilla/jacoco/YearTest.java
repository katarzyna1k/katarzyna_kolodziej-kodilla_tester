package com.kodilla.jacoco;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YearTest {

    @Test
    void shouldBeLeapYearIfDivisibleBy100And400() {
        Year year = new Year(1600);

        boolean isLeapYear = year.isLeap();
        assertTrue(isLeapYear);
    }

    @Test
    void shouldNotBeLeapIfNotDivisibleBy4() {
        Year year = new Year(1991);

        boolean notALeapYear = year.isLeap();
        assertFalse(notALeapYear);
    }

    @Test
    void shouldBeLeapIfDivisibleBy4ButNotBy100() {
        Year year = new Year(2024);

        boolean result = year.isLeap();
        assertTrue(result);
    }

    @Test
    void shouldNotBeLeapYearIfDivisibleBy100ButNot400() {
        Year year1900 = new Year(1900);

        assertFalse(year1900.isLeap());
    }

}