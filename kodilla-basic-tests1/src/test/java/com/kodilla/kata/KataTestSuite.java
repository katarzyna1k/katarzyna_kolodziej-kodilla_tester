package com.kodilla.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KataTestSuite {

    @Test
    void shouldCreateStringFromInteger() {
        Kata kata = new Kata(1234);
        Kata kata1 = new Kata(-300);

        assertEquals("1234", kata.numberToString());
        assertEquals("-300", kata1.numberToString());
    }

}