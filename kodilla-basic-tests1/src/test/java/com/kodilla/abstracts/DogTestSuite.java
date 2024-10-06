package com.kodilla.abstracts;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class DogTestSuite {
    @Test
    void shouldGiveVoice() {
        Dog dog = new Dog(4, "Tofik");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        String expected = "Hau Hau!";
        dog.giveVoice();

        assertTrue(outContent.toString().contains(expected));

        System.setOut(System.out);
    }

    @Test
    void shouldHasName() {
        Dog dog = new Dog(4, "Tofik");
        String name = dog.getName();

        assertEquals("Tofik", name);
    }

    @Test
    void dogShouldHasName() {
        Dog dog = new Dog(4, "Terror");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        String expected = "By the power given to me by me i call You: " + dog.getName();
        dog.dogHasName();

        assertEquals(expected.trim(),outContent.toString().trim());

    }
}