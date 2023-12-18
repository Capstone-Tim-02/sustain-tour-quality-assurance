package starter.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.NoSuchElementException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;


public class Admin_ManageDestinationContents extends PageObject {

    // =============================================TC_AW_48============================================================

    private By menuDestinasi(){
        return By.xpath("/html/body/div/div[2]/div[1]/div[2]/nav/ul/li/ul/li[5]");
    }

    private By tambahDestinasiButton(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[2]/a/button");
    }

    private By destinasiKodeField(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[3]/form/div[1]/div[1]/div[1]/label/div/input");
    }

    private By namaDestinasiField(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[3]/form/div[1]/div[2]/div[1]/label/div/input");
    }

    private By lokasiKotaField(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[3]/form/div[1]/div[1]/div[2]/label/div/input");
    }

    private By urlPetaField(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[3]/form/div[1]/div[2]/div[2]/label/div/input");
    }

    private By alamatField(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[3]/form/div[1]/div[1]/div[3]/label/div/textarea");
    }

    private By latitudePetaField(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[3]/form/div[1]/div[2]/div[3]/label/div/input");
    }

    private By LongitudePetaField(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[3]/form/div[1]/div[2]/div[4]/label/div/input");
    }

    private By statusOpen(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[3]/form/div[1]/div[1]/div[4]/label/div/div/div[1]/div/input");
    }

    private By deskripsiStatusField(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[3]/form/div[1]/div[1]/div[5]/label/div/input");
    }

    private By urlVideoField(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[3]/form/div[1]/div[2]/div[5]/label/div/input");
    }

    private By kategoriField(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[3]/form/div[1]/div[1]/div[6]/label/div/div");
    }

    private By optionKategoriWisataAlam(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[3]/form/div[1]/div[1]/div[6]/label/div/div/div[2]/div/div[1]");
    }

    private By fasilitasLokalField(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[3]/form/div[1]/div[1]/div[7]/label/div/input");
    }

    private By highlightField(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[3]/form/div[1]/div[1]/div[8]/label/div/textarea");
    }

    private By jumlahStokTiketField(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[3]/form/div[1]/div[1]/div[9]/label/div/input");
    }

    private By hargaTiketField(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[3]/form/div[1]/div[1]/div[10]/label/div/input");
    }

    private By gambarDestinasi1(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[3]/form/div[1]/div[1]/div[11]/label/div/div/div/div[1]/div[1]/span/div/span");
    }

    private By gambarDestinasi2(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[3]/form/div[1]/div[1]/div[11]/label/div/div/div/div[1]/div[2]/span/div/span");
    }

    private By gambarDestinasi3(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[3]/form/div[1]/div[1]/div[11]/label/div/div/div/div[1]/div[3]/span/div/span");
    }

    private By tambahDestinasiOption(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[3]/form/div[2]/button");
    }

    private By messageSuccessAddNewDestination(){
        return By.xpath("/html/body/div/div[1]/div/div/div[1]");
    }

    // =============================================TC_AW_49============================================================

    private By messageEmptyDestinasiKode(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[3]/form/div[1]/div[1]/div[1]/div");
    }

    // =============================================TC_AW_50============================================================

    private By messageEmptyNamaDestinasi(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[3]/form/div[1]/div[2]/div[1]/div");
    }

    // =============================================TC_AW_51============================================================

    private By messageEmptyLokasiKota(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[3]/form/div[1]/div[1]/div[2]/div");
    }

    // =============================================TC_AW_52============================================================

    private By messageEmptyURLPeta(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[3]/form/div[1]/div[2]/div[2]/div");
    }

    // =============================================TC_AW_53============================================================

    private By messageEmptyAlamat(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[3]/form/div[1]/div[1]/div[3]/div");
    }

    // =============================================TC_AW_54============================================================

    private By messageEmptyLatitudePeta(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[3]/form/div[1]/div[2]/div[3]/div");
    }

    // =============================================TC_AW_55============================================================

    private By messageEmptyLongitudePeta(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[3]/form/div[1]/div[2]/div[4]/div");
    }

    // =============================================TC_AW_56============================================================


