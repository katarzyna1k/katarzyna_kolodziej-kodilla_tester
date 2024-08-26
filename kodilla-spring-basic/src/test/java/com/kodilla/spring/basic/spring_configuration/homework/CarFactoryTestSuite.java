//package com.kodilla.spring.basic.spring_configuration.homework;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@SpringBootTest
//class CarFactoryTestSuite {
//
//    @Test
//    public void shouldCreateTypeOfCar() {
//        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
//        Car typeOfCar = context.getBean(Car.class);
//        assertNotNull(typeOfCar, "Car bean should be created");
//    }
//}