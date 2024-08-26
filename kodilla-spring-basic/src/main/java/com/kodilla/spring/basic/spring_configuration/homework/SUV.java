//package com.kodilla.spring.basic.spring_configuration.homework;
//
//import java.time.LocalTime;
//
//public class SUV implements Car {
//
//    @Override
//    public boolean hasHeadlightsTurnedOn() {
//        LocalTime time = LocalTime.now();
//        if (time.isAfter(LocalTime.of(20, 00)) && time.isBefore(LocalTime.of(06, 00))) {
//            return true;
//        }
//        return false;
//    }
//
//
//    @Override
//    public String getCarType() {
//        return "SUV";
//    }
//}
