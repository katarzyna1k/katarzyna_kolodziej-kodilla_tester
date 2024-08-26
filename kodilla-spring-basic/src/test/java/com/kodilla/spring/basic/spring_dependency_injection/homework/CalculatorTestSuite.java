package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class CalculatorTestSuite {

    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
    Calculator bean = context.getBean(Calculator.class);

    @Test
    public void shouldReturnValue() {
        Display bean = context.getBean(Display.class);
        double result = bean.display(12);
        Assertions.assertEquals(12, result);
    }

    @Test
    public void shouldAdd() {
        double result = bean.add(10.1, 20.5);
        Assertions.assertEquals(30.6, result);
    }

    @Test
    public void shouldSubtract() {
        double result = bean.subtract(20.5, 11.3);
        Assertions.assertEquals(9.2, result);
    }

    @Test
    public void shouldMultiply() {
        double result = bean.multiply(13.5, 22.8);
        Assertions.assertEquals(307.8, result);
    }

    @Test
    public void shouldDivide() {
        double result = bean.divide(15.3, 14.7);
        double delta = 0.001;
        Assertions.assertEquals(1.04, result, delta);
    }

}