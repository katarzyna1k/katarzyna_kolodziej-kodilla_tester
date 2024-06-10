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
        speed += 12;

    }

    @Override
    public void decreaseSpeed() {
        speed -= 10;
    }

    @Override
    public String toString() {
        return "Tesla{" +
                "speed=" + speed +
                '}';
    }
}
