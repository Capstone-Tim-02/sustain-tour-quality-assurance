package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Admin_Login;
import starter.pages.Admin_ManageUserData;


public class Admin_ManageUserData_Steps {

    @Steps
    Admin_Login adminLogin;

    @Steps
    Admin_ManageUserData manageUserData;



    //TC_AW_8 [Positive 1] - Verify success to update user account of "Hanna Erita Saragih" with valid username

    @Given("I login and will be on the dashboard of the Destimate")
    public void iLoginAndWillBeOnTheDashboardOfTheDestimate() {
        adminLogin.openDestimateWebsite();
        adminLogin.inputValidUsername("admin");
        adminLogin.inputValidKataSandi("admin123");
        adminLogin.clickEyesIcon();
        adminLogin.clickMasukButton();
    }

    @When("I click menu Pengguna")
    public void iClickMenuPengguna() {
        manageUserData.clickMenuPengguna();
    }

    @And("I search the name of the user whose data I want to edit")
    public void iSearchTheNameOfTheUserWhoseDataIWantToEdit() {
        manageUserData.inputNameToBeSearch("Hanna");
    }

    @And("I click the update button or icon on the selected account")
    public void iClickTheUpdateButtonOrIconOnTheSelectedAccount() {
        manageUserData.clickEditIcon();
    }

    @And("I edit data user with valid  username")
    public void iEditDataUserWithValidUsername() {
        manageUserData.inputValidUsernameToEditDataAccount("hanna27");
    }

    @And("I click Simpan button")
    public void iClickSimpanButton() {
        manageUserData.clickSimpanButton();
    }

    @Then("Validate success to update user account with valid username and display message {string}")
    public void validateSuccessToUpdateUserAccountWithValidUsernameAndDisplayMessage(String successMessageEditUsername) {
        manageUserData.validateSuccessEditAccountUserWithValidUsername(successMessageEditUsername);
    }












    //TC_AW_9 [Negative 1] - Verify failed to update user account because input invalid username

    @And("I edit data user with invalid username")
    public void iEditDataUserWithInvalidUsername() {
        manageUserData.inputInvalidUsernameToEditDataAccount("han");
    }

    @Then("Validate failed to update user account because invalid username and display error message {string}")
    public void validateFailedToUpdateUserAccountBecauseInvalidUsernameAndDisplayErrorMessage(String failedMessageInUsername) {
        manageUserData.validateFailedEditAccountBecauseInvalidUsername(failedMessageInUsername);
        manageUserData.waitABit();
    }












    //TC_AW_10 [Negative 2] - Verify failed to update user account because did not input username

    @And("I edit data user without username")
    public void iEditDataUserWithoutUsername() {
        manageUserData.didNotInputUsernameToEditDataAccount("");
    }

    @Then("Validate failed to update user account because did not input username and display error message {string}")
    public void validateFailedToUpdateUserAccountBecauseDidNotInputUsernameAndDisplayErrorMessage(String failedMessageBecauseEmptyUsername) {
        manageUserData.validateFailedEditAccountBecauseEmptyUsername(failedMessageBecauseEmptyUsername);
        manageUserData.waitABit();
    }













    //TC_AW_11 [Positive 2] - Verify success to update user account with valid name

    @And("I edit data user with valid name")
    public void iEditDataUserWithValidName() {
        manageUserData.inputValidNameToEditDataAccount("Hanna Erita");
    }

    @Then("Validate success to update user account with valid name and display message {string}")
    public void validateSuccessToUpdateUserAccountWithValidNameAndDisplayMessage(String successMessageEditName) {
        manageUserData.validateSuccessEditAccountUserWithValidName(successMessageEditName);
        manageUserData.waitABit();
    }
















    //TC_AW_12 [Negative 3] - Verify failed to update user account because input invalid name

    @And("I edit data user with invalid name")
    public void iEditDataUserWithInvalidName() {
        manageUserData.inputInvalidNameToEditDataAccount("23");
    }

    @Then("Validate failed to update user account because invalid name and display error message {string}")
    public void validateFailedToUpdateUserAccountBecauseInvalidNameAndDisplayErrorMessage(String failedMessageInName) {
        manageUserData.validateFailedEditAccountBecauseInvalidName(failedMessageInName);
        manageUserData.waitABit();
    }















    //TC_AW_13 [Negative 4] - Verify failed to update user account because did not input name

    @And("I edit data user without input name")
    public void iEditDataUserWithoutName() {
        manageUserData.didNotInputNameToEditDataAccount("");
    }

    @Then("Validate failed to update user account because did not input name and display error message {string}")
    public void validateFailedToUpdateUserAccountBecauseDidNotInputNameAndDisplayErrorMessage(String failedMessageBecauseEmptyName) {
        manageUserData.validateFailedEditAccountBecauseEmptyName(failedMessageBecauseEmptyName);
        manageUserData.waitABit();
    }


















    //TC_AW_14 [Positive 3] - Verify success to update user account with valid email

