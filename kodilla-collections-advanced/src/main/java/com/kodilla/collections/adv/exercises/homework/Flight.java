package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Flight {
    protected String departure;
    protected String arrival;


    @Override
    public int hashCode() {
        return Objects.hash(departure, arrival);
    }

    public String getArrival() {
        return arrival;
    }

    public String getDeparture() {
        return departure;
    }

    public Flight(String arrival, String departure) {
        this.arrival = arrival;
        this.departure = departure;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "departure='" + departure + '\'' +
                ", arrival='" + arrival + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(departure, flight.departure) && Objects.equals(arrival, flight.arrival);
    }
}