package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration
public class CarFactory {

    @Bean
    public Car typesOfCar() {
        LocalDate now = LocalDate.now();
        Season season = getSeason(now);
        Car car;
        if (season.equals(Season.WINTER)) {
            car = new SUV();
        } else if (season.equals(Season.SPRING) || season.equals(Season.AUTUMN)) {
            car = new Sedan();
        } else {
            car = new Cabrio();
        }
        return car;
    }


    private Season getSeason(LocalDate date) {
        int month = date.getMonthValue();
        if (month >= 6 && month <= 8) {
            return Season.SUMMER;
        } else if (month >= 12 || month <= 2) {
            return Season.WINTER;
        } else if (month >= 3 && month <= 5) {
            return Season.SPRING;
        } else {
            return Season.AUTUMN;
        }
    }
}