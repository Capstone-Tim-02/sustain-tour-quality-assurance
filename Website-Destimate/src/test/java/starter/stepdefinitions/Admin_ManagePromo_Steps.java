package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Admin_Login;
import starter.pages.Admin_ManagePromo;

public class Admin_ManagePromo_Steps {

    @Steps
    Admin_Login adminLogin;

    @Steps
    Admin_ManagePromo managePromo;



    //TC_AW_81 [Positive 1] - Verify success to create a new promo with valid data

    @Given("I have to login and already on the dashboard of the Destimate")
    public void iHaveToLoginAndAlreadyOnTheDashboardOfTheDestimate() {
        adminLogin.openDestimateWebsite();
        adminLogin.inputValidUsername("admin");
        adminLogin.inputValidKataSandi("admin123");
        adminLogin.clickEyesIcon();
        adminLogin.clickMasukButton();
    }

    @When("I click menu Promo")
    public void iClickMenuPromo() {
        managePromo.clickMenuPromo();
    }

    @And("I click Tambah Promo button")
    public void iClickTambahPromoButton() {
        managePromo. clickTambahPromoButton();
    }

    @And("I input valid data of new promo")
    public void iInputValidDataOfNewPromo() {
        managePromo.inputValidJudulPromo("Promo Kasih Sayang");
        managePromo.inputValidNamaPromo("Relaxation Retreat");
        managePromo.inputValidKodePromo("RETREATGO1");
        managePromo.inputValidTanggalKadaluarsa("27032024");
        managePromo.inputValidDiskon("30");
        managePromo.chooseStatusAktif();
        managePromo.inputValidDeskripsi("Menawarkan diskon sebesar 30% untuk pengunjung yang membeli tiket wisata");
        managePromo.inputValidPeraturan("minimal 3 tiket");
        managePromo.uploadGambarPromo("file.png");
        managePromo.waitABit();
    }

    @And("I click Tambah Promo option")
    public void iClickTambahPromoOption() {
        managePromo.clickTambahPromoOption();
    }

    @Then("Validate success to create a new promo with valid data and display message {string}")
    public void validateSuccessToCreateANewPromoWithValidDataAndDisplayMessage(String successMessageAddPromo) {
        managePromo.validateSuccessAddNewPromoWithValidData(successMessageAddPromo);
        managePromo.waitABit();
    }







    //TC_AW_82 [Negative 1] - Verify failed to create a new promo because did not input Judul Promo

    @And("I did not input Judul promo in the form create promo")
    public void iDidNotInputJudulPromoInTheFormCreatePromo() {
        managePromo.inputValidJudulPromo("");
        managePromo.inputValidNamaPromo("Promo Family Package");
        managePromo.inputValidKodePromo("FAMILY27");
        managePromo.inputValidTanggalKadaluarsa("27032024");
        managePromo.inputValidDiskon("40");
        managePromo.chooseStatusAktif();
        managePromo.inputValidDeskripsi("Menawarkan diskon sebesar 35% untuk keluarga yang membeli tiket wisata");
        managePromo.inputValidPeraturan("minimal 4 tiket");
        managePromo.uploadGambarPromo("file.png");
        managePromo.waitABit();
    }

    @Then("Validate failed to create a new promo because did not input Judul Promo and display message {string}")
    public void validateFailedToCreateANewPromoBecauseDidNotInputJudulPromoAndDisplayMessage(String failedMessageBecauseEmptyJudulPromo) {
        managePromo.validateFailedAddNewPromoBecauseEmptyJudulPromo(failedMessageBecauseEmptyJudulPromo);
        managePromo.waitABit();
    }









    //TC_AW_83 [Negative 2] - Verify failed to create a new promo because did not input Nama Promo

    @And("I did not input Nama promo in the form create promo")
    public void iDidNotInputNamaPromoInTheFormCreatePromo() {
        managePromo.inputValidJudulPromo("Promo Paket Keluarga");
        managePromo.inputValidNamaPromo("");
        managePromo.inputValidKodePromo("FAMILY27");
        managePromo.inputValidTanggalKadaluarsa("27032024");
        managePromo.inputValidDiskon("40");
        managePromo.chooseStatusAktif();
        managePromo.inputValidDeskripsi("Menawarkan diskon sebesar 35% untuk keluarga yang membeli tiket wisata");
        managePromo.inputValidPeraturan("minimal 4 tiket");
        managePromo.uploadGambarPromo("file.png");
        managePromo.waitABit();
    }

    @Then("Validate failed to create a new promo because did not input Nama Promo and display message {string}")
    public void validateFailedToCreateANewPromoBecauseDidNotInputNamaPromoAndDisplayMessage(String failedMessageBecauseEmptyNamaPromo) {
        managePromo.validateFailedAddNewPromoBecauseEmptyNamaPromo(failedMessageBecauseEmptyNamaPromo);
        managePromo.waitABit();
    }












    //TC_AW_84 [Negative 3] - Verify failed to create a new promo because did not input Kode Promo

    @And("I did not input Kode Promo in the form create promo")
    public void iDidNotInputKodePromoInTheFormCreatePromo() {
        managePromo.inputValidJudulPromo("Promo Paket Keluarga");
        managePromo.inputValidNamaPromo("Promo Family Package");
        managePromo.inputValidKodePromo("");
        managePromo.inputValidTanggalKadaluarsa("27032024");
        managePromo.inputValidDiskon("40");
        managePromo.chooseStatusAktif();
        managePromo.inputValidDeskripsi("Menawarkan diskon sebesar 35% untuk keluarga yang membeli tiket wisata");
        managePromo.inputValidPeraturan("minimal 4 tiket");
        managePromo.uploadGambarPromo("file.png");
        managePromo.waitABit();
    }

