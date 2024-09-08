package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import java.time.LocalTime;

@SpringBootTest
class ClockTestSuite {

    @Autowired
    private ApplicationContext context;

    @Test
    void shouldCreateDifferentBeanForDifferentTime() throws InterruptedException {
        Clock clock1 = context.getBean(Clock.class);
        LocalTime time1 = clock1.getCurrentTime();
        Thread.sleep(1000);
        Clock clock2 = context.getBean(Clock.class);
        LocalTime time2 = clock2.getCurrentTime();
        Thread.sleep(1000);
        Clock clock3 = context.getBean(Clock.class);
        Thread.sleep(1000);
        LocalTime time3 = clock3.getCurrentTime();

        Assertions.assertNotEquals(time2, time1);
        Assertions.assertNotEquals(time2, time3);
        Assertions.assertNotEquals(time3, time1);

        Assertions.assertNotEquals(clock1, clock2);
        Assertions.assertNotEquals(clock2, clock3);
        Assertions.assertNotEquals(clock3, clock1);

    }

}