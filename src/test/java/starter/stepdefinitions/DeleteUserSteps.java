package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.DeleteTNC;
import starter.pages.DeleteUser;

public class DeleteUserSteps {
    @Steps
    DeleteUser deleteUser;

    //TC_MA_50

    @Given("Admin input valid endpoint to delete user")
    public void adminInputValidEndpointToDeleteUser() {
        deleteUser.setPostApiEndpointForValidDeleteUser();
    }

    @When("Admin request with the HTTP method DELETE and input valid user ID in the request body")
    public void adminRequestWithTheHTTPMethodDeleteToDeleteUser() {
        deleteUser.sendPostHttpRequestForValidDeleteUser();
    }

    @Then("Admin receive a response with status code 200 OK for success delete user")
    public void adminValidateDeleteUser() {
        deleteUser.receiveStatusForValidDeleteUser();
    }

    @And("receive {string} in the response body for TC_AA_50")
    public void adminValidateDisplayMessageDeleteUser(String message) {
        deleteUser.receiveMessageForValidDeleteUser("Berhasil menghapus data user");
    }

    //TC_MA_51

    @Given("Admin input invalid endpoint to delete user")
    public void adminInputValidEndpointToDeleteUserInvalid() {
        deleteUser.setPostApiEndpointForInValidDeleteUser();
    }

    @When("Admin request with the HTTP method DELETE and input invalid user ID in the request body")
    public void adminRequestWithTheHTTPMethodDeleteToDeleteUserInvalid() {
        deleteUser.sendPostHttpRequestForInValidDeleteUser();
    }

    @Then("Admin receive a response with status code 404 not found for failed delete user")
    public void adminValidateDeleteUserInvalid() {
        deleteUser.receiveStatusForInValidDeleteUser();
    }

    @And("receive {string} in the response body for TC_AA_51")
    public void adminValidateDisplayMessageDeleteUserInvalid(String message) {
        deleteUser.receiveMessageForInValidDeleteUser("User tidak ditemukan");
    }

}
