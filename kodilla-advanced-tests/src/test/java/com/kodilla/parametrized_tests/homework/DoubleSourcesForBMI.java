package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class DoubleSourcesForBMI {
    static Stream<Arguments> provideDoubleForPersonBMI() {
        return Stream.of(
                Arguments.of(1.75, 45, "Very severely underweight"),
                Arguments.of(1.72, 45.5, "Severely underweight"),
                Arguments.of(1.70, 52, "Underweight"),
                Arguments.of(1.82, 80, "Normal (healthy weight)"),
                Arguments.of(1.54, 70, "Overweight"),
                Arguments.of(1.57, 79, "Obese Class I (Moderately obese)"),
                Arguments.of(1.60, 97, "Obese Class II (Severely obese)"),
                Arguments.of(1.52, 97, "Obese Class III (Very severely obese)"),
                Arguments.of(1.68, 130, "Obese Class IV (Morbidly Obese)"),
                Arguments.of(1.8, 180, "Obese Class V (Super Obese)"),
                Arguments.of(1.8, 200, "Obese Class VI (Hyper Obese)"));

    }
}
