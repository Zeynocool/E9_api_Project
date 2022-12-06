package day_03;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.baseURI;
import static org.junit.jupiter.api.Assertions.*;

public class SpartanTest2 {
    /*
        TASK
        Given accept type is Json
        And Id parameter value is 500
        When user sends GET request to /api/spartans/{id}
        Then response status code should be 404
        And response content-type: application/json
        And "Not Found" message should be in response payload
     */


@Test
    public void test2(){
    baseURI="http://54.209.146.158:8000";
    Response response = given().accept(ContentType.JSON)
            .and().pathParam("id", 500)
            .when()
            .get("http://54.209.146.158:8000/api/spartans/{id}");

    System.out.println(response.statusCode());
    assertEquals(404,response.statusCode());
}
}
