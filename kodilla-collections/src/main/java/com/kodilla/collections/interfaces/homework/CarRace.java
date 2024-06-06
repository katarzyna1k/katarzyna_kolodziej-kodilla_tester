package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Ford ford = new Ford(55);
        doRace(ford);

        Honda honda = new Honda(78);
        doRace(honda);

        Tesla tesla = new Tesla(40);
        doRace(tesla);

    }

    private static void doRace(Car car) {
        for (int i = 0; i < 3; i++) {
            car.increaseSpeed();
        }
        for (int i = 0; i < 2; i++) {
            car.decreaseSpeed();
        }
        System.out.println(car.getSpeed());
    }
}
