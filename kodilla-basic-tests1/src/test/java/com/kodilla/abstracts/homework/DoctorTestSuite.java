package com.kodilla.abstracts.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoctorTestSuite {
    @Test
    void shouldGetJobTitle() {
        Doctor doctor = new Doctor(1200.5, "Doctor responsibilities.");
        String jobTitle = doctor.getJobTitle();
        assertEquals("Doctor", jobTitle);
    }

    @Test
    void shouldReturnJobResponsibilities() {
        Doctor doctor = new Doctor(1200.5, "Doctor responsibilities.");
        String responsibilities = doctor.getResponsibilities();

        assertEquals("Doctor responsibilities.", responsibilities);

    }
}