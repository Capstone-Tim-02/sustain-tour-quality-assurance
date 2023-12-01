package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.EditTNC;
import starter.pages.EditWisata;
import java.io.File;

public class EditWisataSteps {
    @Steps
    EditWisata editWisata;

    //TC_MA_62
    @Given("Admin input valid endpoint to edit wisata")
    public void adminInputValidEndpointToEditWisata() {
        editWisata.setPostApiEndpointEditWisata();
    }

    @When("Admin request with the HTTP method PUT and input valid wisata ID and credentials in the request body")
    public void adminRequestWithTheHTTPMethodPutEditWisata() {
        editWisata.sendPostHttpRequestForEditWisata();
    }

    @Then("Admin receive a response with status code 200 for success edit wisata")
    public void adminValidateResponseInTheResponseBodyForEditWisata() {
        editWisata.receiveStatusForEditWisata();
    }
    @And("Receive {string} in the response body for TC_AA_62")
    public void adminValidateResponseMessageInTheResponseBodyForEditWisata(String message) {
        editWisata.receiveMessageForEditWisata("Data wisata berhasil di update");
    }

    //TC_MA_63
    @Given("Admin input valid endpoint to edit wisata with existing title")
    public void adminInputValidEndpointToEditWisataWithExistingTitle() {
        editWisata.setPostApiEndpointEditWisataWithExistingTitle();
    }

    @When("Admin request with the HTTP method PUT and input valid wisata ID and existing title in the request body")
    public void adminRequestWithTheHTTPMethodPutEditWisataWithExistingTitle() {
        editWisata.sendPostHttpRequestForEditWisataWithExistingTitle();
    }

    @Then("Admin receive a response with status code 400 for failed edit wisata with existing title")
    public void adminValidateResponseInTheResponseBodyForEditWisataWithExistingTitle() {
        editWisata.receiveStatusForEditWisataWithExistingTitle();
    }
    @And("Receive {string} in the response body for TC_AA_63")
    public void adminValidateResponseMessageInTheResponseBodyForEditWisataWithExistingTitle(String message) {
        editWisata.receiveMessageForEditWisataWithExistingTitle("Judul sudah ada, pilih judul lain");
    }


    //TC_MA_64
    @Given("Admin input valid endpoint to edit wisata with empty title")
    public void adminInputValidEndpointToEditWisataWithEmptyTitle() {
        editWisata.setPostApiEndpointEditWisataWithEmptyTitle();
    }

    @When("Admin request with the HTTP method PUT and input valid wisata ID and empty title in the request body")
    public void adminRequestWithTheHTTPMethodPutEditWisataWithEmptyTitle() {
        editWisata.sendPostHttpRequestForEditWisataWithEmptyTitle();
    }

    @Then("Admin receive a response with status code 200 for edit wisata with empty title")
    public void adminValidateResponseInTheResponseBodyForEditWisataWithEmptyTitle() {
        editWisata.receiveStatusForEditWisataWithEmptyTitle();
    }
    @And("Receive {string} in the response body for TC_AA_64")
    public void adminValidateResponseMessageInTheResponseBodyForEditWisataWithEmptyTitle(String message) {
        editWisata.receiveMessageForEditWisataWithEmptyTitle("Data wisata berhasil di update");
    }


    //TC_MA_65
    @Given("Admin input invalid endpoint to edit wisata")
    public void adminInputValidEndpointToEditWisataInvalid() {
        editWisata.setPostApiEndpointEditWisataInvalid();
    }

    @When("Admin request with the HTTP method PUT and input invalid wisata ID in the request body")
    public void adminRequestWithTheHTTPMethodPutEditWisataWithInvalid() {
        editWisata.sendPostHttpRequestForEditWisataInvalid();
    }

    @Then("Admin receive a response with status code 404 for failed invalid edit wisata")
    public void adminValidateResponseInTheResponseBodyForEditWisataInvalid() {
        editWisata.receiveStatusForEditWisataInvalid();
    }
    @And("Receive {string} in the response body for TC_AA_65")
    public void adminValidateResponseMessageInTheResponseBodyForEditWisataInvalid(String message) {
        editWisata.receiveMessageForEditWisataInvalid("Wisata tidak ditemukan");
    }

}
