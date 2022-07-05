package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import models.ApiConnector;
import org.json.JSONObject;
import org.junit.Assert;

public class Task2 {

    ApiConnector apiConnector = new ApiConnector();
    JSONObject object = new JSONObject();

    @Given("I send Api Key")
    public void i_send_api_key() {
        apiConnector.requestSpecification();
    }
    @When("I retrieve the Ethereum technical documentacion")
    public void i_retrieve_the_ethereum_technical_documentacion() {
        Response response = apiConnector.getTechDocumentacion("1027");
        object = new JSONObject(response.asPrettyString()).getJSONObject("data").getJSONObject("1027");
    }
    @Then("I confirm that the following logo URL {string} is present")
    public void i_confirm_that_the_following_logo_url_is_present(String string) {
        Assert.assertEquals(string, object.getString("logo"));
    }
    @Then("I confirm that the technical_doc URL {string} is present")
    public void i_confirm_that_the_technical_doc_url_is_present(String string) {
        Assert.assertEquals(string, object.getJSONObject("urls").getJSONArray("technical_doc").getString(0));
    }
    @Then("I confirm that the symbol of the currency is ETH:")
    public void i_confirm_that_the_symbol_of_the_currency_is_eth() {
        Assert.assertEquals("ETH", object.getString("symbol"));
    }
    @Then("I confirm that the date added is {string}")
    public void i_confirm_that_the_date_added_is(String string) {
        Assert.assertEquals(string, object.getString("date_added"));
    }
    @Then("I confirm that the platform is null")
    public void i_confirm_that_the_platform_is_null() {
        Assert.assertTrue(object.get("platform").equals(null));
    }
    @Then("I confirm that the currency has the mineable tag associated with it")
    public void i_confirm_that_the_currency_has_the_mineable_tag_associated_with_it() {
        Assert.assertEquals("mineable", object.getJSONArray("tags").getString(0));
    }
}
