package com.kodilla.inheritance.homework;

public class OperatingSystem {

    private int yearRelease;
    private int procesor;

    public OperatingSystem(int yearRelease, int procesor) {
        this.yearRelease = yearRelease;
        this.procesor = procesor;
    }

    public void turnOn() {
        System.out.println("System turned On!");
    }

    public void turnOf() {
        System.out.println("System turned Off!");
    }

    public int getProcessor() {
        return procesor;
    }

    public void checkProcessor() {
        System.out.println("This system operates on " + procesor + " bits");
    }


    public static void connectPrinter() {
        System.out.println("Please insert the cable into the correct slot");
    }


    public void connectKeyboard() {
        System.out.println("Keyboard connected");
    }

}
