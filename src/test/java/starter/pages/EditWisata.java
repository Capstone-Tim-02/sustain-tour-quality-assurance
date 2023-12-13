package starter.pages;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import java.io.File;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class EditWisata {
    protected String url = "https://destimate.uc.r.appspot.com/";

    //TC_MA_62
    @Step("Admin input valid endpoint to edit wisata")
    public String setPostApiEndpointEditWisata(){
        return url + "admin/wisata/75";
    }

    @Step("Admin request with the HTTP method PUT and input valid wisata ID and credentials in the request body")
    public void sendPostHttpRequestForEditWisata(){;
        SerenityRest.given()
                .contentType("multipart/form-data")
                .multiPart("title", "Pantai Hijau")
                .multiPart("kode", "PHJ")
                .multiPart("location", "Jawa Timur")
                .multiPart("kota", "malang")
                .multiPart("description", "Pantai Hijau")
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
                .put(setPostApiEndpointEditWisata());
    }

    @Step("Admin receive a response with status code 200 for success edit wisata")
    public void receiveStatusForEditWisata(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("Receive {string} in the response body for TC_AA_62")
    public void receiveMessageForEditWisata(String message){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 200 && responseBody.contains(message)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Data wisata berhasil di update");
        }
    }


    //TC_MA_63
    @Step("Admin input valid endpoint to edit wisata with existing title")
    public String setPostApiEndpointEditWisataWithExistingTitle(){
        return url + "admin/wisata/75";
    }

    @Step("Admin request with the HTTP method PUT and input valid wisata ID and existing title in the request body")
    public void sendPostHttpRequestForEditWisataWithExistingTitle(){;
        SerenityRest.given()
                .contentType("multipart/form-data")
                .multiPart("title", "Moja Museum")
                .multiPart("kode", "MMM")
                .multiPart("location", "Jakarta")
                .multiPart("kota", "Jakarta")
                .multiPart("description", "Museum Moja")
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
                .put(setPostApiEndpointEditWisataWithExistingTitle());
    }

    @Step("Admin receive a response with status code 400 for failed edit wisata with existing title")
    public void receiveStatusForEditWisataWithExistingTitle(){
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("Receive {string} in the response body for TC_AA_63")
    public void receiveMessageForEditWisataWithExistingTitle(String message){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(message)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Judul sudah ada, pilih judul lain");
        }
    }

    //TC_MA_64
    @Step("Admin input valid endpoint to edit wisata with empty title")
    public String setPostApiEndpointEditWisataWithEmptyTitle(){
        return url + "admin/wisata/75";
    }

    @Step("Admin request with the HTTP method PUT and input valid wisata ID and empty title in the request body")
    public void sendPostHttpRequestForEditWisataWithEmptyTitle(){;
        SerenityRest.given()
                .contentType("multipart/form-data")
                .multiPart("title", "")
                .multiPart("kode", "PHJ")
                .multiPart("location", "Jawa Timur")
                .multiPart("kota", "malang")
                .multiPart("description", "Pantai Hijau")
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
                .put(setPostApiEndpointEditWisata());
    }

    @Step("Admin receive a response with status code 200 for edit wisata with empty title")
    public void receiveStatusForEditWisataWithEmptyTitle(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("Receive {string} in the response body for TC_AA_64")
    public void receiveMessageForEditWisataWithEmptyTitle(String message){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 200 && responseBody.contains(message)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Data wisata berhasil di update");
        }
    }


    //TC_MA_65
    @Step("Admin input invalid endpoint to edit wisata")
    public String setPostApiEndpointEditWisataInvalid(){
        return url + "admin/wisata/999";
    }

    @Step("Admin request with the HTTP method PUT and input invalid wisata ID in the request body")
    public void sendPostHttpRequestForEditWisataInvalid(){;
        SerenityRest.given()
                .contentType("multipart/form-data")
                .multiPart("title", "Pantai Hijau")
                .multiPart("kode", "PHJ")
                .multiPart("location", "Jawa Timur")
                .multiPart("kota", "malang")
                .multiPart("description", "Pantai Hijau")
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
                .put(setPostApiEndpointEditWisataInvalid());
    }

    @Step("Admin receive a response with status code 404 for failed invalid edit wisata")
    public void receiveStatusForEditWisataInvalid(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("Receive {string} in the response body for TC_AA_65")
    public void receiveMessageForEditWisataInvalid(String message){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 404 && responseBody.contains(message)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Wisata tidak ditemukan");
        }
    }


}
