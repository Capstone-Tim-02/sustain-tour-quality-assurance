package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Admin_Login;
import starter.pages.Admin_ManageAdminAccount;

public class Admin_ManageAdminAccount_Steps {

    @Steps
    Admin_Login adminLogin;

    @Steps
    Admin_ManageAdminAccount manageAdminAccount;



    //TC_AW_144 [Positive 1] - Verify success to update account admin of "Admin Destimate 3" with valid username

    @Given("I am login and will be on the dashboard of the Destimate")
    public void iAmLoginAndWillBeOnTheDashboardOfTheDestimate() {
        adminLogin.openDestimateWebsite();
        adminLogin.inputValidUsername("admin");
        adminLogin.inputValidKataSandi("admin123");
        adminLogin.clickEyesIcon();
        adminLogin.clickMasukButton();
    }

    @When("I click menu Admin")
    public void iClickMenuAdmin() {
        manageAdminAccount.clickMenuAdmin();
    }

    @And("I search the name of the admin whose data I want to edit")
    public void iSearchTheNameOfTheAdminWhoseDataIWantToEdit() {
        manageAdminAccount.inputNameToBeSearch("Admin Destimate 3");
    }

    @And("I go to click the update button or icon on the selected account")
    public void iGoToClickTheUpdateButtonOrIconOnTheSelectedAccount() {
        manageAdminAccount.clickEditIcon();
    }

    @And("I edit data admin with valid username")
    public void iEditDataAdminWithValidUsername() {
        manageAdminAccount.inputValidUsernameToEditDataAccount("admin36");
    }

    @And("I will click Simpan button")
    public void iWillClickSimpanButton() {
        manageAdminAccount.clickSimpanButton();
    }

    @Then("Validate success to update admin account with valid username and display message {string}")
    public void validateSuccessToUpdateAdminAccountWithValidUsernameAndDisplayMessage(String successMessageEditUsername) {
        manageAdminAccount.validateSuccessEditAccountAdminWithValidUsername(successMessageEditUsername);
    }











    //TC_AW_145 [Negative 1] - Verify failed to update account "Admin Destimate 3" because input an existing username

    @And("I input existing username")
    public void iInputExistingUsername() {
        manageAdminAccount.inputUsernameAlreadyExists("admin");
    }

    @Then("Validate failed to update admin account because username already registered and display error message {string}")
    public void validateFailedToUpdateAdminAccountBecauseUsernameAlreadyRegisteredAndDisplayErrorMessage(String failedMessageInUsername) {
        manageAdminAccount.validateFailedEditAccountBecauseUsernameAlreadyExists(failedMessageInUsername);
        manageAdminAccount.waitABit();
    }





    //TC_AW_146 [Negative 2] - Verify failed to update account "Admin Destimate 3" because did not input username

    @And("I edit data admin without username")
    public void iEditDataAdminWithoutUsername() {
        manageAdminAccount.didNotInputUsernameToEditDataAccount("");
    }

    @Then("Validate failed to update admin account because did not input username and display error message {string}")
    public void validateFailedToUpdateAdminAccountBecauseDidNotInputUsernameAndDisplayErrorMessage(String failedMessageBecauseEmptyUsername) {
        manageAdminAccount.validateFailedEditAccountBecauseEmptyUsername(failedMessageBecauseEmptyUsername);
    }








    //TC_AW_147 [Positive 2] - Verify success to update account "Admin Destimate 3" with valid name

    @And("I edit data admin with valid name")
    public void iEditDataAdminWithValidName() {
        manageAdminAccount.inputValidNameToEditDataAccount("Admin Destimate 36");
    }

    @Then("Validate success to update admin account with valid name and display message {string}")
    public void validateSuccessToUpdateAdminAccountWithValidNameAndDisplayMessage(String successMessageEditName) {
        manageAdminAccount.validateSuccessEditAccountAdminWithValidName(successMessageEditName);
    }









    //TC_AW_148 [Negative 3] - Verify failed to update account "Admin Destimate 36" because input invalid name

