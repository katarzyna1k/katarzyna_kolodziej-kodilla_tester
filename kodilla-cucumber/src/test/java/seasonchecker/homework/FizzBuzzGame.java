package seasonchecker.homework;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzGame {

    private int number;
    private String result;

    @Given("dividend number is three")
    public void dividend_number_is_three() {
        this.number = 3;
    }

    @Given("dividend number is five")
    public void dividend_number_is_five() {
        this.number = 5;
    }

    @Given("dividend number is fifteen")
    public void dividend_number_is_fifteen() {
        this.number = 15;
    }

    @Given("dividend number is nineteen")
    public void dividend_number_is_nineteen() {
        this.number = 19;
    }

    @When("can be number divide by three or and  five")
    public void can_be_number_divide_by_three_or_and_five() {
        this.result = NumberChecker.checkDivision(this.number);
    }

    @Then("the result of division should be {string}")
    public void the_result_of_division_should_be(String string) {
        assertEquals(string, this.result);
    }


}
