package com.kodilla.collections.interfaces.homework;

public class Honda implements Car {
    int speed;

    public Honda(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        int increasedSpeed = speed += 15;
        System.out.println(increasedSpeed);
    }

    @Override
    public void decreaseSpeed() {
        int decreasedSpeed = speed -= 8;
        System.out.println(decreasedSpeed);
    }
}
