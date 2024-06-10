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
        speed += 15;
    }

    @Override
    public void decreaseSpeed() {
        speed -= 8;
    }

    @Override
    public String toString() {
        return "Honda{" +
                "speed=" + speed +
                '}';
    }
}
