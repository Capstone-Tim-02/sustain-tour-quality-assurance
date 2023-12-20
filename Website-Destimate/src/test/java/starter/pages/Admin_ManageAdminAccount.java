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

public class Admin_ManageAdminAccount extends PageObject {

    // =============================================TC_AW_144============================================================

    private By menuAdmin(){
        return By.xpath("/html/body/div/div[2]/div[1]/div[2]/nav/ul/li/ul/li[2]");
    }

    private By searchField(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[2]/div/label/div/input");
    }

    private By EditIcon(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[3]/div/table/tbody/tr/td[4]/div/button[1]");
    }

    private By usernameFieldForEditAdminData(){
        return By.xpath("/html/body/div[3]/form/div[1]/label/div/input");
    }

    private By simpanButton(){
        return By.xpath("/html/body/div[3]/div[2]/button[2]");
    }

    private By messageSuccessEditAccountAdmin(){
        return By.xpath("/html/body/div/div[1]/div");
    }

    // ===========================================TC_AW_145=========================================================

    private By messageFailedEditBecauseAlreadyExists(){
        return By.xpath("/html/body/div[1]/div[1]/div/div/div[1]");
    }


    // ===========================================TC_AW_146=========================================================

    private By messageFailedEditAccountAdminInUsernameField(){
        return By.xpath("/html/body/div[3]/form/div[1]/div");
    }

    // ===========================================TC_AW_147=========================================================

    private By nameFieldForEditAdminData(){
        return By.xpath("/html/body/div[3]/form/div[2]/label/div/input");
    }

    // ===========================================TC_AW_148=========================================================

    private By messageFailedEditAccountAdminInNameField(){
        return By.xpath("/html/body/div[3]/form/div[2]/div");
    }

    // ===========================================TC_AW_150=========================================================

    private By emailFieldForEditAdminData(){
        return By.xpath("/html/body/div[3]/form/div[3]/label/div/input");
    }

    // ===========================================TC_AW_152=========================================================

    private By messageFailedEditAccountAdminInEmailField(){
        return By.xpath("/html/body/div[3]/form/div[3]/div");
    }

    // ===========================================TC_AW_153=========================================================

    private By phoneNumberFieldForEditAdminData(){
        return By.xpath("/html/body/div[3]/form/div[4]/label/div/input");
    }

    // ===========================================TC_AW_154=========================================================

    private By messageFailedEditAccountAdminInPhoneNumberField(){
        return By.xpath("/html/body/div[3]/form/div[4]/div");
    }

    // ===========================================TC_AW_157=========================================================

    private By cancelButton(){
        return By.xpath("/html/body/div[3]/div[2]/button[1]");
    }

    private By displayDataAccountAdmin(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[3]/div/table/tbody/tr");
    }

    // ===========================================TC_AW_158=========================================================

    private By DeleteIcon(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[3]/div/table/tbody/tr[4]/td[4]/div/button[2]");
    }

    private By HapusButton(){
        return By.xpath("/html/body/div[3]/div[2]/button[2]");
    }

    private By messageSuccessDeleteAccountAdmin(){
        return By.xpath("/html/body/div/div[1]/div");
    }

    // ===========================================TC_AW_159=========================================================

    private By DeleteIconforAdminDestimate2(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[3]/div/table/tbody/tr/td[4]/div/button[2]");
    }


    // ===========================================TC_AW_161=========================================================

    private By messageDataNotAvailable(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[3]/div/table/tbody/tr/td");
    }

    // ===========================================TC_AW_162=========================================================

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

    // ===========================================TC_AW_163=========================================================

    private By option100Tampilan(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[4]/div/div[1]/div/label/div/select/option[3]");
    }

    // ===========================================TC_AW_164=========================================================

    private By nextButtonToNextPage(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[4]/div/div[2]/div/button[3]");
    }

    private By onTheNextPage(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[4]/div/div[2]/div/button[2]");
    }

    // ===========================================TC_AW_165=========================================================

    private By backButtonToPreviousPage(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[4]/div/div[2]/div/button[1]");
    }

    private By onThePreviousPage(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[4]/div/div[2]/div/button[2]");
    }





















    //TC_AW_144 [Positive 1] - Verify success to update account admin of "Admin Destimate 3" with valid username

    @Step
    public void clickMenuAdmin(){
        $(menuAdmin()).click();
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
        $(usernameFieldForEditAdminData()).type(validUsername);
    }

    @Step
    public void clickSimpanButton(){
        $(simpanButton()).click();
        waitABit(3000);
    }

