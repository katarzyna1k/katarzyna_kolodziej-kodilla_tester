package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ShippingCenterTestSuite {

    @Test
    public void packageShouldHaveWeightAndAddress() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        DeliveryService beanDelivery = context.getBean(DeliveryService.class);
        boolean result = beanDelivery.deliverPackage("address", 31);
        assertNotNull(result);
    }

    @Test
    public void shouldReturnTrueIfWeightIsUnder30() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        DeliveryService beanDelivery = context.getBean(DeliveryService.class);
        boolean result = beanDelivery.deliverPackage("address", 30.0);
        assertTrue(result);
    }

    @Test
    public void shouldReturnFalseIfWeightIsOver30() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        DeliveryService beanDelivery = context.getBean(DeliveryService.class);
        boolean result = beanDelivery.deliverPackage("address", 30.1);
        assertFalse(result);
    }



    @Test
    public void shouldSendPackage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);

        String result = bean.sendPackage("address", 30.0);
        assertEquals("Package delivered to: address", result);

    }

}