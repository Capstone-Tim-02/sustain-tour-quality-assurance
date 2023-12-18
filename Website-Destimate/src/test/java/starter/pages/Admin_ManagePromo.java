package starter.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.NoSuchElementException;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;


public class Admin_ManagePromo extends PageObject {

    // =============================================TC_AW_81============================================================

    private By menuPromo(){
        return By.xpath("/html/body/div/div[2]/div[1]/div[2]/nav/ul/li/ul/li[6]");
    }

    private By tambahPromoButton(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[2]/a/button");
    }

    private By judulPromoField(){
        return By.xpath("/html/body/div[1]/div[2]/div[2]/main/div/div/div[3]/form/div[1]/div[1]/div[1]/label/div/input");
    }

    private By namaPromoField(){
        return By.xpath("/html/body/div[1]/div[2]/div[2]/main/div/div/div[3]/form/div[1]/div[2]/div[1]/label/div/input");
    }

    private By kodePromoField(){
        return By.xpath("/html/body/div[1]/div[2]/div[2]/main/div/div/div[3]/form/div[1]/div[1]/div[2]/label/div/input");
    }

    private By tanggalKadaluarsaField(){
        return By.xpath("/html/body/div[1]/div[2]/div[2]/main/div/div/div[3]/form/div[1]/div[2]/div[2]/label/div/input");
    }

    private By diskonField(){
        return By.xpath("/html/body/div[1]/div[2]/div[2]/main/div/div/div[3]/form/div[1]/div[1]/div[3]/label/div/input");
    }

    private By statusField(){
        return By.xpath("/html/body/div[1]/div[2]/div[2]/main/div/div/div[3]/form/div[1]/div[1]/div[4]/label/div/div/div/div[2]");
    }

    private By statusAktif(){
        return By.xpath("/html/body/div[1]/div[2]/div[2]/main/div/div/div[3]/form/div[1]/div[1]/div[4]/label/div/div/div[2]/div/div[2]");
    }

    private By statusTidakAktif(){
        return By.xpath("/html/body/div[1]/div[2]/div[2]/main/div/div/div[3]/form/div[1]/div[1]/div[4]/label/div/div/div[2]/div/div[1]");
    }

    private By deskripsiField(){
        return By.xpath("/html/body/div[1]/div[2]/div[2]/main/div/div/div[3]/form/div[1]/div[1]/div[5]/label/div/textarea");
    }

    private By peraturanField(){
        return By.xpath("/html/body/div[1]/div[2]/div[2]/main/div/div/div[3]/form/div[1]/div[1]/div[6]/label/div/div/div[1]/div[2]/div[1]/iframe");
    }

    private By gambarPromo(){
        return By.xpath("/html/body/div[1]/div[2]/div[2]/main/div/div/div[3]/form/div[1]/div[1]/div[7]/label/div/span/div/span");
    }

    private By tambahPromoOption(){
        return By.xpath("/html/body/div[1]/div[2]/div[2]/main/div/div/div[3]/form/div[2]/button");
    }

    private By messageSuccessAddNewPromo(){
        return By.xpath("/html/body/div/div[1]/div/div/div[1]");
    }


    // =============================================TC_AW_82============================================================

    private By messageErrorJudulPromo(){
        return By.xpath("/html/body/div[1]/div[2]/div[2]/main/div/div/div[3]/form/div[1]/div[1]/div[1]/div");
    }

    // =============================================TC_AW_83============================================================

    private By messageErrorNamaPromo(){
        return By.xpath("/html/body/div[1]/div[2]/div[2]/main/div/div/div[3]/form/div[1]/div[2]/div[1]/div");
    }

    // =============================================TC_AW_84============================================================

    private By messageErrorKodePromo(){
        return By.xpath("/html/body/div[1]/div[2]/div[2]/main/div/div/div[3]/form/div[1]/div[1]/div[2]/div");
    }

    // =============================================TC_AW_85============================================================

    private By messageErrorTanggalKadaluarsa(){
        return By.xpath("/html/body/div[1]/div[2]/div[2]/main/div/div/div[3]/form/div[1]/div[2]/div[2]/div");
    }