    @Then("Validate failed to create a new promo because did not input Kode Promo and display message {string}")
    public void validateFailedToCreateANewPromoBecauseDidNotInputKodePromoAndDisplayMessage(String failedMessageBecauseEmptyKodePromo) {
        managePromo.validateFailedAddNewPromoBecauseEmptyKodePromo(failedMessageBecauseEmptyKodePromo);
        managePromo.waitABit();
    }














    //TC_AW_85 [Negative 4] - Verify failed to create a new promo because did not input Tanggal Kadaluarsa

    @And("I did not input Tanggal Kadaluarsa in the form create promo")
    public void iDidNotInputTanggalKadaluarsaInTheFormCreatePromo() {
        managePromo.inputValidJudulPromo("Promo Paket Keluarga");
        managePromo.inputValidNamaPromo("Promo Family Package");
        managePromo.inputValidKodePromo("FAMILY27");
        managePromo.inputValidTanggalKadaluarsa("");
        managePromo.inputValidDiskon("40");
        managePromo.chooseStatusAktif();
        managePromo.inputValidDeskripsi("Menawarkan diskon sebesar 35% untuk keluarga yang membeli tiket wisata");
        managePromo.inputValidPeraturan("minimal 4 tiket");
        managePromo.uploadGambarPromo("file.png");
        managePromo.waitABit();
    }

    @Then("Validate failed to create a new promo because did not input Tanggal Kadaluarsa and display message {string}")
    public void validateFailedToCreateANewPromoBecauseDidNotInputTanggalKadaluarsaAndDisplayMessage(String failedMessageBecauseEmptyTanggalKadaluarsa) {
        managePromo.validateFailedAddNewPromoBecauseEmptyTanggalKadaluarsa(failedMessageBecauseEmptyTanggalKadaluarsa);
        managePromo.waitABit();
    }














    //TC_AW_86 [Negative 5] - Verify failed to create a new promo because did not input Diskon

    @And("I did not input Diskon in the form create promo")
    public void iDidNotInputDiskonInTheFormCreatePromo() {
        managePromo.inputValidJudulPromo("Promo Paket Keluarga");
        managePromo.inputValidNamaPromo("Promo Family Package");
        managePromo.inputValidKodePromo("FAMILY27");
        managePromo.inputValidTanggalKadaluarsa("27032024");
        managePromo.inputValidDiskon("");
        managePromo.chooseStatusAktif();
        managePromo.inputValidDeskripsi("Menawarkan diskon sebesar 35% untuk keluarga yang membeli tiket wisata");
        managePromo.inputValidPeraturan("minimal 4 tiket");
        managePromo.uploadGambarPromo("file.png");
        managePromo.waitABit();
    }

    @Then("Validate failed to create a new promo because did not input Diskon and display message {string}")
    public void validateFailedToCreateANewPromoBecauseDidNotInputDiskonAndDisplayMessage(String failedMessageBecauseEmptyDiskon) {
        managePromo.validateFailedAddNewPromoBecauseEmptyDiskon(failedMessageBecauseEmptyDiskon);
        managePromo.waitABit();
    }















    //TC_AW_87 [Negative 6] - Verify failed to create a new promo because did not input Deskripsi

    @And("I did not input Deskripsi in the form create promo")
    public void iDidNotInputDeskripsiInTheFormCreatePromo() {
        managePromo.inputValidJudulPromo("Promo Paket Keluarga");
        managePromo.inputValidNamaPromo("Promo Family Package");
        managePromo.inputValidKodePromo("FAMILY27");
        managePromo.inputValidTanggalKadaluarsa("27032024");
        managePromo.inputValidDiskon("40");
        managePromo.chooseStatusAktif();
        managePromo.inputValidDeskripsi("");
        managePromo.inputValidPeraturan("minimal 4 tiket");
        managePromo.uploadGambarPromo("file.png");
        managePromo.waitABit();
    }

    @Then("Validate failed to create a new promo because did not input Deskripsi and display message {string}")
    public void validateFailedToCreateANewPromoBecauseDidNotInputDeskripsiAndDisplayMessage(String failedMessageBecauseEmptyDeskripsi) {
        managePromo.validateFailedAddNewPromoBecauseEmptyDeskripsi(failedMessageBecauseEmptyDeskripsi);
        managePromo.waitABit();
    }
















    //TC_AW_88 [Negative 7] - Verify failed to create a new promo because did not input "Peraturan"

    @And("I did not input Peraturan in the form create promo")
    public void iDidNotInputPeraturanInTheFormCreatePromo() {
        managePromo.inputValidJudulPromo("Promo Paket Keluarga");
        managePromo.inputValidNamaPromo("Promo Family Package");
        managePromo.inputValidKodePromo("FAMILY27");
        managePromo.inputValidTanggalKadaluarsa("27032024");
        managePromo.inputValidDiskon("40");
        managePromo.chooseStatusAktif();
        managePromo.inputValidDeskripsi("Menawarkan diskon sebesar 35% untuk keluarga yang membeli tiket wisata");
        managePromo.inputValidPeraturan("");
        managePromo.uploadGambarPromo("file.png");
        managePromo.waitABit();
    }

