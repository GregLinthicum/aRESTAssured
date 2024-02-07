// package com.example;

// import io.restassured.RestAssured;
// import io.restassured.response.Response;
// import org.junit.Test;
// import org.junit.Assert;

// public class MyRestAssuredTest {

//     // Base URI for your API calls (modify as needed)
//     private static final String BASE_URI = "http://localhost";

//     @Test
//     public void testSimpleGetRequest() {
//         Response response = RestAssured.get(BASE_URI + "/endpoint");

//         // Assertions to verify the response
//         int statusCode = response.getStatusCode();
//         Assert.assertEquals(200, statusCode);

//         String responseBody = response.getBody().asString();
//         Assert.assertTrue(responseBody.contains("expected content"));
//     }
// }