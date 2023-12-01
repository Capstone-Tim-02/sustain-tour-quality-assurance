package starter.pages;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteCategory {
    protected String url = "https://destimate.uc.r.appspot.com/";


    //TC_MA_73

    @Step("Admin input valid endpoint to delete category")
    public String setPostApiEndpointForValidDeleteCategory(){
        return url + "admin/categories/136";
    }

    @Step("Admin request with the HTTP method DELETE and input valid category ID in the request body")
    public void sendPostHttpRequestForValidDeleteCategory(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzNDk0MTIwLCJpYXQiOjE3MDA5MDIxMjB9.qlUKfXy-A4lumLTCtgKKGJcEiLhtvp7WOWv_zDO0zyA")
                .delete(setPostApiEndpointForValidDeleteCategory());
    }

    @Step("Admin receive a response with status code 200 OK for success delete category")
    public void receiveStatusForValidDeleteCategory(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("receive {string} in the response body for TC_AA_73")
    public void receiveMessageForValidDeleteCategory(String message){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 200 && responseBody.contains(message)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Kategori berhasil dihapus");
        }
    }

    //TC_MA_74

    @Step("Admin input invalid endpoint to delete category")
    public String setPostApiEndpointForInValidDeleteCategory(){
        return url + "admin/categories/999";
    }

    @Step("Admin request with the HTTP method DELETE and input invalid category ID in the request body")
    public void sendPostHttpRequestForInValidDeleteCategory(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzNDk0MTIwLCJpYXQiOjE3MDA5MDIxMjB9.qlUKfXy-A4lumLTCtgKKGJcEiLhtvp7WOWv_zDO0zyA")
                .delete(setPostApiEndpointForInValidDeleteCategory());
    }

    @Step("Admin receive a response with status code 404 not found for failed delete category")
    public void receiveStatusForInValidDeleteCategory(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("receive {string} in the response body for TC_AA_74")
    public void receiveMessageForInValidDeleteCategory(String message){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 404 && responseBody.contains(message)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Kategori tidak ditemukan");
        }
    }

}
