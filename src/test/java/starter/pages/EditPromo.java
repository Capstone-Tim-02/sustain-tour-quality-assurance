package starter.pages;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class EditPromo {
    protected String url = "https://destimate.uc.r.appspot.com/";


    //TC_MA_52

    @Step("Admin input valid endpoint to edit promo")
    public String setPutAPIEndpointEditPromo(){
        return url + "admin/promo/57";
    }

    @Step("Admin request with the HTTP method PUT and input valid ID and credentials in the request body")
    public void sendPostHttpRequestForEditPromo(){
        JSONObject requestBody = new JSONObject();

        SerenityRest.given()
                .contentType("multipart/form-data")
                .multiPart("title", "CHRISTMAS10")
                .multiPart("nama_promo", "CHRISTMAS10")
                .multiPart("kode_voucher", "CHRISTMAS10")
                .multiPart("jumlah_potongan_persen", 10)
                .multiPart("status_aktif", true)
                .multiPart("tanggal_kadaluarsa", "2023-12-12")
                .multiPart("image_voucher", "")
                .multiPart("deskripsi", "CHRISTMAS10")
                .multiPart("peraturan", "CHRISTMAS10")

                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzMzkwMTI4LCJpYXQiOjE3MDA3OTgxMjh9.v0E1sZcUAne2jIBc8dNrH8HIxmYkDe2LmrcTl4oI9zo")
                .put(setPutAPIEndpointEditPromo());
    }

    @Step("Admin receive a response with status code 200 for success edit promo")
    public void receiveStatusForEditPromo(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("Receive {string} in the response body for TC_AA_57")
    public void receiveMessageForEditPromo(String message){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 200 && responseBody.contains(message)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Promo berhasil diperbarui");
        }
    }

    //TC_MA_52

    @Step("Admin input valid endpoint to edit promo")
    public String setPutAPIEndpointEditPromooWithExistingTitle(){
        return url + "admin/promo/57";
    }

    @Step("Admin request with the HTTP method PUT and input valid ID and credentials in the request body")
    public void sendPostHttpRequestForEditPromooWithExistingTitle(){
        JSONObject requestBody = new JSONObject();

        SerenityRest.given()
                .contentType("multipart/form-data")
                .multiPart("title", "jalan2")
                .multiPart("nama_promo", "CHRISTMAS10")
                .multiPart("kode_voucher", "CHRISTMAS10")
                .multiPart("jumlah_potongan_persen", 10)
                .multiPart("status_aktif", true)
                .multiPart("tanggal_kadaluarsa", "2023-12-12")
                .multiPart("image_voucher", "")
                .multiPart("deskripsi", "CHRISTMAS10")
                .multiPart("peraturan", "CHRISTMAS10")

                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzMzkwMTI4LCJpYXQiOjE3MDA3OTgxMjh9.v0E1sZcUAne2jIBc8dNrH8HIxmYkDe2LmrcTl4oI9zo")
                .put(setPutAPIEndpointEditPromooWithExistingTitle());
    }

    @Step("Admin receive a response with status code 409 for failed edit promo with existing title")
    public void receiveStatusForEditPromooWithExistingTitle(){
        restAssuredThat(response -> response.statusCode(409));
    }

    @Step("Receive {string} in the response body for TC_AA_53")
    public void receiveMessageForEditPromooWithExistingTitle(String message){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 409 && responseBody.contains(message)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Promo dengan judul ini telah digunakan");
        }
    }


    //TC_MA_54

    @Step("Admin input valid endpoint to edit promo with existing nama")
    public String setPutAPIEndpointEditPromooWithExistingNama(){
        return url + "admin/promo/57";
    }

    @Step("Admin request with the HTTP method PUT and input valid ID and existing nama in the request body")
    public void sendPostHttpRequestForEditPromooWithExistingNama(){
        JSONObject requestBody = new JSONObject();

        SerenityRest.given()
                .contentType("multipart/form-data")
                .multiPart("title", "CHRISTMAS15")
                .multiPart("nama_promo", "jalan2")
                .multiPart("kode_voucher", "CHRISTMAS15")
                .multiPart("jumlah_potongan_persen", 10)
                .multiPart("status_aktif", true)
                .multiPart("tanggal_kadaluarsa", "2023-12-12")
                .multiPart("image_voucher", "")
                .multiPart("deskripsi", "CHRISTMAS15")
                .multiPart("peraturan", "CHRISTMAS15")

                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzMzkwMTI4LCJpYXQiOjE3MDA3OTgxMjh9.v0E1sZcUAne2jIBc8dNrH8HIxmYkDe2LmrcTl4oI9zo")
                .put(setPutAPIEndpointEditPromooWithExistingTitle());
    }

    @Step("Admin receive a response with status code 409 for failed edit promo with existing nama")
    public void receiveStatusForEditPromooWithExistingNama(){
        restAssuredThat(response -> response.statusCode(409));
    }

    @Step("Receive {string} in the response body for TC_AA_54")
    public void receiveMessageForEditPromooWithExistingNama(String message){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 409 && responseBody.contains(message)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Promo dengan nama_promo ini telah digunakan");
        }
    }


    //TC_MA_55

    @Step("Admin input valid endpoint to edit promo with existing kode voucher")
    public String setPutAPIEndpointEditPromooWithExistingKode(){
        return url + "admin/promo/57";
    }

    @Step("Admin request with the HTTP method PUT and input valid ID and existing kode voucher in the request body")
    public void sendPostHttpRequestForEditPromooWithExistingKode(){
        JSONObject requestBody = new JSONObject();

        SerenityRest.given()
                .contentType("multipart/form-data")
                .multiPart("title", "CHRISTMAS15")
                .multiPart("nama_promo", "CHRISTMAS15")
                .multiPart("kode_voucher", "jalan2")
                .multiPart("jumlah_potongan_persen", 10)
                .multiPart("status_aktif", true)
                .multiPart("tanggal_kadaluarsa", "2023-12-12")
                .multiPart("image_voucher", "")
                .multiPart("deskripsi", "CHRISTMAS15")
                .multiPart("peraturan", "CHRISTMAS15")

                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzMzkwMTI4LCJpYXQiOjE3MDA3OTgxMjh9.v0E1sZcUAne2jIBc8dNrH8HIxmYkDe2LmrcTl4oI9zo")
                .put(setPutAPIEndpointEditPromooWithExistingKode());
    }

    @Step("Admin receive a response with status code 409 for failed edit promo with existing kode voucher")
    public void receiveStatusForEditPromooWithExistingKode(){
        restAssuredThat(response -> response.statusCode(409));
    }

    @Step("Receive {string} in the response body for TC_AA_55")
    public void receiveMessageForEditPromooWithExistingKode(String message){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 409 && responseBody.contains(message)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Promo dengan kode_voucher ini telah digunakan");
        }
    }

    //TC_MA_56

    @Step("Admin input valid endpoint to edit promo with >0 potongan")
    public String setPutAPIEndpointEditPromooWith0Potongan(){
        return url + "admin/promo/57";
    }

    @Step("Admin request with the HTTP method PUT and input valid ID and >0 potongan in the request body")
    public void sendPostHttpRequestForEditPromooWith0Potongan(){
        JSONObject requestBody = new JSONObject();

        SerenityRest.given()
                .contentType("multipart/form-data")
                .multiPart("title", "CHRISTMAS15")
                .multiPart("nama_promo", "CHRISTMAS15")
                .multiPart("kode_voucher", "CHRISTMAS15")
                .multiPart("jumlah_potongan_persen", 0)
                .multiPart("status_aktif", true)
                .multiPart("tanggal_kadaluarsa", "2023-12-12")
                .multiPart("image_voucher", "")
                .multiPart("deskripsi", "CHRISTMAS15")
                .multiPart("peraturan", "CHRISTMAS15")

                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzMzkwMTI4LCJpYXQiOjE3MDA3OTgxMjh9.v0E1sZcUAne2jIBc8dNrH8HIxmYkDe2LmrcTl4oI9zo")
                .put(setPutAPIEndpointEditPromooWithExistingKode());
    }

    @Step("Admin receive a response with status code 400 for failed edit promo with >0 potongan")
    public void receiveStatusForEditPromooWith0Potongan(){
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("Receive {string} in the response body for TC_AA_56")
    public void receiveMessageForEditPromooWith0Potongan(String message){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(message)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("JumlahPotonganPersen harus lebih besar dari 0");
        }
    }


    //TC_MA_57

    @Step("Admin input invalid endpoint to edit promo")
    public String setPutAPIEndpointEditPromoInvalid(){
        return url + "admin/promo/999";
    }

    @Step("Admin request with the HTTP method PUT and input invalid ID and credentials in the request body")
    public void sendPostHttpRequestForEditPromoInvalid(){
        JSONObject requestBody = new JSONObject();

        SerenityRest.given()
                .contentType("multipart/form-data")
                .multiPart("title", "CHRISTMAS15")
                .multiPart("nama_promo", "CHRISTMAS15")
                .multiPart("kode_voucher", "CHRISTMAS15")
                .multiPart("jumlah_potongan_persen", 0)
                .multiPart("status_aktif", true)
                .multiPart("tanggal_kadaluarsa", "2023-12-12")
                .multiPart("image_voucher", "")
                .multiPart("deskripsi", "CHRISTMAS15")
                .multiPart("peraturan", "CHRISTMAS15")

                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzMzkwMTI4LCJpYXQiOjE3MDA3OTgxMjh9.v0E1sZcUAne2jIBc8dNrH8HIxmYkDe2LmrcTl4oI9zo")
                .put(setPutAPIEndpointEditPromoInvalid());
    }

    @Step("Admin receive a response with status code 404 for failed edit promo with invalid ID")
    public void receiveStatusForEditPromoInvalid(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("Receive {string} in the response body for TC_AA_57")
    public void receiveMessageForEditPromoInvalid(String message){
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
