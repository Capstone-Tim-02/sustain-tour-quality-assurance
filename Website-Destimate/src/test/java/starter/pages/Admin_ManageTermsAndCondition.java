package starter.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.NoSuchElementException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;

public class Admin_ManageTermsAndCondition extends PageObject {

    // =============================================TC_AW_131============================================================

    private By menuTNC(){
        return By.xpath("/html/body/div/div[2]/div[1]/div[2]/nav/ul/li/ul/li[8]");
    }

    private By EditIconTNCDummy(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[2]/div/table/tbody/tr[8]/td[4]/div/a");
    }

    private void scrollRight() {
        WebElementFacade element = find(EditIconTNCDummy());
        String script = "arguments[0].scrollIntoView(true);";
        evaluateJavascript(script, element);
    }

    private By titleTNCField(){
        return By.xpath("/html/body/div[1]/div[2]/div[2]/main/div/div/div[2]/div[2]/form/div[1]/label/div/input");
    }

    private By deskripsiField(){
        return By.xpath("/html/body/div[1]/div[2]/div[2]/main/div/div/div[2]/div[2]/form/div[2]/label/div/div/div[1]/div[2]/div[1]/iframe");
    }

    private By simpanButton(){
        return By.xpath("/html/body/div[1]/div[2]/div[2]/main/div/div/div[2]/div[2]/form/div[3]/button");
    }

    private By messageSuccessEditTNC(){
        return By.xpath("/html/body/div/div[1]/div");
    }

    // =============================================TC_AW_132============================================================

    private By EditIconTNCPerjanjianPemilikWisata(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[2]/div/table/tbody/tr[9]/td[4]/div/a");
    }

    private By messageErrorTNC(){
        return By.xpath("/html/body/div[1]/div[1]/div/div/div[1]");
    }

    // =============================================TC_AW_133============================================================

    private By EditIconTNCPembeliTiket(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[4]/div/a");
    }

    private By messageErrorTitle(){
        return By.xpath("/html/body/div[1]/div[2]/div[2]/main/div/div/div[2]/div[2]/form/div[1]/div");
    }

    // =============================================TC_AW_134============================================================

    private By messageErrorDescription(){
        return By.xpath("/html/body/div[1]/div[2]/div[2]/main/div/div/div[2]/div[2]/form/div[2]/div");
    }

    // =============================================TC_AW_137============================================================

    private By cancelButtonTNC(){
        return By.xpath("/html/body/div[1]/div[2]/div[2]/main/div/div/div[2]/div[2]/form/div[3]/a/button");
    }

    private By validateTableBody(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[2]/div/table/tbody");
    }

    // ===========================================TC_AW_138=========================================================

    private By maksimalTampilanButton(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[3]/div/div[1]/div/label/div/select");
    }
    private void scrollDown() {
        WebElementFacade element = find(numberOfPages());
        evaluateJavascript("arguments[0].scrollIntoView(true);", element);
        element.click();
    }

    private By option50Tampilan(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[3]/div/div[1]/div/label/div/select/option[2]");
    }

    private By numberOfPages(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[3]/div/div[1]/span");
    }

    // ===========================================TC_AW_139=========================================================

    private By option100Tampilan(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[3]/div/div[1]/div/label/div/select/option[3]");
    }

    // ===========================================TC_AW_140=========================================================

    private By nextButtonToNextPage(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[3]/div/div[2]/div/button[4]");
    }

    private By onTheNextPage(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[3]/div/div[2]/div/button[3]");
    }

    // ===========================================TC_AW_141=========================================================

    private By backButtonToPreviousPage(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[3]/div/div[2]/div/button[1]");
    }

    private By onThePreviousPage(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[3]/div/div[2]/div/button[2]");
    }























    //TC_AW_131 [Positive 1] - Verify success to Update Terms and Condition with title "TNC Dummy 1" using valid data (title or description)

    @Step
    public void clickMenuTNC(){
        $(menuTNC()).click();
        waitABit(3000);
    }

    @Step
    public void waitABit(){
        waitABit(3000);
    }


    @Step
    public void clickEditIconTNCDummy(){
        scrollRight();
        waitABit(3000);
        $(EditIconTNCDummy()).click();
        waitABit(3000);
    }


    @Step
    public void inputTitleTNC(String validTitle){
        $(titleTNCField()).type(validTitle);
    }