    @Step
    public void validateSuccessEditAccountAdminWithValidUsername(String successMessageEditUsername){
        try {
            WebElement resultMessage = find(messageSuccessEditAccountAdmin());

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

















    //TC_AW_145 [Negative 1] - Verify failed to update account "Admin Destimate 3" because input an existing username

    @Step
    public void inputUsernameAlreadyExists(String usernameAlreadyExists){
        $(usernameFieldForEditAdminData()).type(usernameAlreadyExists);
    }

    @Step
    public void validateFailedEditAccountBecauseUsernameAlreadyExists(String failedMessageInUsername){
        try {
            WebElement resultMessage = find(messageFailedEditBecauseAlreadyExists());

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




















    //TC_AW_146 [Negative 2] - Verify failed to update account "Admin Destimate 3" because did not input username

    @Step
    public void didNotInputUsernameToEditDataAccount(String emptyUsername){
        $(usernameFieldForEditAdminData()).type(emptyUsername);
    }

    @Step
    public void validateFailedEditAccountBecauseEmptyUsername(String failedMessageBecauseEmptyUsername){
        try {
            WebElement resultMessage = find(messageFailedEditAccountAdminInUsernameField());

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




















    //TC_AW_147 [Positive 2] - Verify success to update account "Admin Destimate 3" with valid name

    @Step
    public void inputValidNameToEditDataAccount(String validName){
        $(nameFieldForEditAdminData()).type(validName);
    }

    @Step
    public void validateSuccessEditAccountAdminWithValidName(String successMessageEditName){
        try {
            WebElement resultMessage = find(messageSuccessEditAccountAdmin());

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
















    //TC_AW_148 [Negative 3] - Verify failed to update account "Admin Destimate 36" because input invalid name

    @Step
    public void inputInvalidNameToEditDataAccount(String invalidName){
        $(nameFieldForEditAdminData()).type(invalidName);
    }

    @Step
    public void validateFailedEditAccountBecauseInvalidName(String failedMessageInName){
        try {
            WebElement resultMessage = find(messageFailedEditAccountAdminInNameField());

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
















    //TC_AW_149 [Negative 4] - Verify failed to update account "Admin Destimate 36" because did not input name

    @Step
    public void didNotInputNameToEditDataAccount(String emptyName){
        $(nameFieldForEditAdminData()).type(emptyName);
    }

    @Step
    public void validateFailedEditAccountBecauseEmptyName(String failedMessageBecauseEmptyName){
        try {
            WebElement resultMessage = find(messageFailedEditAccountAdminInNameField());

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

















    //TC_AW_150 [Positive 3] - Verify success to update account "Admin Destimate 36" with valid email

    @Step
    public void inputValidEmailToEditDataAccount(String validEmail){
        $(emailFieldForEditAdminData()).type(validEmail);
    }

    @Step
    public void validateSuccessEditAccountAdminWithValidEmail(String successMessageEditEmail){
        try {
            WebElement resultMessage = find(messageSuccessEditAccountAdmin());

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






















    //TC_AW_151 [Negative 5] - Verify failed to update account "Admin Destimate 36" because input an existing email

    @Step
    public void inputInvalidEmailToEditDataAccount(String invalidEmail){
        $(emailFieldForEditAdminData()).type(invalidEmail);
    }

    @Step
    public void validateFailedEditAccountBecauseInvalidEmail(String failedMessageInEmail){
        try {
            WebElement resultMessage = find(messageFailedEditBecauseAlreadyExists());

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















    //TC_AW_152 [Negative 6] - Verify failed to update account "Admin Destimate 36" because did not input email

    @Step
    public void didNotInputEmailToEditDataAccount(String emptyEmail){
        $(emailFieldForEditAdminData()).type(emptyEmail);
    }

    @Step
    public void validateFailedEditAccountBecauseEmptyEmail(String failedMessageBecauseEmptyEmail){
        try {
            WebElement resultMessage = find(messageFailedEditAccountAdminInEmailField());

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






















    //TC_AW_153 [Positive 4] - Verify success to update account "Admin Destimate 36" with valid "no. telepon"

    @Step
    public void inputValidPhoneNumberToEditDataAccount(String validPhoneNumber){
        $(phoneNumberFieldForEditAdminData()).type(validPhoneNumber);
    }

    @Step
    public void validateSuccessEditAccountAdminWithValidPhoneNumber(String successMessageEditPhoneNumber){
        try {
            WebElement resultMessage = find(messageSuccessEditAccountAdmin());

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



















    //TC_AW_154 [Negative 7] - Verify failed to update account "Admin Destimate 36" because input invalid "no. telepon" with abjad

    @Step
    public void inputInvalidPhoneNumberWithAbjadToEditDataAccount(String invalidPhoneNumberWithAbjad){
        $(phoneNumberFieldForEditAdminData()).type(invalidPhoneNumberWithAbjad);
    }

    @Step
    public void validateFailedEditAccountBecauseInvalidPhoneNumberWithAbjad(String failedMessageInPhoneNumberWithAbjad){
        try {
            WebElement resultMessage = find(messageFailedEditAccountAdminInPhoneNumberField());

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





















    //TC_AW_155 [Negative 8] - Verify failed to update account "Admin Destimate 36" because input invalid "no. telepon" which does not consist of 10 digits

    @Step
    public void inputInvalidPhoneNumberLessThan10Digit(String invalidPhoneNumberLessThan10Digit){
        $(phoneNumberFieldForEditAdminData()).type(invalidPhoneNumberLessThan10Digit);
    }

    @Step
    public void validateFailedEditAccountBecauseInvalidPhoneNumberLessThan10Digit(String failedMessageInPhoneNumberLessThan10Digit){
        try {
            WebElement resultMessage = find(messageFailedEditAccountAdminInPhoneNumberField());

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






















    //TC_AW_156 [Negative 9] - Verify failed to update account "Admin Destimate 36" because did not input "no. telepon"

    @Step
    public void didNotInputPhoneNumberToEditDataAccount(String emptyPhoneNumber){
        $(phoneNumberFieldForEditAdminData()).type(emptyPhoneNumber);
    }

    @Step
    public void validateFailedEditAccountBecauseEmptyPhoneNumber(String failedMessageBecauseEmptyPhoneNumber){
        try {
            WebElement resultMessage = find(messageFailedEditAccountAdminInPhoneNumberField());

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



















    //TC_AW_157 [Positive 5] - Verify success cancels editing of account "Admin Destimate 36"

    @Step
    public void clickCancelButton(){$(cancelButton()).click();
    }

    @Step
    public void validateSuccessCancelEditAccountAdmin() {
        $(displayDataAccountAdmin()).isDisplayed();
    }



















    //TC_AW_158 [Positive 6] - Verify success to delete account "Admin Destimate 36"

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
    public void validateSuccessDeleteAccountAdmin(String successMessageDeleteAccount){
        try {
            WebElement resultMessage = find(messageSuccessDeleteAccountAdmin());

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




















    //TC_AW_159 [Positive 7] - Verify success cancel to delete account "Admin Destimate 2"

    @Step
    public void clickDeleteIconforAdminDestimate2(){
        waitABit(3000);
        $(DeleteIconforAdminDestimate2()).click();
        waitABit(3000);
    }


    @Step
    public void validateSuccessCancelDeleteAccountAdmin() {
        $(displayDataAccountAdmin()).isDisplayed();
    }



















    //TC_AW_160 [Positive 8] - Verify success to search account for Existing Admin

    @Step
    public void validateSuccessToSearchAdminAccountForExistingAdmin() {
        waitABit(3000);
        List<WebElementFacade> dataItems = findAll(validateTableBody());
        assertThat("Search results are not empty", dataItems.size(), greaterThan(0));
        waitABit(3000);
    }


















    //TC_AW_161 [Negative 10] - Verify failed to search account because input Non-Existent Admin

    @Step
    public void validateFailedToGetResultOfSearchingAdminAccount(String notFoundAdmin){
        try {
            WebElement resultMessage = find(messageDataNotAvailable());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(notFoundAdmin)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + notFoundAdmin + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }














    //TC_AW_162 [Positive 9] - Verify success to displays data with a maximum of 50 data results

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


















    //TC_AW_163 [Positive 10] - Verify success to displays data with a maximum of 100 data results

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

























    //TC_AW_164 [Positive 11] - Verify success to displays the next page which also contains admin account data

    @Step
    public void scrollDownClickTheNextButton() {
        waitABit(3000);
        scrollDown();
        $(numberOfPages()).click();
        waitABit(2000);
        try {
            WebElementFacade nextButton = $(nextButtonToNextPage());
            nextButton.click();
            System.out.println("Tombol 'Next' berhasil diklik.");
        } catch (Exception e) {
            System.out.println("Tombol 'Next' tidak dapat diklik atau tidak ada. Mungkin halaman terakhir.");
        }
    }

    @Step
    public void validateOnTheNextPage() {
        scrollDown();
        waitABit(3000);
        $(numberOfPages()).click();
        $(onTheNextPage()).getText();
        waitABit(3000);

    }


















    //TC_AW_165 [Positive 12] - Verify success to displays the previous page which also contains admin account data

    @Step
    public void scrollDownClickTheBackButton() {
        waitABit(3000);


        try {
            WebElementFacade backButton = $(backButtonToPreviousPage());
            backButton.click();
            System.out.println("Tombol 'Back' berhasil diklik.");
        } catch (Exception e) {
            System.out.println("Tombol 'Back' tidak dapat diklik atau tidak ada. Mungkin halaman terakhir.");
        }
    }

    @Step
    public void validateOnThePreviousPage() {
        scrollDown();
        waitABit(3000);
        $(numberOfPages()).click();
        $(onThePreviousPage()).getText();
        waitABit(3000);


    }


}
