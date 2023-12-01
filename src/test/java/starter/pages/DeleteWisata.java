package starter.pages;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteWisata {
    protected String url = "https://destimate.uc.r.appspot.com/";


    //TC_MA_46

    @Step("Admin input valid endpoint to delete wisata")
    public String setPostApiEndpointForValidDeleteWisata(){
        return url + "admin/wisata/86";
    }

    @Step("Admin request with the HTTP method DELETE and input valid wisata ID in the request body")
    public void sendPostHttpRequestForValidDeleteWisata(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzNDk0MTIwLCJpYXQiOjE3MDA5MDIxMjB9.qlUKfXy-A4lumLTCtgKKGJcEiLhtvp7WOWv_zDO0zyA")
                .delete(setPostApiEndpointForValidDeleteWisata());
    }

    @Step("Admin receive a response with status code 200 OK for success delete wisata")
    public void receiveStatusForValidDeleteWisata(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("receive {string} in the response body for TC_AA_46")
    public void receiveMessageForValidDeleteWisata(String message){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 200 && responseBody.contains(message)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Wisata berhasil dihapus");
        }
    }

    //TC_MA_47

    @Step("Admin input invalid endpoint to delete wisata")
    public String setPostApiEndpointForInValidDeleteWisata(){
        return url + "admin/wisata/999";
    }

    @Step("Admin request with the HTTP method DELETE and input invalid wisata ID in the request body")
    public void sendPostHttpRequestForInValidDeleteWisata(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzNDk0MTIwLCJpYXQiOjE3MDA5MDIxMjB9.qlUKfXy-A4lumLTCtgKKGJcEiLhtvp7WOWv_zDO0zyA")
                .delete(setPostApiEndpointForInValidDeleteWisata());
    }

    @Step("Admin receive a response with status code 404 not found for failed delete wisata")
    public void receiveStatusForInValidDeleteWisata(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("receive {string} in the response body for TC_AA_47")
    public void receiveMessageForInValidDeleteWisata(String message){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 404 && responseBody.contains(message)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Wisata berhasil dihapus");
        }
    }

}
