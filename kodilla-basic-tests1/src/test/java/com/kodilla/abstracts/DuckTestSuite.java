package com.kodilla.abstracts;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class DuckTestSuite {
    @Test
    void shouldGiveVoice() {
        Duck duck = new Duck(2, "Donald");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        String expected = "Quack!";
        duck.giveVoice();

        assertTrue(outContent.toString().contains(expected));

        System.setOut(System.out);
    }

    @Test
    void shouldHasName() {
        Duck duck = new Duck(2, "Kaczka Dziwaczka");
        String name = duck.getName();

        assertEquals("Kaczka Dziwaczka", name);
    }


}