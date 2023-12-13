package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.CreatePromo;
import starter.pages.EditPromo;

public class EditPromoSteps {
    @Steps
    EditPromo editPromo;

    //TC_MA_52

    @Given("Admin input valid endpoint to edit promo")
    public void adminInputValidEndpointToEditPromo() {
        editPromo.setPutAPIEndpointEditPromo();
    }

    @When("Admin request with the HTTP method PUT and input valid ID and credentials in the request body")
    public void adminRequestWithTheHTTPMethodPutEditPromo() {
        editPromo.sendPostHttpRequestForEditPromo();
    }

    @Then("Admin receive a response with status code 200 for success edit promo")
    public void adminValidateResponseInTheResponseBodyForEditPromo() {
        editPromo.receiveStatusForEditPromo();
    }

    @And("Receive {string} in the response body for TC_AA_52")
    public void adminValidateDisplayMessageInTheResponseBodyForEditPromo(String message) {
        editPromo.receiveMessageForEditPromo("Promo berhasil diperbarui");
    }


    //TC_MA_53

    @Given("Admin input valid endpoint to edit promo with existing title")
    public void adminInputValidEndpointToEditPromoWithExistingTitle() {
        editPromo.setPutAPIEndpointEditPromooWithExistingTitle();
    }

    @When("Admin request with the HTTP method PUT and input valid ID and existing title in the request body")
    public void adminRequestWithTheHTTPMethodPutEditPromooWithExistingTitle() {
        editPromo.sendPostHttpRequestForEditPromooWithExistingTitle();
    }

    @Then("Admin receive a response with status code 409 for failed edit promo with existing title")
    public void adminValidateResponseInTheResponseBodyForEditPromooWithExistingTitle() {
        editPromo.receiveStatusForEditPromooWithExistingTitle();
    }

    @And("Receive {string} in the response body for TC_AA_53")
    public void adminValidateDisplayMessageInTheResponseBodyForEditPromooWithExistingTitle(String message) {
        editPromo.receiveMessageForEditPromooWithExistingTitle("Promo dengan judul ini telah digunakan");
    }


    //TC_MA_54

    @Given("Admin input valid endpoint to edit promo with existing nama")
    public void adminInputValidEndpointToEditPromoWithExistingNama() {
        editPromo.setPutAPIEndpointEditPromooWithExistingNama();
    }

    @When("Admin request with the HTTP method PUT and input valid ID and existing nama in the request body")
    public void adminRequestWithTheHTTPMethodPutEditPromooWithExistingNama() {
        editPromo.sendPostHttpRequestForEditPromooWithExistingNama();
    }

    @Then("Admin receive a response with status code 409 for failed edit promo with existing nama")
    public void adminValidateResponseInTheResponseBodyForEditPromooWithExistingNama() {
        editPromo.receiveStatusForEditPromooWithExistingNama();
    }

    @And("Receive {string} in the response body for TC_AA_54")
    public void adminValidateDisplayMessageInTheResponseBodyForEditPromooWithExistingNama(String message) {
        editPromo.receiveMessageForEditPromooWithExistingNama("Promo dengan nama_promo ini telah digunakan");
    }

    //TC_MA_55

    @Given("Admin input valid endpoint to edit promo with existing kode voucher")
    public void adminInputValidEndpointToEditPromoWithExistingKode() {
        editPromo.setPutAPIEndpointEditPromooWithExistingKode();
    }

    @When("Admin request with the HTTP method PUT and input valid ID and existing kode voucher in the request body")
    public void adminRequestWithTheHTTPMethodPutEditPromooWithExistingKode() {
        editPromo.sendPostHttpRequestForEditPromooWithExistingKode();
    }

    @Then("Admin receive a response with status code 409 for failed edit promo with existing kode voucher")
    public void adminValidateResponseInTheResponseBodyForEditPromooWithExistingKode() {
        editPromo.receiveStatusForEditPromooWithExistingKode();
    }

    @And("Receive {string} in the response body for TC_AA_55")
    public void adminValidateDisplayMessageInTheResponseBodyForEditPromooWithExistingKode(String message) {
        editPromo.receiveMessageForEditPromooWithExistingKode("Promo dengan kode_voucher ini telah digunakan");
    }

    //TC_MA_56

    @Given("Admin input valid endpoint to edit promo with >0 potongan")
    public void adminInputValidEndpointToEditPromoWith0Potongan() {
        editPromo.setPutAPIEndpointEditPromooWith0Potongan();
    }

    @When("Admin request with the HTTP method PUT and input valid ID and >0 potongan in the request body")
    public void adminRequestWithTheHTTPMethodPutEditPromooWith0Potongan() {
        editPromo.sendPostHttpRequestForEditPromooWith0Potongan();
    }

    @Then("Admin receive a response with status code 400 for failed edit promo with >0 potongan")
    public void adminValidateResponseInTheResponseBodyForEditPromooWith0Potongan() {
        editPromo.receiveStatusForEditPromooWith0Potongan();
    }

    @And("Receive {string} in the response body for TC_AA_56")
    public void adminValidateDisplayMessageInTheResponseBodyForEditPromooWith0Potongan(String message) {
        editPromo.receiveMessageForEditPromooWith0Potongan("JumlahPotonganPersen harus lebih besar dari 0");
    }


    //TC_MA_57

    @Given("Admin input invalid endpoint to edit promo")
    public void adminInputValidEndpointToEditPromoInvalid() {
        editPromo.setPutAPIEndpointEditPromoInvalid();
    }

    @When("Admin request with the HTTP method PUT and input invalid ID and credentials in the request body")
    public void adminRequestWithTheHTTPMethodPutEditPromoInvalid() {
        editPromo.sendPostHttpRequestForEditPromoInvalid();
    }

    @Then("Admin receive a response with status code 404 for failed edit promo with invalid ID")
    public void adminValidateResponseInTheResponseBodyForEditPromoInvalid() {
        editPromo.receiveStatusForEditPromoInvalid();
    }

    @And("Receive {string} in the response body for TC_AA_57")
    public void adminValidateDisplayMessageInTheResponseBodyForEditPromoInvalid(String message) {
        editPromo.receiveMessageForEditPromoInvalid("Promo tidak ditemukan");
    }


}