    @Then("Validate failed to create a new promo because did not input Peraturan and display message {string}")
    public void validateFailedToCreateANewPromoBecauseDidNotInputPeraturanAndDisplayMessage(String failedMessageBecauseEmptyPeraturan) {
        managePromo.validateFailedAddNewPromoBecauseEmptyPeraturan(failedMessageBecauseEmptyPeraturan);
        managePromo.waitABit();
    }


















    //TC_AW_89 [Negative 8] - Verify failed to create a new promo because did not input "Gambar Promo"

    @And("I did not input Gambar Promo in the form create promo")
    public void iDidNotInputGambarPromoInTheFormCreatePromo() {
        managePromo.inputValidJudulPromo("Promo Paket Keluarga");
        managePromo.inputValidNamaPromo("Promo Family Package");
        managePromo.inputValidKodePromo("FAMILY27");
        managePromo.inputValidTanggalKadaluarsa("27032024");
        managePromo.inputValidDiskon("40");
        managePromo.chooseStatusAktif();
        managePromo.inputValidDeskripsi("Menawarkan diskon sebesar 35% untuk keluarga yang membeli tiket wisata");
        managePromo.inputValidPeraturan("minimal 4 tiket");
    }

    @Then("Validate failed to create a new promo because did not input Gambar Promo and display message {string}")
    public void validateFailedToCreateANewPromoBecauseDidNotInputGambarPromoAndDisplayMessage(String failedMessageBecauseEmptyGambarPromo) {
        managePromo.validateFailedAddNewPromoBecauseEmptyGambarPromo(failedMessageBecauseEmptyGambarPromo);
        managePromo.waitABit();
    }


















    //TC_AW_90 [Negative 9] - Verify failed to create a new promo because input invalid "Judul Promo"

    @And("I input invalid Judul Promo in the form create promo")
    public void iInputInvalidJudulPromoInTheFormCreatePromo() {
        managePromo.inputValidJudulPromo("P");
        managePromo.inputValidNamaPromo("Promo Family Package");
        managePromo.inputValidKodePromo("FAMILY27");
        managePromo.inputValidTanggalKadaluarsa("27032024");
        managePromo.inputValidDiskon("40");
        managePromo.chooseStatusAktif();
        managePromo.inputValidDeskripsi("Menawarkan diskon sebesar 35% untuk keluarga yang membeli tiket wisata");
        managePromo.inputValidPeraturan("minimal 4 tiket");
        managePromo.uploadGambarPromo("file.png");
        managePromo.waitABit();
    }

    @Then("Validate failed to create a new promo because invalid Judul Promo and display message {string}")
    public void validateFailedToCreateANewPromoBecauseInvalidJudulPromoAndDisplayMessage(String failedMessageBecauseInvalidJudulPromo) {
        managePromo.validateFailedAddNewPromoBecauseInvalidJudulPromo(failedMessageBecauseInvalidJudulPromo);
        managePromo.waitABit();
    }















    //TC_AW_91 [Negative 10] - Verify failed to create a new promo because input invalid "Nama Promo"

    @And("I input invalid Nama Promo in the form create promo")
    public void iInputInvalidNamaPromoInTheFormCreatePromo() {
        managePromo.inputValidJudulPromo("Promo Paket Keluarga");
        managePromo.inputValidNamaPromo("PF");
        managePromo.inputValidKodePromo("FAMILY27");
        managePromo.inputValidTanggalKadaluarsa("27032024");
        managePromo.inputValidDiskon("40");
        managePromo.chooseStatusAktif();
        managePromo.inputValidDeskripsi("Menawarkan diskon sebesar 35% untuk keluarga yang membeli tiket wisata");
        managePromo.inputValidPeraturan("minimal 4 tiket");
        managePromo.uploadGambarPromo("file.png");
        managePromo.waitABit();
    }

    @Then("Validate failed to create a new promo because invalid Nama Promo and display message {string}")
    public void validateFailedToCreateANewPromoBecauseInvalidNamaPromoAndDisplayMessage(String failedMessageBecauseInvalidNamaPromo) {
        managePromo.validateFailedAddNewPromoBecauseInvalidNamaPromo(failedMessageBecauseInvalidNamaPromo);
        managePromo.waitABit();
    }













    //TC_AW_92 [Negative 11] - Verify failed to create a new promo because input invalid "Kode Promo" with 2 character

    @And("I input invalid Kode Promo with 2 character in the form create promo")
    public void iInputInvalidKodePromoWithCharacterInTheFormCreatePromo() {
        managePromo.inputValidJudulPromo("Promo Paket Keluarga");
        managePromo.inputValidNamaPromo("Promo Family Package");
        managePromo.inputValidKodePromo("4R");
        managePromo.inputValidTanggalKadaluarsa("27032024");
        managePromo.inputValidDiskon("40");
        managePromo.chooseStatusAktif();
        managePromo.inputValidDeskripsi("Menawarkan diskon sebesar 35% untuk keluarga yang membeli tiket wisata");
        managePromo.inputValidPeraturan("minimal 4 tiket");
        managePromo.uploadGambarPromo("file.png");
        managePromo.waitABit();
    }

    @Then("Validate failed to create a new promo because invalid Kode Promo with 2 character and display message {string}")
    public void validateFailedToCreateANewPromoBecauseInvalidKodePromoWithCharacterAndDisplayMessage(String failedMessageBecauseInvalidKodePromoWith2Character) {
        managePromo.validateFailedAddNewPromoBecauseInvalidKodePromoWith2Character(failedMessageBecauseInvalidKodePromoWith2Character);
        managePromo.waitABit();
    }













