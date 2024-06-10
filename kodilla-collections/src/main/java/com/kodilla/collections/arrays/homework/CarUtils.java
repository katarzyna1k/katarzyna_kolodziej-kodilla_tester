package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Tesla;
import com.kodilla.collections.interfaces.homework.Honda;


public class CarUtils {
    public static void describeCar(Car car) {
        System.out.println("-----------------------------");
        System.out.println("You are driveing: " + getCarName(car));
        car.increaseSpeed();
        System.out.println("Increase speed: " + car.getSpeed());
        car.decreaseSpeed();
        System.out.println("Decrease speed: " + car.getSpeed());

    }

    public static String getCarName(Car car) {
        if (car instanceof Ford)
            return "Ford";
        else if (car instanceof Tesla)
            return "Tesla";
        else if (car instanceof Honda)
            return "Honda";
        else
            return "Keep driving";

    }

}
