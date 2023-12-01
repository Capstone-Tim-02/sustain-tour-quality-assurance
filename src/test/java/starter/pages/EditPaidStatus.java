package starter.pages;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class EditPaidStatus {
    protected String url = "https://destimate.uc.r.appspot.com/";

    //TC_MA_66
    @Step("Admin input valid endpoint to edit paid status to true")
    public String setPostApiEndpointEditPaidStatusToTrue(){
        return url + "admin/ticket/1700725341-699";
    }

    @Step("Admin request with the HTTP method PUT and input an valid invoice ID")
    public void sendPostHttpRequestForEditPaidStatusToTrue(){;
        JSONObject requestBody = new JSONObject();
        requestBody.put("paid_status", true);

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzMzkwMTI4LCJpYXQiOjE3MDA3OTgxMjh9.v0E1sZcUAne2jIBc8dNrH8HIxmYkDe2LmrcTl4oI9zo")
                .contentType("application/json")
                .body(requestBody.toString())
                .put(setPostApiEndpointEditPaidStatusToTrue());
    }

    @Step("Admin receive a response with status code 200 for success edit paid status to true")
    public void receiveStatusForEditPaidStatusToTrue(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("Receive {string} in the response body for TC_AA_66")
    public void receiveMessageForEditPaidStatusToTrue(String message){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 200 && responseBody.contains(message)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Status pembayaran berhasil di konfirmasi");
        }
    }


    //TC_MA_67
    @Step("Admin input valid endpoint to edit paid status to false")
    public String setPostApiEndpointEditPaidStatusToFalse(){
        return url + "admin/ticket/1700725341-699";
    }

    @Step("Admin request with the HTTP method PUT and input valid invoice ID")
    public void sendPostHttpRequestForEditPaidStatusToFalse(){;
        JSONObject requestBody = new JSONObject();
        requestBody.put("paid_status", false);

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzMzkwMTI4LCJpYXQiOjE3MDA3OTgxMjh9.v0E1sZcUAne2jIBc8dNrH8HIxmYkDe2LmrcTl4oI9zo")
                .contentType("application/json")
                .body(requestBody.toString())
                .put(setPostApiEndpointEditPaidStatusToTrue());
    }

    @Step("Admin receive a response with status code 200 for success edit paid status to false")
    public void receiveStatusForEditPaidStatusToFalse(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("Receive {string} in the response body for TC_AA_67")
    public void receiveMessageForEditPaidStatusToFalse(String message){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 200 && responseBody.contains(message)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Status pembayaran berhasil di konfirmasi");
        }
    }

    //TC_MA_68
    @Step("Admin input invalid endpoint to edit paid status to true")
    public String setPostApiEndpointForInvalidEditPaidStatusToTrue(){
        return url + "admin/ticket/1699737216-999";
    }

    @Step("Admin request with the HTTP method PUT and input an invalid invoice ID")
    public void sendPostHttpRequestForInvalidEditPaidStatusToTrue(){;
        JSONObject requestBody = new JSONObject();
        requestBody.put("paid_status", true);

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzMzkwMTI4LCJpYXQiOjE3MDA3OTgxMjh9.v0E1sZcUAne2jIBc8dNrH8HIxmYkDe2LmrcTl4oI9zo")
                .contentType("application/json")
                .body(requestBody.toString())
                .put(setPostApiEndpointForInvalidEditPaidStatusToTrue());
    }

    @Step("Admin receive a response with status code 404 for failed edit paid status with invalid invoice ID")
    public void receiveStatusForInvalidEditPaidStatusToTrue(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("Receive {string} in the response body for TC_AA_68")
    public void receiveMessageForInvalidEditPaidStatusToTrue(String message){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 404 && responseBody.contains(message)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Ticket tidak ditemukan");
        }
    }

    //TC_MA_69
    @Step("Admin input invalid endpoint to edit paid status to false")
    public String setPostApiEndpointForInvalidEditPaidStatusToFalse(){
        return url + "admin/ticket/1699737216-999";
    }

    @Step("Admin request with the HTTP method PUT and input invalid invoice ID")
    public void sendPostHttpRequestForInvalidEditPaidStatusToFalse(){;
        JSONObject requestBody = new JSONObject();
        requestBody.put("paid_status", false);

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzMzkwMTI4LCJpYXQiOjE3MDA3OTgxMjh9.v0E1sZcUAne2jIBc8dNrH8HIxmYkDe2LmrcTl4oI9zo")
                .contentType("application/json")
                .body(requestBody.toString())
                .put(setPostApiEndpointForInvalidEditPaidStatusToFalse());
    }

    @Step("Admin receive a response with status code 404 for failed edit paid status with invalid ID")
    public void receiveStatusForInvalidEditPaidStatusToFalse(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("Receive {string} in the response body for TC_AA_69")
    public void receiveMessageForInvalidEditPaidStatusToFalse(String message){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 404 && responseBody.contains(message)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Ticket tidak ditemukan");
        }
    }


    //TC_MA_70
    @Step("Admin input valid endpoint to edit paid status with non boolean")
    public String setPostApiEndpointEditWithNonBoolean(){
        return url + "admin/ticket/1700725341-699";
    }

    @Step("Admin request with the HTTP method PUT and fill request body with non boolean")
    public void sendPostHttpRequestForEditWithNonBoolean(){;
        JSONObject requestBody = new JSONObject();
        requestBody.put("paid_status", "test");

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzMzkwMTI4LCJpYXQiOjE3MDA3OTgxMjh9.v0E1sZcUAne2jIBc8dNrH8HIxmYkDe2LmrcTl4oI9zo")
                .contentType("application/json")
                .body(requestBody.toString())
                .put(setPostApiEndpointEditWithNonBoolean());
    }

    @Step("Admin receive a response with status code 400 for failed edit with non boolean")
    public void receiveStatusForEditWithNonBoolean(){
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("Receive {string} in the response body for TC_AA_70")
    public void receiveMessageForEditWithNonBoolean(String message){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(message)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Kesalahan request body");
        }
    }


}
