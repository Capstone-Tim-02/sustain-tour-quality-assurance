package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.DeleteTicket;
import starter.pages.DeleteUser;

public class DeleteTicketSteps {
    @Steps
    DeleteTicket deleteTicket;

    //TC_MA_50

    @Given("Admin input valid endpoint to delete ticket")
    public void adminInputValidEndpointToDeleteTicket() {
        deleteTicket.setPostApiEndpointForValidDeleteTicket();
    }

    @When("Admin request with the HTTP method DELETE and input valid ticket ID in the request body")
    public void adminRequestWithTheHTTPMethodDeleteToDeleteTicket() {
        deleteTicket.sendPostHttpRequestForValidDeleteTicket();
    }

    @Then("Admin receive a response with status code 200 OK for success delete ticket")
    public void adminValidateDeleteTicket() {
        deleteTicket.receiveStatusForValidDeleteTicket();
    }

    @And("receive {string} in the response body for TC_AA_75")
    public void adminValidateDisplayMessageDeleteTicket(String message) {
        deleteTicket.receiveMessageForValidDeleteTicket("Ticket deleted successfully");
    }

    //TC_MA_51

    @Given("Admin input invalid endpoint to delete ticket")
    public void adminInputValidEndpointToDeleteTicketInvalid() {
        deleteTicket.setPostApiEndpointForInValidDeleteTicket();
    }

    @When("Admin request with the HTTP method DELETE and input invalid ticket ID in the request body")
    public void adminRequestWithTheHTTPMethodDeleteToDeleteTicketInvalid() {
        deleteTicket.sendPostHttpRequestForInValidDeleteTicket();
    }

    @Then("Admin receive a response with status code 404 not found for failed delete ticket")
    public void adminValidateDeleteTicketInvalid() {
        deleteTicket.receiveStatusForInValidDeleteTicket();
    }

    @And("receive {string} in the response body for TC_AA_76")
    public void adminValidateDisplayMessageDeleteTicketInvalid(String message) {
        deleteTicket.receiveMessageForInValidDeleteTicket("Ticket not found");
    }

}
