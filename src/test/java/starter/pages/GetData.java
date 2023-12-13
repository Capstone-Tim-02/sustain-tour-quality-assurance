package starter.pages;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class GetData {
    protected String url = "https://destimate.uc.r.appspot.com/";

    //TC_MA_19
    @Step("Admin input valid endpoint to get user data")
    public String userInputValidEndpointToGetAllUser(){
        return url + "admin/user";
    }

    @Step("Admin request to get all user data with the HTTP GET method")
    public void userRequestWithHTTPMethodGETAndInputValidEndpointToGetAllUser(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzNDk0MTIwLCJpYXQiOjE3MDA5MDIxMjB9.qlUKfXy-A4lumLTCtgKKGJcEiLhtvp7WOWv_zDO0zyA")
                .get(userInputValidEndpointToGetAllUser());
    }

    @Step("Admin receive a response with status code 200 for success get all user data")
    public void receiveStatusForGetAllUser(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("Verify user data is not empty")
    public void successToGetAllUser(){
        restAssuredThat(response -> response.body("$", notNullValue()));
    }

    //TC_MA_19
    @Step("Admin input valid endpoint to get booking data")
    public String userInputValidEndpointToGetAllBookingData(){
        return url + "admin/ticket";
    }

    @Step("Admin request to get all booking data with the HTTP GET method")
    public void userRequestWithHTTPMethodGETAndInputValidEndpointToGetAllBookingData(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzNDk0MTIwLCJpYXQiOjE3MDA5MDIxMjB9.qlUKfXy-A4lumLTCtgKKGJcEiLhtvp7WOWv_zDO0zyA")
                .get(userInputValidEndpointToGetAllUser());
    }

    @Step("Admin receive a response with status code 200 for success get all booking data")
    public void receiveStatusForGetAllBookingData(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("Verify booking data is not empty")
    public void successToGetAllBookingData(){
        restAssuredThat(response -> response.body("$", notNullValue()));
    }

    //TC_MA_21
    @Step("Admin input valid endpoint to get total carbon footprint data")
    public String userInputValidEndpointToGetAllCarbon(){
        return url + "admin/carbonfootprint";
    }

    @Step("Admin request to get total carbon footprint data with the HTTP GET method")
    public void userRequestWithHTTPMethodGETAndInputValidEndpointToGetAllCarbon(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzNDk0MTIwLCJpYXQiOjE3MDA5MDIxMjB9.qlUKfXy-A4lumLTCtgKKGJcEiLhtvp7WOWv_zDO0zyA")
                .get(userInputValidEndpointToGetAllUser());
    }

    @Step("Admin receive a response with status code 200 for success get total carbon footprint data")
    public void receiveStatusForGetAllCarbon(){
        restAssuredThat(response -> response.statusCode(200));
    }


    //TC_MA_22
    @Step("Admin input valid endpoint to get total wisata data")
    public String userInputValidEndpointToGetTotalWisata(){
        return url + "admin/totalwisata";
    }

    @Step("Admin request to get total wisata data with the HTTP GET method")
    public void userRequestWithHTTPMethodGETAndInputValidEndpointToGetTotalWisata(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzNDk0MTIwLCJpYXQiOjE3MDA5MDIxMjB9.qlUKfXy-A4lumLTCtgKKGJcEiLhtvp7WOWv_zDO0zyA")
                .get(userInputValidEndpointToGetAllUser());
    }

    @Step("Admin receive a response with status code 200 for success get total wisata data")
    public void receiveStatusForGetTotalWisata(){
        restAssuredThat(response -> response.statusCode(200));
    }


    //TC_MA_23
    @Step("Admin input valid endpoint to get total user data")
    public String userInputValidEndpointToGetTotalUser(){
        return url + "admin/totaluser";
    }

    @Step("Admin request to get total user data with the HTTP GET method")
    public void userRequestWithHTTPMethodGETAndInputValidEndpointToGetTotalUser(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzNDk0MTIwLCJpYXQiOjE3MDA5MDIxMjB9.qlUKfXy-A4lumLTCtgKKGJcEiLhtvp7WOWv_zDO0zyA")
                .get(userInputValidEndpointToGetAllUser());
    }

    @Step("Admin receive a response with status code 200 for success get total user data")
    public void receiveStatusForGetTotalUser(){
        restAssuredThat(response -> response.statusCode(200));
    }

    //TC_MA_24
    @Step("Admin input valid endpoint to get total transaction data")
    public String userInputValidEndpointToGetTotalTransaksi(){
        return url + "admin/totaltransaksi";
    }

    @Step("Admin request to get total transaction data with the HTTP GET method")
    public void userRequestWithHTTPMethodGETAndInputValidEndpointToGetTotalTransaksi(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzNDk0MTIwLCJpYXQiOjE3MDA5MDIxMjB9.qlUKfXy-A4lumLTCtgKKGJcEiLhtvp7WOWv_zDO0zyA")
                .get(userInputValidEndpointToGetAllUser());
    }

    @Step("Admin receive a response with status code 200 for success get total transaction data")
    public void receiveStatusForGetTotalTransaksi(){
        restAssuredThat(response -> response.statusCode(200));
    }

    //TC_MA_25
    @Step("Admin input valid endpoint to get total monthly revenue data")
    public String userInputValidEndpointToGetTotalTransaksiBulanan(){
        return url + "admin/revenuebulanan/2023/11";
    }

    @Step("Admin request to get total monthly revenue data with the HTTP GET method")
    public void userRequestWithHTTPMethodGETAndInputValidEndpointToGetTotalTransaksiBulanan(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzNDk0MTIwLCJpYXQiOjE3MDA5MDIxMjB9.qlUKfXy-A4lumLTCtgKKGJcEiLhtvp7WOWv_zDO0zyA")
                .get(userInputValidEndpointToGetAllUser());
    }

    @Step("Admin receive a response with status code 200 for success get total monthly revenue data")
    public void receiveStatusForGetTotalTransaksiBulanan(){
        restAssuredThat(response -> response.statusCode(200));
    }

    //TC_MA_26
    @Step("Admin input invalid endpoint to get total monthly revenue data")
    public String userInputEndpointToGetTotalTransaksiBulananInvalid(){
        return url + "admin/revenuebulanan";
    }

    @Step("Admin send invalid request to get total monthly revenue data with the HTTP GET method")
    public void userRequestWithHTTPMethodGETAndInputInvalidEndpointToGetTotalTransaksiBulanan(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzNDk0MTIwLCJpYXQiOjE3MDA5MDIxMjB9.qlUKfXy-A4lumLTCtgKKGJcEiLhtvp7WOWv_zDO0zyA")
                .get(userInputEndpointToGetTotalTransaksiBulananInvalid());
    }

    @Step("Admin receive a response with status code 404 for failed request to get total monthly revenue data")
    public void receiveStatusForInvalidGetTotalTransaksiBulanan(){
        restAssuredThat(response -> response.statusCode(404));
    }

    //TC_MA_27
    @Step("Admin input valid endpoint to get all cetegory data")
    public String userInputValidEndpointToGetCategory(){
        return url + "/categories";
    }

    @Step("Admin request to get all category data with the HTTP GET method")
    public void userRequestWithHTTPMethodGETAndInputValidEndpointToGetCategory(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzNDk0MTIwLCJpYXQiOjE3MDA5MDIxMjB9.qlUKfXy-A4lumLTCtgKKGJcEiLhtvp7WOWv_zDO0zyA")
                .get(userInputValidEndpointToGetAllUser());
    }

    @Step("Admin receive a response with status code 200 for success get all category data")
    public void receiveStatusForGetCategory(){
        restAssuredThat(response -> response.statusCode(200));
    }

    //TC_MA_28
    @Step("Admin input valid endpoint to get all TNC data")
    public String userInputValidEndpointToGetTNC(){
        return url + "/tnc";
    }

    @Step("Admin request to get all TNC data with the HTTP GET method")
    public void userRequestWithHTTPMethodGETAndInputValidEndpointToGetTNC(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzNDk0MTIwLCJpYXQiOjE3MDA5MDIxMjB9.qlUKfXy-A4lumLTCtgKKGJcEiLhtvp7WOWv_zDO0zyA")
                .get(userInputValidEndpointToGetAllUser());
    }

    @Step("Admin receive a response with status code 200 for success get all TNC data")
    public void receiveStatusForGetTNC(){
        restAssuredThat(response -> response.statusCode(200));
    }

    //TC_MA_29
    @Step("Admin input valid endpoint to get all wisata data")
    public String userInputValidEndpointToGetWisata(){
        return url + "/wisata";
    }

    @Step("Admin request to get all wisata data with the HTTP GET method")
    public void userRequestWithHTTPMethodGETAndInputValidEndpointToGetWisata(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzNDk0MTIwLCJpYXQiOjE3MDA5MDIxMjB9.qlUKfXy-A4lumLTCtgKKGJcEiLhtvp7WOWv_zDO0zyA")
                .get(userInputValidEndpointToGetAllUser());
    }

    @Step("Admin receive a response with status code 200 for success get all wisata data")
    public void receiveStatusForGetWisata(){
        restAssuredThat(response -> response.statusCode(200));
    }

    //TC_MA_30
    @Step("Admin input valid endpoint to get wisata data by ID")
    public String userInputValidEndpointToGetWisatabyID(){
        return url + "/wisata/1";
    }

    @Step("Admin request to get wisata data by ID with the HTTP GET method")
    public void userRequestWithHTTPMethodGETAndInputValidEndpointToGetWisatabyID(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzNDk0MTIwLCJpYXQiOjE3MDA5MDIxMjB9.qlUKfXy-A4lumLTCtgKKGJcEiLhtvp7WOWv_zDO0zyA")
                .get(userInputValidEndpointToGetAllUser());
    }

    @Step("Admin receive a response with status code 200 for success get wisata data by ID")
    public void receiveStatusForGetWisatabyID(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("Verify result to get wisata data by ID is not null")
    public void verifyNotNullWisataByID(){
        restAssuredThat(response -> response.body("$", notNullValue()));
    }

    //TC_MA_31
    @Step("Admin input invalid endpoint to get wisata data by ID")
    public String userInputInValidEndpointToGetWisatabyID(){
        return url + "wisata/999";
    }

    @Step("Admin request to get wisata data by invalid ID with the HTTP GET method")
    public void userRequestWithHTTPMethodGETAndInputInValidEndpointToGetWisatabyID(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzNDk0MTIwLCJpYXQiOjE3MDA5MDIxMjB9.qlUKfXy-A4lumLTCtgKKGJcEiLhtvp7WOWv_zDO0zyA")
                .get(userInputInValidEndpointToGetWisatabyID());
    }

    @Step("Admin receive a response with status code 404 for failed get wisata data by invalid ID")
    public void receiveStatusForGetWisatabyInvalidID(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("Receive {string} in the response body for TC_AA_31")
    public void verifyErrorMessageWisataNotFound(String message){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 404 && responseBody.contains(message)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Wisata tidak ditemukan");
        }
    }

    //TC_MA_32
    @Step("Admin input valid endpoint to get carbon footprint by wisata data by ID")
    public String userInputValidEndpointToGetCarbonByWisata(){
        return url + "carbonfootprintwisata/10";
    }

    @Step("Admin request to get carbon footprint data by valid wisata ID with the HTTP GET method")
    public void userRequestWithHTTPMethodGETAndInputValidEndpointToGetCarbonByWisata(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzNDk0MTIwLCJpYXQiOjE3MDA5MDIxMjB9.qlUKfXy-A4lumLTCtgKKGJcEiLhtvp7WOWv_zDO0zyA")
                .get(userInputValidEndpointToGetCarbonByWisata());
    }

    @Step("Admin receive a response with status code 200 for success get total carbon footprint by wisata id")
    public void receiveStatusForGetCarbonByWisata(){
        restAssuredThat(response -> response.statusCode(200));
    }

    //TC_MA_33
    @Step("Admin input invalid endpoint to get carbon footprint by wisata data by ID")
    public String userInputInValidEndpointToGetCarbonWisatabyInvalidID(){
        return url + "carbonfootprintwisata/999";
    }

    @Step("Admin request to get carbon footprint data by invalid wisata ID with the HTTP GET method")
    public void userRequestWithHTTPMethodGETAndInputInValidEndpointToGetCarbonWisatabyInvalidID(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzNDk0MTIwLCJpYXQiOjE3MDA5MDIxMjB9.qlUKfXy-A4lumLTCtgKKGJcEiLhtvp7WOWv_zDO0zyA")
                .get(userInputInValidEndpointToGetCarbonWisatabyInvalidID());
    }

    @Step("Admin receive a response with status code 404 for failed get total carbon footprint by wisata invalid id")
    public void receiveStatusForGetCarbonWisatabyInvalidID(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("Receive {string} in the response body for TC_AA_33")
    public void verifyErrorMessageCarbonWisatabyInvalidID(String message){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 404 && responseBody.contains(message)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Wisata not found");
        }
    }

    //TC_MA_34
    @Step("Admin input invalid endpoint to get booking data by valid invoice")
    public String userInputValidEndpointToGetBooking(){
        return url + "admin/ticket/1700579240-327";
    }

    @Step("Admin request to get booking data data by valid invoice with the HTTP GET method")
    public void userRequestWithHTTPMethodGETAndInputValidEndpointToGetBooking(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzNDk0MTIwLCJpYXQiOjE3MDA5MDIxMjB9.qlUKfXy-A4lumLTCtgKKGJcEiLhtvp7WOWv_zDO0zyA")
                .get(userInputValidEndpointToGetBooking());
    }

    @Step("Admin receive a response with status code 200 for sucess get booking data by valid invoice")
    public void receiveStatusForGetBooking(){
        restAssuredThat(response -> response.statusCode(200));
    }

    //TC_MA_35
    @Step("Admin input invalid endpoint to get booking data by invalid invoice")
    public String userInputInValidEndpointToGetInvalidBooking(){
        return url + "admin/ticket/08224411";
    }

    @Step("Admin request to get booking data data by invalid invoice with the HTTP GET method")
    public void userRequestWithHTTPMethodGETAndInputInValidEndpointToGetInvalidBooking(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzNDk0MTIwLCJpYXQiOjE3MDA5MDIxMjB9.qlUKfXy-A4lumLTCtgKKGJcEiLhtvp7WOWv_zDO0zyA")
                .get(userInputInValidEndpointToGetCarbonWisatabyInvalidID());
    }

    @Step("Admin receive a response with status code 404 for sucess get booking data by invalid invoice")
    public void receiveStatusForGetInvalidBooking(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("Receive {string} in the response body for TC_AA_35")
    public void verifyErrorMessageInvalidBooking(String message){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 404 && responseBody.contains(message)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Wisata not found");
        }
    }

    //TC_MA_86
    @Step("Admin input valid endpoint to get all pesan kerjasama")
    public String userInputValidEndpointToGetCoopMessage(){
        return url + "cooperation";
    }

    @Step("Admin request to get all pesan kerjasama data with the HTTP GET method")
    public void userRequestWithHTTPMethodGETAndInputValidEndpointToGetCoopMessage(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzNDk0MTIwLCJpYXQiOjE3MDA5MDIxMjB9.qlUKfXy-A4lumLTCtgKKGJcEiLhtvp7WOWv_zDO0zyA")
                .get(userInputValidEndpointToGetCoopMessage());
    }

    @Step("Admin receive a response with status code 200 for success get all pesan kerjasama data")
    public void receiveStatusForGetCoopMessage(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("Verify pesan kerjasama data is not empty")
    public void verifyNotNullCoopMessage(){
        restAssuredThat(response -> response.body("$", notNullValue()));
    }

    //TC_MA_87
    @Step("Admin input valid endpoint to get top 3 wisata")
    public String userInputValidEndpointToGetTopWisata(){
        return url + "top/wisata";
    }

    @Step("Admin request to get top 3 wisata with the HTTP GET method")
    public void userRequestWithHTTPMethodGETAndInputValidEndpointToGetTopWisata(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzNDk0MTIwLCJpYXQiOjE3MDA5MDIxMjB9.qlUKfXy-A4lumLTCtgKKGJcEiLhtvp7WOWv_zDO0zyA")
                .get(userInputValidEndpointToGetTopWisata());
    }

    @Step("Admin receive a response with status code 200 for success get top 3 wisata")
    public void receiveStatusForGetTopWisata(){
        restAssuredThat(response -> response.statusCode(200));
    }

    //TC_MA_88
    @Step("Admin input valid endpoint to get top 4 user by carbon footprint")
    public String userInputValidEndpointToGetTopUser(){
        return url + "top/emition";
    }

    @Step("Admin request to get top 4 user with the HTTP GET method")
    public void userRequestWithHTTPMethodGETAndInputValidEndpointToGetTopUser(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzNDk0MTIwLCJpYXQiOjE3MDA5MDIxMjB9.qlUKfXy-A4lumLTCtgKKGJcEiLhtvp7WOWv_zDO0zyA")
                .get(userInputValidEndpointToGetTopWisata());
    }

    @Step("Admin receive a response with status code 200 for success get top 4 user by carbon footprint")
    public void receiveStatusForGetTopUser(){
        restAssuredThat(response -> response.statusCode(200));
    }

    //TC_MA_89
    @Step("Admin input valid endpoint to get TNC data by ID")
    public String userInputValidEndpointToGetTNCByID(){
        return url + "tnc/1";
    }

    @Step("Admin request to get TNC data by valid ID with the HTTP GET method")
    public void userRequestWithHTTPMethodGETAndInputValidEndpointToGetTNCByID(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzNDk0MTIwLCJpYXQiOjE3MDA5MDIxMjB9.qlUKfXy-A4lumLTCtgKKGJcEiLhtvp7WOWv_zDO0zyA")
                .get(userInputValidEndpointToGetTNCByID());
    }

    @Step("Admin receive a response with status code 200 for success get TNC by valid ID")
    public void receiveStatusForGetTNCByID(){
        restAssuredThat(response -> response.statusCode(200));
    }

    //TC_MA_90
    @Step("Admin input invalid endpoint to get TNC data by ID")
    public String userInputInValidEndpointToGetTNCByInvalidID(){
        return url + "tnc/999";
    }

    @Step("Admin request to get TNC by invalid ID with the HTTP GET method")
    public void userRequestWithHTTPMethodGETAndInputInValidEndpointToGetTNCByInvalidID(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzNDk0MTIwLCJpYXQiOjE3MDA5MDIxMjB9.qlUKfXy-A4lumLTCtgKKGJcEiLhtvp7WOWv_zDO0zyA")
                .get(userInputInValidEndpointToGetCarbonWisatabyInvalidID());
    }

    @Step("Admin receive a response with status code 404 for failed get TNC by invalid ID")
    public void receiveStatusForGetTNCByInvalidID(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("Receive {string} in the response body for TC_AA_90")
    public void verifyErrorMessageTNCByInvalidID(String message){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 404 && responseBody.contains(message)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Wisata not found");
        }
    }

    //TC_MA_91
    @Step("Admin input valid endpoint to get grafik dashboard")
    public String userInputValidEndpointToGetGrafik(){
        return url + "grafik";
    }

    @Step("Admin request to get grafik data with the HTTP GET method")
    public void userRequestWithHTTPMethodGETAndInputValidEndpointToGetGrafik(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzNDk0MTIwLCJpYXQiOjE3MDA5MDIxMjB9.qlUKfXy-A4lumLTCtgKKGJcEiLhtvp7WOWv_zDO0zyA")
                .get(userInputValidEndpointToGetGrafik());
    }

    @Step("Admin receive a response with status code 200 for success get grafik data")
    public void receiveStatusForGetGrafik(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("Verify grafik data is not empty")
    public void verifyNotNullGrafik(){
        restAssuredThat(response -> response.body("$", notNullValue()));
    }

    //TC_MA_92
    @Step("Admin input valid endpoint to get grafik dashboard in six month with only start date")

    public String userInputValidEndpointToGetGrafikWithOnlyStartDate(){
        return url + "grafik?start_date=" + "2023-10-10" + "&end_date=" + "";
    }

    @Step("Admin request to get grafik data in six month with only start date with the HTTP GET method")
    public void userRequestWithHTTPMethodGETAndInputValidEndpointToGetGrafikWithOnlyStartDate(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzNDk0MTIwLCJpYXQiOjE3MDA5MDIxMjB9.qlUKfXy-A4lumLTCtgKKGJcEiLhtvp7WOWv_zDO0zyA")
                .get(userInputValidEndpointToGetGrafikWithOnlyStartDate());
    }

    @Step("Admin receive a response with status code 200 for success get grafik data in six month with only start date")
    public void receiveStatusForGetGrafikWithOnlyStartDate(){
        restAssuredThat(response -> response.statusCode(400));
    }


    //TC_MA_93
    @Step("Admin input valid endpoint to get grafik dashboard in six month with only end date")

    public String userInputValidEndpointToGetGrafikWithOnlyEndDate(){
        return url + "grafik?start_date=" + "" + "&end_date=" + "2023-10-10";
    }

    @Step("Admin request to get grafik data in six month with only end date with the HTTP GET method")
    public void userRequestWithHTTPMethodGETAndInputValidEndpointToGetGrafikWithOnlyEndDate(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzNDk0MTIwLCJpYXQiOjE3MDA5MDIxMjB9.qlUKfXy-A4lumLTCtgKKGJcEiLhtvp7WOWv_zDO0zyA")
                .get(userInputValidEndpointToGetGrafikWithOnlyEndDate());
    }

    @Step("Admin receive a response with status code 200 for success get grafik data in six month with only end date")
    public void receiveStatusForGetGrafikWithOnlyEndDate(){
        restAssuredThat(response -> response.statusCode(400));
    }


    //TC_MA_94
    @Step("Admin input valid endpoint to get grafik dashboard in six month with valid start date and end date")

    public String userInputValidEndpointToGetGrafikWithValidDate(){
        return url + "grafik?start_date=" + "2023-05-10" + "&end_date=" + "2023-11-10";
    }

    @Step("Admin request to get grafik data in six month with valid start date and end date with the HTTP GET method")
    public void userRequestWithHTTPMethodGETAndInputValidEndpointToGetGrafikWithValidDate(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzNDk0MTIwLCJpYXQiOjE3MDA5MDIxMjB9.qlUKfXy-A4lumLTCtgKKGJcEiLhtvp7WOWv_zDO0zyA")
                .get(userInputValidEndpointToGetGrafikWithValidDate());
    }

    @Step("Admin receive a response with status code 200 for success get grafik data in six month with valid start date and end date")
    public void receiveStatusForGetGrafikWithValidDate(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("Verify grafik data in six month with valid start date and end date is not empty")
    public void verifyNotNullGrafikWithValidDate(){
        restAssuredThat(response -> response.body("$", notNullValue()));
    }

    //TC_MA_95
    @Step("Admin input valid endpoint to get grafik dashboard in six month with start date bigger than the end date")

    public String userInputValidEndpointToGetGrafikWithStartDateBiggerThanEndDate(){
        return url + "grafik?start_date=" + "2023-12-10" + "&end_date=" + "2023-10-10";
    }

    @Step("Admin request to get grafik data in six month with start date bigger than the end date with the HTTP GET method")
    public void userRequestWithHTTPMethodGETAndInputValidEndpointToGetGrafikWithStartDateBiggerThanEndDate(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzNDk0MTIwLCJpYXQiOjE3MDA5MDIxMjB9.qlUKfXy-A4lumLTCtgKKGJcEiLhtvp7WOWv_zDO0zyA")
                .get(userInputValidEndpointToGetGrafikWithStartDateBiggerThanEndDate());
    }

    @Step("Admin receive a response with status code 200 for success get grafik data in six month with start date bigger than the end date")
    public void receiveStatusForGetGrafikWithStartDateBiggerThanEndDate(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("Verify grafik data in six month with start date bigger than the end date is not empty")
    public void verifyNotNullGrafikWithStartDateBiggerThanEndDate(){
        restAssuredThat(response -> response.body("$", notNullValue()));
    }

    //TC_MA_96
    @Step("Admin input valid endpoint to get grafik dashboard in six month with invalid start date format")
    public String userInputValidEndpointToGetGrafikWithInvalidStartDate(){
        return url + "grafik?start_date=" + "2023-13-10" + "&end_date=" + "2023-10-10";
    }

    @Step("Admin request to get grafik data in six month with invalid start date format with the HTTP GET method")
    public void userRequestWithHTTPMethodGETAndInputValidEndpointToGetGrafikWithInvalidStartDate(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzNDk0MTIwLCJpYXQiOjE3MDA5MDIxMjB9.qlUKfXy-A4lumLTCtgKKGJcEiLhtvp7WOWv_zDO0zyA")
                .get(userInputValidEndpointToGetGrafikWithInvalidStartDate());
    }

    @Step("Admin receive a response with status code 400 for failed get grafik data in six month with invalid start date format")
    public void receiveStatusForGetGrafikWithInvalidStartDate(){
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("Receive {string} in the response body for TC_AA_96")
    public void verifyErrorMessageInvalidStartDate(String message){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(message)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Kesalahan format pada start date. Gunakan YYYY-MM-DD");
        }
    }


    //TC_MA_97
    @Step("Admin input valid endpoint to get grafik dashboard in six month with invalid end date format")
    public String userInputValidEndpointToGetGrafikWithInvalidEndDate(){
        return url + "grafik?start_date=" + "2023-10-10" + "&end_date=" + "2023-13-10";
    }

    @Step("Admin request to get grafik data in six month with invalid end date format with the HTTP GET method")
    public void userRequestWithHTTPMethodGETAndInputValidEndpointToGetGrafikWithInvalidEndDate(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzNDk0MTIwLCJpYXQiOjE3MDA5MDIxMjB9.qlUKfXy-A4lumLTCtgKKGJcEiLhtvp7WOWv_zDO0zyA")
                .get(userInputValidEndpointToGetGrafikWithInvalidEndDate());
    }

    @Step("Admin receive a response with status code 400 for failed get grafik data in six month with invalid end date format")
    public void receiveStatusForGetGrafikWithInvalidEndDate(){
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("Receive {string} in the response body for TC_AA_97")
    public void verifyErrorMessageInvalidEndDate(String message){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(message)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Kesalahan format end date. Gunakan YYYY-MM-DD");
        }
    }

    //TC_MA_98
    @Step("Admin input valid endpoint to get grafik dashboard in six month with invalid start date and end date format")
    public String userInputValidEndpointToGetGrafikWithInvalidDate(){
        return url + "grafik?start_date=" + "2023-13-10" + "&end_date=" + "2023-13-10";
    }

    @Step("Admin request to get grafik data in six month with invalid start date and end date format with the HTTP GET method")
    public void userRequestWithHTTPMethodGETAndInputValidEndpointToGetGrafikWithInvalidDate(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzNDk0MTIwLCJpYXQiOjE3MDA5MDIxMjB9.qlUKfXy-A4lumLTCtgKKGJcEiLhtvp7WOWv_zDO0zyA")
                .get(userInputValidEndpointToGetGrafikWithInvalidDate());
    }

    @Step("Admin receive a response with status code 400 for failed get grafik data in six month with invalid start date and end date format")
    public void receiveStatusForGetGrafikWithInvalidDate(){
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("Receive {string} in the response body for TC_AA_98")
    public void verifyErrorMessageInvalidDate(String message){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(message)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Kesalahan format pada end date. Gunakan YYYY-MM-DD");
        }
    }

    //TC_MA_99
    @Step("Admin input valid endpoint to get grafik dashboard in six month with valid start date and end date but less than 6 month range")
    public String userInputValidEndpointToGetGrafikWithDateLessThan6Month(){
        return url + "grafik?start_date=" + "2023-06-10" + "&end_date=" + "2023-10-10";
    }

    @Step("Admin request to get grafik data in six month with valid start date and end date but less than 6 month range with the HTTP GET method")
    public void userRequestWithHTTPMethodGETAndInputValidEndpointToGetGrafikWithDateLessThan6Month(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzNDk0MTIwLCJpYXQiOjE3MDA5MDIxMjB9.qlUKfXy-A4lumLTCtgKKGJcEiLhtvp7WOWv_zDO0zyA")
                .get(userInputValidEndpointToGetGrafikWithDateLessThan6Month());
    }

    @Step("Admin receive a response with status code 200 for success get grafik data in six month with valid start date and end date but less than 6 month range")
    public void receiveStatusForGetGrafikWithDateLessThan6Month(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("Verify grafik data in six month with valid start date and end date but less than 6 month range is not empty")
    public void verifyNotNullGrafikWithDateLessThan6Month(){
        restAssuredThat(response -> response.body("$", notNullValue()));
    }

    //TC_MA_100
    @Step("Admin input valid endpoint to get grafik dashboard in six month with with empty start date and end date")
    public String userInputValidEndpointToGetGrafikWithEmptyDate(){
        return url + "grafik?start_date=" + "" + "&end_date=" + "";
    }

    @Step("Admin request to get grafik data in six month with with empty start date and end date with the HTTP GET method")
    public void userRequestWithHTTPMethodGETAndInputValidEndpointToGetGrafikWithEmptyDate(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwiZXhwIjoxNzAzNDk0MTIwLCJpYXQiOjE3MDA5MDIxMjB9.qlUKfXy-A4lumLTCtgKKGJcEiLhtvp7WOWv_zDO0zyA")
                .get(userInputValidEndpointToGetGrafikWithEmptyDate());
    }

    @Step("Admin receive a response with status code 200 for success get grafik data in six month with empty start date and end date")
    public void receiveStatusForGetGrafikWithEmptyDate(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("Verify grafik data in six month with empty start date and end date is not empty")
    public void verifyNotNullGrafikWithEmptyDate(){
        restAssuredThat(response -> response.body("$", notNullValue()));
    }

}
