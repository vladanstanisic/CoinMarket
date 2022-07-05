package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.ToString;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import pageObjects.Action;
import pageObjects.Locators;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task3 extends Locators {

    public Action action;
    public Actions actions = new Actions(getDriver());
    public Random random = new Random();

    public void loadPage(){
        action.connection();
    }


    @When("I mouseover on Cryptocurrencies tab.")
    public void i_mouseover_on_cryptocurrencies_tab() throws InterruptedException {
        actions.moveToElement(cryptocurrencies).perform();
        spotlight.click();
          ((JavascriptExecutor) getDriver()).executeScript("window.scrollBy(0,1000)");
        Thread.sleep(3000);
        List<String> list = new ArrayList<>();
        for(int i = 0 ; i <10 ;i++){
            list.add(i,mostVisitedList.get(i).getText());
        }

        String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN);
        getDriver().findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div[2]/div[4]/div[1]/a")).sendKeys(selectLinkOpeninNewTab);
        getDriver().switchTo().window(getDriver().getWindowHandles().stream().reduce((f, s) -> s).orElse(null));
        Thread.sleep(3000);
        ((JavascriptExecutor) getDriver()).executeScript("window.scrollBy(0,600)");

        for(int i= 0 ; i <10 ; i++){
            Assert.assertEquals(list.get(i),mostViewedList.get(i).getText());
        }
    }
    @And("I click on the Spotlight option on this menu")
    public void i_click_on_the_spotlight_option_on_this_menu() {
        System.out.println("");
    }
    @And("I record the data in Most visited category \\({int} coins)")
    public void i_record_the_data_in_most_visited_category_coins(Integer int1) {
        System.out.println("");
    }
    @Then("I open Most Visited link See More in new tab and Verify that first {int} Most Visited coins are also displayed in new tab")
    public void i_open_most_visited_link_see_more_in_new_tab_and_verify_that_first_most_visited_coins_are_also_displayed_in_new_tab(Integer int1) {
        System.out.println("");
    }

}