    // =============================================TC_AW_86============================================================

    private By messageErrorDiskonPromo(){
        return By.xpath("/html/body/div[1]/div[2]/div[2]/main/div/div/div[3]/form/div[1]/div[1]/div[3]/div");
    }

    // =============================================TC_AW_87============================================================

    private By messageErrorDeskripsiPromo(){
        return By.xpath("/html/body/div[1]/div[2]/div[2]/main/div/div/div[3]/form/div[1]/div[1]/div[5]/div");
    }

    // =============================================TC_AW_88============================================================

    private By messageErrorPeraturanPromo(){
        return By.xpath("/html/body/div[1]/div[2]/div[2]/main/div/div/div[3]/form/div[1]/div[1]/div[6]/div");
    }

    // =============================================TC_AW_89============================================================

    private By messageErrorGambarPromo(){
        return By.xpath("/html/body/div[1]/div[2]/div[2]/main/div/div/div[3]/form/div[1]/div[1]/div[7]/div");
    }

    // =============================================TC_AW_94============================================================

    private By messageFailedAddNewPromo(){
        return By.xpath("/html/body/div[1]/div[1]/div/div/div[1]");
    }

    // ===========================================TC_AW_104=========================================================

    private By searchField(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[2]/div/label/div/input");
    }

    private By EditIcon(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[3]/div/table/tbody/tr/td[7]/div/a");
    }

    private void scrollRight() {
        WebElementFacade element = find(EditIcon());
        String script = "arguments[0].scrollIntoView(true);";
        evaluateJavascript(script, element);
    }

    private By simpanButton(){
        return By.xpath("/html/body/div[1]/div[2]/div[2]/main/div/div/div[3]/form/div[2]/button");
    }

    private By messageSuccessEditPromo(){
        return By.xpath("/html/body/div/div[1]/div");
    }


    // ===========================================TC_AW_108=========================================================

    private By DeleteIcon(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[3]/div/table/tbody/tr/td[7]/div/button");
    }

    private void scrollRightToDeleteButton() {
        WebElementFacade element = find(DeleteIcon());
        String script = "arguments[0].scrollIntoView(true);";
        evaluateJavascript(script, element);
    }

    private By HapusButton(){
        return By.xpath("/html/body/div[3]/div[2]/button[2]");
    }

    private By messageSuccessDeletePromo(){
        return By.xpath("/html/body/div/div[1]/div/div/div[1]");
    }


    // ===========================================TC_AW_109=========================================================

    private By CancelDeleteOption(){
        return By.xpath("/html/body/div[3]/div[2]/button[1]");
    }

    private By displayDataPromoNEWYEAR2024(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[3]/div/table/tbody");
    }

    // ===========================================TC_AW_110=========================================================

    private By displayDataPromoNovember(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[3]/div/table/tbody");
    }

    // ===========================================TC_AW_111=========================================================

    private By messageDataNotAvailable(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[3]/div/table/tbody/tr/td");
    }

    // ===========================================TC_AW_112=========================================================

    private By iconVirtualAssistant(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[1]/div[2]/a");
    }

    private By inputQuestionsInFieldVirtualAssistant(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[3]/div/div[2]/form/div/textarea");
    }

    private By submitButtonVirtualAssistant(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[3]/div/div[2]/form/div/button");
    }

    private By validateSuccessGetAnswer(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[3]/div/div[2]/div/div[1]/div[2]");
    }


    // ===========================================TC_AW_113=========================================================

    private By messageError(){
        return By.xpath("/html/body/div/div[1]/div/div/div[1]");
    }


    // ===========================================TC_AW_115=========================================================

    private By reloadButtonVirtualAssistant(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[3]/div/div[2]/form/div/div");
    }

    private By successReloadQuestion(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[3]/div/div[2]/div/div[1]/div[2]/h2");
    }

    // ===========================================TC_AW_116=========================================================

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

    // ===========================================TC_AW_117=========================================================

    private By option100Tampilan(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[4]/div/div[1]/div/label/div/select/option[3]");
    }

