package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class Cabrio implements Car {

    @Override
    public boolean hasHeadlightsTurnedOn() {
        LocalTime time = LocalTime.now();
        if (time.isAfter(LocalTime.of(20, 0)) && time.isBefore(LocalTime.of(6, 0))) {
            return true;
        }
        return false;
    }

    @Override
    public String getCarType() {
        return "Cabrio";
    }
}
