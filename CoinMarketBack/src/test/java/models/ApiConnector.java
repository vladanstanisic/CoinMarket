package models;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.rest.SerenityRest;

public class ApiConnector {

    public static String BASE_URL = "https://pro-api.coinmarketcap.com/";

    public RequestSpecification requestSpecification(){
        return new RequestSpecBuilder().addHeader("X-CMC_PRO_API_KEY","2c4c8912-a9cf-4a64-bf57-172f3967a406").build();
    }

    public Response getSymbols(String symbols){
        return SerenityRest.
                given(requestSpecification()).
                when().
                get(BASE_URL+"v1/cryptocurrency/info?symbol="+symbols).
                thenReturn().prettyPeek();
    }

//    public Response getSymbol(String symbol){
//        return SerenityRest.
//                given(requestSpecification()).
//                when().
//                get(BASE_URL+"v1/cryptocurrency/info?symbol="+symbol).
//                thenReturn().prettyPeek();
//    }

    public Response convertCurrencies(int id){
        return SerenityRest.given(requestSpecification())
                .when()
                .get(BASE_URL+"v2/tools/price-conversion?id="+id+"&amount=100&convert=BOB")
                .thenReturn().prettyPeek();
    }

    public Response getTechDocumentacion(String id){
        return SerenityRest.given(requestSpecification())
                .when()
                .get(BASE_URL + "v1/cryptocurrency/info?id=" +id)
                .thenReturn().prettyPeek();
    }
}

