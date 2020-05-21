package com.automation.tests.day3;

import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.junit.jupiter.api.Assertions.*;

public class ExchangeRatesAPITests {


     @BeforeAll
    public static void setup(){
        baseURI = "http://api.openrates.io/";
    }

    @Test
     public void getLatestRates(){
        Response response =  get("/latest").prettyPeek();
        response.then().assertThat().statusCode(200);
     }
}