    @And("I edit data admin with invalid name")
    public void iEditDataAdminWithInvalidName() {
        manageAdminAccount.inputInvalidNameToEditDataAccount("36");
    }

    @Then("Validate failed to update admin account because invalid name and display error message {string}")
    public void validateFailedToUpdateAdminAccountBecauseInvalidNameAndDisplayErrorMessage(String failedMessageInName) {
        manageAdminAccount.validateFailedEditAccountBecauseInvalidName(failedMessageInName);
    }













    //TC_AW_149 [Negative 4] - Verify failed to update account "Admin Destimate 36" because did not input name

    @And("I edit data admin without input name")
    public void iEditDataAdminWithoutInputName() {
        manageAdminAccount.didNotInputNameToEditDataAccount("");
    }

    @Then("Validate failed to update admin account because did not input name and display error message {string}")
    public void validateFailedToUpdateAdminAccountBecauseDidNotInputNameAndDisplayErrorMessage(String failedMessageBecauseEmptyName) {
        manageAdminAccount.validateFailedEditAccountBecauseEmptyName(failedMessageBecauseEmptyName);
    }











    //TC_AW_150 [Positive 3] - Verify success to update account "Admin Destimate 36" with valid email

    @And("I edit data admin with valid email")
    public void iEditDataAdminWithValidEmail() {
        manageAdminAccount.inputValidEmailToEditDataAccount("hidestimate36@gmail.com");
    }

    @Then("Validate success to update admin account with valid email and display message {string}")
    public void validateSuccessToUpdateAdminAccountWithValidEmailAndDisplayMessage(String successMessageEditEmail) {
        manageAdminAccount.validateSuccessEditAccountAdminWithValidEmail(successMessageEditEmail);
    }







    //TC_AW_151 [Negative 5] - Verify failed to update account "Admin Destimate 36" because input an existing email

    @And("I input existing email")
    public void iInputExistingEmail() {
        manageAdminAccount.inputInvalidEmailToEditDataAccount("hidestimate@gmail.com");
    }

    @Then("Validate failed to update admin account because email already registered and display error message {string}")
    public void validateFailedToUpdateAdminAccountBecauseEmailAlreadyRegisteredAndDisplayErrorMessage(String failedMessageInEmail) {
        manageAdminAccount.validateFailedEditAccountBecauseInvalidEmail(failedMessageInEmail);
    }











    //TC_AW_152 [Negative 6] - Verify failed to update account "Admin Destimate 36" because did not input email

    @And("I edit data admin without email")
    public void iEditDataAdminWithoutEmail() {
        manageAdminAccount.didNotInputEmailToEditDataAccount("");
    }

    @Then("Validate failed to update admin account because did not input email and display error message {string}")
    public void validateFailedToUpdateAdminAccountBecauseDidNotInputEmailAndDisplayErrorMessage(String failedMessageBecauseEmptyEmail) {
        manageAdminAccount.validateFailedEditAccountBecauseEmptyEmail(failedMessageBecauseEmptyEmail);
    }









    //TC_AW_153 [Positive 4] - Verify success to update account "Admin Destimate 36" with valid "no. telepon"

    @And("I edit data admin with valid no telepon")
    public void iEditDataAdminWithValidNoTelepon() {
        manageAdminAccount.inputValidPhoneNumberToEditDataAccount("813456789236");
    }

    @Then("Validate success to update admin account with valid no telepon and display message {string}")
    public void validateSuccessToUpdateAdminAccountWithValidNoTeleponAndDisplayMessage(String successMessageEditPhoneNumber) {
        manageAdminAccount.validateSuccessEditAccountAdminWithValidPhoneNumber(successMessageEditPhoneNumber);
    }








    //TC_AW_154 [Negative 7] - Verify failed to update account "Admin Destimate 36" because input invalid "no. telepon" with abjad

    @And("I edit data admin with invalid no telepon with abjad")
    public void iEditDataAdminWithInvalidNoTeleponWithAbjad() {
        manageAdminAccount.inputInvalidPhoneNumberWithAbjadToEditDataAccount("abc123");
    }

