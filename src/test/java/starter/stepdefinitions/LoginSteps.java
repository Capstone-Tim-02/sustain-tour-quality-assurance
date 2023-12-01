package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Login;

public class LoginSteps {
    @Steps
    Login login;

    //TC_MA_1 - Login

    @Given("Admin input valid endpoint to login")
    public void adminInputValidEndpointToLogin() {
        login.setPostApiEndpoint();
    }


    @When("Admin request with the HTTP method POST and input valid username and password in the request body and click Login Button")
    public void adminRequestWithTheHTTPMethodPOSTAndInputValidUsernameAndPasswordInTheRequestBodyAndClickSendButton() {
        login.sendPostHttpRequest();
    }

    @Then("Admin receive a response with status code 200 OK")
    public void adminValidateResponseLoginInTheResponseBody() {
        login.receiveStatus();
    }

    @And("receive {string} in the response body")
    public void adminValidateDisplayMessageInTheResponseBody(String message) {
        login.receiveMessage("Admin login successful");
    }

    //TC_MA_2 - Login
    @When("Admin request with the HTTP method POST and input valid username and wrong password")
    public void adminRequestWithTheHTTPMethodPOSTAndInputValidUsernameAndWrongPasswordInTheRequestBodyAndClickSendButton() {
        login.sendPostHttpRequestWithWrongPassword();
    }

    @Then("Admin receive a response with status code 401 for login with wrong password")
    public void adminValidateResponseLogin401() {
        login.receiveStatusLoginWithWrongPassword();
    }

    @And("receive {string} in the response body for TC_MA_2")
    public void adminValidateDisplayMessageInTheResponseBodyForLoginWIthWrongPassword(String message) {
        login.receiveMessageLoginWithWrongPassword("Password salah");
    }


    //TC_MA_3 - Login
    @When("Admin request with the HTTP method POST and input wrong username and valid password")
    public void adminRequestWithTheHTTPMethodPOSTAndInputWrongUsernameAndValidPasswordInTheRequestBodyAndClickSendButton() {
        login.sendPostHttpRequestWithWrongUsername();
    }

    @Then("Admin receive a response with status code 401 for login with wrong username")
    public void adminValidateResponseLogin401ForInvalidUsername() {
        login.receiveStatusLoginWithWrongUsername();
    }

    @And("receive {string} in the response body for TC_MA_3")
    public void adminValidateDisplayMessageInTheResponseBodyForLoginWIthWrongUsername(String message) {
        login.receiveMessageLoginWithWrongUsername("Username salah");
    }

    //TC_MA_4 - Login
    @When("Admin request with the HTTP method POST and input wrong username and wrong password")
    public void adminRequestWithTheHTTPMethodPOSTAndInputWrongUsernameAndWrongPasswordInTheRequestBodyAndClickSendButton() {
        login.sendPostHttpRequestWithWrongUsernamePassword();
    }

    @Then("Admin receive a response with status code 401 for login with wrong username and password")
    public void adminValidateResponseLogin401ForInvalidUsernamePassword() {
        login.receiveStatusLoginWithWrongUsernamePassword();
    }

    @And("receive {string} in the response body for TC_MA_4")
    public void adminValidateDisplayMessageInTheResponseBodyForLoginWIthWrongUsernamePassword(String message) {
        login.receiveMessageLoginWithWrongUsernamePassword("Username salah");
    }

    //TC_MA_5 - Login
    @When("Admin request with the HTTP method POST and input valid username and empty password")
    public void adminRequestWithTheHTTPMethodPOSTAndInputWrongUsernameAndEmptyPassword() {
        login.sendPostHttpRequestWithWrongUsernameEmptyPassword();
    }

    @Then("Admin receive a response with status code 400 for login with wrong username and empty password")
    public void adminValidateResponseLogin401ForInvalidUsernameEmptyPassword() {
        login.receiveStatusLoginWithWrongUsernameEmptyPassword();
    }

    @And("receive {string} in the response body for TC_MA_5")
    public void adminValidateDisplayMessageInTheResponseBodyForLoginWIthWrongUsernameEmptyPassword(String message) {
        login.receiveMessageLoginWithWrongUsernameEmptyPassword("Password harus dimasukan");
    }

    //TC_MA_6 - Login
    @When("Admin request with the HTTP method POST and input empty username and valid password")
    public void adminRequestWithTheHTTPMethodPOSTAndInputEmptyUsernameAndValidPassword() {
        login.sendPostHttpRequestWithEmptyUsernameValidPassword();
    }

    @Then("Admin receive a response with status code 400 for login with empty username and valid password")
    public void adminValidateResponseLogin401ForEmptyUsernameAndValidPassword() {
        login.receiveStatusLoginWithEmptyUsernameValidPassword();
    }

    @And("receive {string} in the response body for TC_MA_6")
    public void adminValidateDisplayMessageInTheResponseBodyForLoginWIthEmptyUsernameAndValidPassword(String message) {
        login.receiveMessageLoginWithEmptyUsernameValidPassword("Username harus dimasukan");
    }

    //TC_MA_7 - Login
    @When("Admin request with the HTTP method POST and input empty username and empty password")
    public void adminRequestWithTheHTTPMethodPOSTAndInputEmptyUsernameAndEmptyPassword() {
        login.sendPostHttpRequestWithEmptyUsernameEmptyPassword();
    }

    @Then("Admin receive a response with status code 400 for login with empty username and empty password")
    public void adminValidateResponseLogin401ForEmptyUsernameAndEmptyPassword() {
        login.receiveStatusLoginWithEmptyUsernameEmptyPassword();
    }

    @And("receive {string} in the response body for TC_MA_7")
    public void adminValidateDisplayMessageInTheResponseBodyForLoginWIthEmptyUsernameAndEmptyPassword(String message) {
        login.receiveMessageLoginWithEmptyUsernameEmptyPassword("Username harus dimasukan");
    }
}
