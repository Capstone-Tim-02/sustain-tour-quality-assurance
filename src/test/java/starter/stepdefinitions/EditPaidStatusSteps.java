package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.EditPaidStatus;
import starter.pages.EditTNC;

public class EditPaidStatusSteps {
    @Steps
    EditPaidStatus editPaidStatus;

    //TC_MA_66

    @Given("Admin input valid endpoint to edit paid status to true")
    public void adminInputValidEndpointToEditPaidStatusToTrue() {
        editPaidStatus.setPostApiEndpointEditPaidStatusToTrue();
    }

    @When("Admin request with the HTTP method PUT and input an valid invoice ID")
    public void adminRequestWithTheHTTPMethodPutEditPaidStatusToTrue() {
        editPaidStatus.sendPostHttpRequestForEditPaidStatusToTrue();
    }

    @Then("Admin receive a response with status code 200 for success edit paid status to true")
    public void adminValidateResponseInTheResponseBodyForEditPaidStatusToTrue() {
        editPaidStatus.receiveStatusForEditPaidStatusToTrue();
    }

    @And("Receive {string} in the response body for TC_AA_66")
    public void adminValidateResponseMessageInTheResponseBodyForEditPaidStatusToTrue(String message) {
        editPaidStatus.receiveMessageForEditPaidStatusToTrue("Status pembayaran berhasil di konfirmasi");
    }


    //TC_MA_67

    @Given("Admin input valid endpoint to edit paid status to false")
    public void adminInputValidEndpointToEditPaidStatusToFalse() {
        editPaidStatus.setPostApiEndpointEditPaidStatusToFalse();
    }

    @When("Admin request with the HTTP method PUT and input valid invoice ID")
    public void adminRequestWithTheHTTPMethodPutEditPaidStatusToFalse() {
        editPaidStatus.sendPostHttpRequestForEditPaidStatusToFalse();
    }

    @Then("Admin receive a response with status code 200 for success edit paid status to false")
    public void adminValidateResponseInTheResponseBodyForEditPaidStatusToFalse() {
        editPaidStatus.receiveStatusForEditPaidStatusToFalse();
    }

    @And("Receive {string} in the response body for TC_AA_67")
    public void adminValidateResponseMessageInTheResponseBodyForEditPaidStatusToFalse(String message) {
        editPaidStatus.receiveMessageForEditPaidStatusToFalse("Status pembayaran berhasil di konfirmasi");
    }

    //TC_MA_68

    @Given("Admin input invalid endpoint to edit paid status to true")
    public void adminInputValidEndpointForInvalidEditPaidStatusToTrue() {
        editPaidStatus.setPostApiEndpointForInvalidEditPaidStatusToTrue();
    }

    @When("Admin request with the HTTP method PUT and input an invalid invoice ID")
    public void adminRequestWithTheHTTPMethodPutForInvalidEditPaidStatusToTrue() {
        editPaidStatus.sendPostHttpRequestForInvalidEditPaidStatusToTrue();
    }

    @Then("Admin receive a response with status code 404 for failed edit paid status with invalid invoice ID")
    public void adminValidateResponseInTheResponseBodyForInvalidEditPaidStatusToTrue() {
        editPaidStatus.receiveStatusForInvalidEditPaidStatusToTrue();
    }

    @And("Receive {string} in the response body for TC_AA_68")
    public void adminValidateResponseMessageInTheResponseBodyForInvalidEditPaidStatusToTrue(String message) {
        editPaidStatus.receiveMessageForInvalidEditPaidStatusToTrue("Ticket tidak ditemukan");
    }


    //TC_MA_69
    @Given("Admin input invalid endpoint to edit paid status to false")
    public void adminInputValidEndpointForInvalidEditPaidStatusToFalse() {
        editPaidStatus.setPostApiEndpointForInvalidEditPaidStatusToFalse();
    }

    @When("Admin request with the HTTP method PUT and input invalid invoice ID")
    public void adminRequestWithTheHTTPMethodPutForInvalidEditPaidStatusToFalse() {
        editPaidStatus.sendPostHttpRequestForInvalidEditPaidStatusToFalse();
    }

    @Then("Admin receive a response with status code 404 for failed edit paid status with invalid ID")
    public void adminValidateResponseInTheResponseBodyForInvalidEditPaidStatusToFalse() {
        editPaidStatus.receiveStatusForInvalidEditPaidStatusToFalse();
    }

    @And("Receive {string} in the response body for TC_AA_69")
    public void adminValidateResponseMessageInTheResponseBodyForInvalidEditPaidStatusToFalse(String message) {
        editPaidStatus.receiveMessageForInvalidEditPaidStatusToFalse("Ticket tidak ditemukan");
    }


    //TC_MA_70
    @Given("Admin input valid endpoint to edit paid status with non boolean")
    public void adminInputValidEndpointForInvalidEditEditWithNonBoolean() {
        editPaidStatus.setPostApiEndpointForInvalidEditPaidStatusToFalse();
    }

    @When("Admin request with the HTTP method PUT and fill request body with non boolean")
    public void adminRequestWithTheHTTPMethodPutForEditWithNonBoolean() {
        editPaidStatus.sendPostHttpRequestForEditWithNonBoolean();
    }

    @Then("Admin receive a response with status code 400 for failed edit with non boolean")
    public void adminValidateResponseInTheResponseBodyForEditWithNonBoolean() {
        editPaidStatus.receiveStatusForEditWithNonBoolean();
    }

    @And("Receive {string} in the response body for TC_AA_70")
    public void adminValidateResponseMessageInTheResponseBodyForEditWithNonBoolean(String message) {
        editPaidStatus.receiveMessageForEditWithNonBoolean("Kesalahan request body");
    }


}
