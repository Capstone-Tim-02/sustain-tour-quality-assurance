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

public class Admin_ManageTransaction extends PageObject {

    // =============================================TC_AW_120============================================================

    private By menuTransaksi(){
        return By.xpath("/html/body/div/div[2]/div[1]/div[2]/nav/ul/li/ul/li[7]");
    }

    private By searchField(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[2]/div/label/div/input");
    }

    private By EditIcon(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[3]/div/table/tbody/tr/td[9]/div/button[2]");
    }

    private void scrollRight() {
        WebElementFacade element = find(EditIcon());
        String script = "arguments[0].scrollIntoView(true);";
        evaluateJavascript(script, element);
    }

    private By statusSudahBayar(){
        return By.xpath("/html/body/div[3]/form/div[8]/label/div/select/option[2]");
    }

    private By simpanButton(){
        return By.xpath("/html/body/div[3]/div[2]/button[2]");
    }

    private By messageSuccessEditTransaction(){
        return By.xpath("/html/body/div/div[1]/div");
    }


    // =============================================TC_AW_121============================================================

    private By statusBelumBayar(){
        return By.xpath("/html/body/div[3]/form/div[8]/label/div/select/option[1]");
    }

    // ===========================================TC_AW_122=========================================================

    private By displayDataTransaction(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[3]/div/table/tbody");
    }

    // ===========================================TC_AW_123=========================================================

    private By messageDataNotAvailable(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[3]/div/table/tbody/tr/td");
    }

    // ===========================================TC_AW_124=========================================================

    private By eyesButtonOrIcon(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[3]/div/table/tbody/tr/td[9]/div/button[1]");
    }

    private void scrollRightToEyesIcon() {
        WebElementFacade element = find(eyesButtonOrIcon());
        String script = "arguments[0].scrollIntoView(true);";
        evaluateJavascript(script, element);
    }

    private By validasiDetailTransaksi(){
        return By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/h1");
    }

    // ===========================================TC_AW_127=========================================================

    private By maksimalTampilanButton(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[4]/div/div[1]/div/label/div/select");
    }
    private void scrollDown() {
        WebElementFacade element = find(numberOfPages());
        evaluateJavascript("arguments[0].scrollIntoView(true);", element);
        element.click();
    }

    private By option50Tampilan(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[4]/div/div[1]/div/label/div/select/option[2]");
    }

    private By numberOfPages(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[4]/div/div[1]/span");
    }

    private By validateTableBody(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[3]/div/table/tbody");
    }

    // ===========================================TC_AW_128=========================================================

    private By option100Tampilan(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[4]/div/div[1]/div/label/div/select/option[3]");
    }

    // ===========================================TC_AW_129=========================================================

    private By nextButtonToNextPage(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[4]/div/div[2]/div/button[9]");
    }

    private By onTheNextPage(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[4]/div/div[2]/div/button[3]");
    }

    // ===========================================TC_AW_130=========================================================

    private By backButtonToPreviousPage(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[4]/div/div[2]/div/button[1]");
    }

    private By onThePreviousPage(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[4]/div/div[2]/div/button[2]");
    }

















    //TC_AW_120 [Positive 1] - Verify success to update transaction (ID Order 1701396764-262) with status "Sudah Bayar"

    @Step
    public void clickMenuTransaction(){
        $(menuTransaksi()).click();
        waitABit(3000);
    }

    @Step
    public void waitABit(){
        waitABit(3000);
    }

    @Step
    public void inputIDToBeSearch(String searchID){
        $(searchField()).type(searchID);
    }

    @Step
    public void clickEditIcon(){
        scrollRight();
        waitABit(3000);
        $(EditIcon()).click();
        waitABit(3000);
    }

    @Step
    public void chooseStatusSudahBayar(){
        $(statusSudahBayar()).click();
        waitABit(3000);
    }

    @Step
    public void clickSimpanButton(){
        $(simpanButton()).click();
        waitABit(3000);
    }

    @Step
    public void validateSuccessEditTransaction(String successMessageEditTransaction){
        try {
            WebElement resultMessage = find(messageSuccessEditTransaction());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(successMessageEditTransaction)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + successMessageEditTransaction + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
        waitABit(3000);
    }







    //TC_AW_121 [Positive 2] - Verify success to update transaction (ID Order 1701396764-262) with status not yet paid

    @Step
    public void chooseStatusBelumBayar(){
        $(statusBelumBayar()).click();
        waitABit(3000);
    }






















    //TC_AW_122 [Positive 3] - Verify success to search transaction for Existing data


    @Step
    public void validateSuccessSearchPromoForExistingData() {
        waitABit(3000);
        List<WebElementFacade> dataItems = findAll(displayDataTransaction());
        assertThat("Search results are not empty", dataItems.size(), greaterThan(0));
        waitABit(3000);
    }








    //TC_AW_123 [Negative 1] - Verify failed to search transaction because input Non-Existent Data

    @Step
    public void validateFailedToGetResultOfSearchingTransaction(String notFoundTransaksi) {
        try {
            WebElement resultMessage = find(messageDataNotAvailable());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(notFoundTransaksi)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + notFoundTransaksi + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
        waitABit(3000);
    }















    //TC_AW_124 [Positive 4] - Verify success to see details of transaction with status "Selesai"

    @Step
    public void clickEyesButtonOrIcon(){
        scrollRightToEyesIcon();
        waitABit(3000);
        $(eyesButtonOrIcon()).click();
        waitABit(3000);
    }

    @Step
    public void validateSuccessToDisplayDetailTransaksiStatusSukses(String statusSukses){
        try {
            WebElement resultMessage = find(validasiDetailTransaksi());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(statusSukses)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + statusSukses + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }

        waitABit(3000);
    }









    //TC_AW_125 [Positive 5] - Verify success to see details of transaction in status "Tertunda"

    @Step
    public void validateSuccessToDisplayDetailTransaksiStatusPending(String statusPending){
        try {
            WebElement resultMessage = find(validasiDetailTransaksi());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(statusPending)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + statusPending + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }

        waitABit(3000);
    }











    //TC_AW_126 [Positive 6] - Verify success to see details of transaction with status "Batal"

    @Step
    public void validateSuccessToDisplayDetailTransaksiStatusBatal(String statusBatal){
        try {
            WebElement resultMessage = find(validasiDetailTransaksi());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(statusBatal)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + statusBatal + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }

        waitABit(3000);
    }





















    //TC_AW_127 [Positive 7] - Verify success to displays data with a maximum of 50 data results

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













    //TC_AW_128 [Positive 8] - Verify success to displays data with a maximum of 100 data results

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

















    //TC_AW_129 [Positive 9] - Verify success to displays the next page which also contains other transaction

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





    //TC_AW_130 [Positive 10] - Verify success to displays the previous page which also contains other transaction

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

