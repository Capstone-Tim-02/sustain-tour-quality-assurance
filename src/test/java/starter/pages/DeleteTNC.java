package starter.pages;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteTNC {
    protected String url = "https://destimate.uc.r.appspot.com/";


    //TC_MA_48

    @Step("Admin input valid endpoint to delete TNC")
    public String setPostApiEndpointForValidDeleteTNC(){
        return url + "admin/tnc/22";
    }

    @Step("Admin request with the HTTP method DELETE and input valid TNC ID in the request body")
    public void sendPostHttpRequestForValidDeleteTNC(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzNDk0MTIwLCJpYXQiOjE3MDA5MDIxMjB9.qlUKfXy-A4lumLTCtgKKGJcEiLhtvp7WOWv_zDO0zyA")
                .delete(setPostApiEndpointForValidDeleteTNC());
    }

    @Step("Admin receive a response with status code 200 OK for success delete TNC")
    public void receiveStatusForValidDeleteTNC(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("receive {string} in the response body for TC_AA_48")
    public void receiveMessageForValidDeleteTNC(String message){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 200 && responseBody.contains(message)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Syarat Ketentuan berhasil dihapus");
        }
    }

    //TC_MA_49

    @Step("Admin input invalid endpoint to delete TNC")
    public String setPostApiEndpointForInValidDeleteTNC(){
        return url + "admin/tnc/999";
    }

    @Step("Admin request with the HTTP method DELETE and input invalid TNC ID in the request body")
    public void sendPostHttpRequestForInValidDeleteTNC(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzNDk0MTIwLCJpYXQiOjE3MDA5MDIxMjB9.qlUKfXy-A4lumLTCtgKKGJcEiLhtvp7WOWv_zDO0zyA")
                .delete(setPostApiEndpointForInValidDeleteTNC());
    }

    @Step("Admin receive a response with status code 404 not found for failed delete TNC")
    public void receiveStatusForInValidDeleteTNC(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("receive {string} in the response body for TC_AA_49")
    public void receiveMessageForInValidDeleteTNC(String message){
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
