package com.kodilla.inheritance.homework;

public class OperatingSystemLaptop extends OperatingSystem {

    public OperatingSystemLaptop(int yearRelease, int processor) {
        super(yearRelease, processor);
    }

    @Override
    public void connectKeyboard() {
        System.out.println("External keyboard connected");
    }
}
