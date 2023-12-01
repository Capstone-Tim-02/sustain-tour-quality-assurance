package starter.pages;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class CreateTNC {
    protected String url = "https://destimate.uc.r.appspot.com/";

    @Step("Admin input valid endpoint to create TNC")
    public String setPostApiEndpoint(){
        return url + "admin/tnc";
    }


    //TC_MA_36
    @Step("Admin request with the HTTP method POST and input valid TNC credentials on the request body")
    public void sendPostHttpRequestForCreateTNC(){;
        JSONObject requestBody = new JSONObject();
        requestBody.put("tnc_name", "Pembelian Tiket Taman Bermain");
        requestBody.put("description", "Untuk Pembelian tiket taman, user diharuskan login dan mengisi identitas diri");

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzMzkwMTI4LCJpYXQiOjE3MDA3OTgxMjh9.v0E1sZcUAne2jIBc8dNrH8HIxmYkDe2LmrcTl4oI9zo")
                .contentType("application/json")
                .body(requestBody.toString())
                .post(setPostApiEndpoint());
    }

    @Step("Admin receive a response with status code 201 for create valid TNC")
    public void receiveStatusForCreateTNC(){
        restAssuredThat(response -> response.statusCode(201));
    }


    //TC_MA_37
    @Step("Admin request with the HTTP method POST and input used TNC nama in the request body")
    public void sendPostHttpRequestForCreateUsedTNC(){;
        JSONObject requestBody = new JSONObject();
        requestBody.put("tnc_name", "Pembelian Tiket");
        requestBody.put("description", "Untuk Pembelian tiket, user diharuskan login dan mengisi identitas diri");

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzMzkwMTI4LCJpYXQiOjE3MDA3OTgxMjh9.v0E1sZcUAne2jIBc8dNrH8HIxmYkDe2LmrcTl4oI9zo")
                .contentType("application/json")
                .body(requestBody.toString())
                .post(setPostApiEndpoint());
    }

    @Step("Admin receive a response with status code 409 for create TNC with used TNC nama")
    public void receiveStatusForCreateUsedTNC(){
        restAssuredThat(response -> response.statusCode(409));
    }

    @Step("Receive {string} in the response body for TC_AA_37")
    public void receiveMessageForCreateUsedTNC(String message){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 409 && responseBody.contains(message)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Syarat Ketentuan dengan nama ini sudah ada");
        }
    }


    //TC_MA_38
    @Step("Admin request with the HTTP method POST and input empty TNC nama in the request body")
    public void sendPostHttpRequestForCreateEmptyTNC(){;
        JSONObject requestBody = new JSONObject();
        requestBody.put("tnc_name", "");
        requestBody.put("description", "Untuk Pembelian tiket, user diharuskan login dan mengisi identitas diri");

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzMzkwMTI4LCJpYXQiOjE3MDA3OTgxMjh9.v0E1sZcUAne2jIBc8dNrH8HIxmYkDe2LmrcTl4oI9zo")
                .contentType("application/json")
                .body(requestBody.toString())
                .post(setPostApiEndpoint());
    }

    @Step("Admin receive a response with status code 400 for create TNC with empty TNC name")
    public void receiveStatusForCreateEmptyTNC(){
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("Receive {string} in the response body for TC_AA_38")
    public void receiveMessageForCreateEmptyTNC(String message){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(message)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Nama Syarat Ketentuan minimal 5 karakter");
        }
    }


    //TC_MA_39
    @Step("Admin request with the HTTP method POST and input empty TNC description in the request body")
    public void sendPostHttpRequestForCreateEmptyTNCDesc(){;
        JSONObject requestBody = new JSONObject();
        requestBody.put("tnc_name", "Pendaftaran WIsata");
        requestBody.put("description", "");

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzMzkwMTI4LCJpYXQiOjE3MDA3OTgxMjh9.v0E1sZcUAne2jIBc8dNrH8HIxmYkDe2LmrcTl4oI9zo")
                .contentType("application/json")
                .body(requestBody.toString())
                .post(setPostApiEndpoint());
    }

    @Step("Admin receive a response with status code 400 for create TNC with empty TNC description")
    public void receiveStatusForCreateEmptyTNCDesc(){
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("Receive {string} in the response body for TC_AA_39")
    public void receiveMessageForCreateEmptyTNCDesc(String message){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(message)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Deskripsi minimal 10 karakter");
        }
    }


    //TC_MA_40
    @Step("Admin request with the HTTP method POST and input empty TNC nama and description in the request body")
    public void sendPostHttpRequestForCreateEmptyTNCDescAndName(){;
        JSONObject requestBody = new JSONObject();
        requestBody.put("tnc_name", "");
        requestBody.put("description", "");

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzMzkwMTI4LCJpYXQiOjE3MDA3OTgxMjh9.v0E1sZcUAne2jIBc8dNrH8HIxmYkDe2LmrcTl4oI9zo")
                .contentType("application/json")
                .body(requestBody.toString())
                .post(setPostApiEndpoint());
    }

    @Step("Admin receive a response with status code 400 for create promo with empty TNC name and description")
    public void receiveStatusForCreateEmptyTNCDescAndName(){
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("Receive {string} in the response body for TC_AA_40")
    public void receiveMessageForCreateEmptyTNCDescAndName(String message){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(message)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Nama Syarat Ketentuan minimal 5 karakter");
        }
    }


}
