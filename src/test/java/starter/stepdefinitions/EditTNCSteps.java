package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.CreateTNC;
import starter.pages.EditTNC;

public class EditTNCSteps {
    @Steps
    EditTNC editTNC;

    //TC_MA_58

    @Given("Admin input valid endpoint to edit TNC")
    public void adminInputValidEndpointToEditTNC() {
        editTNC.setPostApiEndpointEditTNC();
    }

    @When("Admin request with the HTTP method PUT and input valid TNC ID and credentials in the request body")
    public void adminRequestWithTheHTTPMethodPutEditTNC() {
        editTNC.sendPostHttpRequestForEditTNC();
    }

    @Then("Admin receive a response with status code 200 for success edit TNC")
    public void adminValidateResponseInTheResponseBodyForEditTNC() {
        editTNC.receiveStatusForEditTNC();
    }

    @And("Receive {string} in the response body for TC_AA_58")
    public void adminValidateResponseMessageInTheResponseBodyForEditTNC(String message) {
        editTNC.receiveMessageForEditTNC("Syarat Ketentuan berhasil diupdate");
    }


    //TC_MA_59

    @Given("Admin input valid endpoint to edit TNC with existing title")
    public void adminInputValidEndpointToEditTNCWithExistingTitle() {
        editTNC.setPostApiEndpointEditTNCWithExistingTitle();
    }

    @When("Admin request with the HTTP method PUT and input valid TNC ID and existing title in the request body")
    public void adminRequestWithTheHTTPMethodPutEditTNCWithExistingTitle() {
        editTNC.sendPostHttpRequestForEditTNCWithExistingTitle();
    }

    @Then("Admin receive a response with status code 409 for failed edit TNC with existing title")
    public void adminValidateResponseInTheResponseBodyForEditTNCWithExistingTitle() {
        editTNC.receiveStatusForEditTNCWithExistingTitle();
    }

    @And("Receive {string} in the response body for TC_AA_59")
    public void adminValidateResponseMessageInTheResponseBodyForEditTNCWithExistingTitle(String message) {
        editTNC.receiveMessageForEditTNCWithExistingTitle("Syarat Ketentuan dengan nama ini sudah ada");
    }


    //TC_MA_61

    @Given("Admin input invalid endpoint to edit TNC")
    public void adminInputValidEndpointToEditTNCInvalid() {
        editTNC.setPostApiEndpointEditTNCInvalid();
    }

    @When("Admin request with the HTTP method PUT and input invalid TNC ID in the request body")
    public void adminRequestWithTheHTTPMethodPutEditTNCInvalid() {
        editTNC.sendPostHttpRequestForEditTNCInvalid();
    }

    @Then("Admin receive a response with status code 404 for failed invalid edit TNC")
    public void adminValidateResponseInTheResponseBodyForEditTNCInvalid() {
        editTNC.receiveStatusForEditTNCInvalid();
    }

    @And("Receive {string} in the response body for TC_AA_61")
    public void adminValidateResponseMessageInTheResponseBodyForEditTNCInvalid(String message) {
        editTNC.receiveMessageForEditTNCInvalid("Syarat Ketentuan tidak ditemukan");
    }

}
