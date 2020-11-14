package com.refactorizando.quarkus.example;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest
public class CarDealershipTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/dealership/models?brand=ford")
          .then()
             .statusCode(200)
             ;
    }

}