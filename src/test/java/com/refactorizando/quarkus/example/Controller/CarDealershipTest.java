package com.refactorizando.quarkus.example.Controller;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class CarDealershipTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/dealership/modelsByBrand/ford")
          .then()
             .statusCode(200)
             ;
    }

}