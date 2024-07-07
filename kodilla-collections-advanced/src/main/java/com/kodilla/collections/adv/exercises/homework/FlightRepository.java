//package com.kodilla.collections.adv.exercises.homework;
//
//import java.util.*;
//
//public class FlightRepository {
//
//
//    public static void main(String[] args) {
//        Map<City, List<Flight>> airport = new HashMap<>();
//
//        Flight flightLublin = new Flight(Arrays.asList("DUBLIN", "London Luton", "Gdańsk"));
//        airport.put(City.LUBLIN, (List<Flight>) flightLublin);
//
//        getFlightsTable(airport);
//    }
//
//    public static void getFlightsTable(Map<City, List<Flight>> airport) {
//        for (Map.Entry<City, List<Flight>> flights : airport.entrySet()) {
//            System.out.println(flights.getKey() + " " + flights.getValue());
//        }
//    }
//}