    //TC_AW_93 [Negative 12] - Verify failed to create a new promo because input invalid "Kode Promo" which has a very long promo code

    @And("I input invalid Kode Promo which has a very long promo code in the form create promo")
    public void iInputInvalidKodePromoWhichHasAVeryLongPromoCodeInTheFormCreatePromo() {
        managePromo.inputValidJudulPromo("Promo Paket Keluarga");
        managePromo.inputValidNamaPromo("Promo Family Package");
        managePromo.inputValidKodePromo("4RDNVOVORNVIORNIORNINRINRIVRRRRWWMCOEOENE");
        managePromo.inputValidTanggalKadaluarsa("27032024");
        managePromo.inputValidDiskon("40");
        managePromo.chooseStatusAktif();
        managePromo.inputValidDeskripsi("Menawarkan diskon sebesar 35% untuk keluarga yang membeli tiket wisata");
        managePromo.inputValidPeraturan("minimal 4 tiket");
        managePromo.uploadGambarPromo("file.png");
        managePromo.waitABit();
    }

    @Then("Validate failed to create a new promo because invalid Kode Promo which has a very long promo code and display message {string}")
    public void validateFailedToCreateANewPromoBecauseInvalidKodePromoWhichHasAVeryLongPromoCodeAndDisplayMessage(String failedMessageBecauseInvalidKodePromoWichVeryLong) {
        managePromo.validateFailedAddNewPromoBecauseInvalidKodePromoWhichVeryLong(failedMessageBecauseInvalidKodePromoWichVeryLong);
        managePromo.waitABit();
    }
















    //TC_AW_94 [Negative 13] - Verify failed to create a new promo because input invalid "Tanggal Kadaluarsa" where to input the date that has already passed
    
    @And("I input invalid Tanggal Kadaluarsa in the form create promo")
    public void iInputInvalidTanggalKadaluarsaInTheFormCreatePromo() {
        managePromo.inputValidJudulPromo("Family The Best");
        managePromo.inputValidNamaPromo("Promo Happy Family");
        managePromo.inputValidKodePromo("PROMO2703");
        managePromo.inputValidTanggalKadaluarsa("27032022");
        managePromo.inputValidDiskon("35");
        managePromo.chooseStatusAktif();
        managePromo.inputValidDeskripsi("Menawarkan diskon sebesar 35% untuk keluarga yang membeli tiket wisata");
        managePromo.inputValidPeraturan("minimal 4 tiket");
        managePromo.uploadGambarPromo("file.png");
        managePromo.waitABit();
    }

    @Then("Validate failed to create a new promo because invalid Tanggal Kadaluarsa and display message {string}")
    public void validateFailedToCreateANewPromoBecauseInvalidTanggalKadaluarsaAndDisplayMessage(String failedMessageBecauseInvalidTanggalKadaluarsa) {
        managePromo.validateFailedAddNewPromoBecauseInvalidTanggalKadaluarsa(failedMessageBecauseInvalidTanggalKadaluarsa);
        managePromo.waitABit();
    }


















    //TC_AW_95 [Negative 14] - Verify failed to create a new promo because input invalid "Diskon" with a discount of 0%

    @And("I input invalid Diskon with a discount is 0 in the form create promo")
    public void iInputInvalidDiskonWithADiscountIsInTheFormCreatePromo() {
        managePromo.inputValidJudulPromo("Family The Best");
        managePromo.inputValidNamaPromo("Promo Happy Family");
        managePromo.inputValidKodePromo("PROMO2703");
        managePromo.inputValidTanggalKadaluarsa("27032024");
        managePromo.inputValidDiskon("0");
        managePromo.chooseStatusAktif();
        managePromo.inputValidDeskripsi("Menawarkan diskon sebesar 35% untuk keluarga yang membeli tiket wisata");
        managePromo.inputValidPeraturan("minimal 4 tiket");
        managePromo.uploadGambarPromo("file.png");
        managePromo.waitABit();
    }

    @Then("Validate failed to create a new promo because Diskon with a discount is 0 and display message {string}")
    public void validateFailedToCreateANewPromoBecauseDiskonWithADiscountIsAndDisplayMessage(String failedMessageBecauseInvalidDiskonWith0) {
        managePromo.validateFailedAddNewPromoBecauseInvalidDiskonWith0(failedMessageBecauseInvalidDiskonWith0);
        managePromo.waitABit();
    }



















    //TC_AW_96 [Negative 15] - Verify failed to create a new promo because input invalid "Diskon" with a discount of more than 100%

    @And("I input invalid Diskon with a discount is more than 100% in the form create promo")
    public void iInputInvalidDiskonWithADiscountIsMoreThanInTheFormCreatePromo() {
        managePromo.inputValidJudulPromo("Family The Best");
        managePromo.inputValidNamaPromo("Promo Happy Family");
        managePromo.inputValidKodePromo("PROMO2703");
        managePromo.inputValidTanggalKadaluarsa("27032023");
        managePromo.inputValidDiskon("150");
        managePromo.chooseStatusAktif();
        managePromo.inputValidDeskripsi("Menawarkan diskon sebesar 35% untuk keluarga yang membeli tiket wisata");
        managePromo.inputValidPeraturan("minimal 4 tiket");
        managePromo.uploadGambarPromo("file.png");
        managePromo.waitABit();
    }

