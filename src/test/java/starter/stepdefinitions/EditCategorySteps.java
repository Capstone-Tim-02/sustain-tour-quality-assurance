package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.EditCategory;

public class EditCategorySteps {
    @Steps
    EditCategory editCategory;

    //TC_MA_77

    @Given("Admin input valid endpoint to edit category")
    public void adminInputValidEndpointToEditCategory() {
        editCategory.setPostApiEndpointEditCategory();
    }

    @When("Admin request with the HTTP method PUT and input valid category ID")
    public void adminRequestWithTheHTTPMethodPutEditCategory() {
        editCategory.sendPostHttpRequestForEditCategory();
    }

    @Then("Admin receive a response with status code 200 for success edit category")
    public void adminValidateResponseInTheResponseBodyForEditCategory() {
        editCategory.receiveStatusForEditCategory();
    }

    @And("Receive {string} in the response body for TC_AA_77")
    public void adminValidateResponseMessageInTheResponseBodyForEditCategory(String message) {
        editCategory.receiveMessageForEditCategory("Berhasil mengupdate kategori");
    }

    //TC_MA_78

    @Given("Admin input valid endpoint to edit category with used category name")
    public void adminInputValidEndpointToEditCategoryWithUsedName() {
        editCategory.setPostApiEndpointEditCategoryWithUsedName();
    }

    @When("Admin request with the HTTP method PUT and input valid category ID and used category name")
    public void adminRequestWithTheHTTPMethodPutEditCategoryWithUsedName() {
        editCategory.sendPostHttpRequestForEditCategoryWithUsedName();
    }

    @Then("Admin receive a response with status code 409 for failed edit category with used category name")
    public void adminValidateResponseInTheResponseBodyForEditCategoryWithUsedName() {
        editCategory.receiveStatusForEditCategoryWithUsedName();
    }

    @And("Receive {string} in the response body for TC_AA_78")
    public void adminValidateResponseMessageInTheResponseBodyForEditCategoryWithUsedName(String message) {
        editCategory.receiveMessageForEditCategoryWithUsedName("Kategori sudah ada");
    }


    //TC_MA_79

    @Given("Admin input valid endpoint to edit category with empty category name")
    public void adminInputValidEndpointToEditCategoryWithEmptyName() {
        editCategory.setPostApiEndpointEditCategoryWithEmptyName();
    }

    @When("Admin request with the HTTP method PUT and input valid category ID and empty category name")
    public void adminRequestWithTheHTTPMethodPutEditCategoryWithEmptyName() {
        editCategory.sendPostHttpRequestForEditCategoryWithEmptyName();
    }

    @Then("Admin receive a response with status code 400 for failed edit category with empty category name")
    public void adminValidateResponseInTheResponseBodyForEditCategoryWithEmptyName() {
        editCategory.receiveStatusForEditCategoryWithEmptyName();
    }

    @And("Receive {string} in the response body for TC_AA_79")
    public void adminValidateResponseMessageInTheResponseBodyForEditCategoryWithEmptyName(String message) {
        editCategory.receiveMessageForEditCategoryWithEmptyName("Nama kategori harus minimal 5 karakter");
    }

    //TC_MA_80

    @Given("Admin input valid inendpoint to edit category")
    public void adminInputValidEndpointToEditCategoryInvalid() {
        editCategory.setPostApiEndpointEditCategoryInvalid();
    }

    @When("Admin request with the HTTP method PUT and input invalid category ID")
    public void adminRequestWithTheHTTPMethodPutEditCategoryInvalid() {
        editCategory.sendPostHttpRequestForEditCategoryInvalid();
    }

    @Then("Admin receive a response with status code 404 for invalid edit category")
    public void adminValidateResponseInTheResponseBodyForEditCategoryInvalid() {
        editCategory.receiveStatusForEditCategoryInvalid();
    }

    @And("Receive {string} in the response body for TC_AA_80")
    public void adminValidateResponseMessageInTheResponseBodyForEditCategoryInvalid(String message) {
        editCategory.receiveMessageForEditCategoryInvalid("Kategori tidak ditemukan");
    }



}
