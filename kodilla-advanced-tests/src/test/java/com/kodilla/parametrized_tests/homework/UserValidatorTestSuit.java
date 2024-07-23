package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuit {
    private UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"jan", "Jan_KOwalski1", "_J1", "123", "._-"})
    public void shouldReturnTrueWhenMatch(String username) {
        assertTrue(userValidator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Jo", "Jan/Kowalski1", "@JanKowalski1!", "@!#"})
    public void shouldReturnFalseWhenNotMatch(String username) {
        assertFalse(userValidator.validateUsername(username));
    }

    @ParameterizedTest
    @NullSource
    public void shouldReturnFalseIfEmailIsNull(String email) {
        assertFalse(userValidator.validateEmail(email));
    }

    @ParameterizedTest
    @EmptySource
    public void shouldReturnTrueIfEmailIsEmpty(String email) {
        assertTrue(userValidator.validateEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {"j_9@egz9.com", "Jan.Kowalski_1@egZ.2-egz.com", "jan1.kowalski.123@egz.2-egz.3-egz.com"})
    public void shouldReturnTrueIfEmailMatch(String email) {
        assertTrue(userValidator.validateEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {".Kowalski.eGz_1", "Jan.Kowalski_1egZ", "Jan!.Kowalski 1@egz.com", "Jan.Kowalski@.com", "Jan@egz.123com"})
    public void shouldReturnFalseIfEmailNotMatch(String email) {
        assertFalse(userValidator.validateEmail(email));
    }
}