//   Before running start the server:
//   PS C:\MicroservicesProjts\ShiftLeft\danteachqe\calculator>  c:; cd 'c:\MicroservicesProjts\ShiftLeft\danteachqe\calculator'; & 'C:\Program Files\Java\jdk-18.0.2.1\bin\java.exe' '@C:\Users\Greg\AppData\Local\Temp\cp_eb6bkadctcwzubajji7whtxdp.argfile' 'com.CalculatorApplication'
//  

package com.example;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Before;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class CalculatorControllerTest {

    private static final String BASE_URL = "http://localhost:8080"; // Replace with your actual server URL

    @Before
    public void setup() {
        // Configure RestAssured base URI and authentication (if needed)
        RestAssured.baseURI = BASE_URL;
    }

    @Test
    public void testAddOperation() {
        String jsonPayload = "{"
                + "\"operation\": \"add\","
                + "\"number1\": 103,"
                + "\"number2\": 20"
                + "}";

        // CalculationRequest request = new CalculationRequest("add", 5, 3);
        Response response = given()
                .contentType(ContentType.JSON)
                .body(jsonPayload)
                .when()
                .post("/calculate");

        assertThat(response.statusCode(), equalTo(200));
        response.then().body("result", equalTo(123.0F));
        System.out.print("********     RESPONSE:" + response.getBody().asString() + "  *************\n\n");
    }
}