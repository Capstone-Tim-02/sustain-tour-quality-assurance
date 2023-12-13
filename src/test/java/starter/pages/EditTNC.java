package starter.pages;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class EditTNC {
    protected String url = "https://destimate.uc.r.appspot.com/";

    //TC_MA_58
    @Step("Admin input valid endpoint to edit TNC")
    public String setPostApiEndpointEditTNC(){
        return url + "admin/tnc/12";
    }

    @Step("Admin request with the HTTP method POST and input valid TNC credentials on the request body")
    public void sendPostHttpRequestForEditTNC(){;
        JSONObject requestBody = new JSONObject();
        requestBody.put("tnc_name", "Pembelian Tiket Wisata");
        requestBody.put("description", "Untuk Pembelian tiket, user diharuskan login dan mengisi identitas diri");

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzMzkwMTI4LCJpYXQiOjE3MDA3OTgxMjh9.v0E1sZcUAne2jIBc8dNrH8HIxmYkDe2LmrcTl4oI9zo")
                .contentType("application/json")
                .body(requestBody.toString())
                .put(setPostApiEndpointEditTNC());
    }

    @Step("Admin receive a response with status code 200 for create valid TNC")
    public void receiveStatusForEditTNC(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("Receive {string} in the response body for TC_AA_58")
    public void receiveMessageForEditTNC(String message){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 200 && responseBody.contains(message)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Syarat Ketentuan berhasil diupdate");
        }
    }


    //TC_MA_59
    @Step("Admin input valid endpoint to edit TNC with existing title")
    public String setPostApiEndpointEditTNCWithExistingTitle(){
        return url + "admin/tnc/12";
    }

    @Step("Admin request with the HTTP method PUT and input valid TNC ID and existing title in the request body")
    public void sendPostHttpRequestForEditTNCWithExistingTitle(){;
        JSONObject requestBody = new JSONObject();
        requestBody.put("tnc_name", "Pembelian Tiket");
        requestBody.put("description", "Untuk Pembelian tiket, user diharuskan login dan mengisi identitas diri");

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzMzkwMTI4LCJpYXQiOjE3MDA3OTgxMjh9.v0E1sZcUAne2jIBc8dNrH8HIxmYkDe2LmrcTl4oI9zo")
                .contentType("application/json")
                .body(requestBody.toString())
                .put(setPostApiEndpointEditTNCWithExistingTitle());
    }

    @Step("Admin receive a response with status code 409 for failed edit TNC with existing title")
    public void receiveStatusForEditTNCWithExistingTitle(){
        restAssuredThat(response -> response.statusCode(409));
    }

    @Step("Receive {string} in the response body for TC_AA_59")
    public void receiveMessageForEditTNCWithExistingTitle(String message){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 409 && responseBody.contains(message)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Syarat Ketentuan dengan nama ini sudah ada");
        }
    }


    //TC_MA_61
    @Step("Admin input invalid endpoint to edit TNC")
    public String setPostApiEndpointEditTNCInvalid(){
        return url + "admin/tnc/999";
    }

    @Step("Admin request with the HTTP method PUT and input invalid TNC ID in the request body")
    public void sendPostHttpRequestForEditTNCInvalid(){;
        JSONObject requestBody = new JSONObject();
        requestBody.put("tnc_name", "Pembelian Tiket Wisata");
        requestBody.put("description", "Untuk Pembelian tiket, user diharuskan login dan mengisi identitas diri");

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzMzkwMTI4LCJpYXQiOjE3MDA3OTgxMjh9.v0E1sZcUAne2jIBc8dNrH8HIxmYkDe2LmrcTl4oI9zo")
                .contentType("application/json")
                .body(requestBody.toString())
                .put(setPostApiEndpointEditTNCInvalid());
    }

    @Step("Admin receive a response with status code 404 for failed invalid edit TNC")
    public void receiveStatusForEditTNCInvalid(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("Receive {string} in the response body for TC_AA_61")
    public void receiveMessageForEditTNCInvalid(String message){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 404 && responseBody.contains(message)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Syarat Ketentuan tidak ditemukan");
        }
    }
}
