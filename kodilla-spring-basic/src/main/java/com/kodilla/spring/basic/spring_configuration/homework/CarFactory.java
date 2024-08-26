//package com.kodilla.spring.basic.spring_configuration.homework;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.time.LocalDate;
//import java.time.LocalTime;
//
//@Configuration
//public class CarFactory {
//
//    private final Season season;
//
//    public CarFactory(Season season) {
//        this.season = season;
//    }
//
//
//    @Bean
//    public Car typesOfCar() {
//        LocalDate now = LocalDate.now();
//        LocalTime currentTime = LocalTime.now();
//        Season season = getSeason(now);
//        Car car;
//        if (season.equals(Season.WINTER)) {
//            car = new SUV();
//        } else if (season.equals(Season.SPRING) || season.equals(Season.AUTUMN)) {
//            car = new Sedan();
//        } else {
//            car = new Cabrio();
//        }
//        return car;
//    }
//
//
//    private Season getSeason(LocalDate date) {
//        int month = date.getMonthValue();
//        if (month >= 6 && month <= 8) {
//            return Season.SUMMER; // Czerwiec - Sierpień
//        } else if (month >= 12 || month <= 2) {
//            return Season.WINTER; // Grudzień - Luty
//        } else if (month >= 3 && month <= 5) {
//            return Season.SPRING; // Marzec - Maj
//        } else {
//            return Season.AUTUMN; // Wrzesień - Listopad
//        }
//    }
//}