    @And("I edit data user with valid email")
    public void iEditDataUserWithValidEmail() {
        manageUserData.inputValidEmailToEditDataAccount("hannaerita@gmail.com");
    }

    @Then("Validate success to update user account with valid email and display message {string}")
    public void validateSuccessToUpdateUserAccountWithValidEmailAndDisplayMessage(String successMessageEditEmail) {
        manageUserData.validateSuccessEditAccountUserWithValidEmail(successMessageEditEmail);
        manageUserData.waitABit();
    }

















    //TC_AW_15 [Negative 5] - Verify failed to update user account because input invalid email

    @And("I edit data user with invalid email")
    public void iEditDataUserWithInvalidEmail() {
        manageUserData.inputInvalidEmailToEditDataAccount("hannaerita");
    }

    @Then("Validate failed to update user account because invalid email and display error message {string}")
    public void validateFailedToUpdateUserAccountBecauseInvalidEmailAndDisplayErrorMessage(String failedMessageInEmail) {
        manageUserData.validateFailedEditAccountBecauseInvalidEmail(failedMessageInEmail);
        manageUserData.waitABit();
    }














    //TC_AW_16 [Negative 6] - Verify failed to update user account because did not input email

    @And("I edit data user without email")
    public void iEditDataUserWithoutEmail() {
        manageUserData.didNotInputEmailToEditDataAccount("");
    }

    @Then("Validate failed to update user account because did not input email and display error message {string}")
    public void validateFailedToUpdateUserAccountBecauseDidNotInputEmailAndDisplayErrorMessage(String failedMessageBecauseEmptyEmail) {
        manageUserData.validateFailedEditAccountBecauseEmptyEmail(failedMessageBecauseEmptyEmail);
        manageUserData.waitABit();
    }














    //TC_AW_17 [Positive 4] - Verify success to update user account with valid "no. telepon"

    @And("I edit data user with valid no telepon")
    public void iEditDataUserWithValidNoTelepon() {
        manageUserData.inputValidPhoneNumberToEditDataAccount("81345678923");

    }

    @Then("Validate success to update user account with validno telepon and display message {string}")
    public void validateSuccessToUpdateUserAccountWithValidnoTeleponAndDisplayMessage(String successMessageEditPhoneNumber) {
        manageUserData.validateSuccessEditAccountUserWithValidPhoneNumber(successMessageEditPhoneNumber);
        manageUserData.waitABit();
    }













    //TC_AW_18 [Negative 7] - Verify failed to update user account because input invalid "no. telepon" with abjad

    @And("I edit data user with invalid no telepon with abjad")
    public void iEditDataUserWithInvalidNoTeleponWithAbjad() {
        manageUserData.inputInvalidPhoneNumberWithAbjadToEditDataAccount("abc123");
    }

    @Then("Validate failed to update user account because invalid no telepon with abjad and display error message {string}")
    public void validateFailedToUpdateUserAccountBecauseInvalidNoTeleponWithAbjadAndDisplayErrorMessage(String failedMessageInPhoneNumberWithAbjad) {
        manageUserData.validateFailedEditAccountBecauseInvalidPhoneNumberWithAbjad(failedMessageInPhoneNumberWithAbjad);
        manageUserData.waitABit();
    }














    //TC_AW_19 [Negative 8] - Verify failed to update user account because input invalid "no. telepon" which does not consist of 10 digits

    @And("I edit data user with invalid no telepon which does not consist of 10 digits")
    public void iEditDataUserWithInvalidNoTeleponWhichDoesNotConsistOfDigits() {
        manageUserData.inputInvalidPhoneNumberLessThan10Digit("12");
    }

    @Then("Validate failed to update user account because invalid no telepon less than 10 digits and display error message {string}")
    public void validateFailedToUpdateUserAccountBecauseInvalidNoTeleponLessThanDigitsAndDisplayErrorMessage(String failedMessageInPhoneNumberLessThan10Digit) {
        manageUserData.validateFailedEditAccountBecauseInvalidPhoneNumberLessThan10Digit(failedMessageInPhoneNumberLessThan10Digit);
        manageUserData.waitABit();
    }













    //TC_AW_20 [Negative 9] - Verify failed to update user account because did not input "no. telepon"

    @And("I edit data user without no telepon")
    public void iEditDataUserWithoutNoTelepon() {
        manageUserData.didNotInputPhoneNumberToEditDataAccount("");
    }

    @Then("Validate failed to update user account because did not input no telepon and display error message {string}")
    public void validateFailedToUpdateUserAccountBecauseDidNotInputNoTeleponAndDisplayErrorMessage(String failedMessageBecauseEmptyPhoneNumber) {
        manageUserData.validateFailedEditAccountBecauseEmptyPhoneNumber(failedMessageBecauseEmptyPhoneNumber);
        manageUserData.waitABit();
    }














    //TC_AW_21 [Positive 5] - Verify success cancels editing of user account

