package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Admin_Login;
import starter.pages.Admin_Logout;

public class Admin_Logout_Steps {

    @Steps
    Admin_Login adminLogin;

    @Steps
    Admin_Logout adminLogout;


    //TC_AW_142 [Positive 1] - Verify success logout from account Destimate

    @Given("I have login and already on the dashboard of the Destimate")
    public void iHaveLoginAndAlreadyOnTheDashboardOfTheDestimate() {
        adminLogin.openDestimateWebsite();
        adminLogin.inputValidUsername("admin");
        adminLogin.inputValidKataSandi("admin123");
        adminLogin.clickEyesIcon();
        adminLogin.clickMasukButton();
    }

    @When("I click icon logout")
    public void iClickIconLogout() {
        adminLogout.clickLogoutIcon();
    }

    @And("i choose logout option")
    public void iChooseLogoutOption() {
        adminLogout.clickKeluarOption();
    }

    @Then("validate success logout and display message {string}")
    public void validateSuccessLogoutAndDisplayMessage(String successLogout) {
        adminLogout.validateSuccessLogoutAndOnTheLoginPage(successLogout);
    }











    //TC_AW_143 [Positive 2] - Verify success cancel to logout

    @And("i choose cancel option")
    public void iChooseCancelOption() {
        adminLogout.clickCancelOption();
    }

    @Then("validate success stay on the {string} destimates")
    public void validateSuccessStayOnTheDashboardDestimates(String stayOnTheOverview) {
        adminLogout.validateStayOnTheOverview(stayOnTheOverview);
    }
}
