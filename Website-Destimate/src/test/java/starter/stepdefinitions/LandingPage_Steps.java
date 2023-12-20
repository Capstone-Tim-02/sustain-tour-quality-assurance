package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LandingPage;

public class LandingPage_Steps {

    @Steps
    LandingPage landingPage;



    //TC_AW_175 [Positive 1] - Verify successful browsing Home Page with click menu Beranda in header

    @Given("I am already on the landing page Destimate")
    public void iAmAlreadyOnTheLandingPageDestimate() {
        landingPage.openLandingPageDestimate();
    }

    @When("I scroll down")
    public void iScrollDown() {
        landingPage.scrollToDown();
    }

    @And("I click menu Beranda in header")
    public void iClickMenuBeranda() {
        landingPage.clickMenuBerandaInHeader();
    }

    @Then("Validate success navigate to page Beranda and display the words {string}")
    public void validateSuccessNavigateToPageBerandaAndDisplayTheWords(String titleBeranda) {
        landingPage.validateOnTheBerandaPage(titleBeranda);
    }







    //TC_AW_176 [Positive 2] - Verify successful browsing Home Page with click menu Tentang Kami in header

    @When("I click menu Tentang Kami")
    public void iClickMenuTentangKami() {
        landingPage.clickMenuTentangKamiInHeader();
    }

    @Then("Validate success navigate to page Tentang kami and display the title {string}")
    public void validateSuccessNavigateToPageTentangKamiAndDisplayTheTitle(String titleTentangKami) {
        landingPage.validateOnTheTentangKamiPage(titleTentangKami);
    }
















    //TC_AW_177 [Positive 3] - Verify successful access Contact and send a unique experience in the form with valid Data
    
    @When("I click menu Kontak")
    public void iClickMenuKontak() {
        landingPage.clickMenuKontakInHeader();
    }

    @And("I input valid Data in the form")
    public void iInputValidDataInTheForm() {
        landingPage.inputNamaDepan("Yonathan");
        landingPage.inputNamaBelakang("Tambunan");
        landingPage.inputEmail("yonathan_tambunan@gmail.com");
        landingPage.inputNoTelephone("081234567823");
        landingPage.inputMessage("Halo Tim DestiMate, Saya adalah Yonathan, pemilik Tempat Wisata Pantai Bulbul, destinasi indah kami di Indonesia. Saya sangat berharap dapat bekerja sama dengan DestiMate.");
    }

    @And("I click submit button")
    public void iClickSubmitButton() {
        landingPage.clickSendButton();
    }

    @Then("Validate success to send the message cooperation or question and display message {string}")
    public void validateSuccessToSendTheMessageCooperationOrQuestionAndDisplayMessage(String successSendMessage) {
        landingPage.validateSuccessToSendMessageToAdminDestimate(successSendMessage);
    }












    //TC_AW_178 [Negative 1] - Verify successful access Contact but failed to send a unique experience because did not input Nama Depan


    @And("I did not input Nama Depan in the form")
    public void iDidNotInputNamaDepanInTheForm() {
        landingPage.inputNamaDepan("");
        landingPage.inputNamaBelakang("Tambunan");
        landingPage.inputEmail("yonathan_tambunan@gmail.com");
        landingPage.inputNoTelephone("081234567823");
        landingPage.inputMessage("Halo Tim DestiMate, Saya adalah Yonathan, pemilik Tempat Wisata Pantai Bulbul, destinasi indah kami di Indonesia. Saya sangat berharap dapat bekerja sama dengan DestiMate.");

    }

    @Then("Validate failed to send the message cooperation or question and stay in the contact page with message error below first name {string}")
    public void validateFailedToSendTheMessageCooperationOrQuestionAndStayInTheContactPageWithMessageErrorBelowFirstName(String emptyNamaDepan) {
        landingPage.validateFailedToSendMessageBecauseEmptyNamaDepan(emptyNamaDepan);
    }











    //TC_AW_179 [Positive 4] - Verify successful access Contact but failed to send a unique experience even though not input Nama Belakang

    @And("I did not input Nama Belakang in the form")
    public void iDidNotInputNamaBelakangInTheForm() {
        landingPage.inputNamaDepan("Yonathan");
        landingPage.inputNamaBelakang("");
        landingPage.inputEmail("yonathan_tambunan@gmail.com");
        landingPage.inputNoTelephone("081234567823");
        landingPage.inputMessage("Halo Tim DestiMate, Saya adalah Yonathan, pemilik Tempat Wisata Pantai Bulbul, destinasi indah kami di Indonesia. Saya sangat berharap dapat bekerja sama dengan DestiMate.");

    }



















    //TC_AW_180 [Negative 2] - Verify successful access Contact but failed to send a unique experience because did not input email

    @And("I did not input email in the form")
    public void iDidNotInputEmailInTheForm() {
        landingPage.inputNamaDepan("Yonathan");
        landingPage.inputNamaBelakang("Tambunan");
        landingPage.inputEmail("");
        landingPage.inputNoTelephone("081234567823");
        landingPage.inputMessage("Halo Tim DestiMate, Saya adalah Yonathan, pemilik Tempat Wisata Pantai Bulbul, destinasi indah kami di Indonesia. Saya sangat berharap dapat bekerja sama dengan DestiMate.");
    }

