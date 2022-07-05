package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import models.ApiConnector;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task3 {

    ApiConnector apiConnector = new ApiConnector();
    JSONObject object = new JSONObject();
    JSONArray tags = new JSONArray();
    List<JSONObject> cryptocurencies = new ArrayList();
    @When("I retrieve the first {int} currencies")
    public void iRetrieveTheFirstCurrencies(int arg0) {
        Response response = apiConnector.getTechDocumentacion("1,2,3,4,5,6,7,8,9,10");
        object = new JSONObject(response.asPrettyString()).getJSONObject("data");
    }

    @And("I check which curencies have mineable tag associated with them")
    public void iCheckWhichCurenciesHaveMineableTagAssociatedWithThem() {
        for(int i=1; i<=10; i++){
            tags = object.getJSONObject((String.valueOf(i))).getJSONArray("tags");
            if(tags.toList().contains("mineable")){
                cryptocurencies.add(object.getJSONObject(String.valueOf(i)));
            }
        }
    }

    @Then("I verify that the correct cryptocurrencies have been printed out")
    public void iVerifyThatTheCorrectCryptocurrenciesHaveBeenPrintedOut() {
        System.out.println(cryptocurencies);
    }
}
