package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Integer> studentNumbers = new ArrayList<>();

    public School(List<Integer> studentNumbers) {
        this.studentNumbers = studentNumbers;
    }

    public int getSumOfStudents() {
        int sum = 0;
        for (Integer studentInSchool : studentNumbers) {
            sum += studentInSchool;
        }
        return sum;
    }

    @Override
    public String toString() {
        return "School{" +
                "studentNumbers=" + studentNumbers +
                '}';
    }
}