    @Then("Validate failed to update admin account because invalid no telepon with abjad and display error message {string}")
    public void validateFailedToUpdateAdminAccountBecauseInvalidNoTeleponWithAbjadAndDisplayErrorMessage(String failedMessageInPhoneNumberWithAbjad) {
        manageAdminAccount.validateFailedEditAccountBecauseInvalidPhoneNumberWithAbjad(failedMessageInPhoneNumberWithAbjad);
    }






    //TC_AW_155 [Negative 8] - Verify failed to update account "Admin Destimate 36" because input invalid "no. telepon" which does not consist of 10 digits

    @And("I edit data admin with invalid no telepon which does not consist of 10 digits")
    public void iEditDataAdminWithInvalidNoTeleponWhichDoesNotConsistOfDigits10() {
        manageAdminAccount.inputInvalidPhoneNumberLessThan10Digit("12");
    }

    @Then("Validate failed to update admin account because invalid no telepon less than 10 digits and display error message {string}")
    public void validateFailedToUpdateAdminAccountBecauseInvalidNoTeleponLessThanDigitsAndDisplayErrorMessage(String failedMessageInPhoneNumberLessThan10Digit) {
        manageAdminAccount.validateFailedEditAccountBecauseInvalidPhoneNumberLessThan10Digit(failedMessageInPhoneNumberLessThan10Digit);
    }









    //TC_AW_156 [Negative 9] - Verify failed to update account "Admin Destimate 36" because did not input "no. telepon"

    @And("I edit data admin without no telepon")
    public void iEditDataAdminWithoutNoTelepon() {
        manageAdminAccount.didNotInputPhoneNumberToEditDataAccount("");
    }

    @Then("Validate failed to update admin account because did not input no telepon and display error message {string}")
    public void validateFailedToUpdateAdminAccountBecauseDidNotInputNoTeleponAndDisplayErrorMessage(String failedMessageBecauseEmptyPhoneNumber) {
        manageAdminAccount.validateFailedEditAccountBecauseEmptyPhoneNumber(failedMessageBecauseEmptyPhoneNumber);
    }









    //TC_AW_157 [Positive 5] - Verify success cancels editing of account "Admin Destimate 36"

    @And("I go to click cancel button")
    public void iGoToClickCancelButton() {
        manageAdminAccount.clickCancelButton();
    }

    @Then("Validate success to cancel edit admin account")
    public void validateSuccessToCancelEditAdminAccount() {
        manageAdminAccount.validateSuccessCancelEditAccountAdmin();
    }







    //TC_AW_158 [Positive 6] - Verify success to delete account "Admin Destimate 36"

    @And("I search the name of the admin whose data I want to delete")
    public void iSearchTheNameOfTheAdminWhoseDataIWantToDelete() {
        manageAdminAccount.inputNameToBeSearch("Admin 37");
    }

    @And("I click the delete button or icon on the selected account admin")
    public void iClickTheDeleteButtonOrIconOnTheSelectedAccountAdmin() {
        manageAdminAccount.clickDeleteIcon();
    }

    @And("I choose the Hapus button")
    public void iChooseTheHapusButton() {
        manageAdminAccount.clickHapusButton();
    }

    @Then("Validate success to delete admin account and display message {string}")
    public void validateSuccessToDeleteAdminAccountAndDisplayMessage(String successMessageDeleteAccount) {
        manageAdminAccount.validateSuccessDeleteAccountAdmin(successMessageDeleteAccount);
    }






    //TC_AW_159 [Positive 7] - Verify success cancel to delete account "Admin Destimate 2"

    @And("I search name of the admin whose data I want to delete")
    public void iSearchNameOfTheAdminWhoseDataIWantToDelete() {
        manageAdminAccount.inputNameToBeSearch("Admin Destimate 2");
    }

