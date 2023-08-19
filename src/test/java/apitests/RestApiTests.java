package apitests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;
import static org.hamcrest.Matchers.*;

public class RestApiTests {
    @Owner("Zelenskaia")
    @Feature("API test")

    @Test
    void testMain() {
        String registerData = "{ \"email\": \"eve.holt@reqres.in\", \"password\": \"pistol\"}";

        given()
                .log().uri()
                .log().method()
                .log().body()
                .contentType(JSON)
                .body(registerData)
                .when()
                .post("https://reqres.in/api/register")
                .then()
                .log().status()
                .log().body()
                .statusCode(200)
                .body("token", is("QpwL5tke4Pnpja7X4"));
    }

    @Test
    void testPost() {

        String authData = "{\"name\": \"morpheus\", \"job\": \"zion resident\"}";

        given()
                .log().uri()
                .log().method()
                .log().body()
                .contentType(JSON)
                .body(authData)
                .when()
                .post("https://reqres.in/api/users")
                .then()
                .log().status()
                .log().body()
                .statusCode(201)
                .body("name", is("morpheus"))
                .body("job", is("zion resident"));
    }

    @Test
    void testPostUser() {

        String authData = "{\"name\": \"morpheus\", \"job\": \"zion resident\"}";

        given()
                .log().uri()
                .log().method()
                .log().body()
                .contentType(JSON)
                .body(authData)
                .when()
                .post("https://reqres.in/api/users")
                .then()
                .log().status()
                .log().body()
                .statusCode(201)
                .body("name", is("morpheus"))
                .body("job", is("zion resident"));
    }

    @Test
    void testDelete() {

        given()
                .log().uri()
                .param("page", 1)
                .when()
                .delete("https://reqres.in/api/users/2")
                .then()
                .log().status()
                .statusCode(204);
    }

    @Test
    void testPostStatus() {
        given()
                .log().uri()
                .log().method()
                .log().body()
                .when()
                .get("https://www.thebach.com/cities/nashville-tn/explore")
                .then()
                .log().status()
                .log().body()
                .statusCode(200);
    }

    @Test
    void testGet() {
        RestAssured.baseURI = "https://c11cbkx9qa.execute-api.us-east-1.amazonaws.com/prod/cities/charleston-sc";
        RequestSpecification httpRequest = given();
        Response response = httpRequest.get();
        response.then()
                .log().all()
                .statusCode(200)
                .body("location.postalCode", equalTo("29407")).and()
                .body("picture", is("https://ik.imagekit.io/bi5ihkjoby38/prod-city-guides/guides/385398be-1049-4470-b3e4-31f1bbb65f09"));
    }

    @Test
    void testGet1() {
        RestAssured.baseURI = "https://c11cbkx9qa.execute-api.us-east-1.amazonaws.com/prod/cities/fort-lauderdale-fl";
        RequestSpecification httpRequest = given();
        Response response = httpRequest.get();
        response.then()
                .log().all()
               .statusCode(200)
                .body("tz", is("America/New_York")).and()
                .body("picture",is("https://ik.imagekit.io/bi5ihkjoby38/prod-activities/cities/Fort Lauderdale, FLFri Jul 28 2023 12:35:00 GMT-0400 (Eastern Daylight Time)2")).and()
                .body("name", is("Fort Lauderdale, FL"));




    }

}




