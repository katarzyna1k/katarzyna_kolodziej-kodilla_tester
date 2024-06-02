package com.kodilla.inheritance.homework;

public class OperatingSystem {

    private int yearRelease;
    private int processor;

    public OperatingSystem(int yearRelease, int processor) {
        this.yearRelease = yearRelease;
        this.processor = processor;
    }

    public void turnOn() {
        System.out.println("System turned On!");
    }

    public void turnOf() {
        System.out.println("System turned Off!");
    }

    public int getProcessor() {
        return processor;
    }

    public void checkProcessor() {
        System.out.println("This system operates on " + processor + " bits");
    }


    public void connectPrinter() {
        String text = "Please insert the cable into the correct slot";
        System.out.println(text);
    }


    public void connectKeyboard() {
        System.out.println("Keyboard connected");
    }

}
