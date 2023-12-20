package starter.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.NoSuchElementException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;


public class Admin_ManageUserData extends PageObject {

    // =============================================TC_AW_8============================================================

    private By menuPengguna(){
        return By.xpath("/html/body/div/div[2]/div[1]/div[2]/nav/ul/li/ul/li[3]/a");
    }

    private By searchField(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[2]/div/label/div/input");
    }

    private By EditIcon(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[3]/div/table/tbody/tr/td[4]/div/button[1]");
    }

    private By usernameFieldForEditUserData(){
        return By.xpath("/html/body/div[3]/form/div[1]/label/div/input");
    }

    private By simpanButton(){
        return By.xpath("/html/body/div[3]/div[2]/button[2]");
    }

    private By messageSuccessEditAccountUser(){
        return By.xpath("/html/body/div/div[1]/div");
    }

    // ===========================================TC_AW_9=========================================================

    private By messageFailedEditAccountUserInUsernameField(){
        return By.xpath("/html/body/div[3]/form/div[1]/div");
    }

    // ===========================================TC_AW_10=========================================================

    private By nameFieldForEditUserData(){
        return By.xpath("/html/body/div[3]/form/div[2]/label/div/input");
    }

    // ===========================================TC_AW_12=========================================================

    private By messageFailedEditAccountUserInNameField(){
        return By.xpath("/html/body/div[3]/form/div[2]/div");
    }

    // ===========================================TC_AW_14=========================================================

    private By emailFieldForEditUserData(){
        return By.xpath("/html/body/div[3]/form/div[3]/label/div/input");
    }

    // ===========================================TC_AW_15=========================================================

    private By messageFailedEditAccountUserInEmailField(){
        return By.xpath("/html/body/div[3]/form/div[3]/div");
    }

    // ===========================================TC_AW_17=========================================================

    private By phoneNumberFieldForEditUserData(){
        return By.xpath("/html/body/div[3]/form/div[4]/label/div/input");
    }

    // ===========================================TC_AW_18=========================================================

    private By messageFailedEditAccountUserInPhoneNumberField(){
        return By.xpath("/html/body/div[3]/form/div[4]/div");
    }

    // ===========================================TC_AW_21=========================================================

    private By cancelButton(){
        return By.xpath("/html/body/div[3]/div[2]/button[1]");
    }

    private By displayDataAccountUser(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[3]/div/table/tbody/tr");
    }

    // ===========================================TC_AW_22=========================================================

    private By DeleteIcon(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[3]/div/table/tbody/tr/td[4]/div/button[2]");
    }

    private By HapusButton(){
        return By.xpath("/html/body/div[3]/div[2]/button[2]");
    }

    private By messageSuccessDeleteAccountUser(){
        return By.xpath("/html/body/div/div[1]/div");
    }

    // ===========================================TC_AW_25=========================================================

    private By messageDataNotAvailable(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[3]/div/table/tbody/tr/td");
    }

    // ===========================================TC_AW_26=========================================================