    private By messageEmptyHighlight(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[3]/form/div[1]/div[1]/div[8]/div");
    }

    // =============================================TC_AW_57============================================================

    private By messageEmptyJumlahStokTiket(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[3]/form/div[1]/div[1]/div[9]/div");
    }

    // =============================================TC_AW_58============================================================

    private By messageEmptyHargaTiket(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[3]/form/div[1]/div[1]/div[10]/div");
    }

    // =============================================TC_AW_59============================================================

    private By messageEmptyStatus(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[3]/form/div[1]/div[1]/div[4]/div");
    }


    private By messageEmptyDeskripsiStatus(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[3]/form/div[1]/div[1]/div[5]/div");
    }

    // =============================================TC_AW_60============================================================

    private By messageEmptyKategori(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[3]/form/div[1]/div[1]/div[6]/div");
    }

    private By messageEmptyFasilitasLokal(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[3]/form/div[1]/div[1]/div[7]/div");
    }


    // =============================================TC_AW_61============================================================

    private By messageEmptyGambarDestinasi(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[3]/form/div[1]/div[1]/div[11]/div");
    }

    // ===========================================TC_AW_62=========================================================

    private By searchField(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[2]/div/label/div/input");
    }

    private By EditIcon(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[3]/div/table/tbody/tr[1]/td[6]/div/a");
    }

    private By statusClose(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[3]/form/div[1]/div[1]/div[4]/label/div/div/div[2]/div/input");
    }

    private By simpanButton(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[3]/form/div[2]/button");
    }

    private By messageSuccessEditDestination(){
        return By.xpath("/html/body/div/div[1]/div");
    }


    // ===========================================TC_AW_63=========================================================

    private By messageInvalidDestinasiKode(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[3]/form/div[1]/div[1]/div[1]/div");
    }

    // ===========================================TC_AW_64=========================================================

    private By messageInvalidNamaDestinasi(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[3]/form/div[1]/div[2]/div[1]/div");
    }

    // ===========================================TC_AW_65=========================================================

    private By messageInvalidLokasiKota(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[3]/form/div[1]/div[1]/div[2]/div");
    }

    // ===========================================TC_AW_66=========================================================

    private By messageInvalidURLPeta(){
        return By.xpath("/html/body/div/div[1]/div/div/div[1]");
    }

    // ===========================================TC_AW_67=========================================================

    private By messageInvalidAlamat(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[3]/form/div[1]/div[1]/div[3]/div");
    }

    // ===========================================TC_AW_68=========================================================

    private By messageInvalidLatitudePeta(){
        return By.xpath("/html/body/div/div[1]/div/div/div[1]");
    }

    // ===========================================TC_AW_69=========================================================

    private By messageInvalidLongitudePeta(){
        return By.xpath("/html/body/div[1]/div[1]/div/div/div[1]");
    }

    // ===========================================TC_AW_70=========================================================

    private By messageInvalidJumlahStokTiket(){
        return By.xpath("/html/body/div[1]/div[2]/div[2]/main/div/div/div[3]/form/div[1]/div[1]/div[9]/div");
    }

    // ===========================================TC_AW_71=========================================================

    private By messageInvalidHargaTiket(){
        return By.xpath("/html/body/div[1]/div[2]/div[2]/main/div/div/div[3]/form/div[1]/div[1]/div[10]/div");
    }

    // ===========================================TC_AW_72=========================================================

    private By DeleteIcon(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[3]/div/table/tbody/tr[1]/td[6]/div/button[2]");
    }

    private By HapusButton(){
        return By.xpath("/html/body/div[3]/div[2]/button[2]");
    }

    private By messageSuccessDeleteDestination(){
        return By.xpath("/html/body/div/div[1]/div/div/div[1]");
    }

    // ===========================================TC_AW_73=========================================================

    private By cancelButton(){
        return By.xpath("/html/body/div[3]/div[2]/button[1]");
    }

    private By displayDataDestination(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[3]/div/table/tbody/tr");
    }

    // ===========================================TC_AW_74=========================================================

    private By validateTableBody(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[3]/div/table/tbody");
    }

    // ===========================================TC_AW_75=========================================================

