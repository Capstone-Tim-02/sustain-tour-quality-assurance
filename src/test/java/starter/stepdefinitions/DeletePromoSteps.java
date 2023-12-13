package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.DeletePromo;
import starter.pages.DeleteUser;

public class DeletePromoSteps {
    @Steps
    DeletePromo deletePromo;

    //TC_MA_71

    @Given("Admin input valid endpoint to delete promo")
    public void adminInputValidEndpointToDeletePromo() {
        deletePromo.setPostApiEndpointForValidDeletePromo();
    }

    @When("Admin request with the HTTP method DELETE and input valid promo ID in the request body")
    public void adminRequestWithTheHTTPMethodDeleteToDeletePromo() {
        deletePromo.sendPostHttpRequestForValidDeletePromo();
    }

    @Then("Admin receive a response with status code 200 OK for success delete promo")
    public void adminValidateDeletePromo() {
        deletePromo.receiveStatusForValidDeletePromo();
    }

    @And("receive {string} in the response body for TC_AA_71")
    public void adminValidateDisplayMessageDeletePromo(String message) {
        deletePromo.receiveMessageForValidDeletePromo("Promo berhasil dihapus");
    }

    //TC_MA_72

    @Given("Admin input invalid endpoint to delete promo")
    public void adminInputValidEndpointToDeletePromoInvalid() {
        deletePromo.setPostApiEndpointForInValidDeletePromo();
    }

    @When("Admin request with the HTTP method DELETE and input invalid promo ID in the request body")
    public void adminRequestWithTheHTTPMethodDeleteToDeletePromoInvalid() {
        deletePromo.sendPostHttpRequestForInValidDeletePromo();
    }

    @Then("Admin receive a response with status code 404 not found for failed delete promo")
    public void adminValidateDeletePromoInvalid() {
        deletePromo.receiveStatusForInValidDeletePromo();
    }

    @And("receive {string} in the response body for TC_AA_72")
    public void adminValidateDisplayMessageDeletePromoInvalid(String message) {
        deletePromo.receiveMessageForInValidDeletePromo("Promo tidak ditemukan");
    }

}
