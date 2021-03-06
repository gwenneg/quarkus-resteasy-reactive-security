package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest
public class SecurityResourceTest {

    @Test
    public void testJsonBody() {
        given()
                .contentType(ContentType.JSON)
                .when()
                .post("/security/json-body")
                .then()
                .statusCode(403);
    }

    @Test
    public void testTextBody() {
        given()
                .contentType(ContentType.TEXT)
                .when()
                .post("/security/string-body")
                .then()
                .statusCode(403);
    }
}