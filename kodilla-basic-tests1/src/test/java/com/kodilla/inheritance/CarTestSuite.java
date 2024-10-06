package com.kodilla.inheritance;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class CarTestSuite {
    private Car car = new Car(4, 2);
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Test
    void shouldHaveTurnedLightsOn() {
        System.setOut(new PrintStream(outContent));
        String expectedText = "Lights were turned on";

        car.turnOnLights();

        assertEquals(expectedText.trim(), outContent.toString().trim());
        System.setOut(System.out);
    }

    @Test
    void doorsShouldBeOpened() {
        System.setOut(new PrintStream(outContent));
        String expectedTeXt = "Opening 4 doors";

        car.openDoors();

        assertTrue(outContent.toString().trim().contains(expectedTeXt));
        System.setOut(System.out);
    }

    @Test
    void shouldGetWheels() {
        int howManyWheels = car.getWheels();

        assertEquals(4, howManyWheels);
    }

    @Test
    void shouldGetNumberOfSeats() {
        int numberOfSeets = car.getSeats();

        assertEquals(2, numberOfSeets);
    }

    @Test
    void shouldDisplayNumberOfSeats() {
        System.setOut(new PrintStream(outContent));
        String expectedNumberOfSeats = "Number od seats " + car.getSeats();
        car.displayNumberOfSeats();

        assertEquals(expectedNumberOfSeats.trim(),outContent.toString().trim());
        System.setOut(System.out);
    }
}