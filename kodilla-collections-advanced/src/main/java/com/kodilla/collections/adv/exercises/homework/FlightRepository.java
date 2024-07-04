package com.kodilla.collections.adv.exercises.homework;

import java.util.*;

public class FlightRepository {
    public List<Flight> getFlights() {
        return flights;
    }

    private List<Flight> flights;

    public FlightRepository() {
        flights = new ArrayList<>();
        flights.add(new Flight("London", "Warsaw"));
        flights.add(new Flight("Lublin", "Gdansk"));
        flights.add(new Flight("Warsaw", "Gdansk"));
        flights.add(new Flight("Dublin", "Lublin"));
        flights.add(new Flight("Lublin","London"));
    }

}
