package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Admin_Login;
import starter.pages.Admin_ManageTermsAndCondition;

public class Admin_ManageTermsAndCondition_Steps {

    @Steps
    Admin_Login adminLogin;

    @Steps
    Admin_ManageTermsAndCondition manageTNC;



    //TC_AW_131 [Positive 1] - Verify success to Update Terms and Condition with title "TNC Dummy 1" using valid data (title or description)

    @Given("I am login and already on the dashboard of Destimate")
    public void iAmLoginAndAlreadyOnTheDashboardOfDestimate() {
        adminLogin.openDestimateWebsite();
        adminLogin.inputValidUsername("admin");
        adminLogin.inputValidKataSandi("admin123");
        adminLogin.clickEyesIcon();
        adminLogin.clickMasukButton();
    }

    @When("I click menu Syarat & Ketentuan")
    public void iClickMenuSyaratKetentuan() {
        manageTNC.clickMenuTNC();
    }

    @And("I click the update button or icon on the tnc dummy")
    public void iClickTheUpdateButtonOrIconOnTheTNCDummy() {
        manageTNC.clickEditIconTNCDummy();
    }

    @And("I edit data tnc with valid data")
    public void iEditDataTncWithValidData() {
        manageTNC.inputTitleTNC("TNC Dummy 1");
        manageTNC.inputDescription("Perjanjian Pemilik Wisata merupakan dokumen yang menguraikan persyaratan dan ketentuan yang harus dipatuhi oleh pemilik atau pengelola wisata yang bermitra dengan platform DestiMate.");
        manageTNC.waitABit();
    }

    @And("I want to click the Simpan button")
    public void iChooseSimpanButton() {
        manageTNC.clickTheSimpanButton();
    }

    @Then("Validate success to update tnc and display message {string}")
    public void validateSuccessToUpdateTncAndDisplayMessage(String successMessageEditTNC) {
        manageTNC.waitABit();
        manageTNC.validateSuccessEditTNC(successMessageEditTNC);
        manageTNC.waitABit();
    }









    //TC_AW_132 [Negative 1] - Verify failed to Update Terms and Condition in the title "Perjanjian Pemilik Wisata" because input existing title

    @And("I click the update button or icon on the tnc Perjanjian Pemilik Wisata")
    public void iClickTheUpdateButtonOrIconOnTheTNCPerjanjianPemilikWisata() {
        manageTNC.clickEditIconTNCPerjanjianPemilikWisata();
    }

    @And("I input the title of the tnc that already exists")
    public void iInputTheTitleOfTheTncThatAlreadyExists() {
        manageTNC.inputTitleTNC("Perjanjian Pengguna");
    }

    @Then("Validate failed to update tnc because the title is already exists and display message {string}")
    public void validateFailedToUpdateTncBecauseTheTitleIsAlreadyExistsAndDisplayMessage(String failedMessageBecauseTitleAlreadyExists) {
        manageTNC.waitABit();
        manageTNC.validateFailedEditTNCBecauseTitleAlreadyExists(failedMessageBecauseTitleAlreadyExists);
    }















    //TC_AW_133 [Negative 2] - Verify failed to Update Terms and Condition in the title "Pembelian Tiket" because input title with 1 character

    @And("I click the update button or icon on the tnc Pembeli Tiket")
    public void iClickTheUpdateButtonOrIconOnTheTNCPembeliTiket() {
        manageTNC.clickEditIconTNCPembeliTiket();
    }

    @And("I input invalid data with title 1 character")
    public void iInputInvalidDataWithTitleCharacter() {
        manageTNC.inputTitleTNC("P");
    }

    @Then("Validate failed to update tnc because invalid title and display message {string}")
    public void validateFailedToUpdateTncBecauseInvalidTitleAndDisplayMessage(String failedMessageBecauseInvalidTitle) {
        manageTNC.waitABit();
        manageTNC.validateFailedEditTNCBecauseInvalidTitle(failedMessageBecauseInvalidTitle);
        manageTNC.waitABit();
    }
















    //TC_AW_134 [Negative 3] - Verify failed to Update Terms and Condition in the title "Pembelian Tiket" because input description with 1 character

    @And("I input invalid data with description 1 character")
    public void iInputInvalidDataWithDescriptionCharacter() {
        manageTNC.inputDescription("a");
        manageTNC.waitABit();
    }

