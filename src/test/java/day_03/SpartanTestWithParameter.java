package day_03;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.junit.jupiter.api.Assertions.*;


public class SpartanTestWithParameter {
    String url="http://54.209.146.158:8000";

@Test
    public void test() {
        Response response = given().accept(ContentType.XML)
                .and().pathParam("id", 5)
                .when()
                .get(url+"/api/spartans/{id}");
        System.out.println("response = " + response.statusCode());
        System.out.println("response.contentType() = " + response.contentType());
        assertEquals(200, response.statusCode());

    }

}
