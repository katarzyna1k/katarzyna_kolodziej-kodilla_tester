package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDate;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CarFactoryTestSuite {

    @Test
    public void shouldCreateTypeOfCar() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car typeOfCar = context.getBean(Car.class);
        assertNotNull(typeOfCar, "Car bean should be created");
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        if (month >= 6 && month <= 8) {
            assertEquals("Cabrio", typeOfCar.getCarType());
        } else if (month >= 12 || month <= 2) {
            assertEquals("SUV", typeOfCar.getCarType());
        } else if (month >= 3 && month <= 5) {
            assertEquals("Sedan", typeOfCar.getCarType());
        } else {
            assertEquals("Sedan", typeOfCar.getCarType());
        }
    }

    @Test
    public void theLightsShouldBeTurnedOn() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car typeOfCar = context.getBean(Car.class);
        LocalTime time = LocalTime.now();
        if (time.isAfter(LocalTime.of(20, 0)) && time.isBefore(LocalTime.of(6, 0))) {
            assertTrue(typeOfCar.hasHeadlightsTurnedOn());
        } else {
            assertFalse(typeOfCar.hasHeadlightsTurnedOn());
        }
    }

}