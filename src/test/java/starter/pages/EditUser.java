package starter.pages;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class EditUser {
    protected String url = "https://destimate.uc.r.appspot.com/";

    //TC_MA_81
    @Step("Admin input valid endpoint to edit users")
    public String setPostApiEndpointEditUser(){
        return url + "admin/user/89";
    }

    @Step("Admin request with the HTTP method PUT and input valid user ID")
    public void sendPostHttpRequestForEditUser(){;
        JSONObject requestBody = new JSONObject();
        requestBody.put("nama", "Angeline");
        requestBody.put("username", "angeline123");
        requestBody.put("email", "angeline123@gmail.com");
        requestBody.put("phone_number", "08238912392");

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzMzkwMTI4LCJpYXQiOjE3MDA3OTgxMjh9.v0E1sZcUAne2jIBc8dNrH8HIxmYkDe2LmrcTl4oI9zo")
                .contentType("application/json")
                .body(requestBody.toString())
                .put(setPostApiEndpointEditUser());
    }

    @Step("Admin receive a response with status code 200 for success edit user")
    public void receiveStatusForEditUser(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("Receive {string} in the response body for TC_AA_81")
    public void receiveMessageForEditUser(String message){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 200 && responseBody.contains(message)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Berhasil mengupdate data user");
        }
    }

    //TC_MA_82
    @Step("Admin input valid endpoint to edit user with used username")
    public String setPostApiEndpointEditUserWithUsedUsername(){
        return url + "admin/user/89";
    }

    @Step("Admin request with the HTTP method PUT and input valid user ID and used username")
    public void sendPostHttpRequestForEditUserWithUsedUsername(){;
        JSONObject requestBody = new JSONObject();
        requestBody.put("nama", "Angeline");
        requestBody.put("username", "putrishn27");
        requestBody.put("email", "angeline123@gmail.com");
        requestBody.put("phone_number", "08238912392");

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzMzkwMTI4LCJpYXQiOjE3MDA3OTgxMjh9.v0E1sZcUAne2jIBc8dNrH8HIxmYkDe2LmrcTl4oI9zo")
                .contentType("application/json")
                .body(requestBody.toString())
                .put(setPostApiEndpointEditUserWithUsedUsername());
    }

    @Step("Admin receive a response with status code 409 for failed edit user with used username")
    public void receiveStatusForEditUserWithUsedUsername(){
        restAssuredThat(response -> response.statusCode(409));
    }

    @Step("Receive {string} in the response body for TC_AA_82")
    public void receiveMessageForEditUserWithUsedUsername(String message){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 409 && responseBody.contains(message)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Username sudah digunakan oleh user lain, silahkan coba yang lain");
        }
    }


    //TC_MA_83
    @Step("Admin input valid endpoint to edit user with used email")
    public String setPostApiEndpointEditUserWithUsedEmail(){
        return url + "admin/user/89";
    }

    @Step("Admin request with the HTTP method PUT and input valid user ID and used email")
    public void sendPostHttpRequestForEditUserWithUsedEmail(){;
        JSONObject requestBody = new JSONObject();
        requestBody.put("nama", "Angeline");
        requestBody.put("username", "angeline123");
        requestBody.put("email", "ruthputri135@gmail.com");
        requestBody.put("phone_number", "08238912392");

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzMzkwMTI4LCJpYXQiOjE3MDA3OTgxMjh9.v0E1sZcUAne2jIBc8dNrH8HIxmYkDe2LmrcTl4oI9zo")
                .contentType("application/json")
                .body(requestBody.toString())
                .put(setPostApiEndpointEditUserWithUsedEmail());
    }

    @Step("Admin receive a response with status code 409 for failed edit user with used email")
    public void receiveStatusForEditUserWithUsedEmail(){
        restAssuredThat(response -> response.statusCode(409));
    }

    @Step("Receive {string} in the response body for TC_AA_82")
    public void receiveMessageForEditUserWithUsedEmail(String message){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 409 && responseBody.contains(message)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Email sudah digunakan user lain");
        }
    }


    //TC_MA_84
    @Step("Admin input valid endpoint to edit user with used phone")
    public String setPostApiEndpointEditUserWithUsedPhone(){
        return url + "admin/user/89";
    }

    @Step("Admin request with the HTTP method PUT and input valid user ID and used phone")
    public void sendPostHttpRequestForEditUserWithUsedPhone(){;
        JSONObject requestBody = new JSONObject();
        requestBody.put("nama", "Angeline");
        requestBody.put("username", "angeline123");
        requestBody.put("email", "angeline@gmail.com");
        requestBody.put("phone_number", "7973324420");

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzMzkwMTI4LCJpYXQiOjE3MDA3OTgxMjh9.v0E1sZcUAne2jIBc8dNrH8HIxmYkDe2LmrcTl4oI9zo")
                .contentType("application/json")
                .body(requestBody.toString())
                .put(setPostApiEndpointEditUserWithUsedPhone());
    }

    @Step("Admin receive a response with status code 409 for failed edit user with used phone")
    public void receiveStatusForEditUserWithUsedPhone(){
        restAssuredThat(response -> response.statusCode(409));
    }

    @Step("Receive {string} in the response body for TC_AA_84")
    public void receiveMessageForEditUserWithUsedPhone(String message){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 409 && responseBody.contains(message)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Nomor telphone telah digunakan oleh user lain");
        }
    }


    //TC_MA_85
    @Step("Admin input invalid endpoint to edit user")
    public String setPostApiEndpointEditUserWithInvalidID(){
        return url + "admin/user/999";
    }

    @Step("Admin request with the HTTP method PUT and input invalid user ID")
    public void sendPostHttpRequestForEditUserWithInvalidID(){;
        JSONObject requestBody = new JSONObject();
        requestBody.put("nama", "Angeline");
        requestBody.put("username", "angeline123");
        requestBody.put("email", "angeline@gmail.com");
        requestBody.put("phone_number", "7973324420");

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzMzkwMTI4LCJpYXQiOjE3MDA3OTgxMjh9.v0E1sZcUAne2jIBc8dNrH8HIxmYkDe2LmrcTl4oI9zo")
                .contentType("application/json")
                .body(requestBody.toString())
                .put(setPostApiEndpointEditUserWithInvalidID());
    }

    @Step("Admin receive a response with status code 404 for failed edit user")
    public void receiveStatusForEditUserWithInvalidID(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("Receive {string} in the response body for TC_AA_85")
    public void receiveMessageForEditUserWithInvalidID(String message){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 404 && responseBody.contains(message)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("User tidak ditemukan");
        }
    }


}
