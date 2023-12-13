package starter.pages;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteTicket {
    protected String url = "https://destimate.uc.r.appspot.com/";


    //TC_MA_75

    @Step("Admin input valid endpoint to delete ticket")
    public String setPostApiEndpointForValidDeleteTicket(){
        return url + "admin/ticket/1701415048-844";
    }

    @Step("Admin request with the HTTP method DELETE and input valid ticket ID in the request body")
    public void sendPostHttpRequestForValidDeleteTicket(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzNDk0MTIwLCJpYXQiOjE3MDA5MDIxMjB9.qlUKfXy-A4lumLTCtgKKGJcEiLhtvp7WOWv_zDO0zyA")
                .delete(setPostApiEndpointForValidDeleteTicket());
    }

    @Step("Admin receive a response with status code 200 OK for success delete ticket")
    public void receiveStatusForValidDeleteTicket(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("receive {string} in the response body for TC_AA_75")
    public void receiveMessageForValidDeleteTicket(String message){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 200 && responseBody.contains(message)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Ticket deleted successfully");
        }
    }

    //TC_MA_76

    @Step("Admin input invalid endpoint to delete ticket")
    public String setPostApiEndpointForInValidDeleteTicket(){
        return url + "admin/ticket/1701396109-999";
    }

    @Step("Admin request with the HTTP method DELETE and input invalid ticket ID in the request body")
    public void sendPostHttpRequestForInValidDeleteTicket(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzNDk0MTIwLCJpYXQiOjE3MDA5MDIxMjB9.qlUKfXy-A4lumLTCtgKKGJcEiLhtvp7WOWv_zDO0zyA")
                .delete(setPostApiEndpointForInValidDeleteTicket());
    }

    @Step("Admin receive a response with status code 404 not found for failed delete ticket")
    public void receiveStatusForInValidDeleteTicket(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("receive {string} in the response body for TC_AA_76")
    public void receiveMessageForInValidDeleteTicket(String message){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 404 && responseBody.contains(message)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Ticket not found");
        }
    }

}
