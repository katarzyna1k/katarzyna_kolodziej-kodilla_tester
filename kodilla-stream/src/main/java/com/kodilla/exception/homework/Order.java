package com.kodilla.exception.homework;

public class Order {
    private String number;

    public String getNumber() {
        return number;
    }

    public Order(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Order{" +
                "number='" + number + '\'' +
                '}';
    }
}