    @Then("Validate failed to create a new promo because Diskon with a discount is more than 100% and display message {string}")
    public void validateFailedToCreateANewPromoBecauseDiskonWithADiscountIsMoreThanAndDisplayMessage(String failedMessageBecauseInvalidDiskonMoreThan100) {
        managePromo.validateFailedAddNewPromoBecauseInvalidDiskonMoreThan100(failedMessageBecauseInvalidDiskonMoreThan100);
        managePromo.waitABit();
    }

















    //TC_AW_97 [Positive 2] - Verify success to create a new promo even though select status "Tidak Aktif"

    @And("I input status Tidak Aktif of new promo")
    public void iInputStatusTidakAktifOfNewPromo() {
        managePromo.inputValidJudulPromo("Family The Best");
        managePromo.inputValidNamaPromo("Promo Happy Family");
        managePromo.inputValidKodePromo("PROMO2703");
        managePromo.inputValidTanggalKadaluarsa("27032024");
        managePromo.inputValidDiskon("35");
        managePromo.chooseStatusTidakAktif();
        managePromo.inputValidDeskripsi("Menawarkan diskon sebesar 35% untuk keluarga yang membeli tiket wisata");
        managePromo.inputValidPeraturan("minimal 4 tiket");
        managePromo.uploadGambarPromo("file.png");
        managePromo.waitABit();
    }

    @Then("Validate success to create a new promo with Status Tidak Aktif and display message {string}")
    public void validateSuccessToCreateANewPromoWithStatusTidakAktifAndDisplayMessage(String successMessageAddPromo) {
        managePromo.validateSuccessAddNewPromoEvenThoughSelectStatusTidakAktif(successMessageAddPromo);
        managePromo.waitABit();
    }

















    //TC_AW_98 [Negative 16] - Verify failed to create a new promo because input invalid "Description"

    @And("I input invalid Description in the form create promo")
    public void iInputInvalidDescriptionInTheFormCreatePromo() {
        managePromo.inputValidJudulPromo("Promo Paket Keluarga");
        managePromo.inputValidNamaPromo("Promo Family Package");
        managePromo.inputValidKodePromo("FAMILY27");
        managePromo.inputValidTanggalKadaluarsa("27032024");
        managePromo.inputValidDiskon("40");
        managePromo.chooseStatusAktif();
        managePromo.inputValidDeskripsi("N/A");
        managePromo.inputValidPeraturan("minimal 4 tiket");
        managePromo.uploadGambarPromo("file.png");
        managePromo.waitABit();
    }

    @Then("Validate failed to create a new promo because invalid Description and display message {string}")
    public void validateFailedToCreateANewPromoBecauseInvalidDescriptionAndDisplayMessage(String failedMessageBecauseInvalidDescription) {
        managePromo.validateFailedAddNewPromoBecauseInvalidDescription(failedMessageBecauseInvalidDescription);
        managePromo.waitABit();
    }




















    //TC_AW_99 [Negative 17] - Verify failed to create a new promo because input invalid "Peraturan"

    @And("I input invalid Peraturan in the form create promo")
    public void iInputInvalidPeraturanInTheFormCreatePromo() {
        managePromo.inputValidJudulPromo("Promo Paket Keluarga");
        managePromo.inputValidNamaPromo("Promo Family Package");
        managePromo.inputValidKodePromo("FAMILY27");
        managePromo.inputValidTanggalKadaluarsa("27032024");
        managePromo.inputValidDiskon("40");
        managePromo.chooseStatusAktif();
        managePromo.inputValidDeskripsi("Menawarkan diskon sebesar 35% untuk keluarga yang membeli tiket wisata");
        managePromo.inputValidPeraturan("rieonnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnrieonnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnrieonnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnrieonnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnrieonnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnrieonnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnrieonnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnrieonnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnrieonnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnrieonnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnrieonnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnrieonnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnrieonnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnrieonnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnrieonnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnrieonnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnrieonnnnnnnnnnnnrieonnnnnnnnnnnnrieonnnnnnnnnnnnrieonnnnnnnnnnnnrieonnnnnnnnnnnnrieonnnnnnnnnnnnrieonnnnnnnnnnnnrieonnnnnnnnnnnnrieonnnnnnnnnnnnrieonnnnnnnnnnnnrieonnnnnnnnnnnnrieonnnnnnnnnnnnrieonnnnnnnnnnnnrieonnnnnnnnnnnnrieonnnnnnnnnnnnrieonnnnnnnnnnnnrieonnnnnnnnnnnnrieonnnnnnnnnnnnrieonnnnnnnnnnnnrieonnnnnnnnnnnnrieonnnnnnnnnnnnrieonnnnnnnnnnnnrieonnnnnnnnnnnnrieonnnnnnnnnnnnrieonnnnnnnnnnnnrieonnnnnnnnnnnnrieonnnnnnnnnnnnrieonnnnnnnnnnnnrieonnnnnnnnnnnnrieonnnnnnnnnnnnrieonnnnnnnnnnnnrieonnnnnnnnnnnnrieonnnnnnnnnnnnrieonnnnnnnnnnnnrieonnnnnnnnnnnnrieonnnnnnnnnnnnrieonnnnnnnnnnnnrieonnnnnnnnnnnndwww");
        managePromo.uploadGambarPromo("file.png");
        managePromo.waitABit();
    }

    @Then("Validate failed to create a new promo because invalid Peraturan and display message {string}")
    public void validateFailedToCreateANewPromoBecauseInvalidPeraturanAndDisplayMessage(String failedMessageBecauseInvalidPeraturan) {
        managePromo.validateFailedAddNewPromoBecauseInvalidPeraturan(failedMessageBecauseInvalidPeraturan);
        managePromo.waitABit();
    }
















