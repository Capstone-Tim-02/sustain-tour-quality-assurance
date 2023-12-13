package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.CreateCategory;
import starter.pages.CreateTNC;

public class CreateTNCSteps {
    @Steps
    CreateTNC createTNC;

    //TC_MA_36

    @Given("Admin input valid endpoint to create TNC")
    public void adminInputValidEndpointToCreateTNC() {
        createTNC.setPostApiEndpoint();
    }


    @When("Admin request with the HTTP method POST and input valid TNC credentials on the request body")
    public void adminRequestWithTheHTTPMethodPOSTAndInputTNC() {
        createTNC.sendPostHttpRequestForCreateTNC();
    }

    @Then("Admin receive a response with status code 201 for create valid TNC")
    public void adminValidateResponseInTheResponseBodyForCreateTNC() {
        createTNC.receiveStatusForCreateTNC();
    }

    //TC_MA_37

    @When("Admin request with the HTTP method POST and input used TNC nama in the request body")
    public void adminRequestWithTheHTTPMethodPOSTAndInputUsedTNC() {
        createTNC.sendPostHttpRequestForCreateUsedTNC();
    }

    @Then("Admin receive a response with status code 409 for create TNC with used TNC nama")
    public void adminValidateResponseInTheResponseBodyForCreateUsedTNC() {
        createTNC.receiveStatusForCreateUsedTNC();
    }

    @And("Receive {string} in the response body for TC_AA_37")
    public void adminValidateResponseMessageInTheResponseBodyForCreateUsedTNC(String message) {
        createTNC.receiveMessageForCreateUsedTNC("Syarat Ketentuan dengan nama ini sudah ada");
    }

    //TC_MA_38

    @When("Admin request with the HTTP method POST and input empty TNC nama in the request body")
    public void adminRequestWithTheHTTPMethodPOSTAndInputEmptyTNC() {
        createTNC.sendPostHttpRequestForCreateEmptyTNC();
    }

    @Then("Admin receive a response with status code 400 for create TNC with empty TNC name")
    public void adminValidateResponseInTheResponseBodyForCreateEmptyTNC() {
        createTNC.receiveStatusForCreateEmptyTNC();
    }

    @And("Receive {string} in the response body for TC_AA_38")
    public void adminValidateResponseMessageInTheResponseBodyForCreateEmptyTNC(String message) {
        createTNC.receiveMessageForCreateEmptyTNC("Nama Syarat Ketentuan minimal 5 karakter");
    }

    //TC_MA_39

    @When("Admin request with the HTTP method POST and input empty TNC description in the request body")
    public void adminRequestWithTheHTTPMethodPOSTAndInputEmptyTNCDesc() {
        createTNC.sendPostHttpRequestForCreateEmptyTNCDesc();
    }

    @Then("Admin receive a response with status code 400 for create TNC with empty TNC description")
    public void adminValidateResponseInTheResponseBodyForCreateEmptyTNCDesc() {
        createTNC.receiveStatusForCreateEmptyTNCDesc();
    }

    @And("Receive {string} in the response body for TC_AA_39")
    public void adminValidateResponseMessageInTheResponseBodyForCreateEmptyTNCDesc(String message) {
        createTNC.receiveMessageForCreateEmptyTNCDesc("Deskripsi minimal 10 karakter");
    }

    //TC_MA_40

    @When("Admin request with the HTTP method POST and input empty TNC nama and description in the request body")
    public void adminRequestWithTheHTTPMethodPOSTAndInputEmptyTNCDescAndName() {
        createTNC.sendPostHttpRequestForCreateEmptyTNCDescAndName();
    }

    @Then("Admin receive a response with status code 400 for create promo with empty TNC name and description")
    public void adminValidateResponseInTheResponseBodyForCreateEmptyTNCDescAndName() {
        createTNC.receiveStatusForCreateEmptyTNCDescAndName();
    }

    @And("Receive {string} in the response body for TC_AA_40")
    public void adminValidateResponseMessageInTheResponseBodyForCreateEmptyTNCDescAndName(String message) {
        createTNC.receiveMessageForCreateEmptyTNCDescAndName("Nama Syarat Ketentuan minimal 5 karakter");
    }


}
