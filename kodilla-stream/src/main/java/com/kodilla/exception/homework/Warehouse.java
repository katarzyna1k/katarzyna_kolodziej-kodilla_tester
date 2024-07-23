package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private List<Order> orders;

    public Warehouse() {
        orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
        orders.stream()
                .map(o -> o.getNumber())
                .forEach(orderNumber -> System.out.println("This is your order: " + orderNumber));
        throw new OrderDoesntExistException();


    }

}
