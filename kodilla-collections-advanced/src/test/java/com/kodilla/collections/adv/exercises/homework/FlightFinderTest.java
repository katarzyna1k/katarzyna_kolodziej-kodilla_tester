package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTest {
    @Test
    public void findFlightsFromTestSuit() {
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> flights = flightFinder.findFlightsFrom("London");

        assertEquals(1, flights.size());
        Flight expextedFlight = new Flight("Lublin", "London");
        assertEquals(expextedFlight, flights.get(0));
    }

    @Test
    public void findFlightsToTestSuit() {
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> flights = flightFinder.findFlightsTo("Warsaw");

        assertEquals(1, flights.size());//wer. rozmiaru
        Flight expectedFlight = new Flight("Warsaw", "Gdansk");//spr. konkretnego obiektu
        assertEquals(expectedFlight, flights.get(0));
    }


}