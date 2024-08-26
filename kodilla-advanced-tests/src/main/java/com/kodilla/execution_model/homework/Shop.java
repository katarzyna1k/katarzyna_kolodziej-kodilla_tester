package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {

    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public List<Order> ordersFromToDate(LocalDate startDate, LocalDate endDate) {
        List<Order> filteredOrdersByDate = orders.stream()
                .filter(o -> (o.getDate().isAfter(startDate)) && (o.getDate().isBefore(endDate)))
                .collect(Collectors.toList());
        return filteredOrdersByDate;
    }

    public List<Order> minToMaxOrder(double minValue, double maxValue) {
        List<Order> filteredOrdersByMinToMaxValue = orders.stream()
                .filter(o -> o.getValue() >= minValue && o.getValue() <= maxValue)
                .collect(Collectors.toList());
        return filteredOrdersByMinToMaxValue;
    }

    public int getOrdersSize() {
        return orders.size();
    }

    public double sumOfOrders() {
        double sumOfOrders = orders.stream()
                .mapToDouble(o -> o.getValue())
                .sum();
        return sumOfOrders;
    }
}