    // ===========================================TC_AW_118=========================================================

    private By nextButtonToNextPage(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[4]/div/div[2]/div/button[3]");
    }

    private By onTheNextPage(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[4]/div/div[2]/div/button[2]");
    }

    // ===========================================TC_AW_119=========================================================

    private By backButtonToPreviousPage(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[4]/div/div[2]/div/button[1]");
    }

    private By onThePreviousPage(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[4]/div/div[2]/div/button[2]");
    }


































    //TC_AW_81 [Positive 1] - Verify success to create a new promo with valid data

    @Step
    public void clickMenuPromo(){
        $(menuPromo()).click();
        waitABit(3000);
    }


    @Step
    public void clickTambahPromoButton(){
        $(tambahPromoButton()).click();
        waitABit(3000);
    }

    @Step
    public void inputValidJudulPromo(String validJudulPromo){
        $(judulPromoField()).type(validJudulPromo);
    }

    @Step
    public void inputValidNamaPromo(String validNamaPromo){
        $(namaPromoField()).type(validNamaPromo);
    }

    @Step
    public void inputValidKodePromo(String validKodePromo){
        $(kodePromoField()).type(validKodePromo);
    }

    @Step
    public void inputValidTanggalKadaluarsa(String validTanggalKadaluarsa){
        $(tanggalKadaluarsaField()).type(validTanggalKadaluarsa);
    }

    @Step
    public void inputValidDiskon(String validDiskon){
        $(diskonField()).type(validDiskon);
    }

    @Step
    public void chooseStatusAktif(){
        $(statusField()).click();
        $(statusAktif()).click();
    }

    @Step
    public void inputValidDeskripsi(String validDeskripsi){
        $(deskripsiField()).type(validDeskripsi);
    }

    @Step
    public void inputValidPeraturan(String validPeraturan){
        // Temukan elemen iframe menggunakan locator
        WebElement iframeElement = getDriver().findElement(peraturanField());

        // Switch ke dalam iframe
        getDriver().switchTo().frame(iframeElement);

        try {
            // Temukan elemen textarea di dalam TinyMCE dan kirim teks
            WebElement textareaElement = getDriver().findElement(By.id("tinymce"));
            textareaElement.clear();  // Bersihkan teks yang ada
            textareaElement.sendKeys(validPeraturan);

            // Kembali ke default content (keluar dari iframe)
            getDriver().switchTo().defaultContent();
        } catch (Exception e) {
            e.printStackTrace();
            // Handle exception jika diperlukan
        }
    }


    // Method to perform drag and drop
    private void performDragAndDrop(By source, By target) {
        WebElement sourceElement = getDriver().findElement(source);
        WebElement targetElement = getDriver().findElement(target);

        Actions actions = new Actions(getDriver());
        actions.dragAndDrop(sourceElement, targetElement).build().perform();
    }

    private static void setClipboardData(String pathfile){
        StringSelection stringSelection = new StringSelection(pathfile);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
    }

    @Step
    public void uploadGambarPromo(String imagePath) {
        // Drag and drop Gambar
        By fileInputField = By.xpath("/html/body/div[1]/div[2]/div[2]/main/div/div/div[3]/form/div[1]/div[1]/div[7]/label/div/span/div/span");

        WebElement fileInput = find(fileInputField);
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].style.display='block';", fileInput);
        fileInput.sendKeys(imagePath);