    @Then("Validate failed to send the message cooperation or question and stay in the contact page with message error below email {string}")
    public void validateFailedToSendTheMessageCooperationOrQuestionAndStayInTheContactPageWithMessageErrorBelowEmail(String emptyEmail) {
        landingPage.validateFailedToSendMessageBecauseEmptyEmail(emptyEmail);
    }














    //TC_AW_181 [Negative 3] - Verify successful access Contact but failed to send a unique experience because did not input message

    @And("I did not input message in the form")
    public void iDidNotInputMessageInTheForm() {
        landingPage.inputNamaDepan("Yonathan");
        landingPage.inputNamaBelakang("Tambunan");
        landingPage.inputEmail("yonathan_tambunan@gmail.com");
        landingPage.inputNoTelephone("081234567823");
        landingPage.inputMessage("");
    }

    @Then("Validate failed to send the message cooperation or question and stay in the contact page with message error below message {string}")
    public void validateFailedToSendTheMessageCooperationOrQuestionAndStayInTheContactPageWithMessageErrorBelowMessage(String emptyMessage) {
        landingPage.validateFailedToSendMessageBecauseEmptyMessage(emptyMessage);
    }
















    //TC_AW_182 [Negative 4] - Verify successful access Contact but failed to send a unique experience because did not input no telphone

    @And("I did not input no telphone in the form")
    public void iDidNotInputNoTelphoneInTheForm() {
        landingPage.inputNamaDepan("Yonathan");
        landingPage.inputNamaBelakang("Tambunan");
        landingPage.inputEmail("yonathan_tambunan@gmail.com");
        landingPage.inputNoTelephone("");
        landingPage.inputMessage("Halo Tim DestiMate, Saya adalah Yonathan, pemilik Tempat Wisata Pantai Bulbul, destinasi indah kami di Indonesia. Saya sangat berharap dapat bekerja sama dengan DestiMate.");

    }

    @Then("Validate failed to send the message cooperation or question and stay in the contact page with message error below phone number {string}")
    public void validateFailedToSendTheMessageCooperationOrQuestionAndStayInTheContactPageWithMessageErrorBelowPhoneNumber(String emptyPhoneNumber) {
        landingPage.validateFailedToSendMessageBecauseEmptyPhoneNumber(emptyPhoneNumber);
    }



















    //TC_AW_183 [Negative 5] - Verify successful access Contact but failed to send a unique experience because input invalid "Nama Depan" with 1 character

    @And("I input invalid Nama Depan with 1 character in the form")
    public void iInputInvalidNamaDepanWithCharacterInTheForm() {
        landingPage.inputNamaDepan("Y");
        landingPage.inputNamaBelakang("Tambunan");
        landingPage.inputEmail("yonathan_tambunan@gmail.com");
        landingPage.inputNoTelephone("081234567823");
        landingPage.inputMessage("Halo Tim DestiMate, Saya adalah Yonathan, pemilik Tempat Wisata Pantai Bulbul, destinasi indah kami di Indonesia. Saya sangat berharap dapat bekerja sama dengan DestiMate.");
    }
















    //TC_AW_184 [Negative 6] - Verify successful access Contact but failed to send a unique experience because input invalid email

    @And("I input invalid Email in the form")
    public void iInputInvalidEmailInTheForm() {
        landingPage.inputNamaDepan("Yonathan");
        landingPage.inputNamaBelakang("Tambunan");
        landingPage.inputEmail("yonathan");
        landingPage.inputNoTelephone("081234567823");
        landingPage.inputMessage("Halo Tim DestiMate, Saya adalah Yonathan, pemilik Tempat Wisata Pantai Bulbul, destinasi indah kami di Indonesia. Saya sangat berharap dapat bekerja sama dengan DestiMate.");
    }















    //TC_AW_185 [Negative 7] - Verify successful access Contact but failed to send a unique experience because input invalid phone number

    @And("I input invalid phone number in the form")
    public void iInputInvalidPhoneNumberInTheForm() {
        landingPage.inputNamaDepan("Yonathan");
        landingPage.inputNamaBelakang("Tambunan");
        landingPage.inputEmail("yonathan_tambunan@gmail.com");
        landingPage.inputNoTelephone("12345678903");
        landingPage.inputMessage("Halo Tim DestiMate, Saya adalah Yonathan, pemilik Tempat Wisata Pantai Bulbul, destinasi indah kami di Indonesia. Saya sangat berharap dapat bekerja sama dengan DestiMate.");

    }

    @Then("Validate failed to send the message cooperation or question and stay in the contact page with error message below phone number {string}")
    public void validateFailedToSendTheMessageCooperationOrQuestionAndStayInTheContactPageWithErrorMessageBelowPhoneNumber(String invalidPhoneNumber) {
        landingPage.validateFailedToSendMessageBecauseInvalidPhoneNumber(invalidPhoneNumber);
    }












    //TC_AW_186 [Negative 8] - Verify successful access Contact but failed to send a unique experience because input invalid message

