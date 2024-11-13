package com.kodilla.kata;

public class Kata extends Object {

    private int number;

    public Kata(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return String.valueOf(number);
    }

    public String numberToString() {
        return this.toString();
    }
}
