package day_01;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

public class GetRequest {

    String url = "http://54.209.146.158:8000/api/spartans";

    @Test
    public void test1() {

        //send a get request and save response inside the Response object
        Response response = RestAssured.get(url);
//print response status code
        System.out.println(response.statusCode());

        //print response body
        response.prettyPrint();
    }
}