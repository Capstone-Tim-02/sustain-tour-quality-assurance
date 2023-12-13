package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.CreateCategory;
import starter.pages.CreatePromo;

public class CreateCategorySteps {
    @Steps
    CreateCategory createCategory;

    //TC_MA_16

    @Given("Admin input valid endpoint to create category")
    public void adminInputValidEndpointToCreateCategory() {
        createCategory.setPostApiEndpoint();
    }

    @When("Admin request with the HTTP method POST and input valid category name in the request body")
    public void adminRequestWithTheHTTPMethodPOSTAndInputCategory() {
        createCategory.sendPostHttpRequestForCreateCategory();
    }

    @Then("Admin receive a response with status code 201 for create valid category")
    public void adminValidateResponseInTheResponseBodyForCreateCategory() {
        createCategory.receiveStatusForCreateCategory();
    }

    //TC_MA_17

    @When("Admin request with the HTTP method POST and input used category nama in the request body")
    public void adminRequestWithTheHTTPMethodPOSTAndInputUsedCategory() {
        createCategory.sendPostHttpRequestForCreateUsedCategory();
    }

    @Then("Admin receive a response with status code 409 for create promo with used category nama")
    public void adminValidateResponseInTheResponseBodyForCreateUsedCategory() {
        createCategory.receiveStatusForCreateUsedCategory();
    }

    @And("Receive {string} in the response body for TC_AA_17")
    public void adminValidateResponseMessageInTheResponseBodyForCreateUsedCategory(String message) {
        createCategory.receiveMessageForCreateUsedCategory("Kategori ini sudah ada");
    }


    //TC_MA_18

    @When("Admin request with the HTTP method POST and input empty category nama in the request body")
    public void adminRequestWithTheHTTPMethodPOSTAndInputEmptyCategory() {
        createCategory.sendPostHttpRequestForCreateEmptyCategory();
    }

    @Then("Admin receive a response with status code 400 for create promo with empty category name")
    public void adminValidateResponseInTheResponseBodyForCreateEmptyCategory() {
        createCategory.receiveStatusForCreateEmptyCategory();
    }

    @And("Receive {string} in the response body for TC_AA_18")
    public void adminValidateResponseMessageInTheResponseBodyForCreateEmptyCategory(String message) {
        createCategory.receiveMessageForCreateEmptyCategory("Nama category minimal terdiri dari 5 karakter");
    }


}
