package starter.pages;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;


import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Login {
    protected String url = "https://destimate.uc.r.appspot.com/";


    //TC_MA_1 - Login

    @Step("Admin input valid endpoint to login")
    public String setPostApiEndpoint(){
        return url + "admin/signin";
    }

    @Step("User request with the HTTP method POST and input valid username and password in the request body and click Send Button")
    public void sendPostHttpRequest(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("username", "admin");
        requestBody.put("password", "admin123");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpoint());
    }

    @Step("Admin receive a response with status code 200 OK")
    public void receiveStatus(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("receive {string} in the response body")
    public void receiveMessage(String message){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 200 && responseBody.contains(message)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Admin login successful");
        }
    }


//    tc_ma_2
    @Step("Admin request with the HTTP method POST and input valid username and wrong password")
    public void sendPostHttpRequestWithWrongPassword(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("username", "admin");
        requestBody.put("password", "admin");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpoint());
    }

    @Step("Admin receive a response with status code 401 for login with wrong password")
    public void receiveStatusLoginWithWrongPassword(){
        restAssuredThat(response -> response.statusCode(401));
    }

    @Step("receive {string} in the response body for TC_MA_2")
    public void receiveMessageLoginWithWrongPassword(String message){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 401 && responseBody.contains(message)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Password salah");
        }
    }



    //    tc_ma_3
    @Step("Admin request with the HTTP method POST and input wrong username and valid password")
    public void sendPostHttpRequestWithWrongUsername(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("username", "hello");
        requestBody.put("password", "admin123");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpoint());
    }

    @Step("Admin receive a response with status code 401 for login with wrong username")
    public void receiveStatusLoginWithWrongUsername(){
        restAssuredThat(response -> response.statusCode(401));
    }

    @Step("receive {string} in the response body for TC_MA_3")
    public void receiveMessageLoginWithWrongUsername(String message){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 401 && responseBody.contains(message)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Username salah");
        }
    }

//    tc_ma_4
    @Step("Admin request with the HTTP method POST and input wrong username and wrong password")
    public void sendPostHttpRequestWithWrongUsernamePassword(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("username", "hello");
        requestBody.put("password", "hello");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpoint());
    }

    @Step("Admin receive a response with status code 401 for login with wrong username and password")
    public void receiveStatusLoginWithWrongUsernamePassword(){
        restAssuredThat(response -> response.statusCode(401));
    }

    @Step("receive {string} in the response body for TC_MA_4")
    public void receiveMessageLoginWithWrongUsernamePassword(String message){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 401 && responseBody.contains(message)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Username salah");
        }
    }


    //    tc_ma_5
    @Step("Admin request with the HTTP method POST and input valid username and empty password")
    public void sendPostHttpRequestWithWrongUsernameEmptyPassword(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("username", "admin");
        requestBody.put("password", "");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpoint());
    }

    @Step("Admin receive a response with status code 400 for login with wrong username and empty password")
    public void receiveStatusLoginWithWrongUsernameEmptyPassword(){
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("receive {string} in the response body for TC_MA_5")
    public void receiveMessageLoginWithWrongUsernameEmptyPassword(String message){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(message)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Password harus dimasukan");
        }
    }

    //    tc_ma_6
    @Step("Admin request with the HTTP method POST and input empty username and valid password")
    public void sendPostHttpRequestWithEmptyUsernameValidPassword(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("username", "");
        requestBody.put("password", "admin123");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpoint());
    }

    @Step("Admin receive a response with status code 400 for login with empty username and valid password")
    public void receiveStatusLoginWithEmptyUsernameValidPassword(){
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("receive {string} in the response body for TC_MA_6")
    public void receiveMessageLoginWithEmptyUsernameValidPassword(String message){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(message)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Username harus dimasukan");
        }
    }


    //    tc_ma_7
    @Step("Admin request with the HTTP method POST and input empty username and empty password")
    public void sendPostHttpRequestWithEmptyUsernameEmptyPassword(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("username", "");
        requestBody.put("password", "");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpoint());
    }

    @Step("Admin receive a response with status code 400 for login with empty username and empty password")
    public void receiveStatusLoginWithEmptyUsernameEmptyPassword(){
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("receive {string} in the response body for TC_MA_7")
    public void receiveMessageLoginWithEmptyUsernameEmptyPassword(String message){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(message)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Username harus dimasukan");
        }
    }
}
