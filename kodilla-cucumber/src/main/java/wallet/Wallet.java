package wallet;

public class Wallet {
    private int balance = 0;

    public Wallet() {
    }

    public void deposit(int money) {
        if (money > 0) {
            this.balance += money;
        } else {
            incorrectAmountOfMoney();
        }
    }

    public void debit(int money) {
        if (money > 0) {
            this.balance -= money;
        } else {
            incorrectAmountOfMoney();
        }
    }

    public void incorrectAmountOfMoney() {
        System.out.println("Select an amount higher than $0.");
    }

    public int getBalance() {
        return balance;
    }

    public void printBalance() {
        int currentBalance = getBalance();
        System.out.println("You have: " + currentBalance + " in your account.");
    }
}