    private void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }

    private By maksimalTampilanButton(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[4]/div/div[1]/div/label/div/select");
    }

    private By option50Tampilan(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[4]/div/div[1]/div/label/div/select/option[2]");
    }

    private By validateTableBody(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[3]/div/table/tbody");
    }

    private By numberOfPages(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[4]/div/div[1]/span");
    }

    // ===========================================TC_AW_27=========================================================

    private By option100Tampilan(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[4]/div/div[1]/div/label/div/select/option[3]");
    }

    // ===========================================TC_AW_28=========================================================

    private By nextButtonToNextPage(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[4]/div/div[2]/div/button[5]");
    }

    private By onTheNextPage(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[4]/div/div[2]/div/button[3]");
    }

    // ===========================================TC_AW_29=========================================================

    private By backButtonToPreviousPage(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[4]/div/div[2]/div/button[1]");
    }

    private By onThePreviousPage(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[4]/div/div[2]/div/button[2]");
    }





















    //TC_AW_8 [Positive 1] - Verify success to update user account of "Hanna Erita Saragih" with valid username

    @Step
    public void clickMenuPengguna(){
        $(menuPengguna()).click();
        waitABit(3000);
    }

    @Step
    public void inputNameToBeSearch(String searchName){
        $(searchField()).type(searchName);
    }

    @Step
    public void clickEditIcon(){
        waitABit(3000);
        $(EditIcon()).click();
        waitABit(3000);
    }

    @Step
    public void inputValidUsernameToEditDataAccount(String validUsername){
        $(usernameFieldForEditUserData()).type(validUsername);
    }

    @Step
    public void clickSimpanButton(){
        $(simpanButton()).click();
        waitABit(2000);
    }

    @Step
    public void validateSuccessEditAccountUserWithValidUsername(String successMessageEditUsername){
        try {
            WebElement resultMessage = find(messageSuccessEditAccountUser());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(successMessageEditUsername)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + successMessageEditUsername + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }

    @Step
    public void waitABit(){
        waitABit(2000);
    }

















    //TC_AW_9 [Negative 1] - Verify failed to update user account because input invalid username

    @Step
    public void inputInvalidUsernameToEditDataAccount(String invalidUsername){
        $(usernameFieldForEditUserData()).type(invalidUsername);
    }

    @Step
    public void validateFailedEditAccountBecauseInvalidUsername(String failedMessageInUsername){
        try {
            WebElement resultMessage = find(messageFailedEditAccountUserInUsernameField());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(failedMessageInUsername)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + failedMessageInUsername + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }




















    //TC_AW_10 [Negative 2] - Verify failed to update user account because did not input username

    @Step
    public void didNotInputUsernameToEditDataAccount(String emptyUsername){
        $(usernameFieldForEditUserData()).type(emptyUsername);
    }

    @Step
    public void validateFailedEditAccountBecauseEmptyUsername(String failedMessageBecauseEmptyUsername){
        try {
            WebElement resultMessage = find(messageFailedEditAccountUserInUsernameField());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(failedMessageBecauseEmptyUsername)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + failedMessageBecauseEmptyUsername + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }




















    //TC_AW_11 [Positive 2] - Verify success to update user account with valid name

    @Step
    public void inputValidNameToEditDataAccount(String validName){
        $(nameFieldForEditUserData()).type(validName);
    }

    @Step
    public void validateSuccessEditAccountUserWithValidName(String successMessageEditName){
        try {
            WebElement resultMessage = find(messageSuccessEditAccountUser());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(successMessageEditName)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + successMessageEditName + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }
















    //TC_AW_12 [Negative 3] - Verify failed to update user account because input invalid name

    @Step
    public void inputInvalidNameToEditDataAccount(String invalidName){
        $(nameFieldForEditUserData()).type(invalidName);
    }

    @Step
    public void validateFailedEditAccountBecauseInvalidName(String failedMessageInName){
        try {
            WebElement resultMessage = find(messageFailedEditAccountUserInNameField());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(failedMessageInName)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + failedMessageInName + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }
















    //TC_AW_13 [Negative 4] - Verify failed to update user account because did not input name

    @Step
    public void didNotInputNameToEditDataAccount(String emptyName){
        $(nameFieldForEditUserData()).type(emptyName);
    }

    @Step
    public void validateFailedEditAccountBecauseEmptyName(String failedMessageBecauseEmptyName){
        try {
            WebElement resultMessage = find(messageFailedEditAccountUserInNameField());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(failedMessageBecauseEmptyName)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + failedMessageBecauseEmptyName + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }

















    //TC_AW_14 [Positive 3] - Verify success to update user account with valid email

    @Step
    public void inputValidEmailToEditDataAccount(String validEmail){
        $(emailFieldForEditUserData()).type(validEmail);
    }

    @Step
    public void validateSuccessEditAccountUserWithValidEmail(String successMessageEditEmail){
        try {
            WebElement resultMessage = find(messageSuccessEditAccountUser());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(successMessageEditEmail)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + successMessageEditEmail + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }






















    //TC_AW_15 [Negative 5] - Verify failed to update user account because input invalid email

    @Step
    public void inputInvalidEmailToEditDataAccount(String invalidEmail){
        $(emailFieldForEditUserData()).type(invalidEmail);
    }

    @Step
    public void validateFailedEditAccountBecauseInvalidEmail(String failedMessageInEmail){
        try {
            WebElement resultMessage = find(messageFailedEditAccountUserInEmailField());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(failedMessageInEmail)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + failedMessageInEmail + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }















    //TC_AW_16 [Negative 6] - Verify failed to update user account because did not input email

    @Step
    public void didNotInputEmailToEditDataAccount(String emptyEmail){
        $(emailFieldForEditUserData()).type(emptyEmail);
    }

    @Step
    public void validateFailedEditAccountBecauseEmptyEmail(String failedMessageBecauseEmptyEmail){
        try {
            WebElement resultMessage = find(messageFailedEditAccountUserInEmailField());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(failedMessageBecauseEmptyEmail)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + failedMessageBecauseEmptyEmail + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }






















    //TC_AW_17 [Positive 4] - Verify success to update user account with valid "no. telepon"

    @Step
    public void inputValidPhoneNumberToEditDataAccount(String validPhoneNumber){
        $(phoneNumberFieldForEditUserData()).type(validPhoneNumber);
    }

    @Step
    public void validateSuccessEditAccountUserWithValidPhoneNumber(String successMessageEditPhoneNumber){
        try {
            WebElement resultMessage = find(messageSuccessEditAccountUser());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(successMessageEditPhoneNumber)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + successMessageEditPhoneNumber + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }



















    //TC_AW_18 [Negative 7] - Verify failed to update user account because input invalid "no. telepon" with abjad

    @Step
    public void inputInvalidPhoneNumberWithAbjadToEditDataAccount(String invalidPhoneNumberWithAbjad){
        $(phoneNumberFieldForEditUserData()).type(invalidPhoneNumberWithAbjad);
    }

    @Step
    public void validateFailedEditAccountBecauseInvalidPhoneNumberWithAbjad(String failedMessageInPhoneNumberWithAbjad){
        try {
            WebElement resultMessage = find(messageFailedEditAccountUserInPhoneNumberField());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(failedMessageInPhoneNumberWithAbjad)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + failedMessageInPhoneNumberWithAbjad + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }





















    //TC_AW_19 [Negative 8] - Verify failed to update user account because input invalid "no. telepon" which does not consist of 10 digits

    @Step
    public void inputInvalidPhoneNumberLessThan10Digit(String invalidPhoneNumberLessThan10Digit){
        $(phoneNumberFieldForEditUserData()).type(invalidPhoneNumberLessThan10Digit);
    }

    @Step
    public void validateFailedEditAccountBecauseInvalidPhoneNumberLessThan10Digit(String failedMessageInPhoneNumberLessThan10Digit){
        try {
            WebElement resultMessage = find(messageFailedEditAccountUserInPhoneNumberField());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(failedMessageInPhoneNumberLessThan10Digit)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + failedMessageInPhoneNumberLessThan10Digit + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }






















    //TC_AW_20 [Negative 9] - Verify failed to update user account because did not input "no. telepon"

    @Step
    public void didNotInputPhoneNumberToEditDataAccount(String emptyPhoneNumber){
        $(phoneNumberFieldForEditUserData()).type(emptyPhoneNumber);
    }

    @Step
    public void validateFailedEditAccountBecauseEmptyPhoneNumber(String failedMessageBecauseEmptyPhoneNumber){
        try {
            WebElement resultMessage = find(messageFailedEditAccountUserInPhoneNumberField());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(failedMessageBecauseEmptyPhoneNumber)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + failedMessageBecauseEmptyPhoneNumber + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }



















    //TC_AW_21 [Positive 5] - Verify success cancels editing of user account

    @Step
    public void clickCancelButton(){$(cancelButton()).click();
    }

    @Step
    public void validateSuccessCancelEditAccountUser() {
        $(displayDataAccountUser()).isDisplayed();
    }



















    //TC_AW_22 [Positive 6] - Verify success to delete user account "Ana Shn"

    @Step
    public void clickDeleteIcon(){
        waitABit(3000);
        $(DeleteIcon()).click();
        waitABit(3000);
    }

    @Step
    public void clickHapusButton(){
        $(HapusButton()).click();
        waitABit(3000);
    }

    @Step
    public void validateSuccessDeleteAccountUser(String successMessageDeleteAccount){
        try {
            WebElement resultMessage = find(messageSuccessDeleteAccountUser());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(successMessageDeleteAccount)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + successMessageDeleteAccount + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }




















    //TC_AW_23 [Positive 7] - Verify success to cancel delete user account "Putri Ruth Berliana Siahaan"

    @Step
    public void validateSuccessCancelDeleteAccountUser() {
        $(displayDataAccountUser()).isDisplayed();
    }



















    //TC_AW_24 [Positive 8] - Verify success to search user account for Existing User

    @Step
    public void validateSuccessToSearchUserAccountForExistingUser() {
        waitABit(3000);
        List<WebElementFacade> dataItems = findAll(validateTableBody());
        assertThat("Search results are not empty", dataItems.size(), greaterThan(0));
        waitABit(3000);
    }

















    //TC_AW_25 [Negative 10] - Verify failed to search user account because input Non-Existent User

    @Step
    public void validateFailedToGetResultOfSearchingUserAccount(String notFoundUser){
        try {
            WebElement resultMessage = find(messageDataNotAvailable());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(notFoundUser)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + notFoundUser + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }














    //TC_AW_26 [Positive 9] - Verify success to displays data with a maximum of 50 data results

    @Step
    public void scrollDownAndClickMaksimalTampilanButton() {
        scrollDown();
        waitABit(5000);
        $(maksimalTampilanButton()).click();
        waitABit(3000);
    }

    @Step
    public void chooseOption50Tampilan() {
        $(option50Tampilan()).click();
        scrollDown();
        waitABit(5000);
        $(numberOfPages()).click();
        waitABit(3000);
    }

    @Step
    public void validateDisplayDataMaximum50(int minItems, int maxItems) {
        List<WebElementFacade> dataItems = findAll(validateTableBody());
        int actualItemCount = dataItems.size();

        // Lakukan validasi antara minItems dan maxItems
        assert (actualItemCount >= minItems && actualItemCount <= maxItems) :
                "The actual item count is not between " + minItems + " and " + maxItems +
                        ". Actual count: " + actualItemCount;
    }


















    //TC_AW_27 [Positive 10] - Verify success to displays data with a maximum of 100 data results

    @Step
    public void chooseOption100Tampilan() {
        $(option100Tampilan()).click();
        scrollDown();
        waitABit(5000);
        $(numberOfPages()).click();
        waitABit(3000);
    }

    @Step
    public void validateDisplayDataMaximum100(int minData, int maxData) {
        List<WebElementFacade> dataItems = findAll(validateTableBody());
        int actualItemCount = dataItems.size();

        assert (actualItemCount >= minData && actualItemCount <= maxData) :
                "The actual item count is not between " + minData + " and " + maxData +
                        ". Actual count: " + actualItemCount;
    }

























    //TC_AW_28 [Positive 11] - Verify success to displays the next page which also contains user account data

    @Step
    public void scrollDownClickTheNextButton() {
        waitABit(3000);
        scrollDown();
        waitABit(5000);
        $(nextButtonToNextPage()).click();
        waitABit(3000);
    }

    @Step
    public void validateOnTheNextPage() {
        scrollDown();
        waitABit(5000);
        $(onTheNextPage()).getText();
        waitABit(3000);
    }


















    //TC_AW_29 [Positive 12] - Verify success to displays the previous page which also contains user account data

    @Step
    public void scrollDownClickTheBackButton() {
        waitABit(3000);
        $(backButtonToPreviousPage()).click();
        waitABit(3000);
    }

    @Step
    public void validateOnThePreviousPage() {
        scrollDown();
        waitABit(5000);
        $(onThePreviousPage()).getText();
        waitABit(3000);


    }

}
