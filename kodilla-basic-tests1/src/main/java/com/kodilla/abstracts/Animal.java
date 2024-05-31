package com.kodilla.abstracts;

public abstract class Animal {
    private int numberOfLegs;
    private String name;

    public Animal(int numberOfLegs, String name) {
        this.numberOfLegs = numberOfLegs;
        this.name = name;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public abstract void giveVoice();

    public String getName() {
        return name;
    }
}
