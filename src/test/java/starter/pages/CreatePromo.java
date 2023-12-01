package starter.pages;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class CreatePromo {
    protected String url = "https://destimate.uc.r.appspot.com/";


    //TC_MA_8

    @Step("Admin input valid endpoint to create promo")
    public String setPostApiEndpoint(){
        return url + "createpromo";
    }

    @Step("Admin request with the HTTP method POST and input empty title in the request body")
    public void sendPostHttpRequestForCreatePromoWithEmptyTitle(){
        JSONObject requestBody = new JSONObject();

        SerenityRest.given()
                .contentType("multipart/form-data")
                .multiPart("title", "")
                .multiPart("nama_promo", "jalanmkjh")
                .multiPart("kode_voucher", "jalanmkjh")
                .multiPart("jumlah_potongan_persen", 10)
                .multiPart("status_aktif", true)
                .multiPart("tanggal_kadaluarsa", "2023-12-12")
                .multiPart("image_voucher", "")
                .multiPart("deskripsi", "asdfghklasa")
                .multiPart("peraturan", "asdfghklasa")

                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzMzkwMTI4LCJpYXQiOjE3MDA3OTgxMjh9.v0E1sZcUAne2jIBc8dNrH8HIxmYkDe2LmrcTl4oI9zo")
                .post(setPostApiEndpoint());
    }

    @Step("Admin receive a response with status code 400 for create promo with empty title")
    public void receiveStatusForCreatePromoWithEmptyTitle(){
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("Receive {string} in the response body")
    public void receiveMessageForCreatePromoWithEmptyTitle(String message){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(message)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Judul minimal 5 karakter");
        }
    }

    //TC_MA_9

    @Step("Admin request with the HTTP method POST and input empty nama voucher in the request body")
    public void sendPostHttpRequestForCreatePromoWithEmptyNama(){
        JSONObject requestBody = new JSONObject();

        SerenityRest.given()
                .contentType("multipart/form-data")
                .multiPart("title", "hallo")
                .multiPart("nama_promo", "")
                .multiPart("kode_voucher", "hallo")
                .multiPart("jumlah_potongan_persen", 10)
                .multiPart("status_aktif", true)
                .multiPart("tanggal_kadaluarsa", "2023-12-12")
                .multiPart("image_voucher", "")
                .multiPart("deskripsi", "asdfghklasa")
                .multiPart("peraturan", "asdfghklasa")

                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzMzkwMTI4LCJpYXQiOjE3MDA3OTgxMjh9.v0E1sZcUAne2jIBc8dNrH8HIxmYkDe2LmrcTl4oI9zo")
                .post(setPostApiEndpoint());
    }

    @Step("Admin receive a response with status code 400 for create promo with empty nama voucher")
    public void receiveStatusForCreatePromoWithEmptyNama(){
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("Receive {string} in the response body for TC_AA_9")
    public void receiveMessageForCreatePromoWithEmptyNama(String message){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(message)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Nama Promo minimal 5 karakter");
        }
    }


    //TC_MA_10
    @Step("Admin request with the HTTP method POST and input empty kode voucher in the request body")
    public void sendPostHttpRequestForCreatePromoWithEmptyKode(){
        JSONObject requestBody = new JSONObject();

        SerenityRest.given()
                .contentType("multipart/form-data")
                .multiPart("title", "pantai")
                .multiPart("nama_promo", "pantai")
                .multiPart("kode_voucher", "")
                .multiPart("jumlah_potongan_persen", 10)
                .multiPart("status_aktif", true)
                .multiPart("tanggal_kadaluarsa", "2023-12-12")
                .multiPart("image_voucher", "")
                .multiPart("deskripsi", "asdfghklasa")
                .multiPart("peraturan", "asdfghklasa")

                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzMzkwMTI4LCJpYXQiOjE3MDA3OTgxMjh9.v0E1sZcUAne2jIBc8dNrH8HIxmYkDe2LmrcTl4oI9zo")
                .post(setPostApiEndpoint());
    }

    @Step("Admin receive a response with status code 400 for create promo with empty kode voucher")
    public void receiveStatusForCreatePromoWithEmptyKode(){
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("Receive {string} in the response body for TC_AA_10")
    public void receiveMessageForCreatePromoWithEmptyKode(String message){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(message)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Kode voucher minimal 5 karakter");
        }
    }


    //TC_MA_11

    @Step("Admin request with the HTTP method POST and input valid credentials in the request body")
    public void sendPostHttpRequestForCreatePromoWithValidCredentials(){
        JSONObject requestBody = new JSONObject();

        SerenityRest.given()
                .contentType("multipart/form-data")
                .multiPart("title", "NEWYEAR")
                .multiPart("nama_promo", "NEWYEAR")
                .multiPart("kode_voucher", "NEWYEAR10")
                .multiPart("jumlah_potongan_persen", 15)
                .multiPart("status_aktif", true)
                .multiPart("tanggal_kadaluarsa", "2023-12-12")
                .multiPart("image_voucher", "")
                .multiPart("deskripsi", "asdfghklasa")
                .multiPart("peraturan", "asdfghklasa")

                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzMzkwMTI4LCJpYXQiOjE3MDA3OTgxMjh9.v0E1sZcUAne2jIBc8dNrH8HIxmYkDe2LmrcTl4oI9zo")
                .post(setPostApiEndpoint());
    }

    @Step("Admin receive a response with status code 400 for create promo with empty kode voucher")
    public void receiveStatusForCreatePromoWithValidCredentials(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("Receive {string} in the response body for TC_AA_11")
    public void receiveMessageForCreatePromoWithValidCredentials(String message){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 200 && responseBody.contains(message)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Promo berhasil dibuat");
        }
    }



    //TC_MA_12

    @Step("Admin request with the HTTP method POST and input 0 discount nominal in the request body")
    public void sendPostHttpRequestForCreatePromoWith0Discount(){
        JSONObject requestBody = new JSONObject();

        SerenityRest.given()
                .contentType("multipart/form-data")
                .multiPart("title", "destimat0")
                .multiPart("nama_promo", "destimat0")
                .multiPart("kode_voucher", "destimat0")
                .multiPart("jumlah_potongan_persen", 0)
                .multiPart("status_aktif", true)
                .multiPart("tanggal_kadaluarsa", "2023-12-12")
                .multiPart("image_voucher", "")
                .multiPart("deskripsi", "asdfghklasa")
                .multiPart("peraturan", "asdfghklasa")

                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzMzkwMTI4LCJpYXQiOjE3MDA3OTgxMjh9.v0E1sZcUAne2jIBc8dNrH8HIxmYkDe2LmrcTl4oI9zo")
                .post(setPostApiEndpoint());
    }

    @Step("Admin receive a response with status code 400 for create promo with 0 discount nominal")
    public void receiveStatusForCreatePromoWith0Discount(){
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("Receive {string} in the response body for TC_AA_12")
    public void receiveMessageForCreatePromoWith0Discount(String message){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(message)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Kesalahan jumlah_potongan_persen");
        }
    }


    //TC_MA_13

    @Step("Admin request with the HTTP method POST and input used title in the request body")
    public void sendPostHttpRequestForCreatePromoWithUsedTitle(){
        JSONObject requestBody = new JSONObject();

        SerenityRest.given()
                .contentType("multipart/form-data")
                .multiPart("title", "destimate")
                .multiPart("nama_promo", "desti")
                .multiPart("kode_voucher", "desti")
                .multiPart("jumlah_potongan_persen", 10)
                .multiPart("status_aktif", true)
                .multiPart("tanggal_kadaluarsa", "2023-12-12")
                .multiPart("image_voucher", "")
                .multiPart("deskripsi", "asdfghklasa")
                .multiPart("peraturan", "asdfghklasa")

                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzMzkwMTI4LCJpYXQiOjE3MDA3OTgxMjh9.v0E1sZcUAne2jIBc8dNrH8HIxmYkDe2LmrcTl4oI9zo")
                .post(setPostApiEndpoint());
    }

    @Step("Admin receive a response with status code 409 for create promo with used title")
    public void receiveStatusForCreatePromoWithUsedTitle(){
        restAssuredThat(response -> response.statusCode(409));
    }

    @Step("Receive {string} in the response body for TC_AA_13")
    public void receiveMessageForCreatePromoWithUsedTitle(String message){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 409 && responseBody.contains(message)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Promo dengan judul ini telah digunakan");
        }
    }


    //TC_MA_14

    @Step("Admin request with the HTTP method POST and input used nama promo in the request body")
    public void sendPostHttpRequestForCreatePromoWithUsedName(){
        JSONObject requestBody = new JSONObject();

        SerenityRest.given()
                .contentType("multipart/form-data")
                .multiPart("title", "desti20")
                .multiPart("nama_promo", "destimate")
                .multiPart("kode_voucher", "desti20")
                .multiPart("jumlah_potongan_persen", 10)
                .multiPart("status_aktif", true)
                .multiPart("tanggal_kadaluarsa", "2023-12-12")
                .multiPart("image_voucher", "")
                .multiPart("deskripsi", "asdfghklasa")
                .multiPart("peraturan", "asdfghklasa")

                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzMzkwMTI4LCJpYXQiOjE3MDA3OTgxMjh9.v0E1sZcUAne2jIBc8dNrH8HIxmYkDe2LmrcTl4oI9zo")
                .post(setPostApiEndpoint());
    }

    @Step("Admin receive a response with status code 400 for create promo with used nama promo")
    public void receiveStatusForCreatePromoWithUsedName(){
        restAssuredThat(response -> response.statusCode(409));
    }

    @Step("Receive {string} in the response body for TC_AA_14")
    public void receiveMessageForCreatePromoWithUsedName(String message){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 409 && responseBody.contains(message)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Promo dengan nama promo ini telah digunakan");
        }
    }



    //TC_MA_15

    @Step("Admin request with the HTTP method POST and input used kode promo in the request body")
    public void sendPostHttpRequestForCreatePromoWithUsedKode(){
        JSONObject requestBody = new JSONObject();

        SerenityRest.given()
                .contentType("multipart/form-data")
                .multiPart("title", "ayojalan")
                .multiPart("nama_promo", "ayojalan")
                .multiPart("kode_voucher", "jalan2")
                .multiPart("jumlah_potongan_persen", 10)
                .multiPart("status_aktif", true)
                .multiPart("tanggal_kadaluarsa", "2023-12-12")
                .multiPart("image_voucher", "")
                .multiPart("deskripsi", "asdfghklasa")
                .multiPart("peraturan", "asdfghklasa")

                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzMzkwMTI4LCJpYXQiOjE3MDA3OTgxMjh9.v0E1sZcUAne2jIBc8dNrH8HIxmYkDe2LmrcTl4oI9zo")
                .post(setPostApiEndpoint());
    }

    @Step("Admin receive a response with status code 400 for create promo with used kode promo")
    public void receiveStatusForCreatePromoWithUsedKode(){
        restAssuredThat(response -> response.statusCode(409));
    }

    @Step("Receive {string} in the response body for TC_AA_15")
    public void receiveMessageForCreatePromoWithUsedKode(String message){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 409 && responseBody.contains(message)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Nama kode voucher telah digunakan oleh promo lainnya, silahkan coba gunakan nama lainnya");
        }
    }
}