    //TC_AW_100 [Negative 18] - Verify failed to create a new promo because input invalid "Gambar Promo"

    @And("I input invalid Gambar Promo in the form create promo")
    public void iInputInvalidGambarPromoInTheFormCreatePromo() {
        managePromo.inputValidJudulPromo("Promo Paket Keluarga");
        managePromo.inputValidNamaPromo("Promo Family Package");
        managePromo.inputValidKodePromo("FAMILY27");
        managePromo.inputValidTanggalKadaluarsa("27032024");
        managePromo.inputValidDiskon("40");
        managePromo.chooseStatusAktif();
        managePromo.inputValidDeskripsi("Menawarkan diskon sebesar 35% untuk keluarga yang membeli tiket wisata");
        managePromo.inputValidPeraturan("minimal 4 tiket");
        managePromo.uploadGambarPromo("file.pdf");
        managePromo.waitABit();
    }

    @Then("Validate failed to create a new promo because invalid Gambar Promo and display message {string}")
    public void validateFailedToCreateANewPromoBecauseInvalidGambarPromoAndDisplayMessage(String failedMessageBecauseInvalidGambarPromo) {
        managePromo.validateFailedAddNewPromoBecauseInvalidGambarPromo(failedMessageBecauseInvalidGambarPromo);
        managePromo.waitABit();
    }















    //TC_AW_101 [Negative 19] - Verify failed to create a new promo because input name of the promo that had already been registered

    @And("I input name of the promo that had already been registered in the form create promo")
    public void iInputNameOfThePromoThatHadAlreadyBeenRegisteredInTheFormCreatePromo() {
        managePromo.inputValidJudulPromo("Promo Paket Keluarga");
        managePromo.inputValidNamaPromo("Relaxation Retreat");
        managePromo.inputValidKodePromo("FAMILY27");
        managePromo.inputValidTanggalKadaluarsa("27032024");
        managePromo.inputValidDiskon("40");
        managePromo.chooseStatusAktif();
        managePromo.inputValidDeskripsi("Menawarkan diskon sebesar 35% untuk keluarga yang membeli tiket wisata");
        managePromo.inputValidPeraturan("minimal 4 tiket");
        managePromo.uploadGambarPromo("file.png");
        managePromo.waitABit();
    }

    @Then("Validate failed to create a new promo because input name of the promo that had already been registered and display message {string}")
    public void validateFailedToCreateANewPromoBecauseInputNameOfThePromoThatHadAlreadyBeenRegisteredAndDisplayMessage(String failedMessageBecauseNameAlreadyRegistered) {
        managePromo.validateFailedAddNewPromoBecauseNameAlreadyRegistered(failedMessageBecauseNameAlreadyRegistered);
        managePromo.waitABit();
    }
















    //TC_AW_102 [Negative 20] - Verify failed to create a new promo because input kode of the promo that had already been registered

    @And("I input kode of the promo that had already been registered in the form create promo")
    public void iInputKodeOfThePromoThatHadAlreadyBeenRegisteredInTheFormCreatePromo() {
        managePromo.inputValidJudulPromo("Promo Paket Keluarga");
        managePromo.inputValidNamaPromo("Promo Family Package");
        managePromo.inputValidKodePromo("RETREATGO1");
        managePromo.inputValidTanggalKadaluarsa("27032024");
        managePromo.inputValidDiskon("40");
        managePromo.chooseStatusAktif();
        managePromo.inputValidDeskripsi("Menawarkan diskon sebesar 35% untuk keluarga yang membeli tiket wisata");
        managePromo.inputValidPeraturan("minimal 4 tiket");
        managePromo.uploadGambarPromo("file.png");
        managePromo.waitABit();
    }

    @Then("Validate failed to create a new promo because input kode of the promo that had already been registered and display message {string}")
    public void validateFailedToCreateANewPromoBecauseInputKodeOfThePromoThatHadAlreadyBeenRegisteredAndDisplayMessage(String failedMessageBecauseKodeAlreadyRegistered) {
        managePromo.validateFailedAddNewPromoBecauseKodeAlreadyRegistered(failedMessageBecauseKodeAlreadyRegistered);
        managePromo.waitABit();
    }

















    //TC_AW_103 [Negative 21] - Verify failed to create a new promo because input title of the promo that had already been registered

    @And("I input title of the promo that had already been registered in the form create promo")
    public void iInputTitleOfThePromoThatHadAlreadyBeenRegisteredInTheFormCreatePromo() {
        managePromo.inputValidJudulPromo("Promo Kasih Sayang");
        managePromo.inputValidNamaPromo("Promo Family Package");
        managePromo.inputValidKodePromo("FAMILY27");
        managePromo.inputValidTanggalKadaluarsa("27032024");
        managePromo.inputValidDiskon("40");
        managePromo.chooseStatusAktif();
        managePromo.inputValidDeskripsi("Menawarkan diskon sebesar 35% untuk keluarga yang membeli tiket wisata");
        managePromo.inputValidPeraturan("minimal 4 tiket");
        managePromo.uploadGambarPromo("file.png");
        managePromo.waitABit();
    }

