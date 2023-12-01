package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.CreateTNC;
import starter.pages.CreateWisata;

public class CreateWisataSteps {
    @Steps
    CreateWisata createWisata;

    //TC_MA_36

    @Given("Admin input valid endpoint to create wisata")
    public void adminInputValidEndpointToCreateWisata() {
        createWisata.setPostApiEndpoint();
    }

    @When("Admin request with the HTTP method POST and input valid wisata credentials on the request body")
    public void adminRequestWithTheHTTPMethodPOSTAndInputWisata() {
        createWisata.sendPostHttpRequestForCreateWisata();
    }

    @Then("Admin receive a response with status code 201 for success create wisata")
    public void adminValidateResponseInTheResponseBodyForCreateWisata() {
        createWisata.receiveStatusForCreateWisata();
    }

    //TC_MA_42
    @When("Admin request with the HTTP method POST and input empty wisata title in the request body")
    public void adminRequestWithTheHTTPMethodPOSTAndInputWisataWithEmptyTitle() {
        createWisata.sendPostHttpRequestForCreateWisataWithEmptyTitle();
    }

    @Then("Admin receive a response with status code 400 for create wisata with empty title")
    public void adminValidateResponseInTheResponseBodyForCreateWisatWithEmptyTitlea() {
        createWisata.receiveStatusForCreateWisataWithEmptyTitle();
    }

    @And("Receive {string} in the response body for TC_AA_42")
    public void adminValidateResponseMessageInTheResponseBodyForCreateWisata(String message) {
        createWisata.receiveMessageForCreateWisataWithEmptyTitleC("Judul harus minimal 8 huruf");
    }

    //TC_MA_43
    @When("Admin request with the HTTP method POST and input used wisata title in the request body")
    public void adminRequestWithTheHTTPMethodPOSTAndInputWisataWithUsedTitle() {
        createWisata.sendPostHttpRequestForCreateWisataWithUsedTitle();
    }

    @Then("Admin receive a response with status code 400 for create wisata with used title")
    public void adminValidateResponseInTheResponseBodyForCreateWisatWithUsedTitle() {
        createWisata.receiveStatusForCreateWisataWithUsedTitle();
    }

    @And("Receive {string} in the response body for TC_AA_43")
    public void adminValidateResponseMessageInTheResponseBodyForCreateWisataWithUsedTitle(String message) {
        createWisata.receiveMessageForCreateWisataWithUsedTitle("Judul sudah digunakan");
    }

    //TC_MA_44
    @When("Admin request with the HTTP method POST and input >0 wisata price in the request body")
    public void adminRequestWithTheHTTPMethodPOSTAndInputWisataWith0Price() {
        createWisata.sendPostHttpRequestForCreateWisataWith0Price();
    }

    @Then("Admin receive a response with status code 409 for create wisata with >0 wisata price")
    public void adminValidateResponseInTheResponseBodyForCreateWisatWith0Price() {
        createWisata.receiveStatusForCreateWisataWith0Price();
    }

    @And("Receive {string} in the response body for TC_AA_44")
    public void adminValidateResponseMessageInTheResponseBodyForCreateWisataWith0Price(String message) {
        createWisata.receiveMessageForCreateWisataWith0Price("Price must be greater than 0");
    }

    //TC_MA_45
    @When("Admin request with the HTTP method POST and input >0 wisata ticket in the request body")
    public void adminRequestWithTheHTTPMethodPOSTAndInputWisataWith0Ticket() {
        createWisata.sendPostHttpRequestForCreateWisataWith0Ticket();
    }

    @Then("Admin receive a response with status code 400 for create wisata with >0 wisata ticket")
    public void adminValidateResponseInTheResponseBodyForCreateWisatWith0Ticket() {
        createWisata.receiveStatusForCreateWisataWith0Ticket();
    }

    @And("Receive {string} in the response body for TC_AA_45")
    public void adminValidateResponseMessageInTheResponseBodyForCreateWisataWith0Ticket(String message) {
        createWisata.receiveMessageForCreateWisataWith0Ticket("Available Tickets harus lebih dari 0");
    }

    //TC_MA_101
    @When("Admin request with the HTTP method POST and input empty kode in the request body")
    public void adminRequestWithTheHTTPMethodPOSTAndInputWisataWithEmptyKode() {
        createWisata.sendPostHttpRequestForCreateWisataWithEmptyKode();
    }

    @Then("Admin receive a response with status code 400 for create wisata with empty kode")
    public void adminValidateResponseInTheResponseBodyForCreateWisatWithEmptyKode() {
        createWisata.receiveStatusForCreateWisataWithEmptyKode();
    }

    @And("Receive {string} in the response body for TC_AA_101")
    public void adminValidateResponseMessageInTheResponseBodyForCreateWisataWithEmptyKode(String message) {
        createWisata.receiveMessageForCreateWisataWithEmptyKode("Kode harus minimal 3 huruf");
    }

    //TC_MA_102
    @When("Admin request with the HTTP method POST and input used kode in the request body")
    public void adminRequestWithTheHTTPMethodPOSTAndInputWisataWithUsedKode() {
        createWisata.sendPostHttpRequestForCreateWisataWithUsedKode();
    }

    @Then("Admin receive a response with status code 400 for create wisata with used kode")
    public void adminValidateResponseInTheResponseBodyForCreateWisatWithUsedKode() {
        createWisata.receiveStatusForCreateWisataWithUsedKode();
    }

    @And("Receive {string} in the response body for TC_AA_102")
    public void adminValidateResponseMessageInTheResponseBodyForCreateWisataWithUsedKode(String message) {
        createWisata.receiveMessageForCreateWisataWithUsedKode("Kode sudah digunakan");
    }



}
