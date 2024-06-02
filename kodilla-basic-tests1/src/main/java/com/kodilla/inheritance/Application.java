package com.kodilla.inheritance;

public class Application {

    public static void main(String[] args) {
        Car car = new Car(4,5);
        car.turnOnLights();
        car.displayNumberOfSeats();

        Convertible convertible = new Convertible(4,2);
        convertible.turnOnLights();
        convertible.displayNumberOfSeats();

        System.out.println(convertible.getWheels());

    }
}