    @Then("Validate failed to create a new promo because input title of the promo that had already been registered and display message {string}")
    public void validateFailedToCreateANewPromoBecauseInputTitleOfThePromoThatHadAlreadyBeenRegisteredAndDisplayMessage(String failedMessageBecauseTitleAlreadyRegistered) {
        managePromo.validateFailedAddNewPromoBecauseTitleAlreadyRegistered(failedMessageBecauseTitleAlreadyRegistered);
        managePromo.waitABit();
    }

















    //TC_AW_104 [Positive 3] - Verify success to update promo "Relaxation Retreat" with valid data

    @And("I search the name of the promo that i want to edit")
    public void iSearchTheNameOfThePromoThatIWantToEdit() {
        managePromo.inputNameToBeSearch("Relaxation Retreat");
    }

    @And("I click the update button or icon on the selected promo")
    public void iClickTheUpdateButtonOrIconOnTheSelectedPromo() {
        managePromo.clickEditIcon();
    }

    @And("I edit data promo with valid data")
    public void iEditDataPromoWithValidData() {
        managePromo.inputValidJudulPromo("Promo Hari Kasih Sayang");
        managePromo.inputValidKodePromo("1JAN2024");
        managePromo.inputValidTanggalKadaluarsa("01012024");
        managePromo.inputValidDiskon("35");
        managePromo.chooseStatusTidakAktif();
        managePromo.inputValidDeskripsi("Menawarkan diskon sebesar 35% untuk penyambutan tahun baru");
        managePromo.inputValidPeraturan("Batas pembelian tiket 5 kali");
        managePromo.waitABit();
    }

    @And("I go to click Simpan button")
    public void iGoToClickSimpanButton() {
        managePromo.clickSimpanButton();
    }

    @Then("Validate success to update promo with valid data and display message {string}")
    public void validateSuccessToUpdatePromoWithValidDataAndDisplayMessage(String successMessageEditPromo) {
        managePromo.validateSuccessEditPromoWithValidData(successMessageEditPromo);
        managePromo.waitABit();
    }


















    //TC_AW_105 [Negative 22] - Verify failed to update promo "Relaxation Retreat" because input invalid "Diskon"

    @And("I edit data promo with invalid Diskon")
    public void iEditDataPromoWithInvalidDiskon() {
        managePromo.inputValidDiskon("200");
    }

    @Then("Validate failed to update promo because invalid Diskon and display message {string}")
    public void validateFailedToUpdatePromoBecauseInvalidDiskonAndDisplayMessage(String failedMessageBecauseInvalidDiskonWith200) {
        managePromo.validateFailedEditPromoBecauseInvalidDiskonWith200(failedMessageBecauseInvalidDiskonWith200);
        managePromo.waitABit();
    }

















    //TC_AW_106 [Positive 4] - Verify success to update promo "Relaxation Retreat" with drag christmastEdit.jpg to form

    @And("I edit data promo with drag christmastEdit.jpg to form")
    public void iEditDataPromoWithDragChristmastEditJpgToForm() {
        managePromo.uploadGambarPromo("christmastEdit.jpg");
    }


















    //TC_AW_107 [Negative 23] - Verify failed to update promo "Relaxation Retreat" because drag file.pdf to form

    @And("I edit data promo with drag file.pdf to form")
    public void iEditDataPromoWithDragFilePdfToForm() {
        managePromo.uploadGambarPromo("file.pdf");
    }

    @Then("Validate failed to update promo because drag file pdf and display message {string}")
    public void validateFailedToUpdatePromoBecauseDragFilePdfAndDisplayMessage(String failedMessageBecauseDragFilePDF) {
        managePromo.validateFailedEditPromoBecauseDragFilePDF(failedMessageBecauseDragFilePDF);
        managePromo.waitABit();
    }

















    //TC_AW_108 [Positive 5] - Verify success to delete promo

    @And("I search the Promo Relaxation Retreat")
    public void iSearchThePromoFamilyPackage() {
        managePromo.inputNameInSearchField("Relaxation Retreat");
    }

    @And("I click delete button or icon on the selected promo")
    public void iClickDeleteButtonOrIconOnTheSelectedPromo() {
        managePromo.clickDeleteIcon();
    }

    @And("I choose Hapus button to delete the promo")
    public void iChooseHapusButtonToDeleteThePromo() {
        managePromo.clickHapusButton();
    }

    @Then("Validate success to delete promo and display message {string}")
    public void validateSuccessToDeletePromoAndDisplayMessage(String successMessageDeletePromo) {
        managePromo.validateSuccessDeleteDestination(successMessageDeletePromo);
        managePromo.waitABit();
    }



















    //TC_AW_109 [Positive 6] - Verify success cancel to delete promo

    @And("I search the name of Promo Tahun Baru")
    public void iSearchTheNameOfPromoNEWYEAR() {
        managePromo.inputNameInSearchField("Promo Tahun Baru");
    }

    @And("I choose the Cancel button")
    public void iChooseTheCancelButton() {
        managePromo.clickCancelButton();
        managePromo.waitABit();
    }

    @Then("Validate success cancel for delete promo")
    public void validateSuccessCancelForDeletePromo() {
        managePromo.validateSuccessCancelDeletePromo();
        managePromo.waitABit();
    }














    //TC_AW_110 [Positive 7] - Verify success to search promo for Existing in the table data promo

    @And("I search name Promo Tahun Baru")
    public void iSearchNamePromoNovember() {
        managePromo.inputNameInSearchField("Promo Tahun Baru");
    }

    @Then("Validate success to display the search result for the promo")
    public void validateSuccessToDisplayTheSearchResultForThePromo() {
        managePromo.validateSuccessSearchPromoForExistingData();
    }

















