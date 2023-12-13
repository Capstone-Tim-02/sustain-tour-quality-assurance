package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.EditCategory;
import starter.pages.EditUser;

public class EditUserSteps {
    @Steps
    EditUser editUser;

    //TC_MA_81

    @Given("Admin input valid endpoint to edit user")
    public void adminInputValidEndpointToEditUser() {
        editUser.setPostApiEndpointEditUser();
    }

    @When("Admin request with the HTTP method PUT and input valid user ID")
    public void adminRequestWithTheHTTPMethodPutEditUser() {
        editUser.sendPostHttpRequestForEditUser();
    }

    @Then("Admin receive a response with status code 200 for success edit user")
    public void adminValidateResponseInTheResponseBodyForEditUser() {
        editUser.receiveStatusForEditUser();
    }

    @And("Receive {string} in the response body for TC_AA_81")
    public void adminValidateResponseMessageInTheResponseBodyForEditUser(String message) {
        editUser.receiveMessageForEditUser("Berhasil mengupdate data user");
    }

    //TC_MA_82

    @Given("Admin input valid endpoint to edit user with used username")
    public void adminInputValidEndpointToEditUserWithUsedUsername() {
        editUser.setPostApiEndpointEditUserWithUsedUsername();
    }

    @When("Admin request with the HTTP method PUT and input valid user ID and used username")
    public void adminRequestWithTheHTTPMethodPutEditUserWithUsedUsername() {
        editUser.sendPostHttpRequestForEditUserWithUsedUsername();
    }

    @Then("Admin receive a response with status code 409 for failed edit user with used username")
    public void adminValidateResponseInTheResponseBodyForEditUserWithUsedUsername() {
        editUser.receiveStatusForEditUserWithUsedUsername();
    }

    @And("Receive {string} in the response body for TC_AA_82")
    public void adminValidateResponseMessageInTheResponseBodyForEditUserWithUsedUsername(String message) {
        editUser.receiveMessageForEditUserWithUsedUsername("Username sudah digunakan oleh user lain, silahkan coba yang lain");
    }


    //TC_MA_83

    @Given("Admin input valid endpoint to edit user with used email")
    public void adminInputValidEndpointToEditUserWithUsedEmail() {
        editUser.setPostApiEndpointEditUserWithUsedEmail();
    }

    @When("Admin request with the HTTP method PUT and input valid user ID and used email")
    public void adminRequestWithTheHTTPMethodPutEditUserWithUsedEmail() {
        editUser.sendPostHttpRequestForEditUserWithUsedEmail();
    }

    @Then("Admin receive a response with status code 409 for failed edit user with used email")
    public void adminValidateResponseInTheResponseBodyForEditUserWithUsedEmail() {
        editUser.receiveStatusForEditUserWithUsedEmail();
    }

    @And("Receive {string} in the response body for TC_AA_83")
    public void adminValidateResponseMessageInTheResponseBodyForEditUserWithUsedEmail(String message) {
        editUser.receiveMessageForEditUserWithUsedEmail("Email sudah digunakan user lain");
    }

    //TC_MA_84

    @Given("Admin input valid endpoint to edit user with used phone")
    public void adminInputValidEndpointToEditUserWithUsedPhone() {
        editUser.setPostApiEndpointEditUserWithUsedPhone();
    }

    @When("Admin request with the HTTP method PUT and input valid user ID and used phone")
    public void adminRequestWithTheHTTPMethodPutEditUserWithUsedPhone() {
        editUser.sendPostHttpRequestForEditUserWithUsedPhone();
    }

    @Then("Admin receive a response with status code 409 for failed edit user with used phone")
    public void adminValidateResponseInTheResponseBodyForEditUserWithUsedPhone() {
        editUser.receiveStatusForEditUserWithUsedPhone();
    }

    @And("Receive {string} in the response body for TC_AA_84")
    public void adminValidateResponseMessageInTheResponseBodyForEditUserWithUsedPhone(String message) {
        editUser.receiveMessageForEditUserWithUsedPhone("Nomor telphone telah digunakan oleh user lain");
    }

    //TC_MA_85

    @Given("Admin input invalid endpoint to edit user")
    public void adminInputValidEndpointToEditUserWithInvalidID() {
        editUser.setPostApiEndpointEditUserWithInvalidID();
    }

    @When("Admin request with the HTTP method PUT and input invalid user ID")
    public void adminRequestWithTheHTTPMethodPutEditUserWithInvalidID() {
        editUser.sendPostHttpRequestForEditUserWithInvalidID();
    }

    @Then("Admin receive a response with status code 404 for failed edit user")
    public void adminValidateResponseInTheResponseBodyForEditUserWithInvalidID() {
        editUser.receiveStatusForEditUserWithInvalidID();
    }

    @And("Receive {string} in the response body for TC_AA_85")
    public void adminValidateResponseMessageInTheResponseBodyForEditUserWithInvalidID(String message) {
        editUser.receiveMessageForEditUserWithInvalidID("User tidak ditemukan");
    }




}
