package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuit {
    private Warehouse warehouse = new Warehouse();

    @Test
    public void shouldFindOrderIfPassingValidNumber() throws OrderDoesntExistException {
        warehouse.addOrder(new Order("1230"));
        Order result = warehouse.getOrder("1230");

        assertNotNull(result);
    }

    @Test
    public void shouldThrowsExceptionIfOrderNotExist() {
        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("121"));


    }
}