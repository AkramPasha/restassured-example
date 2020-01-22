package com.hashedin.restassured.service;

import org.junit.Test;
import io.restassured.RestAssured;

public class ExampleTest extends BaseTest {

    @Test
    public void simpleGETTest() {
        String url = getParsedURL("/1/members/me/boards");
        RestAssured.given().when().get(url)
                .then().statusCode(200);
    }

    @Test
    public void simplePOSTTest() {
        String url = getParsedURL("/1/boards/5e2704e2e054f744cf2b702d/lists");
        String queryParameters = ("&name=name1&pos=top");
        url = url.concat(queryParameters);
        RestAssured.given()
                .contentType("application/json\r\n")
                .when().post(url)
                .then().statusCode(200);
    }

}
