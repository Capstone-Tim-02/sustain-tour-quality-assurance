package starter.pages;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class CreateCategory {
    protected String url = "https://destimate.uc.r.appspot.com/";


    //TC_MA_16

    @Step("Admin input valid endpoint to create category")
    public String setPostApiEndpoint(){
        return url + "createcategory";
    }

    @Step("Admin request with the HTTP method POST and input valid category name in the request body")
    public void sendPostHttpRequestForCreateCategory(){;
        JSONObject requestBody = new JSONObject();
        requestBody.put("category_name", "Pegunungan dan Bukit");

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzMzkwMTI4LCJpYXQiOjE3MDA3OTgxMjh9.v0E1sZcUAne2jIBc8dNrH8HIxmYkDe2LmrcTl4oI9zo")
                .contentType("application/json")
                .body(requestBody.toString())
                .post(setPostApiEndpoint());
    }

    @Step("Admin receive a response with status code 201 for create valid category")
    public void receiveStatusForCreateCategory(){
        restAssuredThat(response -> response.statusCode(201));
    }


    //TC_MA_17
    @Step("Admin request with the HTTP method POST and input used category nama in the request body")
    public void sendPostHttpRequestForCreateUsedCategory(){;
        JSONObject requestBody = new JSONObject();
        requestBody.put("category_name", "Taman Bermain");

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzMzkwMTI4LCJpYXQiOjE3MDA3OTgxMjh9.v0E1sZcUAne2jIBc8dNrH8HIxmYkDe2LmrcTl4oI9zo")
                .contentType("application/json")
                .body(requestBody.toString())
                .post(setPostApiEndpoint());
    }

    @Step("Admin receive a response with status code 409 for create promo with used category nama")
    public void receiveStatusForCreateUsedCategory(){
        restAssuredThat(response -> response.statusCode(409));
    }

    @Step("Receive {string} in the response body for TC_AA_17")
    public void receiveMessageForCreateUsedCategory(String message){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 409 && responseBody.contains(message)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Kategori ini sudah ada");
        }
    }



    //TC_MA_18
    @Step("Admin request with the HTTP method POST and input empty category nama in the request body")
    public void sendPostHttpRequestForCreateEmptyCategory(){;
        JSONObject requestBody = new JSONObject();
        requestBody.put("category_name", "");

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzMzkwMTI4LCJpYXQiOjE3MDA3OTgxMjh9.v0E1sZcUAne2jIBc8dNrH8HIxmYkDe2LmrcTl4oI9zo")
                .contentType("application/json")
                .body(requestBody.toString())
                .post(setPostApiEndpoint());
    }

    @Step("Admin receive a response with status code 400 for create promo with empty category name")
    public void receiveStatusForCreateEmptyCategory(){
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("Receive {string} in the response body for TC_AA_18")
    public void receiveMessageForCreateEmptyCategory(String message){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(message)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Nama category minimal terdiri dari 5 karakter");
        }
    }

}
