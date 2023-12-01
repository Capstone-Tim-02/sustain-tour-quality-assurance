package starter.pages;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeletePromo {
    protected String url = "https://destimate.uc.r.appspot.com/";


    //TC_MA_71

    @Step("Admin input valid endpoint to delete promo")
    public String setPostApiEndpointForValidDeletePromo(){
        return url + "admin/promo/82";
    }

    @Step("Admin request with the HTTP method DELETE and input valid promo ID in the request body")
    public void sendPostHttpRequestForValidDeletePromo(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzNDk0MTIwLCJpYXQiOjE3MDA5MDIxMjB9.qlUKfXy-A4lumLTCtgKKGJcEiLhtvp7WOWv_zDO0zyA")
                .delete(setPostApiEndpointForValidDeletePromo());
    }

    @Step("Admin receive a response with status code 200 OK for success delete promo")
    public void receiveStatusForValidDeletePromo(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("receive {string} in the response body for TC_AA_71")
    public void receiveMessageForValidDeletePromo(String message){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 200 && responseBody.contains(message)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Promo berhasil dihapus");
        }
    }

    //TC_MA_51

    @Step("Admin input invalid endpoint to delete promo")
    public String setPostApiEndpointForInValidDeletePromo(){
        return url + "admin/promo/999";
    }

    @Step("Admin request with the HTTP method DELETE and input invalid promo ID in the request body")
    public void sendPostHttpRequestForInValidDeletePromo(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzNDk0MTIwLCJpYXQiOjE3MDA5MDIxMjB9.qlUKfXy-A4lumLTCtgKKGJcEiLhtvp7WOWv_zDO0zyA")
                .delete(setPostApiEndpointForInValidDeletePromo());
    }

    @Step("Admin receive a response with status code 404 not found for failed delete promo")
    public void receiveStatusForInValidDeletePromo(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("receive {string} in the response body for TC_AA_72")
    public void receiveMessageForInValidDeletePromo(String message){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 404 && responseBody.contains(message)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Promo tidak ditemukan");
        }
    }

}
