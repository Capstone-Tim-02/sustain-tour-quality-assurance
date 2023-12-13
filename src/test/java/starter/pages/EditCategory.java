package starter.pages;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class EditCategory {
    protected String url = "https://destimate.uc.r.appspot.com/";

    //TC_MA_77
    @Step("Admin input valid endpoint to edit category")
    public String setPostApiEndpointEditCategory(){
        return url + "admin/categories/132";
    }

    @Step("Admin request with the HTTP method PUT and input valid category ID")
    public void sendPostHttpRequestForEditCategory(){;
        JSONObject requestBody = new JSONObject();
        requestBody.put("category_name", "Museum");

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzMzkwMTI4LCJpYXQiOjE3MDA3OTgxMjh9.v0E1sZcUAne2jIBc8dNrH8HIxmYkDe2LmrcTl4oI9zo")
                .contentType("application/json")
                .body(requestBody.toString())
                .put(setPostApiEndpointEditCategory());
    }

    @Step("Admin receive a response with status code 200 for success edit category")
    public void receiveStatusForEditCategory(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("Receive {string} in the response body for TC_AA_77")
    public void receiveMessageForEditCategory(String message){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 200 && responseBody.contains(message)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Berhasil mengupdate kategori");
        }
    }


    //TC_MA_78
    @Step("Admin input valid endpoint to edit category with used category name")
    public String setPostApiEndpointEditCategoryWithUsedName(){
        return url + "admin/categories/132";
    }

    @Step("Admin request with the HTTP method PUT and input valid category ID and used category name")
    public void sendPostHttpRequestForEditCategoryWithUsedName(){;
        JSONObject requestBody = new JSONObject();
        requestBody.put("category_name", "pantai");

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzMzkwMTI4LCJpYXQiOjE3MDA3OTgxMjh9.v0E1sZcUAne2jIBc8dNrH8HIxmYkDe2LmrcTl4oI9zo")
                .contentType("application/json")
                .body(requestBody.toString())
                .put(setPostApiEndpointEditCategoryWithUsedName());
    }

    @Step("Admin receive a response with status code 409 for failed edit category with used category name")
    public void receiveStatusForEditCategoryWithUsedName(){
        restAssuredThat(response -> response.statusCode(409));
    }

    @Step("Receive {string} in the response body for TC_AA_78")
    public void receiveMessageForEditCategoryWithUsedName(String message){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 409 && responseBody.contains(message)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Kategori sudah ada");
        }
    }

    //TC_MA_79
    @Step("Admin input valid endpoint to edit category with empty category name")
    public String setPostApiEndpointEditCategoryWithEmptyName(){
        return url + "admin/categories/132";
    }

    @Step("Admin request with the HTTP method PUT and input valid category ID and empty category name")
    public void sendPostHttpRequestForEditCategoryWithEmptyName(){;
        JSONObject requestBody = new JSONObject();
        requestBody.put("category_name", "");

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzMzkwMTI4LCJpYXQiOjE3MDA3OTgxMjh9.v0E1sZcUAne2jIBc8dNrH8HIxmYkDe2LmrcTl4oI9zo")
                .contentType("application/json")
                .body(requestBody.toString())
                .put(setPostApiEndpointEditCategoryWithEmptyName());
    }

    @Step("Admin receive a response with status code 400 for failed edit category with empty category name")
    public void receiveStatusForEditCategoryWithEmptyName(){
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("Receive {string} in the response body for TC_AA_79")
    public void receiveMessageForEditCategoryWithEmptyName(String message){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(message)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Nama kategori harus minimal 5 karakter");
        }
    }


    //TC_MA_80
    @Step("Admin input valid inendpoint to edit category")
    public String setPostApiEndpointEditCategoryInvalid(){
        return url + "admin/categories/999";
    }

    @Step("Admin request with the HTTP method PUT and input invalid category ID")
    public void sendPostHttpRequestForEditCategoryInvalid(){;
        JSONObject requestBody = new JSONObject();
        requestBody.put("category_name", "pantai");

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzMzkwMTI4LCJpYXQiOjE3MDA3OTgxMjh9.v0E1sZcUAne2jIBc8dNrH8HIxmYkDe2LmrcTl4oI9zo")
                .contentType("application/json")
                .body(requestBody.toString())
                .put(setPostApiEndpointEditCategoryInvalid());
    }

    @Step("Admin receive a response with status code 404 for invalid edit category")
    public void receiveStatusForEditCategoryInvalid(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("Receive {string} in the response body for TC_AA_80")
    public void receiveMessageForEditCategoryInvalid(String message){
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
