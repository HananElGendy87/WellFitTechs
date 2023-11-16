package com.wellFitTechs.steps;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.hamcrest.Matchers.equalTo;

public class ContactUs_BackEnd {



    public class ContactUsApiTest1 {

        private static final String BASE_URI = "https://your-api-base-uri.com";

        @Test
        public void ContactUsFormSubmissionTest1() throws IOException {
            String createCustomerEndpoint = "/createCustomer";

            String jsonFilePath = "path/to/your/customer_data.json";
            String requestBody = new String(Files.readAllBytes(Paths.get(jsonFilePath)));

            String response = RestAssured.given()
                    .baseUri(BASE_URI)
                    .contentType(ContentType.JSON)
                    .body(requestBody)
                    .when()
                    .post(createCustomerEndpoint)
                    .then()
                    .statusCode(400) // Set the expected status code
                    .log().all()    // Log the response details
                    .extract().response().asString();

            JsonPath jsonPath = new JsonPath(response);
            String customerId = jsonPath.getString("id");
            System.out.println("Created customer ID: " + customerId);
        }
    }



    public class ContactUsApiTest2 {

        private static final String BASE_URI = "https://your-api-base-uri.com";

        @Test
        public void contactUsFormSubmissionTest2() {
            String contactUsEndpoint = "/contact-us";

            String requestBody = "{\n" +
                    "  \"name\": \"Hanan\",\n" +
                    "  \"companyName\": \"clinic\",\n" +
                    "  \"phoneNumber\": \"1234567\",\n" +
                    "  \"email\": \"hanan@wellfit.han\",\n" +
                    "  \"selectedOption\": \"DENTAL PLANS\"\n" +
                    "}";

            RestAssured.given()
                    .baseUri(BASE_URI)
                    .contentType(ContentType.JSON)
                    .body(requestBody)
                    .when()
                    .post(contactUsEndpoint)
                    .then()
                    .statusCode(400)
                    .log().all()
                    .body("message", equalTo("Your submission failed because of an error"));
        }
    }

}
