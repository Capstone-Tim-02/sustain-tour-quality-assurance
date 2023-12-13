package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.DeleteTNC;
import starter.pages.DeleteWisata;

public class DeleteTNCSteps {
    @Steps
    DeleteTNC deleteTNC;

    //TC_MA_48

    @Given("Admin input valid endpoint to delete TNC")
    public void adminInputValidEndpointToDeleteTNC() {
        deleteTNC.setPostApiEndpointForValidDeleteTNC();
    }

    @When("Admin request with the HTTP method DELETE and input valid TNC ID in the request body")
    public void adminRequestWithTheHTTPMethodDeleteToDeleteWisata() {
        deleteTNC.sendPostHttpRequestForValidDeleteTNC();
    }

    @Then("Admin receive a response with status code 200 OK for success delete TNC")
    public void adminValidateDeleteTNC() {
        deleteTNC.receiveStatusForValidDeleteTNC();
    }

    @And("receive {string} in the response body for TC_AA_48")
    public void adminValidateDisplayMessageDeleteTNC(String message) {
        deleteTNC.receiveMessageForValidDeleteTNC("Syarat Ketentuan berhasil dihapus");
    }

    //TC_MA_49

    @Given("Admin input invalid endpoint to delete TNC")
    public void adminInputValidEndpointToDeleteTNCInvalid() {
        deleteTNC.setPostApiEndpointForInValidDeleteTNC();
    }

    @When("Admin request with the HTTP method DELETE and input invalid TNC ID in the request body")
    public void adminRequestWithTheHTTPMethodDeleteToDeleteTNCInvalid() {
        deleteTNC.sendPostHttpRequestForInValidDeleteTNC();
    }

    @Then("Admin receive a response with status code 404 not found for failed delete TNC")
    public void adminValidateDeleteTNCInvalid() {
        deleteTNC.receiveStatusForInValidDeleteTNC();
    }

    @And("receive {string} in the response body for TC_AA_49")
    public void adminValidateDisplayMessageDeleteTNCInvalid(String message) {
        deleteTNC.receiveMessageForInValidDeleteTNC("Syarat Ketentuan tidak ditemukan");
    }

}
