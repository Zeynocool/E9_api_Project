package day_02;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.internal.common.assertion.Assertion;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import ettğimiz zaman tekrar çağıtmamıza gerek yok

import static io.restassured.RestAssured.*;
import static org.junit.jupiter.api.Assertions.*;


public class SimpleGetRequestSpartan {
    String baseUrl = "http://54.209.146.158:8000";
    String hrBaseUrl="http://54.209.146.158:1000/ords/hr";

    @Test
    public void test1() {

        Response response =given().accept(ContentType.JSON)
                .when()
                .get(baseUrl+"/api/spartans");

        System.out.println("response statuscode = " +response.statusCode());
        System.out.println("response.contentType() = " + response.contentType());

       assertEquals(response.statusCode(),200);
        assertEquals(response.contentType(),"application/json");
        assertTrue(response.getBody().asString().contains("Fidole"));

    }

    @Test
    public void test2(){
        Response response= given().accept(ContentType.TEXT)
                .when()
                .get(baseUrl+"/api/hello");

        System.out.println(response.statusCode());
        System.out.println(response.contentType());
        assertEquals(response.statusCode(),200);
        Assertions.assertTrue(response.contentType().contains("text"));

    }
    @Test
    public void test3() {

        Response response = given().accept(ContentType.JSON)
                .when()
                .get(hrBaseUrl+"/regions");

        System.out.println("response statuscode = " +response.statusCode());
        System.out.println("response.contentType() = " + response.contentType());
        response.prettyPrint();


        assertEquals(response.statusCode(),200);
        assertEquals(response.contentType(),"application/json");
        Assertions.assertTrue(response.getBody().asString().contains("Americ"));



    }
}