        try {

            Robot robot = new Robot();
            robot.delay(1000);


            // Set clipboard data for Gambar
            performDragAndDrop(fileInputField, gambarPromo());
            setClipboardData(imagePath);
            pasteAndEnter(robot);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Method to paste clipboard content and press Enter
    private void pasteAndEnter(Robot robot) {
        robot.delay(1000);

        // Paste clipboard content into the dialog
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        robot.delay(1000);

        // Press Enter to confirm the file upload
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        waitABit(3000);
    }




    @Step
    public void clickTambahPromoOption(){
        $(tambahPromoOption()).click();
        waitABit(3000);
    }

    @Step
    public void validateSuccessAddNewPromoWithValidData(String successMessageAddPromo){
        try {
            WebElement resultMessage = find(messageSuccessAddNewPromo());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(successMessageAddPromo)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + successMessageAddPromo + "'");
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
        waitABit(3000);
    }










    //TC_AW_82 [Negative 1] - Verify failed to create a new promo because did not input Judul Promo

    @Step
    public void validateFailedAddNewPromoBecauseEmptyJudulPromo(String failedMessageBecauseEmptyJudulPromo){
        try {
            WebElement resultMessage = find(messageErrorJudulPromo());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(failedMessageBecauseEmptyJudulPromo)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + failedMessageBecauseEmptyJudulPromo + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }






    //TC_AW_83 [Negative 2] - Verify failed to create a new promo because did not input Nama Promo

    @Step
    public void validateFailedAddNewPromoBecauseEmptyNamaPromo(String failedMessageBecauseEmptyNamaPromo){
        try {
            WebElement resultMessage = find(messageErrorNamaPromo());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(failedMessageBecauseEmptyNamaPromo)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + failedMessageBecauseEmptyNamaPromo + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }









    //TC_AW_84 [Negative 3] - Verify failed to create a new promo because did not input Kode Promo

    @Step
    public void validateFailedAddNewPromoBecauseEmptyKodePromo(String failedMessageBecauseEmptyKodePromo){
        try {
            WebElement resultMessage = find(messageErrorKodePromo());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(failedMessageBecauseEmptyKodePromo)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + failedMessageBecauseEmptyKodePromo + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }








    //TC_AW_85 [Negative 4] - Verify failed to create a new promo because did not input Tanggal Kadaluarsa

    @Step
    public void validateFailedAddNewPromoBecauseEmptyTanggalKadaluarsa(String failedMessageBecauseEmptyTanggalKadaluarsa){
        try {
            WebElement resultMessage = find(messageErrorTanggalKadaluarsa());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(failedMessageBecauseEmptyTanggalKadaluarsa)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + failedMessageBecauseEmptyTanggalKadaluarsa + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }







    //TC_AW_86 [Negative 5] - Verify failed to create a new promo because did not input Diskon

    @Step
    public void validateFailedAddNewPromoBecauseEmptyDiskon(String failedMessageBecauseEmptyDiskon){
        try {
            WebElement resultMessage = find(messageErrorDiskonPromo());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(failedMessageBecauseEmptyDiskon)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + failedMessageBecauseEmptyDiskon + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }







    //TC_AW_87 [Negative 6] - Verify failed to create a new promo because did not input Deskripsi

    @Step
    public void validateFailedAddNewPromoBecauseEmptyDeskripsi(String failedMessageBecauseEmptyDeskripsi){
        try {
            WebElement resultMessage = find(messageErrorDeskripsiPromo());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(failedMessageBecauseEmptyDeskripsi)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + failedMessageBecauseEmptyDeskripsi + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }








    //TC_AW_88 [Negative 7] - Verify failed to create a new promo because did not input "Peraturan"

    @Step
    public void validateFailedAddNewPromoBecauseEmptyPeraturan(String failedMessageBecauseEmptyPeraturan){
        try {
            WebElement resultMessage = find(messageErrorPeraturanPromo());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(failedMessageBecauseEmptyPeraturan)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + failedMessageBecauseEmptyPeraturan + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }








    //TC_AW_89 [Negative 8] - Verify failed to create a new promo because did not input "Gambar Promo"

    @Step
    public void validateFailedAddNewPromoBecauseEmptyGambarPromo(String failedMessageBecauseEmptyGambarPromo){
        try {
            WebElement resultMessage = find(messageErrorGambarPromo());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(failedMessageBecauseEmptyGambarPromo)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + failedMessageBecauseEmptyGambarPromo + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }








    //TC_AW_90 [Negative 9] - Verify failed to create a new promo because input invalid "Judul Promo"

    @Step
    public void validateFailedAddNewPromoBecauseInvalidJudulPromo(String failedMessageBecauseInvalidJudulPromo){
        try {
            WebElement resultMessage = find(messageErrorJudulPromo());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(failedMessageBecauseInvalidJudulPromo)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + failedMessageBecauseInvalidJudulPromo+ "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }








    //TC_AW_91 [Negative 10] - Verify failed to create a new promo because input invalid "Nama Promo"

    @Step
    public void validateFailedAddNewPromoBecauseInvalidNamaPromo(String failedMessageBecauseInvalidNamaPromo){
        try {
            WebElement resultMessage = find(messageErrorNamaPromo());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(failedMessageBecauseInvalidNamaPromo)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + failedMessageBecauseInvalidNamaPromo + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }








    //TC_AW_92 [Negative 11] - Verify failed to create a new promo because input invalid "Kode Promo" with 2 character

    @Step
    public void validateFailedAddNewPromoBecauseInvalidKodePromoWith2Character(String failedMessageBecauseInvalidKodePromoWith2Character){
        try {
            WebElement resultMessage = find(messageErrorKodePromo());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(failedMessageBecauseInvalidKodePromoWith2Character)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + failedMessageBecauseInvalidKodePromoWith2Character + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }








    //TC_AW_93 [Negative 12] - Verify failed to create a new promo because input invalid "Kode Promo" which has a very long promo code

    @Step
    public void validateFailedAddNewPromoBecauseInvalidKodePromoWhichVeryLong(String failedMessageBecauseInvalidKodePromoWichVeryLong){
        try {
            WebElement resultMessage = find(messageErrorKodePromo());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(failedMessageBecauseInvalidKodePromoWichVeryLong)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + failedMessageBecauseInvalidKodePromoWichVeryLong + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }







    //TC_AW_94 [Negative 13] - Verify failed to create a new promo because input invalid "Tanggal Kadaluarsa" where to input the date that has already passed

    @Step
    public void validateFailedAddNewPromoBecauseInvalidTanggalKadaluarsa(String failedMessageBecauseInvalidTanggalKadaluarsa){
        try {
            WebElement resultMessage = find(messageFailedAddNewPromo());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(failedMessageBecauseInvalidTanggalKadaluarsa)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + failedMessageBecauseInvalidTanggalKadaluarsa + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }






    //TC_AW_95 [Negative 14] - Verify failed to create a new promo because input invalid "Diskon" with a discount of 0%

    @Step
    public void validateFailedAddNewPromoBecauseInvalidDiskonWith0(String failedMessageBecauseInvalidDiskonWith0){
        try {
            WebElement resultMessage = find(messageErrorDiskonPromo());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(failedMessageBecauseInvalidDiskonWith0)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + failedMessageBecauseInvalidDiskonWith0 + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }








    //TC_AW_96 [Negative 15] - Verify failed to create a new promo because input invalid "Diskon" with a discount of more than 100%

    @Step
    public void validateFailedAddNewPromoBecauseInvalidDiskonMoreThan100(String failedMessageBecauseInvalidDiskonMoreThan100){
        try {
            WebElement resultMessage = find(messageErrorDiskonPromo());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(failedMessageBecauseInvalidDiskonMoreThan100)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + failedMessageBecauseInvalidDiskonMoreThan100 + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }








    //TC_AW_97 [Positive 2] - Verify success to create a new promo even though select status "Tidak Aktif"

    @Step
    public void chooseStatusTidakAktif(){
        $(statusField()).click();
        $(statusTidakAktif()).click();
    }

    @Step
    public void validateSuccessAddNewPromoEvenThoughSelectStatusTidakAktif(String successMessageAddPromo){
        try {
            WebElement resultMessage = find(messageSuccessAddNewPromo());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(successMessageAddPromo)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + successMessageAddPromo + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }















    //TC_AW_98 [Negative 16] - Verify failed to create a new promo because input invalid "Description"

    @Step
    public void validateFailedAddNewPromoBecauseInvalidDescription(String failedMessageBecauseInvalidDescription){
        try {
            WebElement resultMessage = find(messageErrorDeskripsiPromo());

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
    }









    //TC_AW_99 [Negative 17] - Verify failed to create a new promo because input invalid "Peraturan"

    @Step
    public void validateFailedAddNewPromoBecauseInvalidPeraturan(String failedMessageBecauseInvalidPeraturan){
        try {
            WebElement resultMessage = find(messageErrorPeraturanPromo());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(failedMessageBecauseInvalidPeraturan)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + failedMessageBecauseInvalidPeraturan + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }






    //TC_AW_100 [Negative 18] - Verify failed to create a new promo because input invalid "Gambar Promo"

    @Step
    public void validateFailedAddNewPromoBecauseInvalidGambarPromo(String failedMessageBecauseInvalidGambarPromo){
        try {
            WebElement resultMessage = find(messageErrorGambarPromo());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(failedMessageBecauseInvalidGambarPromo)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + failedMessageBecauseInvalidGambarPromo + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }






    //TC_AW_101 [Negative 19] - Verify failed to create a new promo because input name of the promo that had already been registered

    @Step
    public void validateFailedAddNewPromoBecauseNameAlreadyRegistered(String failedMessageBecauseNameAlreadyRegistered){
        try {
            WebElement resultMessage = find(messageFailedAddNewPromo());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(failedMessageBecauseNameAlreadyRegistered)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + failedMessageBecauseNameAlreadyRegistered + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }






    //TC_AW_102 [Negative 20] - Verify failed to create a new promo because input kode of the promo that had already been registered

    @Step
    public void validateFailedAddNewPromoBecauseKodeAlreadyRegistered(String failedMessageBecauseKodeAlreadyRegistered){
        try {
            WebElement resultMessage = find(messageFailedAddNewPromo());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(failedMessageBecauseKodeAlreadyRegistered)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + failedMessageBecauseKodeAlreadyRegistered + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }






    //TC_AW_103 [Negative 21] - Verify failed to create a new promo because input title of the promo that had already been registered

    @Step
    public void validateFailedAddNewPromoBecauseTitleAlreadyRegistered(String failedMessageBecauseTitleAlreadyRegistered){
        try {
            WebElement resultMessage = find(messageFailedAddNewPromo());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(failedMessageBecauseTitleAlreadyRegistered)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + failedMessageBecauseTitleAlreadyRegistered + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }























    //TC_AW_104 [Positive 3] - Verify success to update promo "NEWYEAR2024" with valid data

    @Step
    public void inputNameToBeSearch(String searchName){
        $(searchField()).type(searchName);
    }

    @Step
    public void clickEditIcon(){
        scrollRight();
        waitABit(3000);
        $(EditIcon()).click();
        waitABit(3000);
    }

    @Step
    public void clickSimpanButton(){
        $(simpanButton()).click();
        waitABit(3000);
    }

    @Step
    public void validateSuccessEditPromoWithValidData(String successMessageEditPromo){
        try {
            WebElement resultMessage = find(messageSuccessEditPromo());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(successMessageEditPromo)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + successMessageEditPromo + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }














    //TC_AW_105 [Negative 22] - Verify failed to update promo "Relaxation Retreat" because input invalid "Diskon"

    @Step
    public void validateFailedEditPromoBecauseInvalidDiskonWith200(String failedMessageBecauseInvalidDiskonWith200){
        try {
            WebElement resultMessage = find(messageErrorDiskonPromo());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(failedMessageBecauseInvalidDiskonWith200)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + failedMessageBecauseInvalidDiskonWith200 + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }








    //TC_AW_107 [Negative 23] - Verify failed to update promo "Relaxation Retreat" because drag file.pdf to form

    @Step
    public void validateFailedEditPromoBecauseDragFilePDF(String failedMessageBecauseDragFilePDF){
        try {
            WebElement resultMessage = find(messageErrorGambarPromo());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(failedMessageBecauseDragFilePDF)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + failedMessageBecauseDragFilePDF + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }





















    //TC_AW_108 [Positive 5] - Verify success to delete promo

    @Step
    public void inputNameInSearchField(String searchName){
        $(searchField()).type(searchName);
        waitABit(3000);
    }

    @Step
    public void clickDeleteIcon(){
        scrollRightToDeleteButton();
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
    public void validateSuccessDeleteDestination(String successMessageDeletePromo){
        try {
            WebElement resultMessage = find(messageSuccessDeletePromo());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(successMessageDeletePromo)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + successMessageDeletePromo + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }












    //TC_AW_109 [Positive 6] - Verify success cancel to delete promo

    @Step
    public void clickCancelButton(){$(CancelDeleteOption()).click();
    }

    @Step
    public void validateSuccessCancelDeletePromo() {
        $(displayDataPromoNEWYEAR2024()).isDisplayed();
    }









    //TC_AW_110 [Positive 7] - Verify success to search promo for Existing in the table data promo

    @Step
    public void validateSuccessSearchPromoForExistingData() {
        waitABit(3000);
        List<WebElementFacade> dataItems = findAll(displayDataPromoNovember());
        assertThat("Search results are not empty", dataItems.size(), greaterThan(0));
        waitABit(3000);
    }






    //TC_AW_111 [Negative 24] - Verify failed to search promo because input Non-Existent in the table data promo


    @Step
    public void validateFailedToGetResultOfSearchingPromo(String notFoundPromo) {
        try {
            WebElement resultMessage = find(messageDataNotAvailable());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(notFoundPromo)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + notFoundPromo + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }




















    //TC_AW_112 [Positive 8] - Verify success to ask in virtual assistant with valid question where related about promo

    @Step
    public void clickIconVirtualAssistant(){$(iconVirtualAssistant()).click();
    }

    @Step
    public void inputQuestionInFieldVirtualAssistant(String validQuestions){
        $(inputQuestionsInFieldVirtualAssistant()).type(validQuestions);
        waitABit(3000);
    }

    @Step
    public void clickSendButtonVirtualAssistant(){$(submitButtonVirtualAssistant()).click();
    }

    @Step
    public void ValidateSuccessGetAnswerInVirtualAssistantPromo(){

        waitABit(55000);

        waitForCondition().until(ExpectedConditions.presenceOfElementLocated(validateSuccessGetAnswer()));

        String expectedResponse = "promo";

        WebElement asistenVirtualGetAnswer = find(validateSuccessGetAnswer());
        String actualResponse = asistenVirtualGetAnswer.getText();

        // Menggunakan assertion untuk memeriksa kesesuaian antara expected dan actual
        Assert.assertTrue("Jawaban tidak sesuai dengan yang diharapkan!", actualResponse.contains(expectedResponse));
        System.out.println("Jawaban sesuai dengan yang diharapkan!");
    }
















    //TC_AW_113 [Negative 25] - Verify failed to ask in virtual assistant because did not input question

    @Step
    public void validateFailedGetAnswerInVirtualAssistant(String failedMessageBecauseEmptyQuestion){
        try {
            WebElement resultMessage = find(messageError());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(failedMessageBecauseEmptyQuestion)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + failedMessageBecauseEmptyQuestion + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }













    //TC_AW_115 [Positive 9] - Verify success to clear history of questions that have been asked successfully

    @Step
    public void clickReloadButtonVirtualAssistant(){$(reloadButtonVirtualAssistant()).click();
    }

    @Step
    public void validateSuccessReloadQuestionInVirtualAssistant(String successReload){
        try {
            WebElement resultMessage = find(successReloadQuestion());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(successReload)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + successReload + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }





















    //TC_AW_116 [Positive 10] - Verify success to displays data with a maximum of 50 data results

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













    //TC_AW_117 [Positive 11] - Verify success to displays data with a maximum of 100 data results

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

















    //TC_AW_118 [Positive 12] - Verify success to displays the next page which also contains other promo

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
        waitABit(5000);
        $(onTheNextPage()).getText();
        waitABit(3000);
    }





    //TC_AW_119 [Positive 13] - Verify success to displays the previous page which also contains other promo

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
        waitABit(5000);
        $(onThePreviousPage()).getText();
        waitABit(3000);
    }






}
