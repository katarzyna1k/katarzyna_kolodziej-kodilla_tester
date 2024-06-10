package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Honda;
import com.kodilla.collections.interfaces.homework.Tesla;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Ford(20));
        cars.add(new Ford(36));
        cars.add(new Honda(50));
        Ford ford = new Ford(9);
        cars.add(ford);
        cars.add(new Honda(26));
        cars.add(new Tesla(47));

        for (Car carObjects : cars) {
            CarUtils.describeCar(carObjects);
            System.out.println(carObjects);
        }

        cars.remove(2);
        cars.remove(ford);
        System.out.println(cars.size());

        for (Car carObjects : cars) {
            System.out.println(carObjects);
        }

    }
}