    private By messageDataNotAvailable(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[3]/div/table/tbody/tr/td");
    }

    // ===========================================TC_AW_76=========================================================

    private void scrollRight() {
        WebElementFacade element = find(eyesButtonOrIcon());
        String script = "arguments[0].scrollIntoView(true);";
        evaluateJavascript(script, element);
    }
    private By eyesButtonOrIcon(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[3]/div/table/tbody/tr/td[6]/div/button[1]");
    }

    private By validasiDetailDestination(){
        return By.xpath("/html/body/div[3]/div[2]/div[2]/div[2]/h1");
    }

    // ===========================================TC_AW_77=========================================================

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

    // ===========================================TC_AW_78=========================================================

    private By option100Tampilan(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[4]/div/div[1]/div/label/div/select/option[3]");
    }

    // ===========================================TC_AW_79=========================================================

    private By nextButtonToNextPage(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[4]/div/div[2]/div/button[4]");
    }

    private By onTheNextPage(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[4]/div/div[2]/div/button[3]");
    }

    // ===========================================TC_AW_80=========================================================

    private By backButtonToPreviousPage(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[4]/div/div[2]/div/button[1]");
    }

    private By onThePreviousPage(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[4]/div/div[2]/div/button[2]");
    }












    //TC_AW_48 [Positive 1] - Verify success to create a new category with valid name of category

    @Step
    public void clickMenuCategory(){
        $(menuDestinasi()).click();
        waitABit(3000);
    }

    @Step
    public void clickTambahDestinasiButton(){
        $(tambahDestinasiButton()).click();
        waitABit(3000);
    }

    @Step
    public void inputValidDestinasiKode(String validDestinasiKode){
        $(destinasiKodeField()).type(validDestinasiKode);
    }

    @Step
    public void inputValidNamaDestinasi(String validNamaDestinasi){
        $(namaDestinasiField()).type(validNamaDestinasi);
    }

    @Step
    public void inputValidLokasiKota(String validLokasiKota){
        $(lokasiKotaField()).type(validLokasiKota);
    }

    @Step
    public void inputValidURLPeta(String validURLPeta){
        $(urlPetaField()).type(validURLPeta);
    }

    @Step
    public void inputValidAlamat(String validAlamat){
        $(alamatField()).type(validAlamat);
    }

    @Step
    public void inputValidLatitudePeta(String validLatitudePeta){
        $(latitudePetaField()).type(validLatitudePeta);
    }

    @Step
    public void inputValidLongitudePeta(String validLongitudePeta){
        $(LongitudePetaField()).type(validLongitudePeta);
    }

    @Step
    public void chooseStatusDestination(){
        $(statusOpen()).click();
    }

    @Step
    public void inputDeskripsiForStatus(String deskripsiStatus){
        $(deskripsiStatusField()).type(deskripsiStatus);
    }

    @Step
    public void inputURLVideo(String urlVideo){
        $(urlVideoField()).type(urlVideo);
    }

    @Step
    public void chooseKategori(){
        $(kategoriField()).click();
        $(optionKategoriWisataAlam()).click();
    }

    @Step
    public void inputFasilitasLokal(String fasilitasLokal){
        $(fasilitasLokalField()).type(fasilitasLokal);
    }

    @Step
    public void inputHighlight(String highlight){
        $(highlightField()).type(highlight);
    }

    @Step
    public void inputJumlahStokTiket(String jumlahStokTiket){
        $(jumlahStokTiketField()).type(jumlahStokTiket);
    }

    @Step
    public void inputHargaTiket(String hargaTiket){
        $(hargaTiketField()).type(hargaTiket);
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
    public void uploadGambarDestinasi(String imagePath1,String imagePath2, String imagePath3) {
        // Drag and drop Gambar 1
        By fileInputField1 = By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[3]/form/div[1]/div[1]/div[11]/label/div/div/div/div[1]/div[1]/span/div/span");

        WebElement fileInput1 = find(fileInputField1);
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].style.display='block';", fileInput1);
        fileInput1.sendKeys(imagePath1);

        // Drag and drop Gambar 2
        By fileInputField2 = By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[3]/form/div[1]/div[1]/div[11]/label/div/div/div/div[1]/div[2]/span/div/span");

        WebElement fileInput2 = find(fileInputField2);
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].style.display='block';", fileInput2);
        fileInput2.sendKeys(imagePath2);


