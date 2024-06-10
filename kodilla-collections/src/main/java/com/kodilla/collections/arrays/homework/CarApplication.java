package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Tesla;
import com.kodilla.collections.interfaces.homework.Honda;

import java.util.Random;

public class CarApplication {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        Car[] cars = new Car[RANDOM.nextInt(15) + 1];
        for (int i = 0; i < cars.length; i++)
            cars[i] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);
    }

    public static Car drawCar() {
        int carModel = RANDOM.nextInt(3);
        int speed = getRandomSpeed();
        if (carModel == 0)
            return new Tesla(speed);
        else if (carModel == 1)
            return new Honda(speed);
        else
            return new Ford(speed);
    }

    private static int getRandomSpeed() {
        return RANDOM.nextInt(260);
    }
}