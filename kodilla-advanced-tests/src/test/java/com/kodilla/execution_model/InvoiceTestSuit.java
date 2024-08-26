package com.kodilla.execution_model;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTestSuit {

    private Invoice invoice = new Invoice();
    Item hairclip = new Item("Hairclip", 12.5);
    Item elasticBands = new Item("Elastic Bands", 25.5);
    Item bobbypins = new Item("Bobbypins", 5.5);



    @Test
    public void shouldAddItemToList() {

        int result = invoice.getSize();
        assertEquals(3, result);
    }

    @Test
    public void shouldReturnItemWithNameAndPrice() {

        Item result = invoice.getItem(1);
        assertEquals("Elastic Bands", result.getName());
        assertEquals(25.5, result.getPrice());
    }

    @Test
    public void shouldReturnNullWhenIndexNegative() {

        Item result = invoice.getItem(-1);
        assertNull(result);
    }

    @Test
    public void shouldReturnNullWhenPassingOutOfRangeIndex() {

        Item result = invoice.getItem(3);
        assertNull(result);
    }

    @Test
    public void shouldClearList() {

        int invoiceSizeBeforeClear = invoice.getSize();

        invoice.clear();
        int result = invoice.getSize();

        assertEquals(0, result);
        assertEquals(3, invoiceSizeBeforeClear);
    }

    @BeforeEach
    public void initializeInvoice() {
        invoice.addItem(hairclip);
        invoice.addItem(elasticBands);
        invoice.addItem(bobbypins);
    }

    @AfterEach
    public void resetValues() {
        System.out.println("Resetting values...");
    }

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }
}