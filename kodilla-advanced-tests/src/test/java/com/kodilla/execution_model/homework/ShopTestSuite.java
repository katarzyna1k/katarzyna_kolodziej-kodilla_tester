package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;


import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {
    private Shop shop = new Shop();
    Order firstOrder = new Order(20.35, LocalDate.of(2023, 3, 27), "k1234");
    Order secondOrder = new Order(10.1, LocalDate.of(2023, 4, 1), "b1234");
    Order thirdOrder = new Order(5.2, LocalDate.of(2023, 4, 15), "c1234");
    Order fourthOrder = new Order(10.0, LocalDate.of(2023, 3, 5), "e1234");

    @Test
    public void shouldAddOrderToList() {
        int result = shop.getOrdersSize();

        assertEquals(4, result);
    }

    @Test
    public void shouldGetOrdersFromAndToGivenDates() {
        List<Order> result = shop.ordersFromToDate(LocalDate.of(2023, 03, 01), LocalDate.of(2023, 03, 31));

        assertEquals(List.of(firstOrder, fourthOrder), result);
    }

    @Test
    public void shouldGetListOfGivenMinAndMaxValue() {
        List<Order> result = shop.minToMaxOrder(5.0, 10.0);

        assertEquals(List.of(thirdOrder, fourthOrder), result);
    }

    @Test
    public void shouldSumOrdersValues() {
        double resultSum = shop.sumOfOrders();
        double delta = 0.01;
        assertEquals(45.65, resultSum, delta);
    }

    @BeforeEach
    public void beforeEachTest() {

        shop.addOrder(firstOrder);
        shop.addOrder(secondOrder);
        shop.addOrder(thirdOrder);
        shop.addOrder(fourthOrder);

    }

}

