package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {
    private int speed;

    public Ford(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        int increasedSpeed = speed += 10;
        System.out.println(increasedSpeed);
    }

    @Override
    public void decreaseSpeed() {
        int decreasedSpeed = speed -= 5;
        System.out.println(decreasedSpeed);
    }
}
