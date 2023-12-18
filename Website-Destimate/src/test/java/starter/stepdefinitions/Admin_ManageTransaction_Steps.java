package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Admin_Login;
import starter.pages.Admin_ManageTransaction;

public class Admin_ManageTransaction_Steps {

    @Steps
    Admin_Login adminLogin;

    @Steps
    Admin_ManageTransaction manageTransaction;



    //TC_AW_120 [Positive 1] - Verify success to update transaction (ID Order 1701396764-262) with status "Sudah Bayar"

    @Given("I am login and already on the dashboard Destimate")
    public void iAmLoginAndAlreadyOnTheDashboardDestimate() {
        adminLogin.openDestimateWebsite();
        adminLogin.inputValidUsername("admin");
        adminLogin.inputValidKataSandi("admin123");
        adminLogin.clickEyesIcon();
        adminLogin.clickMasukButton();
    }

    @When("I click menu Transaksi")
    public void iClickMenuTransaksi() {
        manageTransaction.clickMenuTransaction();
        manageTransaction.waitABit();
    }

    @And("I search the id transaction 1701396764-262")
    public void iSearchTheIdTransaction() {
        manageTransaction.inputIDToBeSearch("1701396764-262");
    }

    @And("I click the update button or icon on the selected transaction")
    public void iClickTheUpdateButtonOrIconOnTheSelectedTransaction() {
        manageTransaction.clickEditIcon();
    }

    @And("I edit data transaction with choose status Sudah Bayar")
    public void iEditDataPromoWithChooseStatusSudahBayar() {
        manageTransaction.chooseStatusSudahBayar();
    }

    @And("I go to click the Simpan button")
    public void iGoToClickTheSimpanButton() {
        manageTransaction.clickSimpanButton();
    }

    @Then("Validate success to update transaction and display message {string}")
    public void validateSuccessToUpdateTransactionAndDisplayMessage(String successMessageEditTransaction) {
        manageTransaction.validateSuccessEditTransaction(successMessageEditTransaction);
    }





    //TC_AW_121 [Positive 2] - Verify success to update transaction (ID Order 1701396764-262) with status not yet paid

    @And("I edit data transaction with choose status Belum Bayar")
    public void iEditDataPromoWithChooseStatusBelumBayar() {
        manageTransaction.chooseStatusBelumBayar();
    }

















    //TC_AW_122 [Positive 3] - Verify success to search transaction for Existing data

    @And("I search the id transaction 1700673264-203")
    public void iSearchTheIdTransactionForExistingData() {
        manageTransaction.inputIDToBeSearch("1700673264-203");
    }

    @Then("Validate success to display the search result for the transaction")
    public void validateSuccessToDisplayTheSearchResultForTheTransaction() {
        manageTransaction.validateSuccessSearchPromoForExistingData();
        manageTransaction.waitABit();
    }





    //TC_AW_123 [Negative 1] - Verify failed to search transaction because input Non-Existent Data

    @And("I input non existent transaction like id 1699737028-105 in the search field")
    public void iInputNonExistentTransactionInTheSearchField() {
        manageTransaction.inputIDToBeSearch("1699737028-105");
        manageTransaction.waitABit();
    }

    @Then("Validate failed to search transaction and display message {string}")
    public void validateFailedToSearchTransactionAndDisplayMessage(String notFoundTransaksi) {
        manageTransaction.validateFailedToGetResultOfSearchingTransaction(notFoundTransaksi);
    }






















    //TC_AW_124 [Positive 4] - Verify success to see details of transaction with status "Selesai"

    @And("I search the id transaction 1700579240-327")
    public void iSearchTheIdTransactionWithStatusSelesai() {
        manageTransaction.inputIDToBeSearch("1700579240-327");
    }

    @And("I click eyes button or icon on the selected transaction to see the details")
    public void iClickEyesButtonOrIconOnTheSelectedTransactionToSeeTheDetails() {
        manageTransaction.clickEyesButtonOrIcon();
    }

    @Then("Validate success to display detail of the transaction with status {string}")
    public void validateSuccessToDisplayDetailOfTheTransactionWithStatusSelesai(String statusSukses) {
        manageTransaction.validateSuccessToDisplayDetailTransaksiStatusSukses(statusSukses);
    }






    //TC_AW_125 [Positive 5] - Verify success to see details of transaction in status "Tertunda"

    @And("I search the id transaction 1700579294-882")
    public void iSearchTheIdTransactionWithStatusTertunda() {
        manageTransaction.inputIDToBeSearch("1700579294-882");
    }

    @Then("Validate success to display detail the transaction with status {string}")
    public void validateSuccessToDisplayDetailTheTransactionWithStatusTertunda(String statusPending) {
        manageTransaction.validateSuccessToDisplayDetailTransaksiStatusPending(statusPending);
    }









    //TC_AW_126 [Positive 6] - Verify success to see details of transaction wtih status "Batal"

    @And("I search the id transaction 1700582320-491")
    public void iSearchTheIdTransactionWithStatusBatal() {
        manageTransaction.inputIDToBeSearch("1700582320-491");
    }

    @Then("Validate success to display detail a transaction with status {string}")
    public void validateSuccessToDisplayDetailATransactionWithStatusBatal(String statusBatal) {
        manageTransaction.validateSuccessToDisplayDetailTransaksiStatusBatal(statusBatal);
    }























    //TC_AW_127 [Positive 7] - Verify success to displays data with a maximum of 50 data results

    @And("I scroll to down in the menu transaction and then click maksimal Tampilan button")
    public void iScrollToDownInTheMenuPromoAndThenClickMaksimalTampilanButton() {
        manageTransaction.scrollDownAndClickMaksimalTampilanButton();
    }

    @And("I am choose the option Tampilkan 50 Data")
    public void iAmChooseTheOptionTampilkanData50() {
        manageTransaction.chooseOption50Tampilan();
    }

    @Then("Validate success to display the data transaction between {int} to {int} data")
    public void validateSuccessToDisplayTheDataTransactionBetween0To50Data(int minItems, int maxItems) {
        manageTransaction.validateDisplayDataMaximum50(minItems, maxItems);
    }








    //TC_AW_128 [Positive 8] - Verify success to displays data with a maximum of 100 data results

    @And("I am choose the option Tampilkan 100 Data")
    public void iAmChooseTheOptionTampilkanData100() {
        manageTransaction.chooseOption100Tampilan();
    }

    @Then("Validate success to display data transaction between {int} to {int} data")
    public void validateSuccessToDisplayDataTransactionBetween0To100Data(int minData, int maxData) {
        manageTransaction.validateDisplayDataMaximum100(minData, maxData);
    }






















    //TC_AW_129 [Positive 9] - Verify success to displays the next page which also contains other transaction

    @And("I scrolls to down and I click the next button")
    public void iScrollsToDownAndIClickTheNextButton() {
        manageTransaction.scrollDownClickTheNextButton();
    }

    @Then("Validate success to displays the next page which also contains the other transaction")
    public void validateSuccessToDisplaysTheNextPageWhichAlsoContainsTheOtherTransaction() {
        manageTransaction.validateOnTheNextPage();
    }












    //TC_AW_130 [Positive 10] - Verify success to displays the previous page which also contains other transaction

    @And("I click back button")
    public void iClickBackButton() {
        manageTransaction.scrollDownClickTheBackButton();
    }

    @Then("Validate success to displays the previous page which also contains the transaction")
    public void validateSuccessToDisplaysThePreviousPageWhichAlsoContainsTheTransaction() {
        manageTransaction.validateOnThePreviousPage();
    }
}
