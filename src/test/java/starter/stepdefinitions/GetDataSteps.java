package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import javax.ws.rs.QueryParam;
import starter.pages.GetData;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class GetDataSteps {
    @Steps
    GetData getData;

    //TC_MA_36

    @Given("Admin input valid endpoint to get user data")
    public void adminInputValidEndpointToGetAllUser() {
        getData.userInputValidEndpointToGetAllUser();
    }


    @When("Admin request to get all user data with the HTTP GET method")
    public void adminRequestWithTheHTTPMethodGETToGetAllUser() {
        getData.userRequestWithHTTPMethodGETAndInputValidEndpointToGetAllUser();
    }

    @Then("Admin receive a response with status code 200 for success get all user data")
    public void adminValidateResponseStatusInTheResponseBodyGetAllUser() {
        getData.receiveStatusForGetAllUser();
    }

    @And("Verify user data is not empty")
    public void adminValidateResponseInTheResponseBodyGetAllUser() {
        getData.successToGetAllUser();
    }

    //    TC_MA_20
    @Given("Admin input valid endpoint to get booking data")
    public void adminInputValidEndpointToGetAllBookingData() {
        getData.userInputValidEndpointToGetAllBookingData();
    }

    @When("Admin request to get all booking data with the HTTP GET method")
    public void adminRequestWithTheHTTPGetAllBookingData() {
        getData.userRequestWithHTTPMethodGETAndInputValidEndpointToGetAllBookingData();
    }

    @Then("Admin receive a response with status code 200 for success get all booking data")
    public void adminValidateResponseStatusInTheResponseBodyGetAllBookingData() {
        getData.receiveStatusForGetAllBookingData();
    }

    @And("Verify booking data is not empty")
    public void adminValidateResponseInTheResponseBodyGetAllBookingData() {
        getData.successToGetAllBookingData();
    }

    //    TC_MA_21
    @Given("Admin input valid endpoint to get total carbon footprint data")
    public void adminInputValidEndpointToGetAllCarbon() {
        getData.userInputValidEndpointToGetAllCarbon();
    }

    @When("Admin request to get total carbon footprint data with the HTTP GET method")
    public void adminRequestWithTheHTTPGetAllCarbon() {
        getData.userRequestWithHTTPMethodGETAndInputValidEndpointToGetAllCarbon();
    }

    @Then("Admin receive a response with status code 200 for success get total carbon footprint data")
    public void adminValidateResponseStatusInTheResponseBodyGetAllCarbon() {
        getData.receiveStatusForGetAllCarbon();
    }

    //    TC_MA_22
    @Given("Admin input valid endpoint to get total wisata data")
    public void adminInputValidEndpointToGetTotalWisata() {
        getData.userInputValidEndpointToGetTotalWisata();
    }

    @When("Admin request to get total wisata data with the HTTP GET method")
    public void adminRequestWithTheHTTPGetTotalWisata() {
        getData.userRequestWithHTTPMethodGETAndInputValidEndpointToGetTotalWisata();
    }

    @Then("Admin receive a response with status code 200 for success get total wisata data")
    public void adminValidateResponseStatusInTheResponseBodyGetTotalWisata() {
        getData.receiveStatusForGetTotalWisata();
    }


    //    TC_MA_23
    @Given("Admin input valid endpoint to get total user data")
    public void adminInputValidEndpointToGetTotalUser() {
        getData.userInputValidEndpointToGetTotalUser();
    }

    @When("Admin request to get total user data with the HTTP GET method")
    public void adminRequestWithTheHTTPGetTotalUser() {
        getData.userRequestWithHTTPMethodGETAndInputValidEndpointToGetTotalUser();
    }

    @Then("Admin receive a response with status code 200 for success get total user data")
    public void adminValidateResponseStatusInTheResponseBodyGetTotalUser() {
        getData.receiveStatusForGetTotalUser();
    }

    //    TC_MA_24
    @Given("Admin input valid endpoint to get total transaction data")
    public void adminInputValidEndpointToGetTotalTransaksi() {
        getData.userInputValidEndpointToGetTotalTransaksi();
    }

    @When("Admin request to get total transaction data with the HTTP GET method")
    public void adminRequestWithTheHTTPGetTotalTransaksi() {
        getData.userRequestWithHTTPMethodGETAndInputValidEndpointToGetTotalTransaksi();
    }

    @Then("Admin receive a response with status code 200 for success get total transaction data")
    public void adminValidateResponseStatusInTheResponseBodyGetTotalTransaksi() {
        getData.receiveStatusForGetTotalTransaksi();
    }


    //    TC_MA_25
    @Given("Admin input valid endpoint to get total monthly revenue  data")
    public void adminInputValidEndpointToGetTotalTransaksiBulanan() {
        getData.userInputValidEndpointToGetTotalTransaksiBulanan();
    }

    @When("Admin request to get total monthly revenue data with the HTTP GET method")
    public void adminRequestWithTheHTTPGetTotalTransaksiBulanan() {
        getData.userRequestWithHTTPMethodGETAndInputValidEndpointToGetTotalTransaksiBulanan();
    }

    @Then("Admin receive a response with status code 200 for success get total monthly revenue data")
    public void adminValidateResponseStatusInTheResponseBodyGetTotalTransaksiBulanan() {
        getData.receiveStatusForGetTotalTransaksiBulanan();
    }

    //    TC_MA_26
    @Given("Admin input invalid endpoint to get total monthly revenue data")
    public void adminInputInvalidEndpointToGetTotalTransaksiBulananInvalid() {
        getData.userInputEndpointToGetTotalTransaksiBulananInvalid();
    }

    @When("Admin send invalid request to get total monthly revenue data with the HTTP GET method")
    public void adminRequestWithTheHTTPGetInvalidTotalTransaksiBulanan() {
        getData.userRequestWithHTTPMethodGETAndInputInvalidEndpointToGetTotalTransaksiBulanan();
    }

    @Then("Admin receive a response with status code 404 for failed request to get total monthly revenue data")
    public void adminValidateResponseStatusInTheResponseBodyInvalidGetTotalTransaksiBulanan() {
        getData.receiveStatusForInvalidGetTotalTransaksiBulanan();
    }

    //    TC_MA_27
    @Given("Admin input valid endpoint to get all cetegory data")
    public void adminInputValidEndpointToGetCategory() {
        getData.userInputValidEndpointToGetCategory();
    }

    @When("Admin request to get all category data with the HTTP GET method")
    public void adminRequestWithTheHTTPGetCategory() {
        getData.userRequestWithHTTPMethodGETAndInputValidEndpointToGetCategory();
    }

    @Then("Admin receive a response with status code 200 for success get all category data")
    public void adminValidateResponseStatusInTheResponseBodyGetCategory() {
        getData.receiveStatusForGetCategory();
    }

    //    TC_MA_28
    @Given("Admin input valid endpoint to get all TNC data")
    public void adminInputValidEndpointToGetTNC() {
        getData.userInputValidEndpointToGetTNC();
    }

    @When("Admin request to get all TNC data with the HTTP GET method")
    public void adminRequestWithTheHTTPGetTNC() {
        getData.userRequestWithHTTPMethodGETAndInputValidEndpointToGetTNC();
    }

    @Then("Admin receive a response with status code 200 for success get all TNC data")
    public void adminValidateResponseStatusInTheResponseBodyGetTNC() {
        getData.receiveStatusForGetTNC();
    }

    //    TC_MA_29
    @Given("Admin input valid endpoint to get all wisata data")
    public void adminInputValidEndpointToGetWisata() {
        getData.userInputValidEndpointToGetWisata();
    }

    @When("Admin request to get all wisata data with the HTTP GET method")
    public void adminRequestWithTheHTTPGetWisata() {
        getData.userRequestWithHTTPMethodGETAndInputValidEndpointToGetWisata();
    }

    @Then("Admin receive a response with status code 200 for success get all wisata data")
    public void adminValidateResponseStatusInTheResponseBodyGetWisata() {
        getData.receiveStatusForGetWisata();
    }

    //    TC_MA_30
    @Given("Admin input valid endpoint to get wisata data by ID")
    public void adminInputValidEndpointToGetWisatabyID() {
        getData.userInputValidEndpointToGetWisatabyID();
    }

    @When("Admin request to get wisata data by ID with the HTTP GET method")
    public void adminRequestWithTheHTTPGetWisatabyID() {
        getData.userRequestWithHTTPMethodGETAndInputValidEndpointToGetWisatabyID();
    }
    @Then("Admin receive a response with status code 200 for success get wisata data by ID")
    public void adminValidateResponseStatusInTheResponseBodyGetWisatabyID() {
        getData.receiveStatusForGetWisatabyID();
    }

    @And("Verify result to get wisata data by ID is not null")
    public void adminValidateResponseNotNullTheResponseBodyGetWisatabyID() {
        getData.verifyNotNullWisataByID();
    }

    //    TC_MA_31
    @Given("Admin input invalid endpoint to get wisata data by ID")
    public void adminInputInValidEndpointToGetWisatabyID() {
        getData.userInputInValidEndpointToGetWisatabyID();
    }

    @When("Admin request to get wisata data by invalid ID with the HTTP GET method")
    public void adminRequestWithTheHTTPGetInvalidWisatabyID() {
        getData.userRequestWithHTTPMethodGETAndInputInValidEndpointToGetWisatabyID();
    }
    @Then("Admin receive a response with status code 404 for failed get wisata data by invalid ID")
    public void adminValidateResponseStatusInTheResponseBodyGetInvalidWisatabyID() {
        getData.receiveStatusForGetWisatabyInvalidID();
    }

    @And("Receive {string} in the response body for TC_AA_31")
    public void adminValidateResponseNotNullTheResponseBodyGetInvalidWisatabyID(String message) {
        getData.verifyErrorMessageWisataNotFound("Wisata tidak ditemukan");
    }

    //    TC_MA_32
    @Given("Admin input valid endpoint to get carbon footprint by wisata data by ID")
    public void adminInputValidEndpointToGetCarbonByWisata() {
        getData.userInputValidEndpointToGetCarbonByWisata();
    }
    @When("Admin request to get carbon footprint data by valid wisata ID with the HTTP GET method")
    public void adminRequestWithTheHTTPGetCarbonByWisata() {
        getData.userRequestWithHTTPMethodGETAndInputValidEndpointToGetCarbonByWisata();
    }
    @Then("Admin receive a response with status code 200 for success get total carbon footprint by wisata id")
    public void adminValidateResponseStatusInTheResponseBodyGetCarbonByWisata() {
        getData.receiveStatusForGetCarbonByWisata();
    }


    //    TC_MA_33
    @Given("Admin input invalid endpoint to get carbon footprint by wisata data by ID")
    public void adminInputInValidEndpointToGetCarbonWisatabyInvalidID() {
        getData.userInputInValidEndpointToGetCarbonWisatabyInvalidID();
    }

    @When("Admin request to get carbon footprint data by invalid wisata ID with the HTTP GET method")
    public void adminRequestWithTheHTTPGetCarbonWisatabyInvalidID() {
        getData.userRequestWithHTTPMethodGETAndInputInValidEndpointToGetCarbonWisatabyInvalidID();
    }
    @Then("Admin receive a response with status code 404 for failed get total carbon footprint by wisata invalid id")
    public void adminValidateResponseStatusInTheResponseBodyGetCarbonWisatabyInvalidID() {
        getData.receiveStatusForGetCarbonWisatabyInvalidID();
    }

    @And("Receive {string} in the response body for TC_AA_33")
    public void adminValidateResponseNotNullTheResponseBodyGetCarbonWisatabyInvalidID(String message) {
        getData.verifyErrorMessageCarbonWisatabyInvalidID("Wisata not found");
    }

    //    TC_MA_34
    @Given("Admin input invalid endpoint to get booking data by valid invoice")
    public void adminInputValidEndpointToGetBooking() {
        getData.userInputValidEndpointToGetBooking();
    }
    @When("Admin request to get booking data data by valid invoice with the HTTP GET method")
    public void adminRequestWithTheHTTPGetBooking() {
        getData.userRequestWithHTTPMethodGETAndInputValidEndpointToGetBooking();
    }
    @Then("Admin receive a response with status code 200 for sucess get booking data by valid invoice")
    public void adminValidateResponseStatusInTheResponseBodyGetBooking() {
        getData.receiveStatusForGetBooking();
    }

    //    TC_MA_35
    @Given("Admin input invalid endpoint to get booking data by invalid invoice")
    public void adminInputInValidEndpointToGetBooking() {
        getData.userInputInValidEndpointToGetInvalidBooking();
    }

    @When("Admin request to get booking data data by invalid invoice with the HTTP GET method")
    public void adminRequestWithTheHTTPGetBookingInvalid() {
        getData.userRequestWithHTTPMethodGETAndInputInValidEndpointToGetInvalidBooking();
    }
    @Then("Admin receive a response with status code 404 for sucess get booking data by invalid invoice")
    public void adminValidateResponseStatusInTheResponseBodyGetBookingInvalid() {
        getData.receiveStatusForGetInvalidBooking();
    }

    @And("Receive {string} in the response body for TC_AA_35")
    public void adminValidateResponseNotNullTheResponseBodyGetBooking(String message) {
        getData.verifyErrorMessageInvalidBooking("Wisata not found");
    }

    //    TC_MA_86
    @Given("Admin input valid endpoint to get all pesan kerjasama")
    public void adminInputValidEndpointToGetCoopMessage() {
        getData.userInputValidEndpointToGetCoopMessage();
    }

    @When("Admin request to get all pesan kerjasama data with the HTTP GET method")
    public void adminRequestWithTheHTTPGetCoopMessage() {
        getData.userRequestWithHTTPMethodGETAndInputValidEndpointToGetCoopMessage();
    }
    @Then("Admin receive a response with status code 200 for success get all pesan kerjasama data")
    public void adminValidateResponseStatusInTheResponseBodyGetGetCoopMessage() {
        getData.receiveStatusForGetCoopMessage();
    }

    @And("Verify pesan kerjasama data is not empty")
    public void adminValidateResponseNotNullTheResponseBodyGetGetCoopMessage() {
        getData.verifyNotNullCoopMessage();
    }

    //    TC_MA_87
    @Given("Admin input valid endpoint to get top 3 wisata")
    public void adminInputValidEndpointToGetTopWisata() {
        getData.userInputValidEndpointToGetTopWisata();
    }
    @When("Admin request to get top 3 wisata with the HTTP GET method")
    public void adminRequestWithTheHTTPGetTopWisata() {
        getData.userRequestWithHTTPMethodGETAndInputValidEndpointToGetTopWisata();
    }
    @Then("Admin receive a response with status code 200 for success get top 3 wisata")
    public void adminValidateResponseStatusInTheResponseBodyGetTopWisata() {
        getData.receiveStatusForGetTopWisata();
    }

    //    TC_MA_88
    @Given("Admin input valid endpoint to get top 4 user by carbon footprint")
    public void adminInputValidEndpointToGetTopUser() {
        getData.userInputValidEndpointToGetTopUser();
    }
    @When("Admin request to get top 4 user with the HTTP GET method")
    public void adminRequestWithTheHTTPGetTopUser() {
        getData.userRequestWithHTTPMethodGETAndInputValidEndpointToGetTopUser();
    }
    @Then("Admin receive a response with status code 200 for success get top 4 user by carbon footprint")
    public void adminValidateResponseStatusInTheResponseBodyGetTopUser() {
        getData.receiveStatusForGetTopUser();
    }
    //    TC_MA_89
    @Given("Admin input valid endpoint to get TNC data by ID")
    public void adminInputValidEndpointToGetTNCByID() {
        getData.userInputValidEndpointToGetTNCByID();
    }
    @When("Admin request to get TNC data by valid ID with the HTTP GET method")
    public void adminRequestWithTheHTTPGetTNCByID() {
        getData.userRequestWithHTTPMethodGETAndInputValidEndpointToGetTNCByID();
    }
    @Then("Admin receive a response with status code 200 for success get TNC by valid ID")
    public void adminValidateResponseStatusInTheResponseBodyGetTNCByID() {
        getData.receiveStatusForGetTNCByID();
    }

    //    TC_MA_90
    @Given("Admin input invalid endpoint to get TNC data by ID")
    public void adminInputValidEndpointToGetTNCByInvalidID() {
        getData.userInputInValidEndpointToGetTNCByInvalidID();
    }

    @When("Admin request to get TNC by invalid ID with the HTTP GET method")
    public void adminRequestWithTheHTTPGetTNCByInvalidID() {
        getData.userRequestWithHTTPMethodGETAndInputInValidEndpointToGetTNCByInvalidID();
    }
    @Then("Admin receive a response with status code 404 for failed get TNC by invalid ID")
    public void adminValidateResponseStatusInTheResponseBodyGetTNCByInvalidID() {
        getData.receiveStatusForGetTNCByInvalidID();
    }

    @And("Receive {string} in the response body for TC_AA_90")
    public void adminValidateResponseNotNullTheResponseBodyGetTNCByInvalidID(String message) {
        getData.verifyErrorMessageTNCByInvalidID("Wisata not found");
    }

    //    TC_MA_91
    @Given("Admin input valid endpoint to get grafik dashboard")
    public void adminInputValidEndpointToGetGrafik() {
        getData.userInputValidEndpointToGetGrafik();
    }

    @When("Admin request to get grafik data with the HTTP GET method")
    public void adminRequestWithTheHTTPGetGrafik() {
        getData.userRequestWithHTTPMethodGETAndInputValidEndpointToGetGrafik();
    }
    @Then("Admin receive a response with status code 200 for success get grafik data")
    public void adminValidateResponseStatusInTheResponseBodyGetGrafik() {
        getData.receiveStatusForGetGrafik();
    }

    @And("Verify grafik data is not empty")
    public void adminValidateResponseNotNullTheResponseBodyGetGrafik() {
        getData.verifyNotNullGrafik();
    }

    //    TC_MA_92
    @Given("Admin input valid endpoint to get grafik dashboard in six month with only start date")
    public void adminInputValidEndpointToGetGrafikWithStartDate() {
        getData.userInputValidEndpointToGetGrafikWithOnlyStartDate();
    }

    @When("Admin request to get grafik data in six month with only start date with the HTTP GET method")
    public void adminRequestWithTheHTTPGetGrafikWithStartDate() {
        getData.userRequestWithHTTPMethodGETAndInputValidEndpointToGetGrafikWithOnlyStartDate();
    }
    @Then("Admin receive a response with status code 200 for success get grafik data in six month with only start date")
    public void adminValidateResponseStatusInTheResponseBodyGetGrafikWithStartDate() {
        getData.receiveStatusForGetGrafikWithOnlyStartDate();
    }


    //    TC_MA_93
    @Given("Admin input valid endpoint to get grafik dashboard in six month with only end date")
    public void adminInputValidEndpointToGetGrafikWithEndDate() {
        getData.userInputValidEndpointToGetGrafikWithOnlyEndDate();
    }

    @When("Admin request to get grafik data in six month with only end date with the HTTP GET method")
    public void adminRequestWithTheHTTPGetGrafikWithEndDate() {
        getData.userRequestWithHTTPMethodGETAndInputValidEndpointToGetGrafikWithOnlyEndDate();
    }
    @Then("Admin receive a response with status code 200 for success get grafik data in six month with only end date")
    public void adminValidateResponseStatusInTheResponseBodyGetGrafikWithEndDate() {
        getData.receiveStatusForGetGrafikWithOnlyEndDate();
    }


    //    TC_MA_94
    @Given("Admin input valid endpoint to get grafik dashboard in six month with valid start date and end date")
    public void adminInputValidEndpointToGetGrafikWithValidDate() {
        getData.userInputValidEndpointToGetGrafikWithValidDate();
    }

    @When("Admin request to get grafik data in six month with valid start date and end date with the HTTP GET method")
    public void adminRequestWithTheHTTPGetGrafikWithValidDate() {
        getData.userRequestWithHTTPMethodGETAndInputValidEndpointToGetGrafikWithValidDate();
    }
    @Then("Admin receive a response with status code 200 for success get grafik data in six month with valid start date and end date")
    public void adminValidateResponseStatusInTheResponseBodyGetGrafikWithValidDate() {
        getData.receiveStatusForGetGrafikWithValidDate();
    }

    @And("Verify grafik data in six month with valid start date and end date is not empty")
    public void adminValidateResponseNotNullTheResponseBodyGetGrafikWithValidDate() {
        getData.verifyNotNullGrafikWithValidDate();
    }

    //    TC_MA_95
    @Given("Admin input valid endpoint to get grafik dashboard in six month with start date bigger than the end date")
    public void adminInputValidEndpointToGetGrafikWithStartDateBiggerThanEndDate() {
        getData.userInputValidEndpointToGetGrafikWithStartDateBiggerThanEndDate();
    }
    @When("Admin request to get grafik data in six month with start date bigger than the end date with the HTTP GET method")
    public void adminRequestWithTheHTTPGetGrafikWithStartDateBiggerThanEndDate() {
        getData.userRequestWithHTTPMethodGETAndInputValidEndpointToGetGrafikWithStartDateBiggerThanEndDate();
    }
    @Then("Admin receive a response with status code 200 for success get grafik data in six month with start date bigger than the end date")
    public void adminValidateResponseStatusInTheResponseBodyGetGrafikWithStartDateBiggerThanEndDate() {
        getData.receiveStatusForGetGrafikWithStartDateBiggerThanEndDate();
    }
    @And("Verify grafik data in six month with start date bigger than the end date is not empty")
    public void adminValidateResponseNotNullTheResponseBodyGetGrafikWithStartDateBiggerThanEndDate() {
        getData.verifyNotNullGrafikWithStartDateBiggerThanEndDate();
    }

    //    TC_MA_96
    @Given("Admin input valid endpoint to get grafik dashboard in six month with invalid start date format")
    public void adminInputValidEndpointToGetGrafikWithInvalidStartDate() {
        getData.userInputValidEndpointToGetGrafikWithInvalidStartDate();
    }
    @When("Admin request to get grafik data in six month with invalid start date format with the HTTP GET method")
    public void adminRequestWithTheHTTPGetGrafikWithInvalidStartDate() {
        getData.userRequestWithHTTPMethodGETAndInputValidEndpointToGetGrafikWithInvalidStartDate();
    }
    @Then("Admin receive a response with status code 400 for failed get grafik data in six month with invalid start date format")
    public void adminValidateResponseStatusInTheResponseBodyGetGrafikWithInvalidStartDate() {
        getData.receiveStatusForGetGrafikWithInvalidStartDate();
    }
    @And("Receive {string} in the response body for TC_AA_96")
    public void adminValidateResponseNotNullTheResponseBodyGetGrafikWithInvalidStartDate(String message) {
        getData.verifyErrorMessageInvalidStartDate("Kesalahan format pada start date. Gunakan YYYY-MM-DD");
    }


    //    TC_MA_97
    @Given("Admin input valid endpoint to get grafik dashboard in six month with invalid end date format")
    public void adminInputValidEndpointToGetGrafikWithInvalidEndDate() {
        getData.userInputValidEndpointToGetGrafikWithInvalidEndDate();
    }
    @When("Admin request to get grafik data in six month with invalid end date format with the HTTP GET method")
    public void adminRequestWithTheHTTPGetGrafikWithInvalidEndDate() {
        getData.userRequestWithHTTPMethodGETAndInputValidEndpointToGetGrafikWithInvalidEndDate();
    }
    @Then("Admin receive a response with status code 400 for failed get grafik data in six month with invalid end date format")
    public void adminValidateResponseStatusInTheResponseBodyGetGrafikWithInvalidEndDate() {
        getData.receiveStatusForGetGrafikWithInvalidEndDate();
    }
    @And("Receive {string} in the response body for TC_AA_97")
    public void adminValidateResponseNotNullTheResponseBodyGetGrafikWithInvalidEndDate(String message) {
        getData.verifyErrorMessageInvalidEndDate("Kesalahan format end date. Gunakan YYYY-MM-DD");
    }

    //    TC_MA_98
    @Given("Admin input valid endpoint to get grafik dashboard in six month with invalid start date and end date format")
    public void adminInputValidEndpointToGetGrafikWithInvalidDate() {
        getData.userInputValidEndpointToGetGrafikWithInvalidDate();
    }
    @When("Admin request to get grafik data in six month with invalid start date and end date format with the HTTP GET method")
    public void adminRequestWithTheHTTPGetGrafikWithInvalidDate() {
        getData.userRequestWithHTTPMethodGETAndInputValidEndpointToGetGrafikWithInvalidDate();
    }
    @Then("Admin receive a response with status code 400 for failed get grafik data in six month with invalid start date and end date format")
    public void adminValidateResponseStatusInTheResponseBodyGetGrafikWithInvalidDate() {
        getData.receiveStatusForGetGrafikWithInvalidDate();
    }
    @And("Receive {string} in the response body for TC_AA_98")
    public void adminValidateResponseNotNullTheResponseBodyGetGrafikWithInvalidDate(String message) {
        getData.verifyErrorMessageInvalidDate("Kesalahan format pada start date. Gunakan YYYY-MM-DD");
    }

    //    TC_MA_99
    @Given("Admin input valid endpoint to get grafik dashboard in six month with valid start date and end date but less than 6 month range")
    public void adminInputValidEndpointToGetGrafikWithDateLessThan6Month() {
        getData.userInputValidEndpointToGetGrafikWithDateLessThan6Month();
    }
    @When("Admin request to get grafik data in six month with valid start date and end date but less than 6 month range with the HTTP GET method")
    public void adminRequestWithTheHTTPGetGrafikWithDateLessThan6Month() {
        getData.userRequestWithHTTPMethodGETAndInputValidEndpointToGetGrafikWithDateLessThan6Month();
    }
    @Then("Admin receive a response with status code 200 for success get grafik data in six month with valid start date and end date but less than 6 month range")
    public void adminValidateResponseStatusInTheResponseBodyGetGrafikWithDateLessThan6Month() {
        getData.receiveStatusForGetGrafikWithDateLessThan6Month();
    }
    @And("Verify grafik data in six month with valid start date and end date but less than 6 month range is not empty")
    public void adminValidateResponseNotNullTheResponseBodyGetGrafikWithDateLessThan6Month() {
        getData.verifyNotNullGrafikWithDateLessThan6Month();
    }

    //    TC_MA_100
    @Given("Admin input valid endpoint to get grafik dashboard in six month with with empty start date and end date")
    public void adminInputValidEndpointToGetGrafikWithEmptyDate() {
        getData.userInputValidEndpointToGetGrafikWithEmptyDate();
    }
    @When("Admin request to get grafik data in six month with with empty start date and end date with the HTTP GET method")
    public void adminRequestWithTheHTTPGetGrafikWithEmptyDate() {
        getData.userRequestWithHTTPMethodGETAndInputValidEndpointToGetGrafikWithEmptyDate();
    }
    @Then("Admin receive a response with status code 200 for success get grafik data in six month with empty start date and end date")
    public void adminValidateResponseStatusInTheResponseBodyGetGrafikWithEmptyDate() {
        getData.receiveStatusForGetGrafikWithEmptyDate();
    }
    @And("Verify grafik data in six month with empty start date and end date is not empty")
    public void adminValidateResponseNotNullTheResponseBodyGetGrafikWithEmptyDate() {
        getData.verifyNotNullGrafikWithEmptyDate();
    }





}
