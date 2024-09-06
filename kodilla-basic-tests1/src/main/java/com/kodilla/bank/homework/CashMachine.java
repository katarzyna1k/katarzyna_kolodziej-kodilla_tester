package com.kodilla.bank.homework;

import java.util.Arrays;
import java.util.Objects;

public class CashMachine {


    private int[] transactions;
    private int size;

    public CashMachine() {
        this.size = 0;
        this.transactions = new int[0];
    }

    public int[] getTransactions() {
        return transactions;
    }

    public void addTransaction(int cash) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(this.transactions, 0, newTab, 0, transactions.length);
        newTab[this.size - 1] = cash;
        this.transactions = newTab;
    }

    public int getAccountBalance() {
        if (this.transactions.length == 0) {
            return 0;
        }
        int accountBalance = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            accountBalance += this.transactions[i];
        }
        return accountBalance;
    }

    public int getOutTransactionsNumber() {
        int count = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            if (this.transactions[i] < 0)
                count++;
        }
        return count;
    }

    public int getInTransactionsNumber() {
        int count = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            if (this.transactions[i] > 0)
                count++;
        }
        return count;
    }

    public int getSumOutTransactions() {
        int sum = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (this.transactions[i] < 0)
                sum += this.transactions[i];
        }
        return sum;
    }

    public int getSumInTransactions() {
        int sum = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (this.transactions[i] > 0)
                sum += this.transactions[i];
        }
        return sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CashMachine that = (CashMachine) o;
        return size == that.size && Objects.deepEquals(transactions, that.transactions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Arrays.hashCode(transactions), size);
    }
}


