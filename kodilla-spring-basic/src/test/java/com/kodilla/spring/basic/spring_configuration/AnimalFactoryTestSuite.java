package com.kodilla.spring.basic.spring_configuration;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class AnimalFactoryTestSuite {

    @Test
    public void testDogCreated() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration");
        Dog dog = (Dog) context.getBean("createDog");
        String voice = dog.getVoice();
        assertEquals("Bark bark", voice);
    }

    @Test
    public void shouldCreateRandomAnimal() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Animal randomAnimal = (Animal) context.getBean("randomAnimal");
        String voice = randomAnimal.getVoice();
        System.out.println(voice);
        List<String> possibleVoices = Arrays.asList("Bark bark", "Meow meow", "Quack quack");
        assertTrue(possibleVoices.contains(voice));
    }
}