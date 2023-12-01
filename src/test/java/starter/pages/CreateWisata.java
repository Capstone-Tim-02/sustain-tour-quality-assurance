package starter.pages;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import java.io.File;


import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class CreateWisata {
    protected String url = "https://destimate.uc.r.appspot.com/";

    @Step("Admin input valid endpoint to create wisata")
    public String setPostApiEndpoint(){
        return url + "wisata/create";
    }


    //TC_MA_41
    @Step("Admin request with the HTTP method POST and input valid wisata credentials on the request body")
    public void sendPostHttpRequestForCreateWisata(){;

        SerenityRest.given()
                .contentType("multipart/form-data")
                .multiPart("title", "Pantai Dummy")
                .multiPart("kode", "DMY")
                .multiPart("location", "Jawa Timur")
                .multiPart("kota", "malang")
                .multiPart("description", "Pantai Dummy")
                .multiPart("price", 25000)
                .multiPart("available_tickets", 1)
                .multiPart("lat", 1.31183923)
                .multiPart("long", 53.3231)
                .multiPart("category_name", "pantai")
                .multiPart("maps_link", "https://pantai.com")
                .multiPart("is_open", true)
                .multiPart("description_is_open", "Buka Jam 08.00-20.00")
                .multiPart("description_is_open", true)
                .multiPart("fasilitas", "Toilet,Wastafel")
                .multiPart("video_link", "")
                .multiPart("image1", new File("src/test/resources/foto/pantai.jpg"), "image/jpeg")


                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzNDc5NjUxLCJpYXQiOjE3MDA4ODc2NTF9.6seAzjyjKtCspLZUUsUYl_MpYMtvB5MkcE3dJz1eJEQ")
                .post(setPostApiEndpoint());
    }

    @Step("Admin receive a response with status code 201 for success create wisata")
    public void receiveStatusForCreateWisata(){
        restAssuredThat(response -> response.statusCode(201));
    }



    //TC_MA_42
    @Step("Admin request with the HTTP method POST and input empty wisata title in the request body")
    public void sendPostHttpRequestForCreateWisataWithEmptyTitle(){;

        SerenityRest.given()
                .contentType("multipart/form-data")
                .multiPart("title", "")
                .multiPart("kode", "DMY")
                .multiPart("location", "Jawa Timur")
                .multiPart("kota", "malang")
                .multiPart("description", "Pantai Dummy")
                .multiPart("price", 25000)
                .multiPart("available_tickets", 1)
                .multiPart("lat", 1.31183923)
                .multiPart("long", 53.3231)
                .multiPart("category_name", "pantai")
                .multiPart("maps_link", "https://pantai.com")
                .multiPart("is_open", true)
                .multiPart("description_is_open", "Buka Jam 08.00-20.00")
                .multiPart("description_is_open", true)
                .multiPart("fasilitas", "Toilet,Wastafel")
                .multiPart("video_link", "")
                .multiPart("image1", new File("src/test/resources/foto/pantai.jpg"), "image/jpeg")


                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzNDc5NjUxLCJpYXQiOjE3MDA4ODc2NTF9.6seAzjyjKtCspLZUUsUYl_MpYMtvB5MkcE3dJz1eJEQ")
                .post(setPostApiEndpoint());
    }

    @Step("Admin receive a response with status code 400 for create wisata with empty title")
    public void receiveStatusForCreateWisataWithEmptyTitle(){
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("Receive {string} in the response body for TC_AA_42")
    public void receiveMessageForCreateWisataWithEmptyTitleC(String message){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(message)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Judul harus minimal 8 huruf");
        }
    }


    //TC_MA_43
    @Step("Admin request with the HTTP method POST and input used wisata title in the request body")
    public void sendPostHttpRequestForCreateWisataWithUsedTitle(){;

        SerenityRest.given()
                .contentType("multipart/form-data")
                .multiPart("title", "Pantai Dummy")
                .multiPart("kode", "PBB")
                .multiPart("location", "Jawa Timur")
                .multiPart("kota", "malang")
                .multiPart("description", "Pantai Dummy")
                .multiPart("price", 25000)
                .multiPart("available_tickets", 1)
                .multiPart("lat", 1.31183923)
                .multiPart("long", 53.3231)
                .multiPart("category_name", "pantai")
                .multiPart("maps_link", "https://pantai.com")
                .multiPart("is_open", true)
                .multiPart("description_is_open", "Buka Jam 08.00-20.00")
                .multiPart("description_is_open", true)
                .multiPart("fasilitas", "Toilet,Wastafel")
                .multiPart("video_link", "")
                .multiPart("image1", new File("src/test/resources/foto/pantai.jpg"), "image/jpeg")


                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzNDc5NjUxLCJpYXQiOjE3MDA4ODc2NTF9.6seAzjyjKtCspLZUUsUYl_MpYMtvB5MkcE3dJz1eJEQ")
                .post(setPostApiEndpoint());
    }

    @Step("Admin receive a response with status code 400 for create wisata with used title")
    public void receiveStatusForCreateWisataWithUsedTitle(){
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("Receive {string} in the response body for TC_AA_43")
    public void receiveMessageForCreateWisataWithUsedTitle(String message){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(message)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Judul sudah digunakan");
        }
    }


    //TC_MA_44
    @Step("Admin request with the HTTP method POST and input >0 wisata price in the request body")
    public void sendPostHttpRequestForCreateWisataWith0Price(){;

        SerenityRest.given()
                .contentType("multipart/form-data")
                .multiPart("title", "Pantai Dummy2")
                .multiPart("kode", "ONP")
                .multiPart("location", "Jawa Timur")
                .multiPart("kota", "malang")
                .multiPart("description", "Pantai Dummy 2")
                .multiPart("price", 0)
                .multiPart("available_tickets", 1)
                .multiPart("lat", 1.31183923)
                .multiPart("long", 53.3231)
                .multiPart("category_name", "pantai")
                .multiPart("maps_link", "https://pantai.com")
                .multiPart("is_open", true)
                .multiPart("description_is_open", "Buka Jam 08.00-20.00")
                .multiPart("description_is_open", true)
                .multiPart("fasilitas", "Toilet,Wastafel")
                .multiPart("video_link", "")
                .multiPart("image1", new File("src/test/resources/foto/pantai.jpg"), "image/jpeg")


                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzNDc5NjUxLCJpYXQiOjE3MDA4ODc2NTF9.6seAzjyjKtCspLZUUsUYl_MpYMtvB5MkcE3dJz1eJEQ")
                .post(setPostApiEndpoint());
    }

    @Step("Admin receive a response with status code 409 for create wisata with >0 wisata price")
    public void receiveStatusForCreateWisataWith0Price(){
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("Receive {string} in the response body for TC_AA_44")
    public void receiveMessageForCreateWisataWith0Price(String message){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(message)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Price must be greater than 0");
        }
    }

    //TC_MA_45
    @Step("Admin request with the HTTP method POST and input >0 wisata ticket in the request body")
    public void sendPostHttpRequestForCreateWisataWith0Ticket(){;

        SerenityRest.given()
                .contentType("multipart/form-data")
                .multiPart("title", "Pantai Dummy2")
                .multiPart("kode", "ONP")
                .multiPart("location", "Jawa Timur")
                .multiPart("kota", "malang")
                .multiPart("description", "Pantai Dummy 2")
                .multiPart("price", 25000)
                .multiPart("available_tickets", 0)
                .multiPart("lat", 1.31183923)
                .multiPart("long", 53.3231)
                .multiPart("category_name", "pantai")
                .multiPart("maps_link", "https://pantai.com")
                .multiPart("is_open", true)
                .multiPart("description_is_open", "Buka Jam 08.00-20.00")
                .multiPart("description_is_open", true)
                .multiPart("fasilitas", "Toilet,Wastafel")
                .multiPart("video_link", "")
                .multiPart("image1", new File("src/test/resources/foto/pantai.jpg"), "image/jpeg")


                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzNDc5NjUxLCJpYXQiOjE3MDA4ODc2NTF9.6seAzjyjKtCspLZUUsUYl_MpYMtvB5MkcE3dJz1eJEQ")
                .post(setPostApiEndpoint());
    }

    @Step("Admin receive a response with status code 400 for create wisata with >0 wisata ticket")
    public void receiveStatusForCreateWisataWith0Ticket(){
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("Receive {string} in the response body for TC_AA_45")
    public void receiveMessageForCreateWisataWith0Ticket(String message){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(message)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Available Tickets harus lebih dari 0");
        }
    }

    //TC_MA_101
    @Step("Admin request with the HTTP method POST and input empty kode in the request body")
    public void sendPostHttpRequestForCreateWisataWithEmptyKode(){;

        SerenityRest.given()
                .contentType("multipart/form-data")
                .multiPart("title", "Pantai Dummy10")
                .multiPart("kode", "")
                .multiPart("location", "Jawa Timur")
                .multiPart("kota", "malang")
                .multiPart("description", "Pantai Dummy 2")
                .multiPart("price", 25000)
                .multiPart("available_tickets", 100)
                .multiPart("lat", 1.31183923)
                .multiPart("long", 53.3231)
                .multiPart("category_name", "pantai")
                .multiPart("maps_link", "https://pantai.com")
                .multiPart("is_open", true)
                .multiPart("description_is_open", "Buka Jam 08.00-20.00")
                .multiPart("description_is_open", true)
                .multiPart("fasilitas", "Toilet,Wastafel")
                .multiPart("video_link", "")
                .multiPart("image1", new File("src/test/resources/foto/pantai.jpg"), "image/jpeg")


                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzNDc5NjUxLCJpYXQiOjE3MDA4ODc2NTF9.6seAzjyjKtCspLZUUsUYl_MpYMtvB5MkcE3dJz1eJEQ")
                .post(setPostApiEndpoint());
    }

    @Step("Admin receive a response with status code 400 for create wisata with empty kode")
    public void receiveStatusForCreateWisataWithEmptyKode(){
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("Receive {string} in the response body for TC_AA_101")
    public void receiveMessageForCreateWisataWithEmptyKode(String message){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(message)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Kode harus minimal 3 huruf");
        }
    }

    //TC_MA_102
    @Step("Admin request with the HTTP method POST and input used kode in the request body")
    public void sendPostHttpRequestForCreateWisataWithUsedKode(){;

        SerenityRest.given()
                .contentType("multipart/form-data")
                .multiPart("title", "Museum Jawa Timur")
                .multiPart("kode", "MJJ")
                .multiPart("location", "Jawa Timur")
                .multiPart("kota", "malang")
                .multiPart("description", "Museum yang terletak di kota Malang")
                .multiPart("price", 25000)
                .multiPart("available_tickets", 100)
                .multiPart("lat", 1.31183923)
                .multiPart("long", 53.3231)
                .multiPart("category_name", "Museum")
                .multiPart("maps_link", "https://pantai.com")
                .multiPart("is_open", true)
                .multiPart("description_is_open", "Buka Jam 08.00-20.00")
                .multiPart("description_is_open", true)
                .multiPart("fasilitas", "Toilet,Wastafel")
                .multiPart("video_link", "")
                .multiPart("image1", new File("src/test/resources/foto/pantai.jpg"), "image/jpeg")


                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzNDc5NjUxLCJpYXQiOjE3MDA4ODc2NTF9.6seAzjyjKtCspLZUUsUYl_MpYMtvB5MkcE3dJz1eJEQ")
                .post(setPostApiEndpoint());
    }

    @Step("Admin receive a response with status code 400 for create wisata with used kode")
    public void receiveStatusForCreateWisataWithUsedKode(){
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("Receive {string} in the response body for TC_AA_102")
    public void receiveMessageForCreateWisataWithUsedKode(String message){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(message)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Kode sudah digunakan");
        }
    }

}
