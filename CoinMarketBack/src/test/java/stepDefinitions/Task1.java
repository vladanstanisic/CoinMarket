package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import models.ApiConnector;
import net.serenitybdd.core.Serenity;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Task1 {

    ApiConnector apiConnector = new ApiConnector();

    String symbols = "BTC,USDT,ETH";
    String[] simboli = symbols.split(",");
    @Given("I send key")
    public void i_send_key() {
        apiConnector.requestSpecification();
    }

    @When("I retreve ID of symbol")
    public void i_retreve_id_of_symbol() {
        Response response = apiConnector.getSymbols(symbols);
        JSONObject object = new JSONObject(response.asPrettyString());
        for(String simbol: simboli){
            int id = object.getJSONObject("data").getJSONObject(simbol).getInt("id");
            System.out.println(id);
            Serenity.setSessionVariable("id"+simbol).to(id);
        }

    }

//    @When("I retreve ID of {string}")
//    public void i_retreve_id_of_(String symbol) {
//        Response response = apiConnector.getSymbol(symbol);
//        JSONObject object = new JSONObject(response.asPrettyString());
//        int id = object.getJSONObject("data").getJSONObject(symbol).getInt("id");
//        System.out.println(id);
//        Serenity.setSessionVariable("id").to(id);
//    }
    @Then("Convert them to Bolivian Boliviano")
    public void convert_them_to_bolivian_boliviano() {
        for(String simbol : simboli){
            int id = Serenity.sessionVariableCalled("id"+simbol);
            Response response = apiConnector.convertCurrencies(id);
            JSONObject object = new JSONObject(response.asPrettyString());
            int price = object.getJSONObject("data").getJSONObject("quote").getJSONObject("BOB").getInt("price");
            System.out.println("price of " +simbol+ " ----> " +price);
        }
    }
}
