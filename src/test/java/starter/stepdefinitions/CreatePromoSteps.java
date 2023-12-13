package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.CreatePromo;
import starter.pages.Login;

public class CreatePromoSteps {
    @Steps
    CreatePromo createPromo;

    //TC_MA_8

    @Given("Admin input valid endpoint to create promo")
    public void adminInputValidEndpointToCreatePromo() {
        createPromo.setPostApiEndpoint();
    }

    @When("Admin request with the HTTP method POST and input empty title in the request body")
    public void adminRequestWithTheHTTPMethodPOSTAndInputEmptyTitle() {
        createPromo.sendPostHttpRequestForCreatePromoWithEmptyTitle();
    }

    @Then("Admin receive a response with status code 400 for create promo with empty title")
    public void adminValidateResponseInTheResponseBodyForCreatePromoWIthEmptyTitle() {
        createPromo.receiveStatusForCreatePromoWithEmptyTitle();
    }

    @And("Receive {string} in the response body")
    public void adminValidateDisplayMessageInTheResponseBodyForCreatePromoWIthEmptyTitle(String message) {
        createPromo.receiveMessageForCreatePromoWithEmptyTitle("Judul minimal 5 karakter");
    }

    //TC_MA_9

    @When("Admin request with the HTTP method POST and input empty nama voucher in the request body")
    public void adminRequestWithTheHTTPMethodPOSTAndInputEmptyNama() {
        createPromo.sendPostHttpRequestForCreatePromoWithEmptyNama();
    }

    @Then("Admin receive a response with status code 400 for create promo with empty nama voucher")
    public void adminValidateResponseInTheResponseBodyForCreatePromoWIthEmptyNama() {
        createPromo.receiveStatusForCreatePromoWithEmptyNama();
    }

    @And("Receive {string} in the response body for TC_AA_9")
    public void adminValidateDisplayMessageInTheResponseBodyForCreatePromoWIthEmptyNama(String message) {
        createPromo.receiveMessageForCreatePromoWithEmptyNama("Nama Promo minimal 5 karakter");
    }

    //TC_MA_10

    @When("Admin request with the HTTP method POST and input empty kode voucher in the request body")
    public void adminRequestWithTheHTTPMethodPOSTAndInputEmptyKode() {
        createPromo.sendPostHttpRequestForCreatePromoWithEmptyKode();
    }

    @Then("Admin receive a response with status code 400 for create promo with empty kode voucher")
    public void adminValidateResponseInTheResponseBodyForCreatePromoWIthEmptyKode() {
        createPromo.receiveStatusForCreatePromoWithEmptyKode();
    }

    @And("Receive {string} in the response body for TC_AA_10")
    public void adminValidateDisplayMessageInTheResponseBodyForCreatePromoWIthEmptyKode(String message) {
        createPromo.receiveMessageForCreatePromoWithEmptyKode("Kode voucher minimal 5 karakter");
    }

    //TC_MA_11

    @When("Admin request with the HTTP method POST and input valid credentials in the request body")
    public void adminRequestWithTheHTTPMethodPOSTAndInputValidCredentials() {
        createPromo.sendPostHttpRequestForCreatePromoWithValidCredentials();
    }

    @Then("Admin receive a response with status code 200 for create promo with valid credentials")
    public void adminValidateResponseInTheResponseBodyForCreatePromoWIthValidCredentials() {
        createPromo.receiveStatusForCreatePromoWithValidCredentials();
    }

    @And("Receive {string} in the response body for TC_AA_11")
    public void adminValidateDisplayMessageInTheResponseBodyForCreatePromoWIthValidCredentials(String message) {
        createPromo.receiveMessageForCreatePromoWithValidCredentials("Promo berhasil dibuat");
    }

    //TC_MA_12

    @When("Admin request with the HTTP method POST and input 0 discount nominal in the request body")
    public void adminRequestWithTheHTTPMethodPOSTAndInput0Discount() {
        createPromo.sendPostHttpRequestForCreatePromoWith0Discount();
    }

    @Then("Admin receive a response with status code 400 for create promo with 0 discount nominal")
    public void adminValidateResponseInTheResponseBodyForCreatePromoWIth0Discount() {
        createPromo.receiveStatusForCreatePromoWith0Discount();
    }

    @And("Receive {string} in the response body for TC_AA_12")
    public void adminValidateDisplayMessageInTheResponseBodyForCreatePromoWIth0Discount(String message) {
        createPromo.receiveMessageForCreatePromoWith0Discount("Kesalahan jumlah_potongan_persen");
    }

    //TC_MA_13

    @When("Admin request with the HTTP method POST and input used title in the request body")
    public void adminRequestWithTheHTTPMethodPOSTAndInputWithUsedTitle() {
        createPromo.sendPostHttpRequestForCreatePromoWithUsedTitle();
    }

    @Then("Admin receive a response with status code 409 for create promo with used title")
    public void adminValidateResponseInTheResponseBodyForCreatePromoWithUsedTitle() {
        createPromo.receiveStatusForCreatePromoWithUsedTitle();
    }

    @And("Receive {string} in the response body for TC_AA_13")
    public void adminValidateDisplayMessageInTheResponseBodyForCreatePromoWithUsedTitle(String message) {
        createPromo.receiveMessageForCreatePromoWithUsedTitle("Promo dengan judul ini telah digunakan");
    }

    //TC_MA_14

    @When("Admin request with the HTTP method POST and input used nama promo in the request body")
    public void adminRequestWithTheHTTPMethodPOSTAndInputWithUsedName() {
        createPromo.sendPostHttpRequestForCreatePromoWithUsedName();
    }

    @Then("Admin receive a response with status code 400 for create promo with used nama promo")
    public void adminValidateResponseInTheResponseBodyForCreatePromoWithUsedName() {
        createPromo.receiveStatusForCreatePromoWithUsedName();
    }

    @And("Receive {string} in the response body for TC_AA_14")
    public void adminValidateDisplayMessageInTheResponseBodyForCreatePromoWithUsedName(String message) {
        createPromo.receiveMessageForCreatePromoWithUsedName("Promo dengan nama promo ini telah digunakan");
    }

    //TC_MA_14

    @When("Admin request with the HTTP method POST and input used kode promo in the request body")
    public void adminRequestWithTheHTTPMethodPOSTAndInputWithUsedKode() {
        createPromo.sendPostHttpRequestForCreatePromoWithUsedKode();
    }

    @Then("Admin receive a response with status code 400 for create promo with used kode promo")
    public void adminValidateResponseInTheResponseBodyForCreatePromoWithUsedKode() {
        createPromo.receiveStatusForCreatePromoWithUsedKode();
    }

    @And("Receive {string} in the response body for TC_AA_15")
    public void adminValidateDisplayMessageInTheResponseBodyForCreatePromoWithUsedKode(String message) {
        createPromo.receiveMessageForCreatePromoWithUsedKode("Nama kode voucher telah digunakan oleh promo lainnya, silahkan coba gunakan nama lainnya");
    }

}