    @Step
    public void inputDescription(String validDescription){

        WebElement iframeElement = getDriver().findElement(deskripsiField());

        getDriver().switchTo().frame(iframeElement);

        try {
            WebElement textareaElement = getDriver().findElement(By.id("tinymce"));
            textareaElement.clear();  //
            textareaElement.sendKeys(validDescription);

            getDriver().switchTo().defaultContent();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Step
    public void clickTheSimpanButton(){
        $(simpanButton()).click();
    }

    @Step
    public void validateSuccessEditTNC(String successMessageEditTNC){
        try {
            WebElement resultMessage = find(messageSuccessEditTNC());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(successMessageEditTNC)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + successMessageEditTNC + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }












    //TC_AW_132 [Negative 1] - Verify failed to Update Terms and Condition in the title "Perjanjian Pemilik Wisata" because input existing title

    @Step
    public void clickEditIconTNCPerjanjianPemilikWisata(){
        scrollRight();
        waitABit(3000);
        $(EditIconTNCPerjanjianPemilikWisata()).click();
        waitABit(3000);
    }

    @Step
    public void validateFailedEditTNCBecauseTitleAlreadyExists(String failedMessageBecauseTitleAlreadyExists){
        try {
            WebElement resultMessage = find(messageErrorTNC());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(failedMessageBecauseTitleAlreadyExists)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + failedMessageBecauseTitleAlreadyExists + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }







    //TC_AW_133 [Negative 2] - Verify failed to Update Terms and Condition in the title "Pembelian Tiket" because input title with 1 character

    @Step
    public void clickEditIconTNCPembeliTiket(){
        scrollRight();
        waitABit(3000);
        $(EditIconTNCPembeliTiket()).click();
        waitABit(3000);
    }

    @Step
    public void validateFailedEditTNCBecauseInvalidTitle(String failedMessageBecauseInvalidTitle){
        try {
            WebElement resultMessage = find(messageErrorTitle());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(failedMessageBecauseInvalidTitle)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + failedMessageBecauseInvalidTitle + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }
















    //TC_AW_134 [Negative 3] - Verify failed to Update Terms and Condition in the title "Pembelian Tiket" because input description with 1 character

    @Step
    public void validateFailedEditTNCBecauseInvalidDescription(String failedMessageBecauseInvalidDescription){
        try {
            WebElement resultMessage = find(messageErrorDescription());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(failedMessageBecauseInvalidDescription)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + failedMessageBecauseInvalidDescription + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
        waitABit(3000);
    }












    //TC_AW_135 [Negative 4] - Verify failed to Update Terms and Condition in the title "Pembelian Tiket" because edit by not entering the title

    @Step
    public void validateFailedEditTNCBecauseEmptyTitle(String failedMessageBecauseEmptyTitle){
        try {
            WebElement resultMessage = find(messageErrorTitle());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(failedMessageBecauseEmptyTitle)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + failedMessageBecauseEmptyTitle + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
        waitABit(3000);
    }














    //TC_AW_136 [Negative 5] - Verify failed to Update Terms and Condition in the title "Pembelian Tiket" because edit by not entering the description

    @Step
    public void validateFailedEditTNCBecauseEmptyDescription(String failedMessageBecauseEmptyDescription){
        try {
            WebElement resultMessage = find(messageErrorDescription());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(failedMessageBecauseEmptyDescription)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + failedMessageBecauseEmptyDescription + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
        waitABit(3000);
    }









    //TC_AW_137 [Positive 2] - Verify success cancels update Terms and Condition with title "Pembelian Paket"

    @Step
    public void clickTheCancelButton(){
        $(cancelButtonTNC()).click();
        waitABit(3000);
    }

    @Step
    public void validateSuccessToCancelUpdateTNC() {
        waitABit(3000);
        List<WebElementFacade> dataItems = findAll(validateTableBody());
        assertThat("List of Terms & Conditions", dataItems.size(), greaterThan(0));
        waitABit(3000);
    }






















    //TC_AW_138 [Positive 3] - Verify success to displays data with a maximum of 50 data results

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













    //TC_AW_139 [Positive 4] - Verify success to displays data with a maximum of 100 data results

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

















    //TC_AW_140 [Positive 5] - Verify success to displays the next page which also contains other Terms and Condition

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





    //TC_AW_141 [Positive 6] - Verify success to displays the previous page which also contains other Terms and Condition

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
