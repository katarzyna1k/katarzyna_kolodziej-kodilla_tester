package com.kodilla.exception.homework;

import java.util.List;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("1234"));
        warehouse.addOrder(new Order("565454"));


        try {
            Order orderNumber = warehouse.getOrder("1");
            System.out.println("Order: " + orderNumber);
        } catch (OrderDoesntExistException e) {
            System.out.println("This order does not exist");
        }

    }
}
