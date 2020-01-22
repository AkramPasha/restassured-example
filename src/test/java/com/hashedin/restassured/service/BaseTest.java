package com.hashedin.restassured.service;

public class BaseTest {

    private String apiKey = "";
    private String token = "";
    private String baseURL = "https://api.trello.com";

    String getParsedURL(String relativePath) {

        return baseURL.concat(relativePath)
                .concat("?key=").concat(apiKey)
                .concat("&token=").concat(token);
    }
}
