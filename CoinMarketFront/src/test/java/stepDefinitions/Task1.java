package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pageObjects.Action;
import pageObjects.Locators;

public class Task1 extends Locators {
    Action action;

    public void loadPage(){
        action.connection();
    }
    @Given("I access the CoinMarketCap website")
    public void i_access_the_coin_market_cap_website() {
        loadPage();
    }
    @Then("I should verify that {int} Cryptocurrencies are displayed.")
    public void i_should_verify_that_cryptocurrencies_are_displayed(Integer int1) {
        Assert.assertTrue(listOfAllElements.size()==int1);
        System.out.println(listOfAllElements.size());
    }
}