    //TC_AW_111 [Negative 24] - Verify failed to search promo because input Non-Existent in the table data promo

    @And("I input non existent promo like Desember ceria in the search field")
    public void iInputNonExistentPromoLikeDesemberCeriaInTheSearchField() {
        managePromo.inputNameInSearchField("Desember ceria");
    }

    @Then("Validate failed to search promo and display message {string}")
    public void validateFailedToSearchPromoAndDisplayMessage(String notFoundPromo) {
        managePromo.validateFailedToGetResultOfSearchingPromo(notFoundPromo);
        managePromo.waitABit();
    }
















    //TC_AW_112 [Positive 8] - Verify success to ask in virtual assistant with valid question where related about promo

    @And("I click icon icon virtual assistant")
    public void iClickIconIconVirtualAssistant() {
        managePromo.clickIconVirtualAssistant();
    }

    @And("I input valid questions about the promo")
    public void iInputValidQuestionsAboutThePromo() {
        managePromo.inputQuestionInFieldVirtualAssistant("saat ini penjualan saya sedang menurun, kira kira bisakah berikan saya rekomendasi promo agar pengunjung kembali ramai. berikan saya nama promo dan jumlah potongan persen yang dapat menarik pengguna");
    }

    @And("I click send button Virtual Assistant")
    public void iClickSendButtonVirtualAssistant() {
        managePromo.clickSendButtonVirtualAssistant();
        managePromo.waitABit();
    }

    @Then("Validate success to getting answer for questions")
    public void validateSuccessToGettingAnswerForQuestions() {
        managePromo.ValidateSuccessGetAnswerInVirtualAssistantPromo();
        managePromo.waitABit();
    }

















    //TC_AW_113 [Negative 25] - Verify failed to ask in virtual assistant because did not input question

    @And("I did not input question")
    public void iDidNotInputQuestion() {
        managePromo.inputQuestionInFieldVirtualAssistant("");
    }

    @Then("Validate failed to getting answer and display error message {string}")
    public void validateFailedToGettingAnswerAndDisplayErrorMessage(String failedMessageBecauseEmptyQuestion) {
        managePromo.validateFailedGetAnswerInVirtualAssistant(failedMessageBecauseEmptyQuestion);
        managePromo.waitABit();
    }

















    //TC_AW_114 [Negative 26] - Verify failed to ask in virtual assistant because input invalid question which is not related to the promo

    @And("I input invalid question which is not related to the promo")
    public void iInputInvalidQuestionWhichIsNotRelatedToThePromo() {
        managePromo.inputQuestionInFieldVirtualAssistant("rekomendasi tempat wisata yang bagus di jakarta");
    }










    //TC_AW_115 [Positive 9] - Verify success to clear history of questions that have been asked successfully

    @And("I click reload button to clear history of questions")
    public void iClickReloadButtonToClearHistoryOfQuestions() {
        managePromo.clickReloadButtonVirtualAssistant();
    }

    @Then("Validate success to clear the history of previous Q&A interactions and display {string}")
    public void validateSuccessToClearTheHistoryOfPreviousQAInteractions(String successReload) {
        managePromo.validateSuccessReloadQuestionInVirtualAssistant(successReload);
        managePromo.waitABit();
    }
















    //TC_AW_116 [Positive 10] - Verify success to displays data with a maximum of 50 data results

    @And("I will scrolls down in the menu promo and then click maksimal Tampilan button")
    public void iWillScrollsDownInTheMenuPromoAndThenClickMaksimalTampilanButton() {
        managePromo.scrollDownAndClickMaksimalTampilanButton();
    }

    @And("I want to choose option Tampilkan 50 Data")
    public void iWantToChooseOptionTampilkanData50() {
        managePromo.chooseOption50Tampilan();
    }

    @Then("Validate success to display data promo between {int} to {int} data")
    public void validateSuccessToDisplayDataPromoBetweenToData(int minItems, int maxItems) {
        managePromo.validateDisplayDataMaximum50(minItems, maxItems);
    }

















    //TC_AW_117 [Positive 11] - Verify success to displays data with a maximum of 100 data results

    @And("I want to choose option Tampilkan 100 Data")
    public void iWantToChooseOptionTampilkanData100() {
        managePromo.chooseOption100Tampilan();
    }

    @Then("Validate success to display a data promo between {int} to {int} data")
    public void validateSuccessToDisplayADataPromoBetweenToData(int minData, int maxData) {
        managePromo.validateDisplayDataMaximum100(minData, maxData);
    }




















    //TC_AW_118 [Positive 12] - Verify success to displays the next page which also contains other promo

    @And("I will scrolls down and I click the next button")
    public void iWillScrollsDownAndIClickTheNextButton() {
        managePromo.scrollDownClickTheNextButton();
    }

    @Then("Validate success to displays the next page which also contains the other promo")
    public void validateSuccessToDisplaysTheNextPageWhichAlsoContainsTheOtherPromo() {
        managePromo.validateOnTheNextPage();
    }






















    //TC_AW_119 [Positive 13] - Verify success to displays the previous page which also contains other promo

    @And("I click a back button")
    public void iClickABackButton() {
        managePromo.scrollDownClickTheBackButton();
    }

    @Then("Validate success to displays the previous page which also contains the promo")
    public void validateSuccessToDisplaysThePreviousPageWhichAlsoContainsThePromo() {
        managePromo.validateOnThePreviousPage();
    }


}
