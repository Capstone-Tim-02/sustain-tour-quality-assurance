package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.DeleteWisata;
import starter.pages.Login;

public class DeleteWisataSteps {
    @Steps
    DeleteWisata deleteWisata;

    //TC_MA_46

    @Given("Admin input valid endpoint to delete wisata")
    public void adminInputValidEndpointToDeleteWisata() {
        deleteWisata.setPostApiEndpointForValidDeleteWisata();
    }

    @When("Admin request with the HTTP method DELETE and input valid wisata ID in the request body")
    public void adminRequestWithTheHTTPMethodDeleteToDeleteWisata() {
        deleteWisata.sendPostHttpRequestForValidDeleteWisata();
    }

    @Then("Admin receive a response with status code 200 OK for success delete wisata")
    public void adminValidateDeleteWisata() {
        deleteWisata.receiveStatusForValidDeleteWisata();
    }

    @And("receive {string} in the response body for TC_AA_46")
    public void adminValidateDisplayMessageDeleteWisata(String message) {
        deleteWisata.receiveMessageForValidDeleteWisata("Wisata berhasil dihapus");
    }

    //TC_MA_47

    @Given("Admin input invalid endpoint to delete wisata")
    public void adminInputValidEndpointToDeleteWisataInvalid() {
        deleteWisata.setPostApiEndpointForInValidDeleteWisata();
    }

    @When("Admin request with the HTTP method DELETE and input invalid wisata ID in the request body")
    public void adminRequestWithTheHTTPMethodDeleteToDeleteWisataInvalid() {
        deleteWisata.sendPostHttpRequestForInValidDeleteWisata();
    }

    @Then("Admin receive a response with status code 404 not found for failed delete wisata")
    public void adminValidateDeleteWisataInvalid() {
        deleteWisata.receiveStatusForInValidDeleteWisata();
    }

    @And("receive {string} in the response body for TC_AA_47")
    public void adminValidateDisplayMessageDeleteWisataInvalid(String message) {
        deleteWisata.receiveMessageForInValidDeleteWisata("Wisata tidak ditemukan");
    }

}
