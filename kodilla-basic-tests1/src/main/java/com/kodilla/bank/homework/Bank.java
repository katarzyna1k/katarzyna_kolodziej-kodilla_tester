package com.kodilla.bank.homework;

public class Bank {

    private CashMachine[] cashMachines;
    int size;

    public Bank() {
        this.size = 0;
        this.cashMachines = new CashMachine[0];
    }

    public CashMachine[] getCashMachines() {
        return cashMachines;
    }

    public void addCashMachine(CashMachine cashMachine) {
        this.size++;
        CashMachine[] newTab = new CashMachine[this.size];
        System.arraycopy(this.cashMachines, 0, newTab, 0, cashMachines.length);
        newTab[this.size - 1] = cashMachine;
        this.cashMachines = newTab;
    }

    public int cashMachinesTotalBalance() {
        int sum = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            sum += this.cashMachines[i].getAccountBalance();
        }
        return sum;
    }

    public int getTotalOutCashTransactionsNumber() {
        int totalOutCount = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            totalOutCount += this.cashMachines[i].getOutTransactionsNumber();
        }
        return totalOutCount;
    }

    public int getTotalInCashTransactionsNumber() {
        int totalInCount = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            totalInCount += this.cashMachines[i].getInTransactionsNumber();
        }
        return totalInCount;
    }

    public double getAverageTotalOutCashTransactions() {
        int totalOutCount = getTotalOutCashTransactionsNumber();
        if (totalOutCount == 0) {
            return 0.0;
        }
        int totalOutSum = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            totalOutSum += this.cashMachines[i].getSumOutTransactions();
        }
        return (double) totalOutSum / totalOutCount;
    }

    public double getAverageTotalInCashTransactions() {
        int totalInCount = getTotalInCashTransactionsNumber();
        if (totalInCount == 0) {
            return 0.0;
        }
        int totalInSum = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            totalInSum += this.cashMachines[i].getSumInTransactions();
        }
        return (double) totalInSum / totalInCount;
    }
}
