package starter.pages;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class User_GetAllWisataData {

    protected static String url = "https://destimate.uc.r.appspot.com/";


    //TC_AA_User_31 - Get All Wisata Data [Positive]

    @Step("User input valid endpoint to get all wisata data")
    public String userInputValidEndpointToGetAllWisataData(){
        return url + "wisata/mobile";
    }

    @Step("User request with HTTP method GET and click Send Button")
    public void userRequestWithHTTPMethodGETAndInputValidEndpointToGetAllWisata(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + Token_Authentication.authToken)
                .get(userInputValidEndpointToGetAllWisataData()).then().statusCode(200);
    }

    @Step("Validate success to get all wisata data and display information detail all wisata in the response body")
    public void successToGetAllWisata(){
        restAssuredThat(response -> response.body("$", notNullValue()));
    }







    //TC_AA_User_32 - Get All Wisata Data [Negative]

    @Step("User input invalid endpoint to get all wisata data")
    public String userInputInvalidEndpointToGetAllWisataData(){
        return url + "wisata/Mobile";
    }

    @Step("User request with GET HTTP method and click Send Button")
    public void userRequestWithGetHTTPMethodAndInputValidEndpointToGetAllWisata(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + Token_Authentication.authToken)
                .get(userInputInvalidEndpointToGetAllWisataData()).then().statusCode(400);
    }

    @Step("User receive a response with status code 404 Not Found")
    public void receiveHttpResponseCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("Validate failed to get all wisata data and display error message {string} in the response body")
    public void failedToGetAllWisataData(String failedGetAllWisata){
        Response response = SerenityRest.then().extract().response();
        String responseBody = response.asString();

        if (response.getStatusCode() == 400 && responseBody.contains(failedGetAllWisata)) {
            // Validasi berhasil, pesan sesuai dengan yang diharapkan
        } else {
            // Validasi gagal
            throw new AssertionError("Response did not match the expected message.");
        }
    }

}
