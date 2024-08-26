//package com.kodilla.spring.basic.spring_configuration.homework;
//
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.time.LocalTime;
//
//public class Sedan implements Car {
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
//    @Override
//    public String getCarType() {
//        return "Sedan";
//    }
//}
