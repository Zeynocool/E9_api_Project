package day_02;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.baseURI;
import static org.junit.jupiter.api.Assertions.*;

public class NegativeTaskSpartan {


       String baseURI = "http://54.209.146.158:8000/api/spartans/10";


    @Test
    public void test2() {
        Response response=given().accept(ContentType.XML
                )
                .when()
                .get(baseURI);
        System.out.println("response statuscode = " + response.statusCode());
        System.out.println("response.contentType() = " + response.contentType());
        assertEquals(406, response.statusCode());
    }

}
