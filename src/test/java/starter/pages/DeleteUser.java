package starter.pages;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteUser {
    protected String url = "https://destimate.uc.r.appspot.com/";


    //TC_MA_50

    @Step("Admin input valid endpoint to delete user")
    public String setPostApiEndpointForValidDeleteUser(){
        return url + "admin/user/109";
    }

    @Step("Admin request with the HTTP method DELETE and input valid user ID in the request body")
    public void sendPostHttpRequestForValidDeleteUser(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzNDk0MTIwLCJpYXQiOjE3MDA5MDIxMjB9.qlUKfXy-A4lumLTCtgKKGJcEiLhtvp7WOWv_zDO0zyA")
                .delete(setPostApiEndpointForValidDeleteUser());
    }

    @Step("Admin receive a response with status code 200 OK for success delete user")
    public void receiveStatusForValidDeleteUser(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("receive {string} in the response body for TC_AA_48")
    public void receiveMessageForValidDeleteUser(String message){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 200 && responseBody.contains(message)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Berhasil menghapus data user");
        }
    }

    //TC_MA_51

    @Step("Admin input invalid endpoint to delete user")
    public String setPostApiEndpointForInValidDeleteUser(){
        return url + "admin/user/999";
    }

    @Step("Admin request with the HTTP method DELETE and input invalid user ID in the request body")
    public void sendPostHttpRequestForInValidDeleteUser(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzNDk0MTIwLCJpYXQiOjE3MDA5MDIxMjB9.qlUKfXy-A4lumLTCtgKKGJcEiLhtvp7WOWv_zDO0zyA")
                .delete(setPostApiEndpointForInValidDeleteUser());
    }

    @Step("Admin receive a response with status code 404 not found for failed delete user")
    public void receiveStatusForInValidDeleteUser(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("receive {string} in the response body for TC_AA_49")
    public void receiveMessageForInValidDeleteUser(String message){
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