    @Then("Validate failed to update tnc because invalid description and display message {string}")
    public void validateFailedToUpdateTncBecauseInvalidDescriptionAndDisplayMessage(String failedMessageBecauseInvalidDescription) {
        manageTNC.waitABit();
        manageTNC.validateFailedEditTNCBecauseInvalidDescription(failedMessageBecauseInvalidDescription);
    }














    //TC_AW_135 [Negative 4] - Verify failed to Update Terms and Condition in the title "Pembelian Tiket" because edit by not entering the title

    @And("I did not input the title")
    public void iDidNotInputTheTitle() {
        manageTNC.inputTitleTNC("");
    }

    @Then("Validate failed to update tnc because empty title and display message {string}")
    public void validateFailedToUpdateTncBecauseEmptyTitleAndDisplayMessage(String failedMessageBecauseEmptyTitle) {
        manageTNC.waitABit();
        manageTNC.validateFailedEditTNCBecauseEmptyTitle(failedMessageBecauseEmptyTitle);
    }













    //TC_AW_136 [Negative 5] - Verify failed to Update Terms and Condition in the title "Pembelian Tiket" because edit by not entering the description

    @And("I did not input the description")
    public void iDidNotInputTheDescription() {
        manageTNC.inputDescription("");
        manageTNC.waitABit();
    }

    @Then("Validate failed to update tnc because empty description and display message {string}")
    public void validateFailedToUpdateTncBecauseEmptyDescriptionAndDisplayMessage(String failedMessageBecauseEmptyDescription) {
        manageTNC.waitABit();
        manageTNC.validateFailedEditTNCBecauseEmptyDescription(failedMessageBecauseEmptyDescription);
    }














    //TC_AW_137 [Positive 2] - Verify success cancels update Terms and Condition with title "Pembelian Paket"

    @And("I edit data tnc with valid data in TNC")
    public void iEditDataTncWithValidDataInTNC() {
        manageTNC.inputTitleTNC("Syarat Pemakaian Tiket Wisata");
    }

    @And("I choose a Cancel button")
    public void iChooseACancelButton() {
        manageTNC.clickTheCancelButton();
    }

    @Then("Validate success to cancel update tnc and back to display all Terms and Conditions")
    public void validateSuccessToCancelUpdateTncAndBackToDisplayAllTermsAndConditions() {
        manageTNC.waitABit();
        manageTNC.validateSuccessToCancelUpdateTNC();
    }

















    //TC_AW_138 [Positive 3] - Verify success to displays data with a maximum of 50 data results

    @And("I scroll to down in the menu tnc and then click maksimal Tampilan button")
    public void iScrollToDownInTheMenuTncAndThenClickMaksimalTampilanButton() {
        manageTNC.scrollDownAndClickMaksimalTampilanButton();
    }

    @And("I want choose option Tampilkan 50 Data")
    public void iWantChooseOptionTampilkanData50() {
        manageTNC.chooseOption50Tampilan();
    }

    @Then("Validate success to display the data tnc between {int} to {int} data")
    public void validateSuccessToDisplayTheDataTncBetweenToData50(int minItems, int maxItems) {
        manageTNC.validateDisplayDataMaximum50(minItems, maxItems);
    }







    //TC_AW_139 [Positive 4] - Verify success to displays data with a maximum of 100 data results

    @And("I want choose the option Tampilkan 100 Data")
    public void iWantChooseTheOptionTampilkanData100() {
        manageTNC.chooseOption100Tampilan();
    }

    @Then("Validate success to display data tnc between {int} to {int} data")
    public void validateSuccessToDisplayDataTncBetweenToData100(int minData, int maxData) {
        manageTNC.validateDisplayDataMaximum100(minData, maxData);
    }















    //TC_AW_140 [Positive 5] - Verify success to displays the next page which also contains other Terms and Condition

    @And("I scroll to down and I click the next button")
    public void iScrollToDownAndIClickTheNextButton() {
        manageTNC.scrollDownClickTheNextButton();
    }

    @Then("Validate success to displays the next page which also contains the other tnc")
    public void validateSuccessToDisplaysTheNextPageWhichAlsoContainsTheOtherTnc() {
        manageTNC.validateOnTheNextPage();
    }


















    //TC_AW_141 [Positive 6] - Verify success to displays the previous page which also contains other Terms and Condition
    
    @And("I am click a back button")
    public void iAmClickABackButton() {
        manageTNC.scrollDownClickTheBackButton();
    }

    @Then("Validate success to displays the previous page which also contains the tnc")
    public void validateSuccessToDisplaysThePreviousPageWhichAlsoContainsTheTnc() {
        manageTNC.validateOnThePreviousPage();
    }


}
