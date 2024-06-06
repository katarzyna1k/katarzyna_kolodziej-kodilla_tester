package com.kodilla.collections.interfaces.homework;

public class Tesla implements Car {
    int speed;

    public Tesla(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        int increasedSpeed = speed += 12;
        System.out.println(increasedSpeed);
    }

    @Override
    public void decreaseSpeed() {
        int decreasedSpeed = speed -= 10;
        System.out.println(decreasedSpeed);
    }
}
