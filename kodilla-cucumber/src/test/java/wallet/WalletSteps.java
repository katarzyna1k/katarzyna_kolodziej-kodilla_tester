package wallet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

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
        wallet.deposit(200);
        cashier.withdraw(wallet, 30);
    }

    @Then("$30 should be dispensed")
    public void $30_should_be_dispensed() {
        Assertions.assertEquals(30, cashSlot.getContents());
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
        Assertions.assertNotEquals(0, cashSlot.getContents());
    }

    @Given("I have deposited $0 in my wallet")
    public void i_have_deposited_$0_in_my_wallet() {
        wallet.deposit(0);
        Assertions.assertEquals(0, wallet.getBalance());
    }

    @When("I request $100")
    public void i_request_$100() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 100);
    }

    @Then("Dispens should be canceled-balance is zero")
    public void dispens_should_be_canceled_balance_is_zero() {
        wallet.deposit(0);
        Assertions.assertNotEquals(0, cashSlot.getContents());
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

}