    @And("I click the delete button or icon on the selected account admin destimate 2")
    public void iClickTheDeleteButtonOrIconOnTheSelectedAccountAdminDestimate2() {
        manageAdminAccount.clickDeleteIconforAdminDestimate2();
    }

    @And("I choose the Batal button")
    public void iChooseTheBatalButton() {
        manageAdminAccount.clickCancelButton();
    }

    @Then("Validate success to cancel delete admin account")
    public void validateSuccessToCancelDeleteAdminAccount() {
        manageAdminAccount.validateSuccessCancelDeleteAccountAdmin();
    }






    //TC_AW_160 [Positive 8] - Verify success to search account for Existing Admin

    @And("I search Admin Destimate 2")
    public void iSearchAdminDestimate2() {
        manageAdminAccount.inputNameToBeSearch("Admin Destimate 2");
        manageAdminAccount.waitABit();
    }

    @Then("Validate success to display the search result for the account Admin Destimate 2")
    public void validateSuccessToDisplayTheSearchResultForTheAccountAdminDestimate2() {
        manageAdminAccount.validateSuccessToSearchAdminAccountForExistingAdmin();
    }










    //TC_AW_161 [Negative 10] - Verify failed to search account because input Non-Existent Admin

    @And("I search account non existent like Admin CMS")
    public void iSearchAccountNonExistentLikeAdminCMS() {
        manageAdminAccount.inputNameToBeSearch("Admin CMS");
        manageAdminAccount.waitABit();
    }

    @Then("Validate failed to search admin account and display message {string}")
    public void validateFailedToSearchAdminAccountAndDisplayMessage(String notFoundAdmin) {
        manageAdminAccount.validateFailedToGetResultOfSearchingAdminAccount(notFoundAdmin);
    }









    //TC_AW_162 [Positive 9] - Verify success to displays data with a maximum of 50 data results

    @And("I scroll down and click maksimal Tampilan button")
    public void iScrollDownAndClickMaksimalTampilanButton() {
        manageAdminAccount.scrollDownAndClickMaksimalTampilanButton();
    }

    @And("I choose the option Tampilkan 50 Data Admin")
    public void iChooseTheOptionTampilkanDataAdmin50() {
        manageAdminAccount.chooseOption50Tampilan();
    }

    @Then("Validate success to display data account admin between {int} to {int} data")
    public void validateSuccessToDisplayDataAccountAdminBetweenToData(int minItems, int maxItems) {
        manageAdminAccount.validateDisplayDataMaximum50(minItems, maxItems);
    }






    //TC_AW_163 [Positive 10] - Verify success to displays data with a maximum of 100 data results

    @And("I choose a option Tampilkan 100 Data Admin")
    public void iChooseAOptionTampilkanDataAdmin100() {
        manageAdminAccount.chooseOption100Tampilan();
    }

    @Then("Validate success display data account admin between {int} to {int} data")
    public void validateSuccessDisplayDataAccountAdminBetweenToData(int minData, int maxData) {
        manageAdminAccount.validateDisplayDataMaximum100(minData, maxData);
    }











    //TC_AW_164 [Positive 11] - Verify success to displays the next page which also contains admin account data

    @And("I scroll to down and click the next button")
    public void iScrollToDownAndClickTheNextButton() {
        manageAdminAccount.scrollDownClickTheNextButton();
    }

    @Then("Validate success to displays the next page which also contains the admin account")
    public void validateSuccessToDisplaysTheNextPageWhichAlsoContainsTheAdminAccount() {
        manageAdminAccount.validateOnTheNextPage();
    }









    //TC_AW_165 [Positive 12] - Verify success to displays the previous page which also contains admin account data

    @And("I scrolls to down and click the back button")
    public void iScrollsToDownAndClickTheBackButton() {
        manageAdminAccount.scrollDownClickTheBackButton();
    }

    @Then("Validate success to displays the previous page which also contains the admin account")
    public void validateSuccessToDisplaysThePreviousPageWhichAlsoContainsTheAdminAccount() {
        manageAdminAccount.validateOnThePreviousPage();
    }



}
