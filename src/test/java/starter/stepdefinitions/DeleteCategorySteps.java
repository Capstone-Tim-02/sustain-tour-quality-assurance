package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.DeleteCategory;
import starter.pages.DeleteTNC;

public class DeleteCategorySteps {
    @Steps
    DeleteCategory deleteCategory;

    //TC_MA_73

    @Given("Admin input valid endpoint to delete category")
    public void adminInputValidEndpointToDeleteCategory() {
        deleteCategory.setPostApiEndpointForValidDeleteCategory();
    }

    @When("Admin request with the HTTP method DELETE and input valid category ID in the request body")
    public void adminRequestWithTheHTTPMethodDeleteToDeleteCategory() {
        deleteCategory.sendPostHttpRequestForValidDeleteCategory();
    }

    @Then("Admin receive a response with status code 200 OK for success delete category")
    public void adminValidateDeleteCategory() {
        deleteCategory.receiveStatusForValidDeleteCategory();
    }

    @And("receive {string} in the response body for TC_AA_73")
    public void adminValidateDisplayMessageDeleteCategory(String message) {
        deleteCategory.receiveMessageForValidDeleteCategory("Kategori berhasil dihapus");
    }

    //TC_MA_49

    @Given("Admin input invalid endpoint to delete category")
    public void adminInputValidEndpointToDeleteCategoryInvalid() {
        deleteCategory.setPostApiEndpointForInValidDeleteCategory();
    }

    @When("Admin request with the HTTP method DELETE and input invalid category ID in the request body")
    public void adminRequestWithTheHTTPMethodDeleteToDeleteCategoryInvalid() {
        deleteCategory.sendPostHttpRequestForInValidDeleteCategory();
    }

    @Then("Admin receive a response with status code 404 not found for failed delete category")
    public void adminValidateDeleteCategoryInvalid() {
        deleteCategory.receiveStatusForInValidDeleteCategory();
    }

    @And("receive {string} in the response body for TC_AA_74")
    public void adminValidateDisplayMessageDeleteCategoryInvalid(String message) {
        deleteCategory.receiveMessageForInValidDeleteCategory("Kategori tidak ditemukan");
    }

}
