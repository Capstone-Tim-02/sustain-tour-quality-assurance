package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Admin_Login;

public class Admin_Login_Steps {

    @Steps
    Admin_Login adminLogin;


    //TC_AW_1 [Positive] - Verify success login using valid username and valid "kata sandi"

    @Given("I input valid username")
    public void iInputValidUsername() {
        adminLogin.openDestimateWebsite();
        adminLogin.inputValidUsername("admin");
    }

    @When("I input valid kata sandi")
    public void iInputValidKataSandi() {
        adminLogin.inputValidKataSandi("admin123");
    }

    @And("I click icon show password to see password is correct or not")
    public void iClickIconShowPasswordToSeePasswordIsCorrectOrNot() {
        adminLogin.clickEyesIcon();
        
    }

    @And("i click Masuk button")
    public void iClickMasukButton() {
        adminLogin.clickMasukButton();
    }

    @Then("validate success login and i am on the dashboard Destimate and display message {string}")
    public void validateSuccessLoginAndIAmOnTheDashboardDestimateAndDisplayMessage(String successMessage) {
        adminLogin.validateSuccessLogin();
        adminLogin.validateSuccessGetText(successMessage);

    }











    //TC_AW_2 [Negative 1] - Verify failed to login because input invalid username

    @Given("I input invalid username")
    public void iInputInvalidUsername() {
        adminLogin.openDestimateWebsite();
        adminLogin.inputInvalidUsername("admin27");
    }


    @Then("validate failed login because invalid username and display error message {string}")
    public void validateFailedLoginBecauseInvalidUsernameAndDisplayErrorMessage(String messageInvalidUsername) {
        adminLogin.validateFailedLoginBecauseInvalidUsername(messageInvalidUsername);
    }














    //TC_AW_3 [Negative 2] - Verify failed to login because input invalid "kata sandi"

    @When("I input invalid kata sandi")
    public void iInputInvalidKataSandi() {
        adminLogin.inputInvalidKataSandi("admin12345");
    }

    @Then("validate failed login because invalid password and display error message {string}")
    public void validateFailedLoginBecauseInvalidPasswordAndDisplayErrorMessage(String messageInvalidKataSandi) {
        adminLogin.validateFailedLoginBecauseInvalidKataSandi(messageInvalidKataSandi);
    }









    //TC_AW_4 [Negative 3]

    @Then("validate failed login because invalid username and password and display error message {string}")
    public void validateFailedLoginBecauseInvalidUsernameAndPasswordAndDisplayErrorMessage(String messageInvalidUsernameAndPassword) {
        adminLogin.validateFailedLoginBecauseInvalidUsernameAndPassword(messageInvalidUsernameAndPassword);
    }










    //TC_AW_5 [Negative 4]

    @Given("I did not input username")
    public void iDidNotInputUsername() {
        adminLogin.openDestimateWebsite();
        adminLogin.didNotInputUsername();
    }

    @Then("validate failed login because did not input username and display error message {string}")
    public void validateFailedLoginBecauseDidNotInputUsernameAndDisplayErrorMessage(String messageEmptyUsername) {
        adminLogin.validateFailedLoginBecauseEmptyUsername(messageEmptyUsername);
    }












    //TC_AW_6 [Negative 5]

    @When("I did not input kata sandi")
    public void iDidNotInputKataSandi() {
        adminLogin.didNotInputKataSandi();
    }

    @Then("validate failed login because did not input kata sandi and display error message {string}")
    public void validateFailedLoginBecauseDidNotInputKataSandiAndDisplayErrorMessage(String messageEmptyKataSandi) {
        adminLogin.validateFailedLoginBecauseEmptyKataSandi(messageEmptyKataSandi);
    }













    //TC_AW_7 [Negative 6]

    @Then("validate failed login because did not input username and kata sandi and display error message {string} and {string}")
    public void validateFailedLoginBecauseDidNotInputUsernameAndKataSandiAndDisplayErrorMessageAnd(String messageEmptyUsername, String messageEmptyKataSandi) {
        adminLogin.validateFailedLoginBecauseEmptyKataSandi(messageEmptyUsername);
        adminLogin.validateFailedLoginBecauseEmptyKataSandi(messageEmptyKataSandi);
    }
}
