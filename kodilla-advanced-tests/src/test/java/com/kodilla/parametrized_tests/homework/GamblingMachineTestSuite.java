package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTestSuite {

    @ParameterizedTest
    @CsvFileSource(resources = "/userNumbers_lessThanSix.csv", numLinesToSkip = 1)
    void shouldThrowExceptionIfSetSizeIsLessThanSix(int input1, int input2, int input3, int input4, int input5) {
        GamblingMachine gamblingMachine = new GamblingMachine();
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(new HashSet<>(Set.of(input1, input2, input3, input4, input5))));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/userNumbers_outOfScope.csv", numLinesToSkip = 1)
    void shouldThrowExceptionIfNumbersAreOutsideOfScope(int input1, int input2, int input3, int input4, int input5, int input6) {
        GamblingMachine gamblingMachine = new GamblingMachine();
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(new HashSet<>(Set.of(input1, input2, input3, input4, input5, input6))));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/userNumbers_valid.csv", numLinesToSkip = 1)
    void shouldCompareUserNumbersIfAreInRange(int input1, int input2, int input3, int input4, int input5, int input6) throws InvalidNumbersException {
        GamblingMachine gamblingMachine = new GamblingMachine();
        Set<Integer> userNumbers = new HashSet<>(Set.of(input1, input2, input3, input4, input5, input6));
        int result = gamblingMachine.howManyWins(userNumbers);
        assertTrue(result >= 0 && result <= 6);
    }
}