    @And("I click cancel button")
    public void iClickCancelButton() {
        manageUserData.clickCancelButton();
    }

    @Then("Validate success to cancel edit user account")
    public void validateSuccessToCancelEditUserAccount() {
        manageUserData.validateSuccessCancelEditAccountUser();
        manageUserData.waitABit();
    }
















    //TC_AW_22 [Positive 6] - Verify success to delete user account "Ana Shn"

    @And("I search the name of the user whose data I want to delete")
    public void iSearchTheNameOfTheUserWhoseDataIWantToDelete() {
        manageUserData.inputNameToBeSearch("Ana Shn");
    }

    @And("I click the delete button or icon on the selected account")
    public void iClickTheDeleteButtonOrIconOnTheSelectedAccount() {
        manageUserData.clickDeleteIcon();
    }

    @And("I click Hapus button")
    public void iClickHapusButton() {
        manageUserData.clickHapusButton();
    }

    @Then("Validate success to delete user account and display message {string}")
    public void validateSuccessToDeleteUserAccountAndDisplayMessage(String successMessageDeleteAccount) {
        manageUserData.validateSuccessDeleteAccountUser(successMessageDeleteAccount);
    }














    //TC_AW_23 [Positive 7] - Verify success to cancel delete user account "Putri Ruth Berliana Siahaan"

    @And("I search name of the user whose data I want to delete")
    public void iSearchNameOfTheUserWhoseDataIWantToDelete() {
        manageUserData.inputNameToBeSearch("Putri Ruth Berliana Siahaan");
    }

    @Then("Validate success to cancel delete user account")
    public void validateSuccessToCancelDeleteUserAccount() {
        manageUserData.validateSuccessCancelDeleteAccountUser();
    }














    //TC_AW_24 [Positive 8] - Verify success to search user account for Existing User

    @And("I input the name in the search field to search user account for Existing User")
    public void iInputTheNameInTheSearchFieldToSearchUserAccountForExistingUser() {
        manageUserData.inputNameToBeSearch("putri");
    }

    @Then("Validate success to display the search result for the name")
    public void validateSuccessToDisplayTheSearchResultForTheName() {
        manageUserData.validateSuccessToSearchUserAccountForExistingUser();
    }
















    //TC_AW_25 [Negative 10] - Verify failed to search user account because input Non-Existent User

    @And("I input non existent user in the search field")
    public void iInputNonExistentUserInTheSearchField() {
        manageUserData.inputNameToBeSearch("vincent");
        manageUserData.waitABit();
    }

    @Then("Validate failed to search user account and display message {string}")
    public void validateFailedToSearchUserAccountAndDisplayMessage(String notFoundUser) {
        manageUserData.validateFailedToGetResultOfSearchingUserAccount(notFoundUser);
        manageUserData.waitABit();
    }

















    //TC_AW_26 [Positive 9] - Verify success to displays data with a maximum of 50 data results

    @And("I scrolls down and click maksimal Tampilan button")
    public void iScrollsDownAndClickMaksimalTampilanButton() {
        manageUserData.scrollDownAndClickMaksimalTampilanButton();
    }

    @And("I choose option Tampilkan 50 Data")
    public void iChooseOptionTampilkanData() {
        manageUserData.chooseOption50Tampilan();
    }

    @Then("Validate success to display results between {int} to {int} data")
    public void validateSuccessToDisplayResultsBetweenToData50(int minItems, int maxItems) {
        manageUserData.validateDisplayDataMaximum50(minItems,maxItems);
    }
















    //TC_AW_27 [Positive 10] - Verify success to displays data with a maximum of 100 data results

    @And("I choose option Tampilkan 100 Data")
    public void iChooseOptionTampilkanData100() {
        manageUserData.chooseOption100Tampilan();
    }

    @Then("Validate success to displays result between {int} to {int} data")
    public void validateSuccessToDisplayResultsWithAMaximumOfData100(int minData, int maxData) {
        manageUserData.validateDisplayDataMaximum100(minData,maxData);
    }




















    //TC_AW_28 [Positive 11] - Verify success to displays the next page which also contains user account data

    @And("I scrolls down and click the next button")
    public void iScrollsDownAndClickTheNextButton() {
        manageUserData.scrollDownClickTheNextButton();
    }

    @Then("Validate success to displays the next page which also contains the user account")
    public void validateSuccessToDisplaysTheNextPageWhichAlsoContainsTheUserAccount() {
        manageUserData.validateOnTheNextPage();
    }




















    //TC_AW_29 [Positive 12] - Verify success to displays the previous page which also contains user account data

    @And("I scrolls down and click the back button")
    public void iScrollsDownAndClickTheBackButton() {
        manageUserData.scrollDownClickTheBackButton();

    }

    @Then("Validate success to displays the previous page which also contains the user account")
    public void validateSuccessToDisplaysThePreviousPageWhichAlsoContainsTheUserAccount() {
        manageUserData.validateOnThePreviousPage();
    }
}
