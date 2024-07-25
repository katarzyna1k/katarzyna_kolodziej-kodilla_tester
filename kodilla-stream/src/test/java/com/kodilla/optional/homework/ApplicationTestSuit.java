package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTestSuit {

    @Test
    void shouldReturnTeacherNameWhenNotNull() {
        Student student = new Student("Irena Joliot-Curie", new Teacher("Maria Curie"));
        assertEquals("Maria Curie", Application.getTeacherName(student));
    }

    @Test
    void shouldReturnOptionalIfTeacherNameIsNull() {
        Student student = new Student("Stephen Hawking", null);
        assertEquals("<undefined>", Application.getTeacherName(student));
    }
}