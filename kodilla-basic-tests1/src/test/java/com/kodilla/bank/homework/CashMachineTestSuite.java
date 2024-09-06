package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashMachineTestSuite {
    @Test
    public void cashMachineShouldHaveZeroTransactions() {
        CashMachine cashMachine = new CashMachine();
        int[] transactions = cashMachine.getTransactions();

        assertEquals(0, transactions.length);
        assertEquals(0, cashMachine.getInTransactionsNumber());
        assertEquals(0, cashMachine.getOutTransactionsNumber());
    }

    @Test
    public void shouldAddTransactions() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(1200);
        cashMachine.addTransaction(-500);

        int[] transactions = cashMachine.getTransactions();
        assertEquals(2, transactions.length);
        assertEquals(1200,transactions[0]);
        assertEquals(-500,transactions[1]);
    }

    @Test
    public void shouldGetAccountBalance() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(0);
        cashMachine.addTransaction(1000);
        cashMachine.addTransaction(-100);

        int resultAccountTransactions = cashMachine.getAccountBalance();
        assertEquals(900, resultAccountTransactions);
    }

    @Test
    void shouldGetInAndOutCashTransactions() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(500);
        cashMachine.addTransaction(-500);
        cashMachine.addTransaction(-300);

        assertEquals(1, cashMachine.getInTransactionsNumber());
        assertEquals(2, cashMachine.getOutTransactionsNumber());


    }

    @Test
    void shouldSumCashOutTransactions() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(-500);
        cashMachine.addTransaction(-950);
        cashMachine.addTransaction(-300);
        cashMachine.addTransaction(1);
        cashMachine.addTransaction(0);

        int resultSumCashOutTransactions = cashMachine.getSumOutTransactions();
        assertEquals(-1750, resultSumCashOutTransactions);
    }

    @Test
    void shouldSumCashInTransactions() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(500);
        cashMachine.addTransaction(50);
        cashMachine.addTransaction(300);
        cashMachine.addTransaction(-1);
        cashMachine.addTransaction(0);

        int resultSumCashInTransactions = cashMachine.getSumInTransactions();
        assertEquals(850, resultSumCashInTransactions);
    }
}
