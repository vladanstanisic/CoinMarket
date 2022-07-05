package pageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public abstract class Locators extends PageObject {

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div/div[5]/table/tbody/tr")
    public List<WebElementFacade> listOfAllElements;

    @FindBy(className = "hmFKKb")
    public List<WebElementFacade> listOfAllEllipsis;

    @FindBy(xpath = "/html/body/div[3]/div/div[1]/div/div/a[3]/button")
    public WebElementFacade historical;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[2]/div/div[3]/div/div/div[1]/div[1]/span/button")
    public WebElementFacade dateRange;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[2]/div/div[3]/div/div/div[1]/div[1]/div/div/div[1]/div/div/div[1]/div[2]/ul/li[1]")
    public WebElementFacade lastSeven;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[2]/div/div[3]/div/div/div[1]/div[1]/div/div/div[1]/div/div/div[2]/span/button")
    public WebElementFacade confirm;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[2]/div/div[3]/div/div/div[1]/div[2]/table/tbody/tr")
    public List<WebElement> dates;

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[1]/div[1]/div/div[2]/div[1]/div/div[1]/a")
    public WebElementFacade  cryptocurrencies;

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[1]/div[1]/div/div[2]/div[1]/div/div[1]/div/a[4]")
    public WebElementFacade  spotlight;

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div[2]/div[4]/div[2]/table/tbody/tr/td[2]/a/div/div/p")
    public List<WebElement> mostVisitedList;

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div/div[2]/table/tbody/tr/td[3]/a/div/div/p")
    public List<WebElement> mostViewedList;
}
