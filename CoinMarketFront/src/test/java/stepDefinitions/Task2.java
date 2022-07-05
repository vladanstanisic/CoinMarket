package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pageObjects.Action;
import pageObjects.Locators;
import java.util.Random;

public class Task2 extends Locators {

    public Action action;
    public Random random = new Random();

    public void loadPage(){
        action.connection();
    }

    @When("I select between {int} and {int} random Cryptocurrencies")
    public void i_select_between_and_random_cryptocurrencies(Integer int1, Integer int2) throws InterruptedException {
        int randomNum= random.nextInt(int2 - int1 + 1) + int1;
        System.out.println(randomNum);
        for(int i = 1 ; i<=randomNum;i++){
            for(int num = 50; num <=10000; num+=50){
                ((JavascriptExecutor) getDriver()).executeScript("window.scrollBy(0,"+num+")");
            }
            WebElementFacade elementToClick = listOfAllEllipsis.get(random.nextInt(listOfAllEllipsis.size()));
            ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true); window.scrollBy(0, -window.innerHeight / 4);", elementToClick);
            ((JavascriptExecutor) getDriver()).executeScript("arguments[0].click();", elementToClick);
            historical.click();
            ((JavascriptExecutor) getDriver()).executeScript("window.scrollBy(0,250)");
            dateRange.click();
            lastSeven.click();
            confirm.click();
            ((JavascriptExecutor) getDriver()).executeScript("window.scrollBy(0,400)");
            Thread.sleep(2000);
            Assert.assertTrue(dates.size()==6);
            loadPage();
        }
    }
    @And("For each click the ellipsis to select View Historical Data")
    public void for_each_click_the_ellipsis_to_select_view_historical_data() {
        System.out.println("");
    }
    @And("change data range to display last {int} days")
    public void change_data_range_to_display_last_days(Integer int1) {
        System.out.println("");
    }
    @Then("Verify that Historical data for the last {int} days are displayed")
    public void verify_that_historical_data_for_the_last_days_are_displayed(Integer int1) {
        System.out.println("");
    }
}
