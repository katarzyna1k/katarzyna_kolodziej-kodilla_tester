package com.kodilla.exception;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirportRepositoryTestSuit {

    @Test
    public void testIsAirportInUse() throws AirportNotFoundException {
        AirportRepository airportRepository = new AirportRepository();
        boolean isWarsawInUse = airportRepository.isAirportInUse("Warsaw");
        assertTrue(isWarsawInUse);
    }

    @Test
    public void testIsAirportInUse_withException() {
        AirportRepository airportRepository = new AirportRepository();
        assertThrows(AirportNotFoundException.class, () -> airportRepository.isAirportInUse("Vienna"));
    }
}