package starter.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.NoSuchElementException;

public class LandingPage extends PageObject {

    // =============================================TC_AW_175============================================================

    private void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }

    private By menuBerandaInHeader(){
        return By.xpath("/html/body/div/div[1]/nav/nav/div/div/div[2]/div/div/a[1]");
    }

    private By validateInBerandaPage(){
        return By.xpath("/html/body/div/div[2]/div/div[1]/section/div/div[1]/div[1]/h1");
    }




    // =============================================TC_AW_176============================================================

    private By menuTentangKamiInHeader(){
        return By.xpath("/html/body/div/div[1]/nav/nav/div/div/div[2]/div/div/a[2]");
    }

    private By validateInTentangKamiPage(){
        return By.xpath("/html/body/div/div[2]/div/section[4]/div/div/h1");
    }

    // =============================================TC_AW_177============================================================

    private By menuKontakInHeader(){
        return By.xpath("/html/body/div/div[1]/nav/nav/div/div/div[2]/div/div/a[3]");
    }

    private By namaDepanField(){
        return By.xpath("/html/body/div/div[2]/div/div[2]/section[2]/div/div/div/form/div[1]/div[1]/div/input");
    }

    private By namaBelakangField(){
        return By.xpath("/html/body/div/div[2]/div/div[2]/section[2]/div/div/div/form/div[1]/div[2]/div/input");
    }

    private By emailField(){
        return By.xpath("/html/body/div/div[2]/div/div[2]/section[2]/div/div/div/form/div[2]/div[1]/div/input");
    }

    private By phoneNumberField(){
        return By.xpath("/html/body/div/div[2]/div/div[2]/section[2]/div/div/div/form/div[2]/div[2]/div/input");
    }

    private By messageField(){
        return By.xpath("/html/body/div/div[2]/div/div[2]/section[2]/div/div/div/form/div[3]/div/textarea");
    }

    private By sendButton(){
        return By.xpath("/html/body/div/div[2]/div/div[2]/section[2]/div/div/div/form/div[4]/button");
    }

    private By validateSuccessSendToAdminDestimate(){
        return By.xpath("/html/body/div/div[2]/div/div[2]/section[2]/div/div/div/div[2]/div[2]/div/div[1]/h2");
    }

    // =============================================TC_AW_178============================================================

    private By invalidMessageBelowNamaDepanField(){
        return By.xpath("/html/body/div/div[2]/div/div[2]/section[2]/div/div/div/form/div[1]/div[1]/p");
    }

    // =============================================TC_AW_180============================================================

    private By invalidMessageBelowEmailField(){
        return By.xpath("/html/body/div/div[2]/div/div[2]/section[2]/div/div/div/form/div[2]/div[1]/p");
    }


    // =============================================TC_AW_181============================================================

    private By invalidMessageBelowMessageField(){
        return By.xpath("/html/body/div/div[2]/div/div[2]/section[2]/div/div/div/form/div[3]/p");
    }

    // =============================================TC_AW_182============================================================

    private By invalidMessageBelowPhoneNumberField(){
        return By.xpath("/html/body/div/div[2]/div/div[2]/section[2]/div/div/div/form/div[2]/div[2]/p");
    }

    // =============================================TC_AW_189============================================================

    private By pageTemukanDestinasi(){
        return By.xpath("/html/body/div/div[2]/div/section[3]/div/div[2]/div[1]/h1");
    }

    private void scrollDownNavigateToTemukanDestinasiImpian() {
        WebElementFacade element = find(pageTemukanDestinasi());
        evaluateJavascript("arguments[0].scrollIntoView(true);", element);
        element.click();
    }

    private By nextButtonDestinasi(){
        return By.xpath("/html/body/div/div[2]/div/section[3]/div/div[2]/div[2]/div[2]");
    }

    private By otherDestinationForNextButton(){
        return By.xpath("/html/body/div/div[2]/div/section[3]/div/div[1]/div[1]");
    }



    // =============================================TC_AW_190============================================================

    private By backButtonDestinasi(){
        return By.xpath("/html/body/div/div[2]/div/section[3]/div/div[2]/div[2]/div[1]");
    }

    private By otherDestinationForBackButton(){
        return By.xpath("/html/body/div/div[2]/div/section[3]/div/div[1]/div[1]");
    }
    // =============================================TC_AW_191============================================================

    private By arrowButton(){
        return By.id("root");
    }

    private void arrowButtonToNavigateTopPage() {
        WebElementFacade element = find(validateInBerandaPage());
        evaluateJavascript("arguments[0].scrollIntoView(true);", element);
        element.isDisplayed();
    }

    // =============================================TC_AW_192============================================================

    private By footer(){
        return By.xpath("/html/body/div/footer/div/div[2]/div/p");
    }

    private void scrollDownNavigateToFooter() {
        WebElementFacade element = find(footer());
        evaluateJavascript("arguments[0].scrollIntoView(true);", element);
        element.click();
    }
    private By menuBerandaInFooter(){
        return By.xpath("/html/body/div/footer/div/div[1]/div[2]/div/div[2]/div[2]/a[1]");
    }

    // =============================================TC_AW_193============================================================

    private By menuTentangKamiInFooter(){
        return By.xpath("/html/body/div/footer/div/div[1]/div[2]/div/div[2]/div[2]/a[2]");
    }

    // =============================================TC_AW_194============================================================

    private By menuKontakInFooter(){
        return By.xpath("/html/body/div/footer/div/div[1]/div[2]/div/div[2]/div[2]/a[3]");
    }

    private By validateOnTheMenuKontakKami(){
        return By.xpath("/html/body/div/div[2]/div/div[2]/section[2]/div/div/h1");
    }



    // =============================================TC_AW_195============================================================

    private By navigateToDaftarDestinasiPage(){
        return By.xpath("/html/body/div/div[2]/div/div[2]/section[1]/div/div[2]/a");
    }

    private void scrollDownToNavigateDaftarDestinasiPage() {
        WebElementFacade element = find(navigateToDaftarDestinasiPage());
        evaluateJavascript("arguments[0].scrollIntoView(true);", element);
        element.isDisplayed();
    }

    private By buttonDaftarSekarang(){
        return By.xpath("/html/body/div/div[2]/div/div[2]/section[1]/div/div[2]/a");
    }






















    //TC_AW_175 [Positive 1] - Verify successful browsing Home Page with click menu Beranda in header

    @Step
    public void openLandingPageDestimate(){
        String url2 = "https://destimate-dev.netlify.app/";
        openAt(url2);
    }

    @Step
    public void waitABit(){
        waitABit(3000);
    }

    @Step
    public void scrollToDown() {
        scrollDown();
        waitABit(2000);
    }

    @Step
    public void clickMenuBerandaInHeader(){
        $(menuBerandaInHeader()).click();
        waitABit(2000);
    }

    @Step
    public void validateOnTheBerandaPage(String titleBeranda) {
        try {
            WebElement resultMessage = find(validateInBerandaPage());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(titleBeranda)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + titleBeranda + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
        waitABit(3000);
    }


















    //TC_AW_176 [Positive 2] - Verify successful browsing Home Page with click menu Tentang Kami in header

    @Step
    public void clickMenuTentangKamiInHeader(){
        $(menuTentangKamiInHeader()).click();
        waitABit(4000);
    }

    @Step
    public void validateOnTheTentangKamiPage(String titleTentangKami) {
        try {
            WebElement resultMessage = find(validateInTentangKamiPage());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(titleTentangKami)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + titleTentangKami + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
        waitABit(3000);
    }



















    //TC_AW_177 [Positive 3] - Verify successful access Contact and send a unique experience in the form with valid Data

    @Step
    public void clickMenuKontakInHeader(){
        $(menuKontakInHeader()).click();
        waitABit(2000);
    }



    @Step
    public void inputNamaDepan(String namaDepan){
        $(namaDepanField()).type(namaDepan);
    }

    @Step
    public void inputNamaBelakang(String namaBelakang){
        $(namaBelakangField()).type(namaBelakang);
    }

    @Step
    public void inputEmail(String email){
        $(emailField()).type(email);
    }

    @Step
    public void inputNoTelephone(String phoneNumber){
        $(phoneNumberField()).type(phoneNumber);
    }

    @Step
    public void inputMessage(String message){
        $(messageField()).type(message);
    }

    @Step
    public void clickSendButton(){
        try {
            WebElementFacade sendButton = $(sendButton());
            sendButton.click();
            System.out.println("Tombol Kirim berhasil diklik.");
        } catch (Exception e) {
            System.out.println("Tombol Kirim tidak dapat diklik karena invalid pengisian form.");
        }
    }

    @Step
    public void validateSuccessToSendMessageToAdminDestimate(String successSendMessage) {
        try {
            WebElement resultMessage = find(validateSuccessSendToAdminDestimate());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(successSendMessage)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + successSendMessage + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
        waitABit(2000);
    }










    //TC_AW_178 Negative 1] - Verify successful access Contact but failed to send a unique experience because did not input Nama Depan

    @Step
    public void validateFailedToSendMessageBecauseEmptyNamaDepan(String emptyNamaDepan) {
        try {
            WebElement resultMessage = find(invalidMessageBelowNamaDepanField());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(emptyNamaDepan)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + emptyNamaDepan + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
        waitABit(2000);
    }

















    //TC_AW_180 [Negative 2] - Verify successful access Contact but failed to send a unique experience because did not input email

    @Step
    public void validateFailedToSendMessageBecauseEmptyEmail(String emptyEmail) {
        try {
            WebElement resultMessage = find(invalidMessageBelowEmailField());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(emptyEmail)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + emptyEmail + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
        waitABit(2000);
    }













    //TC_AW_181 [Negative 3] - Verify successful access Contact but failed to send a unique experience because did not input message

    @Step
    public void validateFailedToSendMessageBecauseEmptyMessage(String emptyMessage) {
        try {
            WebElement resultMessage = find(invalidMessageBelowMessageField());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(emptyMessage)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + emptyMessage + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
        waitABit(2000);
    }


















    //TC_AW_182 [Negative 4] - Verify successful access Contact but failed to send a unique experience because did not input no telphone

    @Step
    public void validateFailedToSendMessageBecauseEmptyPhoneNumber(String emptyPhoneNumber) {
        try {
            WebElement resultMessage = find(invalidMessageBelowPhoneNumberField());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(emptyPhoneNumber)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + emptyPhoneNumber + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
        waitABit(2000);
    }














    //TC_AW_185 [Negative 7] -Verify successful access Contact but failed to send a unique experience because input invalid phone number

    @Step
    public void validateFailedToSendMessageBecauseInvalidPhoneNumber(String invalidPhoneNumber) {
        try {
            WebElement resultMessage = find(invalidMessageBelowPhoneNumberField());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(invalidPhoneNumber)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + invalidPhoneNumber + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
        waitABit(2000);
    }















    //TC_AW_189 [Positive 5] - Verify success to displays the next page which also contains other destination

    @Step
    public void scrollToDownToTemukanDestinasiImpian() {
        scrollDownNavigateToTemukanDestinasiImpian();
        waitABit(2000);
    }

    @Step
    public void clickNextButton(){
        $(nextButtonDestinasi()).click();
        waitABit(2000);
    }

    @Step
    public void validateDisplayOtherDestination(){
        $(otherDestinationForNextButton()).isDisplayed();
        waitABit(2000);
    }











    //TC_AW_190 [Positive 6] - Verify success to displays the previous page which also contains other destination

    @Step
    public void clickBackButton(){
        $(backButtonDestinasi()).click();
        waitABit(2000);
    }

    @Step
    public void validateDisplayOtherDestinationWhenKlikBackButton(){
        $(otherDestinationForBackButton()).isDisplayed();
        waitABit(2000);
    }












    //TC_AW_191 [Positive 7] - Verify success return to the top of the page

    @Step
    public void clickArrowButton(){
        $(arrowButton()).click();
        waitABit(2000);
        arrowButtonToNavigateTopPage();
    }

    @Step
    public void validateOnTheTopPage(String topPage) {
        try {
            WebElement resultMessage = find(validateInBerandaPage());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(topPage)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + topPage + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
        waitABit(3000);
    }














    //TC_AW_192 [Positive 8] - Verify success browsing Home Page with click menu Beranda in the footer

    @Step
    public void scrollToDownToFooter() {
        scrollDownNavigateToFooter();
        waitABit(2000);
    }


    @Step
    public void clickMenuBerandaInFooter(){
        $(menuBerandaInFooter()).click();
        waitABit(2000);
    }

















    //TC_AW_193 [Positive 9] - Verify success browsing About Us with click menu Tentang Kami in the footer

    @Step
    public void clickMenuTentangKamiInFooter(){
        $(menuTentangKamiInFooter()).click();
        waitABit(2000);
    }











    //TC_AW_194 [Positive 10] - Verify success browsing Contact with click menu Kontak in the footer

    @Step
    public void clickMenuKontakInFooter(){
        $(menuKontakInFooter()).click();
        waitABit(2000);
    }

    @Step
    public void validateOnThePageKontakKami(String titleKontak) {
        try {
            WebElement resultMessage = find(validateOnTheMenuKontakKami());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(titleKontak)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + titleKontak + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
        waitABit(3000);
    }




















    //TC_AW_195 [Positive 11] - Verify success to click button Daftar Sekarang

    @Step
    public void scrollToDownToNavigateDaftarDestinasi() {
        scrollDownToNavigateDaftarDestinasiPage();
        waitABit(2000);
    }

    @Step
    public void clickButtonDaftarSekarang(){
        $(buttonDaftarSekarang()).click();
        waitABit(2000);
    }

    @Step
    public void validateSuccessClickDaftarButton(){
        System.out.println("Sukses klik tombol Datar Sekarang dan menuju form pengisian kerja sama antara pemilik wisata dengan admin Destimate");
    }






}