        // Drag and drop Gambar 3
        By fileInputField3 = By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[3]/form/div[1]/div[1]/div[11]/label/div/div/div/div[1]/div[3]/span/div/span");

        WebElement fileInput3 = find(fileInputField3);
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].style.display='block';", fileInput3);
        fileInput3.sendKeys(imagePath3);



        try {

            Robot robot = new Robot();
            robot.delay(1000);


            // Set clipboard data for Gambar 1
            performDragAndDrop(fileInputField1, gambarDestinasi1());
            setClipboardData(imagePath1);
            pasteAndEnter(robot);

            // Ulangi langkah di atas untuk Gambar 2 dan Gambar 3
            performDragAndDrop(fileInputField2, gambarDestinasi2());
            setClipboardData(imagePath2);
            pasteAndEnter(robot);

            performDragAndDrop(fileInputField3, gambarDestinasi3());
            setClipboardData(imagePath3);
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
    public void clickTambahDestinasiOption(){
        $(tambahDestinasiOption()).click();
        waitABit(3000);
    }

    @Step
    public void validateSuccessAddNewDestinationWithValidData(String successMessageAddDestination){
        try {
            WebElement resultMessage = find(messageSuccessAddNewDestination());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(successMessageAddDestination)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + successMessageAddDestination + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }



    //TC_AW_49 [Negative 1] - Verify failed to create a new destination because did not input Destinasi Kode

    @Step
    public void validateFailedAddNewDestinationWBecauseEmptyDestinasiKode(String failedMessageBecauseEmptyDestinasiKode){
        try {
            WebElement resultMessage = find(messageEmptyDestinasiKode());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(failedMessageBecauseEmptyDestinasiKode)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + failedMessageBecauseEmptyDestinasiKode + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }




    //TC_AW_50 [Negative 2] - Verify failed to create a new destination because did not input "Nama Destinasi"

    @Step
    public void validateFailedAddNewDestinationWBecauseEmptyNamaDestinasi(String failedMessageBecauseEmptyNamaDestinasi){
        try {
            WebElement resultMessage = find(messageEmptyNamaDestinasi());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(failedMessageBecauseEmptyNamaDestinasi)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + failedMessageBecauseEmptyNamaDestinasi + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }



    //TC_AW_51 [Negative 3] - Verify failed to create a new destination because did not input "Lokasi Kota"

    @Step
    public void validateFailedAddNewDestinationWBecauseEmptyLokasiKota(String failedMessageBecauseEmptyLokasiKota){
        try {
            WebElement resultMessage = find(messageEmptyLokasiKota());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(failedMessageBecauseEmptyLokasiKota)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + failedMessageBecauseEmptyLokasiKota + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }




    //TC_AW_52 [Negative 4] - Verify failed to create a new destination because did not input "Alamat Peta"

    @Step
    public void validateFailedAddNewDestinationWBecauseEmptyAlamatPeta(String failedMessageBecauseEmptyAlamatPeta){
        try {
            WebElement resultMessage = find(messageEmptyURLPeta());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(failedMessageBecauseEmptyAlamatPeta)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + failedMessageBecauseEmptyAlamatPeta + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }




    //TC_AW_53 [Negative 5] - Verify failed to create a new destination because did not input "Alamat"

    @Step
    public void validateFailedAddNewDestinationWBecauseEmptyAlamat(String failedMessageBecauseEmptyAlamat){
        try {
            WebElement resultMessage = find(messageEmptyAlamat());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(failedMessageBecauseEmptyAlamat)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + failedMessageBecauseEmptyAlamat + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }



    //TC_AW_54 [Negative 6] - Verify failed to create a new destination because did not input "Latitute Peta"

    @Step
    public void validateFailedAddNewDestinationWBecauseEmptyLatitudePeta(String failedMessageBecauseEmptyLatitudePeta){
        try {
            WebElement resultMessage = find(messageEmptyLatitudePeta());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(failedMessageBecauseEmptyLatitudePeta)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + failedMessageBecauseEmptyLatitudePeta + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }




    //TC_AW_55 [Negative 7] - Verify failed to create a new destination because did not input "Longitude Peta"

    @Step
    public void validateFailedAddNewDestinationWBecauseEmptyLongitudePeta(String failedMessageBecauseEmptyLongitudePeta){
        try {
            WebElement resultMessage = find(messageEmptyLongitudePeta());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(failedMessageBecauseEmptyLongitudePeta)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + failedMessageBecauseEmptyLongitudePeta + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }



    //TC_AW_56 [Negative 8] - Verify failed to create a new destination because did not input "Highlight"

    @Step
    public void validateFailedAddNewDestinationWBecauseEmptyHighlight(String failedMessageBecauseEmptyHighlight){
        try {
            WebElement resultMessage = find(messageEmptyHighlight());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(failedMessageBecauseEmptyHighlight)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + failedMessageBecauseEmptyHighlight + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }



    //TC_AW_57 [Negative 9] - Verify failed to create a new destination because did not input "Jumlah Stok Tiket"

    @Step
    public void validateFailedAddNewDestinationWBecauseEmptyJumlahStokTiket(String failedMessageBecauseEmptyJumlahStokTiket){
        try {
            WebElement resultMessage = find(messageEmptyJumlahStokTiket());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(failedMessageBecauseEmptyJumlahStokTiket)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + failedMessageBecauseEmptyJumlahStokTiket + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }




    //TC_AW_58 [Negative 10] - Verify failed to create a new destination because did not input "Harga Tiket"

    @Step
    public void validateFailedAddNewDestinationWBecauseEmptyHargaTiket(String failedMessageBecauseEmptyHargaTiket){
        try {
            WebElement resultMessage = find(messageEmptyHargaTiket());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(failedMessageBecauseEmptyHargaTiket)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + failedMessageBecauseEmptyHargaTiket + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }



    //TC_AW_59 [Negative 11] - Verify failed to create a new destination because did not choose "Status" and do not input "Deskripsi"

    @Step
    public void validateFailedAddNewDestinationWBecauseDidNotChooseStatus(String failedMessageBecauseEmptyStatus){
        try {
            WebElement resultMessage = find(messageEmptyStatus());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(failedMessageBecauseEmptyStatus)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + failedMessageBecauseEmptyStatus + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }

    @Step
    public void validateFailedAddNewDestinationWBecauseEmptyDeskripsi(String failedMessageBecauseEmptyDeskripsi){
        try {
            WebElement resultMessage = find(messageEmptyDeskripsiStatus());

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




    //TC_AW_60 [Negative 12] - Verify failed to create a new destination because did not choose "Kategori" and did not input "Fasilitas Lokal"

    @Step
    public void validateFailedAddNewDestinationWBecauseDidNotChooseKategori(String failedMessageBecauseEmptyKategori){
        try {
            WebElement resultMessage = find(messageEmptyKategori());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(failedMessageBecauseEmptyKategori)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + failedMessageBecauseEmptyKategori + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }

    @Step
    public void validateFailedAddNewDestinationWBecauseEmptyFasilitasLokal(String failedMessageBecauseEmptyFasilitasLokal){
        try {
            WebElement resultMessage = find(messageEmptyFasilitasLokal());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(failedMessageBecauseEmptyFasilitasLokal)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + failedMessageBecauseEmptyFasilitasLokal + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }





    //TC_AW_61 [Negative 13] - Verify failed to create a new destination because did not input the picture

    @Step
    public void validateFailedAddNewDestinationWBecauseEmptyGambarDestinasi(String failedMessageBecauseEmptyGambarDestinasi){
        try {
            WebElement resultMessage = find(messageEmptyGambarDestinasi());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(failedMessageBecauseEmptyGambarDestinasi)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + failedMessageBecauseEmptyGambarDestinasi + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }













    //TC_AW_62 [Positve 2] - Verify success to update destination "Pantai Bulbul" with valid data

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
    public void chooseStatusClose(){
        $(statusClose()).click();
    }

    @Step
    public void clickSimpanButton(){
        $(simpanButton()).click();
        waitABit(3000);
    }

    @Step
    public void validateSuccessEditDestinationWithStatusClose(String successMessageEditDestination){
        try {
            WebElement resultMessage = find(messageSuccessEditDestination());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(successMessageEditDestination)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + successMessageEditDestination + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }



    //TC_AW_63 [Negative 14] - Verify failed to update destination because input invalid Destinasi Kode

    @Step
    public void inputInvalidDestinasiKode(String invalidDestinasiKode){
        $(destinasiKodeField()).type(invalidDestinasiKode);
    }

    @Step
    public void validateFailedEditDestinationBecauseInvalidDestinasiKode(String failedMessageBecauseInvalidDestinasiKode){
        try {
            WebElement resultMessage = find(messageInvalidDestinasiKode());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(failedMessageBecauseInvalidDestinasiKode)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + failedMessageBecauseInvalidDestinasiKode + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }




    //TC_AW_64 [Negative 15] - Verify failed to update destination because input invalid "Nama Destinasi"

    @Step
    public void inputInvalidNamaDestinasi(String invalidNamaDestinasi){
        $(namaDestinasiField()).type(invalidNamaDestinasi);
    }

    @Step
    public void validateFailedEditDestinationBecauseInvalidNamaDestinasi(String failedMessageBecauseInvalidNamaDestinasi){
        try {
            WebElement resultMessage = find(messageInvalidNamaDestinasi());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(failedMessageBecauseInvalidNamaDestinasi)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + failedMessageBecauseInvalidNamaDestinasi + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }





    //TC_AW_65 [Negative 16] - Verify failed to update destination because input invalid "Lokasi Kota"

    @Step
    public void inputInvalidLokasiKota(String invalidLokasiKota){
        $(lokasiKotaField()).type(invalidLokasiKota);
    }

    @Step
    public void validateFailedEditDestinationBecauseInvalidLokasiKota(String failedMessageBecauseInvalidLokasiKota){
        try {
            WebElement resultMessage = find(messageInvalidLokasiKota());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(failedMessageBecauseInvalidLokasiKota)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + failedMessageBecauseInvalidLokasiKota + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }





    //TC_AW_66 [Negative 17] - Verify failed to update destination because input invalid "Alamat Peta"

    @Step
    public void inputInvalidAlamatPeta(String invalidAlamatPeta){
        $(urlPetaField()).type(invalidAlamatPeta);
    }

    @Step
    public void validateFailedEditDestinationBecauseInvalidAlamatPeta(String failedMessageBecauseInvalidAlamatPeta){
        try {
            WebElement resultMessage = find(messageInvalidURLPeta());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(failedMessageBecauseInvalidAlamatPeta)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + failedMessageBecauseInvalidAlamatPeta + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }






    //TC_AW_67 [Negative 18] - Verify failed to update destination because input invalid "Alamat"

    @Step
    public void inputInvalidAlamat(String invalidAlamat){
        $(alamatField()).type(invalidAlamat);
    }

    @Step
    public void validateFailedEditDestinationBecauseInvalidAlamat(String failedMessageBecauseInvalidAlamat){
        try {
            WebElement resultMessage = find(messageInvalidAlamat());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(failedMessageBecauseInvalidAlamat)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + failedMessageBecauseInvalidAlamat + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }







    //TC_AW_68 [Negative 19] - Verify failed to update destination because input invalid "Latitude Peta"

    @Step
    public void inputInvalidLatitudePeta(String invalidLatitudePeta){
        $(latitudePetaField()).type(invalidLatitudePeta);
    }

    @Step
    public void validateFailedEditDestinationBecauseInvalidLatitudePeta(String failedMessageBecauseInvalidLatitudePeta){
        try {
            WebElement resultMessage = find(messageInvalidLatitudePeta());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(failedMessageBecauseInvalidLatitudePeta)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + failedMessageBecauseInvalidLatitudePeta + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }








    //TC_AW_69 [Negative 20] - Verify failed to update destination because input invalid "Longitude Peta"

    @Step
    public void inputInvalidLongitudePeta(String invalidLongitudePeta){
        $(LongitudePetaField()).type(invalidLongitudePeta);
    }

    @Step
    public void validateFailedEditDestinationBecauseInvalidLongitudePeta(String failedMessageBecauseInvalidLongitudePeta){
        try {
            WebElement resultMessage = find(messageInvalidLongitudePeta());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(failedMessageBecauseInvalidLongitudePeta)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + failedMessageBecauseInvalidLongitudePeta + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }







    //TC_AW_70 [Negative 21] - Verify failed to update destination because input invalid "Jumlah Stok Tiket"

    @Step
    public void inputInvalidJumlahStokTiket(String invalidJumlahStokTiket){
        $(jumlahStokTiketField()).type(invalidJumlahStokTiket);
    }

    @Step
    public void validateFailedEditDestinationBecauseInvalidJumlahStokTiket(String failedMessageBecauseInvalidJumlahStokTiket){
        try {
            WebElement resultMessage = find(messageInvalidJumlahStokTiket());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(failedMessageBecauseInvalidJumlahStokTiket)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + failedMessageBecauseInvalidJumlahStokTiket + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }






    //TC_AW_71 [Negative 22] - Verify failed to update destination because input invalid Harga Tiket

    @Step
    public void inputInvalidHargaTiket(String invalidHargaTiket){
        $(hargaTiketField()).type(invalidHargaTiket);
    }

    @Step
    public void validateFailedEditDestinationBecauseInvalidHargaTiket(String failedMessageBecauseInvalidHargaTiket){
        try {
            WebElement resultMessage = find(messageInvalidHargaTiket());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(failedMessageBecauseInvalidHargaTiket)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + failedMessageBecauseInvalidHargaTiket + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }






    //TC_AW_72 [Positive 3] - Verify success to delete destination "Pantai Bulbul"

    @Step
    public void inputNameInSearchField(String searchName){
        $(searchField()).type(searchName);
        waitABit(3000);
    }

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
    public void validateSuccessDeleteDestination(String successMessageDeleteDestination){
        try {
            WebElement resultMessage = find(messageSuccessDeleteDestination());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(successMessageDeleteDestination)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + successMessageDeleteDestination + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }




    //TC_AW_73 [Positive 4] - Verify success cancel to delete user destination

    @Step
    public void clickCancelButton(){$(cancelButton()).click();
    }

    @Step
    public void validateSuccessCancelDeleteDestination() {
        $(displayDataDestination()).isDisplayed();
    }























    //TC_AW_74 [Positive 5] - Verify success to search category for existing name

    @Step
    public void validateSuccessToSearchDestinationForExistingData() {
        waitABit(3000);
        List<WebElementFacade> dataItems = findAll(validateTableBody());
        assertThat("Search results are not empty", dataItems.size(), greaterThan(0));
        waitABit(3000);
    }



    //TC_AW_75 [Negative 23] - Verify failed to search category because input Non-Existent name

    @Step
    public void waitABit(){
        waitABit(3000);
    }

    @Step
    public void validateFailedToGetResultOfSearchingDestination(String notFoundDestination) {
        try {
            WebElement resultMessage = find(messageDataNotAvailable());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(notFoundDestination)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + notFoundDestination + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }



















    //TC_AW_76 [Positive 6] - Verify success to see details of destination


    @Step
    public void clickEyesButtonOrIcon(){
        scrollRight();
        waitABit(3000);
        $(eyesButtonOrIcon()).click();
        waitABit(3000);
    }

    @Step
    public void validateSuccessToDisplayDetailDestination(){
        $(validasiDetailDestination()).isDisplayed();
        waitABit(3000);
    }















    //TC_AW_77 [Positive 7] - Verify success to displays data with a maximum of 50 data results

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













    //TC_AW_78 [Positive 8] - Verify success to displays data with a maximum of 100 data results

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

















    //TC_AW_79 [Positive 9] - Verify success to displays the next page which also contains other destination

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





    //TC_AW_80 [Positive 10] - Verify success to displays the previous page which also contains other destination

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
