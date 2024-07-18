package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FlightFinder {
    public List<Flight> findFlightsFrom(String departure) {
        FlightRepository flightRepository = new FlightRepository();
        List<Flight> depart = new ArrayList<>();
        for (Flight flight : flightRepository.getFlights()) {
            if (flight.getDeparture().equals(departure)) {
                depart.add(flight);
            }
        }
        return depart;
    }

    public List<Flight> findFlightsTo(String arrival) {
        FlightRepository flightRepository = new FlightRepository();
        List<Flight> arrive = new ArrayList<>();
        for (Flight flight : flightRepository.getFlights()) {
            if (flight.getArrival().equals(arrival)) {
                arrive.add(flight);
            }
        }
        return arrive;
    }
}
