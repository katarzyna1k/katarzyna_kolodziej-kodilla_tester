package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTestSuite {

    @Test
    void shouldAddCashMachines() {
        Bank bank = new Bank();
        CashMachine cashMachine1 = new CashMachine();
        cashMachine1.addTransaction(1200);
        CashMachine cashMachine2 = new CashMachine();
        cashMachine2.addTransaction(-500);
        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);

        CashMachine[] addedCashMachines = bank.getCashMachines();
        assertEquals(2, addedCashMachines.length);
        assertEquals(cashMachine1, addedCashMachines[0]);
        assertEquals(cashMachine2, addedCashMachines[1]);
    }

    @Test
    void shouldSumCashMachinesTotalBalance() {
        Bank bank = new Bank();
        CashMachine cashMachine1 = new CashMachine();
        cashMachine1.addTransaction(1200);
        CashMachine cashMachine2 = new CashMachine();
        cashMachine2.addTransaction(-500);
        CashMachine cashMachine3 = new CashMachine();
        cashMachine3.addTransaction(0);
        CashMachine cashMachine4 = new CashMachine();
        cashMachine4.addTransaction(-1);

        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);
        bank.addCashMachine(cashMachine3);
        bank.addCashMachine(cashMachine4);

        int cashMachinesTotalBalance = bank.cashMachinesTotalBalance();

        assertEquals(699, cashMachinesTotalBalance);
    }

    @Test
    void shouldGetTotalCashInAndOutTransactionsNumber() {
        Bank bank = new Bank();
        CashMachine cashMachine1 = new CashMachine();
        cashMachine1.addTransaction(1200);
        CashMachine cashMachine2 = new CashMachine();
        cashMachine2.addTransaction(-500);
        CashMachine cashMachine3 = new CashMachine();
        cashMachine3.addTransaction(0);
        CashMachine cashMachine4 = new CashMachine();
        cashMachine4.addTransaction(-1);
        CashMachine cashMachine5 = new CashMachine();
        cashMachine5.addTransaction(850);

        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);
        bank.addCashMachine(cashMachine3);
        bank.addCashMachine(cashMachine4);
        bank.addCashMachine(cashMachine5);

        int resultTotalOutCashTransactionsNumber = bank.getTotalOutCashTransactionsNumber();
        int resultTotalInCashTransactionsNumber = bank.getTotalInCashTransactionsNumber();

        assertEquals(2, resultTotalOutCashTransactionsNumber);
        assertEquals(2, resultTotalInCashTransactionsNumber);
    }

    @Test
    void shouldGetAverageTotalOutAndInTransactions() {
        Bank bank = new Bank();
        CashMachine cashMachine1 = new CashMachine();
        cashMachine1.addTransaction(1200);
        CashMachine cashMachine2 = new CashMachine();
        cashMachine2.addTransaction(-500);
        CashMachine cashMachine3 = new CashMachine();
        cashMachine3.addTransaction(0);
        CashMachine cashMachine4 = new CashMachine();
        cashMachine4.addTransaction(-1);
        CashMachine cashMachine5 = new CashMachine();
        cashMachine5.addTransaction(850);

        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);
        bank.addCashMachine(cashMachine3);
        bank.addCashMachine(cashMachine4);
        bank.addCashMachine(cashMachine5);

        double resultAverageTotalOut = bank.getAverageTotalOutCashTransactions();
        double resultAverageTotalIn = bank.getAverageTotalInCashTransactions();
        double delta = 0.001;
        assertEquals(-250.5, resultAverageTotalOut, delta);
        assertEquals(1025.0, resultAverageTotalIn, delta);
    }

    @Test
    void balanceShouldGetZeroIfItsZeroTransactions() {
        Bank bank = new Bank();

        double totalBalance = bank.cashMachinesTotalBalance();
        double delta = 0.001;
        assertEquals(0, totalBalance, delta);
    }

    @Test
    void balanceShouldGetZeroIfTransactionsAreZero() {
        Bank bank = new Bank();
        CashMachine cashMachine1 = new CashMachine();
        cashMachine1.addTransaction(0);
        CashMachine cashMachine2 = new CashMachine();
        cashMachine2.addTransaction(-0);
        CashMachine cashMachine3 = new CashMachine();
        cashMachine3.addTransaction(0);
        CashMachine cashMachine4 = new CashMachine();

        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);
        bank.addCashMachine(cashMachine3);
        bank.addCashMachine(cashMachine4);

        double totalBalance = bank.cashMachinesTotalBalance();
        double delta = 0.001;
        assertEquals(0, totalBalance, delta);

    }

}