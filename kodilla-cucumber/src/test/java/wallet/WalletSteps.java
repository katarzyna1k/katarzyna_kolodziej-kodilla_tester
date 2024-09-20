package wallet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class WalletSteps {
    private final Wallet wallet = new Wallet();
    private final CashSlot cashSlot = new CashSlot();

    @Given("I have deposited $200 in my wallet")
    public void i_have_deposited_$200_in_my_wallet() {
        wallet.deposit(200);
        Assertions.assertEquals(200, wallet.getBalance(), "Incorrect wallet balance");
    }

    @When("I request $30")
    public void i_request_$30() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 30);
    }

    @Then("$30 should be dispensed")
    public void $30_should_be_dispensed() {
        Assertions.assertEquals(30, cashSlot.getContents());
    }

    @Then("the balance of my wallet should be $170")
    public void the_balance_of_my_wallet_should_be_$170() {
        Assertions.assertEquals(170, wallet.getBalance(), "Incorrect wallet balance");
    }

    @Given("I have deposited $20 in my wallet")
    public void i_have_deposited_$20_in_my_wallet() {
        wallet.deposit(20);
        Assertions.assertEquals(20, wallet.getBalance());
    }

    @When("I request $21")
    public void i_request_$21() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 21);
    }

    @Then("Dispens should be canceled-not enough money")
    public void dispens_should_be_canceled() {
        Assertions.assertEquals(0, cashSlot.getContents());
    }


    @Given("I have deposited $125 in my wallet")
    public void i_have_deposited_$125_in_my_wallet() {
        wallet.deposit(125);
        Assertions.assertEquals(125, wallet.getBalance());
    }

    @When("I request $125")
    public void i_request_$125() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 125);
    }

    @Then("$125 should be dispensed")
    public void $125_should_be_dispensed() {
        wallet.deposit(125);
        Assertions.assertEquals(125, cashSlot.getContents());
    }

    @Given("there is $100 in my wallet")
    public void there_is_$100_in_my_wallet() {
        wallet.deposit(100);
        Assertions.assertEquals(100, wallet.getBalance());
    }

    @When("I withdraw $200")
    public void i_withdraw_$200() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 200);
    }

    @Then("nothing should be dispensed")
    public void nothing_should_be_dispensed() {
        Assertions.assertEquals(0, cashSlot.getContents());
    }

    @Then("I should be told that I don't have enough money in my wallet")
    public void i_should_be_told_that_i_don_t_have_enough_money_in_my_wallet() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 200);

        String expectedMessage = "Not enough money in Your wallet.";
        Assertions.assertTrue(outContent.toString().contains(expectedMessage));
        System.setOut(System.out);
    }

    @When("I check the balance of my wallet")
    public void i_check_the_balance_of_my_wallet() {
        Assertions.assertEquals(100, wallet.getBalance());
    }

    @Then("I should see that the balance is $100")
    public void i_should_see_that_the_balance_is_$100() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        wallet.printBalance();
        String currentBalanceMessage = "You have: 100 in your account.";

        Assertions.assertTrue(outContent.toString().contains(currentBalanceMessage));
        System.setOut(System.out);
    }

    @Given("I have $0 in my wallet")
    public void i_have_$0_in_my_wallet() {
        Assertions.assertEquals(0, wallet.getBalance());
    }

    @When("I have deposited $23 in my wallet")
    public void i_have_deposited_$10_in_my_wallet() {
        wallet.deposit(23);
        Assertions.assertEquals(23, wallet.getBalance());
    }

    @When("I have withdrawal $10 from my wallet")
    public void i_have_withdrawal_$_from_my_wallet() {
        wallet.debit(10);
        Assertions.assertEquals(13, wallet.getBalance());
    }

    @When("I have deposited $190 in my wallet")
    public void i_have_deposited_$190_in_my_wallet() {
        wallet.deposit(190);
        Assertions.assertEquals(203, wallet.getBalance());
    }

    @When("I have withdrawal $150 from my wallet")
    public void i_have_withdrawal_$150_from_my_wallet() {
        wallet.debit(150);
        Assertions.assertEquals(53, wallet.getBalance());
    }

    @When("I have deposited $25 in my wallet")
    public void i_have_deposited_$25_in_my_wallet() {
        wallet.deposit(25);
        Assertions.assertEquals(78, wallet.getBalance());
    }

    @Then("The balance of my wallet should be $78")
    public void the_balance_of_my_wallet_should_be_$78() {
        Assertions.assertEquals(78, wallet.getBalance());
    }

    @Given("I have deposited $5 in my wallet")
    public void i_have_deposited_$5_in_my_wallet() {
        wallet.deposit(5);
    }

    @When("I have or withdrawal $0 from my wallet")
    public void i_have_or_withdrawal_$0_from_my_wallet() {
        wallet.debit(0);
    }

    @When("I have deposited $0 in my wallet")
    public void i_have_deposited_$0_in_my_wallet() {
        wallet.deposit(0);
    }

    @Then("I should get message Select an amount higher than $0.")
    public void i_should_get_message_select_an_amount_higher_than_$0() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        wallet.deposit(0);
        wallet.debit(0);

        String messageOfZeroOperation = "Select an amount higher than $0.";
        Assertions.assertTrue(outContent.toString().contains(messageOfZeroOperation));

        System.setOut(System.out);
    }


}