    @And("I input invalid message in the form")
    public void iInputInvalidMessageInTheForm() {
        landingPage.inputNamaDepan("Yonathan");
        landingPage.inputNamaBelakang("Tambunan");
        landingPage.inputEmail("yonathan_tambunan@gmail.com");
        landingPage.inputNoTelephone("081234567823");
        landingPage.inputMessage("P");

    }

    //TC_AW_187 [Negative 9] - Verify successful access Contact but failed to send a unique experience because input first name only with spaces

    @And("I input first name only with spaces in the form")
    public void iInputFirstNameOnlyWithSpacesInTheForm() {
        landingPage.inputNamaDepan("           ");
        landingPage.inputNamaBelakang("Tambunan");
        landingPage.inputEmail("yonathan_tambunan@gmail.com");
        landingPage.inputNoTelephone("081234567823");
        landingPage.inputMessage("Halo Tim DestiMate, Saya adalah Yonathan, pemilik Tempat Wisata Pantai Bulbul, destinasi indah kami di Indonesia. Saya sangat berharap dapat bekerja sama dengan DestiMate.");

    }






    //TC_AW_188 [Negative 10] - Verify successful access Contact but failed to send a unique experience because input message only with spaces

    @And("I input messages only with spaces in the form")
    public void iInputMessagesOnlyWithSpacesInTheForm() {
        landingPage.inputNamaDepan("Yonathan");
        landingPage.inputNamaBelakang("Tambunan");
        landingPage.inputEmail("yonathan_tambunan@gmail.com");
        landingPage.inputNoTelephone("081234567823");
        landingPage.inputMessage("                  ");

    }


















    //TC_AW_189 [Positive 5] - Verify success to displays the next page which also contains other destination

    @When("I scroll down and navigate to page Temukan Destinasi Impianmu dengan Destimate!")
    public void iScrollDownAndNavigateToPage() {
        landingPage.scrollToDownToTemukanDestinasiImpian();
    }

    @And("I am click the next button")
    public void iAmClickTheNextButton() {
        landingPage.clickNextButton();
    }

    @Then("Validate success to displays the next page which also contains the other of destination")
    public void validateSuccessToDisplaysTheNextPageWhichAlsoContainsTheOtherOfDestination() {
        landingPage.validateDisplayOtherDestination();
    }















    //TC_AW_190 [Positive 6] - Verify success to displays the previous page which also contains other destination

    @And("I am click back button")
    public void iAmClickBackButton() {
        landingPage.clickBackButton();
    }

    @Then("Validate success to displays the previous page which also contains a destination")
    public void validateSuccessToDisplaysThePreviousPageWhichAlsoContainsADestination() {
        landingPage.validateDisplayOtherDestinationWhenKlikBackButton();
    }















    //TC_AW_191 [Positive 7] - Verify success return to the top of the page

    @And("I click the up arrow button")
    public void iClickTheUpArrowButton() {
        landingPage.clickArrowButton();
    }

    @Then("Validate success to displays the top page which have the words {string}")
    public void validateSuccessToDisplaysTheTopPageWhichHaveTheWords(String topPage) {
        landingPage.validateOnTheTopPage(topPage);
    }


















    //TC_AW_192 [Positive 8] - Verify success browsing Home Page with click menu Beranda in the footer

    @When("I scroll down and navigate to the footer page")
    public void iScrollDownAndNavigateToTheFooterPage() {
        landingPage.scrollToDownToFooter();
    }

    @And("I click menu Beranda in the footer")
    public void iClickMenuBerandaInTheFooter() {
        landingPage.clickMenuBerandaInFooter();
    }










    //TC_AW_193 [Positive 9] - Verify success browsing About Us with click menu Tentang Kami in the footer

    @And("I click menu Tentang Kami in the footer")
    public void iClickMenuTentangKamiInTheFooter() {
        landingPage.clickMenuTentangKamiInFooter();
    }














    //TC_AW_194 [Positive 10] - Verify success browsing Contact with click menu Kontak in the footer

    @And("I click menu Kontak in the footer")
    public void iClickMenuKontakInTheFooter() {
        landingPage.clickMenuKontakInFooter();
    }

    @Then("Validate success navigate to page Kontak and display the title {string}")
    public void validateSuccessNavigateToPageKontakAndDisplayTheTitle(String titleKontak) {
        landingPage.validateOnThePageKontakKami(titleKontak);
    }















    //TC_AW_195 [Positive 11] - Verify success to click button Daftar Sekarang

    @When("I scroll down and navigate to the page Daftarkan Wisatamu")
    public void iScrollDownAndNavigateToThePageDaftarkanWisatamu() {
        landingPage.scrollToDownToNavigateDaftarDestinasi();
    }

    @And("I click button Daftar Sekarang")
    public void iClickButtonDaftarSekarang() {
        landingPage.clickButtonDaftarSekarang();
    }

    @Then("Validate success to click button Daftar Sekarang")
    public void validateSuccessToClickButtonDaftarSekarang() {
        landingPage.validateSuccessClickDaftarButton();
    }
}
