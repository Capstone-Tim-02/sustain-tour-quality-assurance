package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Admin_Login;
import starter.pages.Admin_ManageDestinationContents;

public class Admin_ManageDestinationContents_Steps {

    @Steps
    Admin_Login adminLogin;

    @Steps
    Admin_ManageDestinationContents manageDestinationContents;



    //TC_AW_48 [Positive 1] - Verify success to create a new category with valid name of category

    @Given("I am login and already on the dashboard of the Destimate")
    public void iAmLoginAndAlreadyOnTheDashboardOfTheDestimate() {
        adminLogin.openDestimateWebsite();
        adminLogin.inputValidUsername("admin");
        adminLogin.inputValidKataSandi("admin123");
        adminLogin.clickEyesIcon();
        adminLogin.clickMasukButton();
    }

    @When("I click menu Destination")
    public void iClickMenuDestination() {
        manageDestinationContents.clickMenuCategory();
    }

    @And("I click Tambah Destinasi button")
    public void iClickTambahDestinasiButton() {
        manageDestinationContents.clickTambahDestinasiButton();
    }

    @And("I input valid data of new destination")
    public void iInputValidDataOfNewDestination() {
        manageDestinationContents.inputValidDestinasiKode("PBB");
        manageDestinationContents.inputValidNamaDestinasi("Pantai Bulbul");
        manageDestinationContents.inputValidLokasiKota("Balige");
        manageDestinationContents.inputValidURLPeta("https://maps.app.goo.gl/kTnbAAuH5J3FhVw39");
        manageDestinationContents.inputValidAlamat("Balige, Sumatera Utara");
        manageDestinationContents.inputValidLatitudePeta("2.348616508757384");
        manageDestinationContents.inputValidLongitudePeta("99.0732244877909");
        manageDestinationContents.chooseStatusDestination();
        manageDestinationContents.inputDeskripsiForStatus("Pukul 07.00 - 19.00 WIB");
        manageDestinationContents.inputURLVideo("https://www.youtube.com/watch?v=wcMeux4lZnc");
        manageDestinationContents.chooseKategori();
        manageDestinationContents.inputFasilitasLokal("Tersedianya Fasilitas Toilet yang Memadai, Tersedianya Tempat Sampah, Banana boat, Speed Boat");
        manageDestinationContents.inputHighlight("Berbeda dari pantai pada umumnya, pantai air tawar ini berada di tepi sekitar Danau Toba. Di sepanjang pinggiran pantainya terdapat pasir putih yang menjadi ciri khas dari tempat wisata ini.");
        manageDestinationContents.inputJumlahStokTiket("10000");
        manageDestinationContents.inputHargaTiket("20000");
        manageDestinationContents.uploadGambarDestinasi("bulbul1.jpeg", "bulbul2.jpg", "bulbul3.jpg");
    }

    @And("I click Tambah Destinasi option")
    public void iClickTambahDestinasiOption() {
        manageDestinationContents.clickTambahDestinasiOption();
    }

    @Then("Validate success to create a new destination with valid data and display message {string}")
    public void validateSuccessToCreateANewDestinationWithValidDataAndDisplayMessage(String successMessageAddDestination) {
        manageDestinationContents.validateSuccessAddNewDestinationWithValidData(successMessageAddDestination);
    }
























    //TC_AW_49 [Negative 1] - Verify failed to create a new destination because did not input Destinasi Kode

    @And("I did not input Destinasi Kode in the form create destination")
    public void iDidNotInputDestinasiKodeInTheFormCreateDestination() {
        manageDestinationContents.inputValidDestinasiKode("");
        manageDestinationContents.inputValidNamaDestinasi("Pemandian Air Panas Sipoholon");
        manageDestinationContents.inputValidLokasiKota("Tarutung");
        manageDestinationContents.inputValidURLPeta("https://maps.app.goo.gl/GiZo7s7ahnrnSMe57");
        manageDestinationContents.inputValidAlamat("Tarutung, Tapanuli Utara");
        manageDestinationContents.inputValidLatitudePeta("2.074838614491135");
        manageDestinationContents.inputValidLongitudePeta("98.94347507871815");
        manageDestinationContents.chooseStatusDestination();
        manageDestinationContents.inputDeskripsiForStatus("Pukul 07.00 - 19.00 WIB");
        manageDestinationContents.chooseKategori();
        manageDestinationContents.inputFasilitasLokal("Area Parkir Gratis, Kolam Pemandian Air Panas, Spot Foto Instagramable, Warung Makan");
        manageDestinationContents.inputHighlight("Destinasi ini muncul akibat aktivitas vulkanik di kawasan kolam magma yang terus tumbuh di bawah kaldera Toba. Aktivitas vulkanik itulah yang menghasilkan energi dan beberapa di antaranya muncul ke permukaan yang mewujudkan keindahan serta keunikan adalah Air Panas di Desa Sipoholon yang selama ini dikenal luas masyarakat sebagai lokasi pemandian air panas Sipoholon");
        manageDestinationContents.inputJumlahStokTiket("10000");
        manageDestinationContents.inputHargaTiket("10000");
        manageDestinationContents.uploadGambarDestinasi("sipoholon1.jpeg", "sipoholon2.jpg", "sipoholon3.jpg");
    }

    @Then("Validate failed to create a new destination because did not input Destinasi Kode and display message {string}")
    public void validateFailedToCreateANewDestinationBecauseDidNotInputDestinasiKodeAndDisplayMessage(String failedMessageBecauseEmptyDestinasiKode) {
        manageDestinationContents.validateFailedAddNewDestinationWBecauseEmptyDestinasiKode(failedMessageBecauseEmptyDestinasiKode);
    }


















    //TC_AW_50 [Negative 2] - Verify failed to create a new destination because did not input "Nama Destinasi"

    @And("I did not input Nama Destinasi in the form create destination")
    public void iDidNotInputNamaDestinasiInTheFormCreateDestination() {
        manageDestinationContents.inputValidDestinasiKode("PAPS");
        manageDestinationContents.inputValidNamaDestinasi("");
        manageDestinationContents.inputValidLokasiKota("Tarutung");
        manageDestinationContents.inputValidURLPeta("https://maps.app.goo.gl/GiZo7s7ahnrnSMe57");
        manageDestinationContents.inputValidAlamat("Tarutung, Tapanuli Utara");
        manageDestinationContents.inputValidLatitudePeta("2.074838614491135");
        manageDestinationContents.inputValidLongitudePeta("98.94347507871815");
        manageDestinationContents.chooseStatusDestination();
        manageDestinationContents.inputDeskripsiForStatus("Pukul 07.00 - 19.00 WIB");
        manageDestinationContents.chooseKategori();
        manageDestinationContents.inputFasilitasLokal("Area Parkir Gratis, Kolam Pemandian Air Panas, Spot Foto Instagramable, Warung Makan");
        manageDestinationContents.inputHighlight("Destinasi ini muncul akibat aktivitas vulkanik di kawasan kolam magma yang terus tumbuh di bawah kaldera Toba. Aktivitas vulkanik itulah yang menghasilkan energi dan beberapa di antaranya muncul ke permukaan yang mewujudkan keindahan serta keunikan adalah Air Panas di Desa Sipoholon yang selama ini dikenal luas masyarakat sebagai lokasi pemandian air panas Sipoholon");
        manageDestinationContents.inputJumlahStokTiket("10000");
        manageDestinationContents.inputHargaTiket("10000");
        manageDestinationContents.uploadGambarDestinasi("sipoholon1.jpeg", "sipoholon2.jpg", "sipoholon3.jpg");

    }

    @Then("Validate failed to create a new destination because did not input Nama Destinasi and display message {string}")
    public void validateFailedToCreateANewDestinationBecauseDidNotInputNamaDestinasiAndDisplayMessage(String failedMessageBecauseEmptyNamaDestinasi) {
        manageDestinationContents.validateFailedAddNewDestinationWBecauseEmptyNamaDestinasi(failedMessageBecauseEmptyNamaDestinasi);
    }
















    //TC_AW_51 [Negative 3] - Verify failed to create a new destination because did not input "Lokasi Kota"

    @And("I did not input Lokasi Kota in the form create destination")
    public void iDidNotInputLokasiKotaInTheFormCreateDestination() {
        manageDestinationContents.inputValidDestinasiKode("PAPS");
        manageDestinationContents.inputValidNamaDestinasi("Pemandian Air Panas Sipoholon");
        manageDestinationContents.inputValidLokasiKota("");
        manageDestinationContents.inputValidURLPeta("https://maps.app.goo.gl/GiZo7s7ahnrnSMe57");
        manageDestinationContents.inputValidAlamat("Tarutung, Tapanuli Utara");
        manageDestinationContents.inputValidLatitudePeta("2.074838614491135");
        manageDestinationContents.inputValidLongitudePeta("98.94347507871815");
        manageDestinationContents.chooseStatusDestination();
        manageDestinationContents.inputDeskripsiForStatus("Pukul 07.00 - 19.00 WIB");
        manageDestinationContents.chooseKategori();
        manageDestinationContents.inputFasilitasLokal("Area Parkir Gratis, Kolam Pemandian Air Panas, Spot Foto Instagramable, Warung Makan");
        manageDestinationContents.inputHighlight("Destinasi ini muncul akibat aktivitas vulkanik di kawasan kolam magma yang terus tumbuh di bawah kaldera Toba. Aktivitas vulkanik itulah yang menghasilkan energi dan beberapa di antaranya muncul ke permukaan yang mewujudkan keindahan serta keunikan adalah Air Panas di Desa Sipoholon yang selama ini dikenal luas masyarakat sebagai lokasi pemandian air panas Sipoholon");
        manageDestinationContents.inputJumlahStokTiket("10000");
        manageDestinationContents.inputHargaTiket("10000");
        manageDestinationContents.uploadGambarDestinasi("sipoholon1.jpeg", "sipoholon2.jpg", "sipoholon3.jpg");
    }

    @Then("Validate failed to create a new destination because did not input Lokasi Kota and display message {string}")
    public void validateFailedToCreateANewDestinationBecauseDidNotInputLokasiKotaAndDisplayMessage(String failedMessageBecauseEmptyLokasiKota) {
        manageDestinationContents.validateFailedAddNewDestinationWBecauseEmptyLokasiKota(failedMessageBecauseEmptyLokasiKota);
    }

















    //TC_AW_52 [Negative 4] - Verify failed to create a new destination because did not input "Alamat Peta"

    @And("I did not input Alamat Peta in the form create destination")
    public void iDidNotInputAlamatPetaInTheFormCreateDestination() {
        manageDestinationContents.inputValidDestinasiKode("PAPS");
        manageDestinationContents.inputValidNamaDestinasi("Pemandian Air Panas Sipoholon");
        manageDestinationContents.inputValidLokasiKota("Tarutung");
        manageDestinationContents.inputValidURLPeta("");
        manageDestinationContents.inputValidAlamat("Tarutung, Tapanuli Utara");
        manageDestinationContents.inputValidLatitudePeta("2.074838614491135");
        manageDestinationContents.inputValidLongitudePeta("98.94347507871815");
        manageDestinationContents.chooseStatusDestination();
        manageDestinationContents.inputDeskripsiForStatus("Pukul 07.00 - 19.00 WIB");
        manageDestinationContents.chooseKategori();
        manageDestinationContents.inputFasilitasLokal("Area Parkir Gratis, Kolam Pemandian Air Panas, Spot Foto Instagramable, Warung Makan");
        manageDestinationContents.inputHighlight("Destinasi ini muncul akibat aktivitas vulkanik di kawasan kolam magma yang terus tumbuh di bawah kaldera Toba. Aktivitas vulkanik itulah yang menghasilkan energi dan beberapa di antaranya muncul ke permukaan yang mewujudkan keindahan serta keunikan adalah Air Panas di Desa Sipoholon yang selama ini dikenal luas masyarakat sebagai lokasi pemandian air panas Sipoholon");
        manageDestinationContents.inputJumlahStokTiket("10000");
        manageDestinationContents.inputHargaTiket("10000");
        manageDestinationContents.uploadGambarDestinasi("sipoholon1.jpeg", "sipoholon2.jpg", "sipoholon3.jpg");
    }

    @Then("Validate failed to create a new destination because did not input Alamat Peta and display message {string}")
    public void validateFailedToCreateANewDestinationBecauseDidNotInputAlamatPetaAndDisplayMessage(String failedMessageBecauseEmptyAlamatPeta) {
        manageDestinationContents.validateFailedAddNewDestinationWBecauseEmptyAlamatPeta(failedMessageBecauseEmptyAlamatPeta);
    }

















    //TC_AW_53 [Negative 5] - Verify failed to create a new destination because did not input "Alamat"

    @And("I did not input Alamat in the form create destination")
    public void iDidNotInputAlamatInTheFormCreateDestination() {
        manageDestinationContents.inputValidDestinasiKode("PAPS");
        manageDestinationContents.inputValidNamaDestinasi("Pemandian Air Panas Sipoholon");
        manageDestinationContents.inputValidLokasiKota("Tarutung");
        manageDestinationContents.inputValidURLPeta("https://maps.app.goo.gl/GiZo7s7ahnrnSMe57");
        manageDestinationContents.inputValidAlamat("");
        manageDestinationContents.inputValidLatitudePeta("2.074838614491135");
        manageDestinationContents.inputValidLongitudePeta("98.94347507871815");
        manageDestinationContents.chooseStatusDestination();
        manageDestinationContents.inputDeskripsiForStatus("Pukul 07.00 - 19.00 WIB");
        manageDestinationContents.chooseKategori();
        manageDestinationContents.inputFasilitasLokal("Area Parkir Gratis, Kolam Pemandian Air Panas, Spot Foto Instagramable, Warung Makan");
        manageDestinationContents.inputHighlight("Destinasi ini muncul akibat aktivitas vulkanik di kawasan kolam magma yang terus tumbuh di bawah kaldera Toba. Aktivitas vulkanik itulah yang menghasilkan energi dan beberapa di antaranya muncul ke permukaan yang mewujudkan keindahan serta keunikan adalah Air Panas di Desa Sipoholon yang selama ini dikenal luas masyarakat sebagai lokasi pemandian air panas Sipoholon");
        manageDestinationContents.inputJumlahStokTiket("10000");
        manageDestinationContents.inputHargaTiket("10000");
        manageDestinationContents.uploadGambarDestinasi("sipoholon1.jpeg", "sipoholon2.jpg", "sipoholon3.jpg");
    }

    @Then("Validate failed to create a new destination because did not input Alamat and display message {string}")
    public void validateFailedToCreateANewDestinationBecauseDidNotInputAlamatAndDisplayMessage(String failedMessageBecauseEmptyAlamat) {
        manageDestinationContents.validateFailedAddNewDestinationWBecauseEmptyAlamat(failedMessageBecauseEmptyAlamat);
    }
























    //TC_AW_54 [Negative 6] - Verify failed to create a new destination because did not input "Latitude Peta"

    @And("I did not input Latitude Peta in the form create destination")
    public void iDidNotInputLatitutePetaInTheFormCreateDestination() {
        manageDestinationContents.inputValidDestinasiKode("PAPS");
        manageDestinationContents.inputValidNamaDestinasi("Pemandian Air Panas Sipoholon");
        manageDestinationContents.inputValidLokasiKota("Tarutung");
        manageDestinationContents.inputValidURLPeta("https://maps.app.goo.gl/GiZo7s7ahnrnSMe57");
        manageDestinationContents.inputValidAlamat("Tarutung, Tapanuli Utara");
        manageDestinationContents.inputValidLatitudePeta("");
        manageDestinationContents.inputValidLongitudePeta("98.94347507871815");
        manageDestinationContents.chooseStatusDestination();
        manageDestinationContents.inputDeskripsiForStatus("Pukul 07.00 - 19.00 WIB");
        manageDestinationContents.chooseKategori();
        manageDestinationContents.inputFasilitasLokal("Area Parkir Gratis, Kolam Pemandian Air Panas, Spot Foto Instagramable, Warung Makan");
        manageDestinationContents.inputHighlight("Destinasi ini muncul akibat aktivitas vulkanik di kawasan kolam magma yang terus tumbuh di bawah kaldera Toba. Aktivitas vulkanik itulah yang menghasilkan energi dan beberapa di antaranya muncul ke permukaan yang mewujudkan keindahan serta keunikan adalah Air Panas di Desa Sipoholon yang selama ini dikenal luas masyarakat sebagai lokasi pemandian air panas Sipoholon");
        manageDestinationContents.inputJumlahStokTiket("10000");
        manageDestinationContents.inputHargaTiket("10000");
        manageDestinationContents.uploadGambarDestinasi("sipoholon1.jpeg", "sipoholon2.jpg", "sipoholon3.jpg");
    }

    @Then("Validate failed to create a new destination because did not input Latitute Peta and display message {string}")
    public void validateFailedToCreateANewDestinationBecauseDidNotInputLatitutePetaAndDisplayMessage(String failedMessageBecauseEmptyLatitudePeta) {
        manageDestinationContents.validateFailedAddNewDestinationWBecauseEmptyLatitudePeta(failedMessageBecauseEmptyLatitudePeta);
    }






















    //TC_AW_55 [Negative 7] - Verify failed to create a new destination because did not input "Longitude Peta"

    @And("I did not input Longitude Peta in the form create destination")
    public void iDidNotInputLongitudePetaInTheFormCreateDestination() {
        manageDestinationContents.inputValidDestinasiKode("PAPS");
        manageDestinationContents.inputValidNamaDestinasi("Pemandian Air Panas Sipoholon");
        manageDestinationContents.inputValidLokasiKota("Tarutung");
        manageDestinationContents.inputValidURLPeta("https://maps.app.goo.gl/GiZo7s7ahnrnSMe57");
        manageDestinationContents.inputValidAlamat("Tarutung, Tapanuli Utara");
        manageDestinationContents.inputValidLatitudePeta("2.074838614491135");
        manageDestinationContents.inputValidLongitudePeta("");
        manageDestinationContents.chooseStatusDestination();
        manageDestinationContents.inputDeskripsiForStatus("Pukul 07.00 - 19.00 WIB");
        manageDestinationContents.chooseKategori();
        manageDestinationContents.inputFasilitasLokal("Area Parkir Gratis, Kolam Pemandian Air Panas, Spot Foto Instagramable, Warung Makan");
        manageDestinationContents.inputHighlight("Destinasi ini muncul akibat aktivitas vulkanik di kawasan kolam magma yang terus tumbuh di bawah kaldera Toba. Aktivitas vulkanik itulah yang menghasilkan energi dan beberapa di antaranya muncul ke permukaan yang mewujudkan keindahan serta keunikan adalah Air Panas di Desa Sipoholon yang selama ini dikenal luas masyarakat sebagai lokasi pemandian air panas Sipoholon");
        manageDestinationContents.inputJumlahStokTiket("10000");
        manageDestinationContents.inputHargaTiket("10000");
        manageDestinationContents.uploadGambarDestinasi("sipoholon1.jpeg", "sipoholon2.jpg", "sipoholon3.jpg");
    }

    @Then("Validate failed to create a new destination because did not input Longitude Peta and display message {string}")
    public void validateFailedToCreateANewDestinationBecauseDidNotInputLongitudePetaAndDisplayMessage(String failedMessageBecauseEmptyLongitudePeta) {
        manageDestinationContents.validateFailedAddNewDestinationWBecauseEmptyLongitudePeta(failedMessageBecauseEmptyLongitudePeta);
    }

















    //TC_AW_56 [Negative 8] - Verify failed to create a new destination because did not input "Highlight"

    @And("I did not input Highlight in the form create destination")
    public void iDidNotInputHighlightInTheFormCreateDestination() {
        manageDestinationContents.inputValidDestinasiKode("PAPS");
        manageDestinationContents.inputValidNamaDestinasi("Pemandian Air Panas Sipoholon");
        manageDestinationContents.inputValidLokasiKota("Tarutung");
        manageDestinationContents.inputValidURLPeta("https://maps.app.goo.gl/GiZo7s7ahnrnSMe57");
        manageDestinationContents.inputValidAlamat("Tarutung, Tapanuli Utara");
        manageDestinationContents.inputValidLatitudePeta("2.074838614491135");
        manageDestinationContents.inputValidLongitudePeta("98.94347507871815");
        manageDestinationContents.chooseStatusDestination();
        manageDestinationContents.inputDeskripsiForStatus("Pukul 07.00 - 19.00 WIB");
        manageDestinationContents.chooseKategori();
        manageDestinationContents.inputFasilitasLokal("Area Parkir Gratis, Kolam Pemandian Air Panas, Spot Foto Instagramable, Warung Makan");
        manageDestinationContents.inputHighlight("");
        manageDestinationContents.inputJumlahStokTiket("10000");
        manageDestinationContents.inputHargaTiket("10000");
        manageDestinationContents.uploadGambarDestinasi("sipoholon1.jpeg", "sipoholon2.jpg", "sipoholon3.jpg");
    }

    @Then("Validate failed to create a new destination because did not input Highlight and display message {string}")
    public void validateFailedToCreateANewDestinationBecauseDidNotInputHighlightAndDisplayMessage(String failedMessageBecauseEmptyHighlight) {
        manageDestinationContents.validateFailedAddNewDestinationWBecauseEmptyHighlight(failedMessageBecauseEmptyHighlight);
    }

























    //TC_AW_57 [Negative 9] - Verify failed to create a new destination because did not input "Jumlah Stok Tiket"

    @And("I did not input Jumlah Stok Tiket in the form create destination")
    public void iDidNotInputJumlahStokTiketInTheFormCreateDestination() {
        manageDestinationContents.inputValidDestinasiKode("PAPS");
        manageDestinationContents.inputValidNamaDestinasi("Pemandian Air Panas Sipoholon");
        manageDestinationContents.inputValidLokasiKota("Tarutung");
        manageDestinationContents.inputValidURLPeta("https://maps.app.goo.gl/GiZo7s7ahnrnSMe57");
        manageDestinationContents.inputValidAlamat("Tarutung, Tapanuli Utara");
        manageDestinationContents.inputValidLatitudePeta("2.074838614491135");
        manageDestinationContents.inputValidLongitudePeta("98.94347507871815");
        manageDestinationContents.chooseStatusDestination();
        manageDestinationContents.inputDeskripsiForStatus("Pukul 07.00 - 19.00 WIB");
        manageDestinationContents.chooseKategori();
        manageDestinationContents.inputFasilitasLokal("Area Parkir Gratis, Kolam Pemandian Air Panas, Spot Foto Instagramable, Warung Makan");
        manageDestinationContents.inputHighlight("Destinasi ini muncul akibat aktivitas vulkanik di kawasan kolam magma yang terus tumbuh di bawah kaldera Toba. Aktivitas vulkanik itulah yang menghasilkan energi dan beberapa di antaranya muncul ke permukaan yang mewujudkan keindahan serta keunikan adalah Air Panas di Desa Sipoholon yang selama ini dikenal luas masyarakat sebagai lokasi pemandian air panas Sipoholon");
        manageDestinationContents.inputJumlahStokTiket("");
        manageDestinationContents.inputHargaTiket("10000");
        manageDestinationContents.uploadGambarDestinasi("sipoholon1.jpeg", "sipoholon2.jpg", "sipoholon3.jpg");
    }

    @Then("Validate failed to create a new destination because did not input Jumlah Stok Tiket and display message {string}")
    public void validateFailedToCreateANewDestinationBecauseDidNotInputJumlahStokTiketAndDisplayMessage(String failedMessageBecauseEmptyJumlahStokTiket) {
        manageDestinationContents.validateFailedAddNewDestinationWBecauseEmptyJumlahStokTiket(failedMessageBecauseEmptyJumlahStokTiket);
    }


















    //TC_AW_58 [Negative 10] - Verify failed to create a new destination because did not input "Harga Tiket"

    @And("I did not input Harga Tiket in the form create destination")
    public void iDidNotInputHargaTiketInTheFormCreateDestination() {
        manageDestinationContents.inputValidDestinasiKode("PAPS");
        manageDestinationContents.inputValidNamaDestinasi("Pemandian Air Panas Sipoholon");
        manageDestinationContents.inputValidLokasiKota("Tarutung");
        manageDestinationContents.inputValidURLPeta("https://maps.app.goo.gl/GiZo7s7ahnrnSMe57");
        manageDestinationContents.inputValidAlamat("Tarutung, Tapanuli Utara");
        manageDestinationContents.inputValidLatitudePeta("2.074838614491135");
        manageDestinationContents.inputValidLongitudePeta("98.94347507871815");
        manageDestinationContents.chooseStatusDestination();
        manageDestinationContents.inputDeskripsiForStatus("Pukul 07.00 - 19.00 WIB");
        manageDestinationContents.chooseKategori();
        manageDestinationContents.inputFasilitasLokal("Area Parkir Gratis, Kolam Pemandian Air Panas, Spot Foto Instagramable, Warung Makan");
        manageDestinationContents.inputHighlight("Destinasi ini muncul akibat aktivitas vulkanik di kawasan kolam magma yang terus tumbuh di bawah kaldera Toba. Aktivitas vulkanik itulah yang menghasilkan energi dan beberapa di antaranya muncul ke permukaan yang mewujudkan keindahan serta keunikan adalah Air Panas di Desa Sipoholon yang selama ini dikenal luas masyarakat sebagai lokasi pemandian air panas Sipoholon");
        manageDestinationContents.inputJumlahStokTiket("10000");
        manageDestinationContents.inputHargaTiket("");
        manageDestinationContents.uploadGambarDestinasi("sipoholon1.jpeg", "sipoholon2.jpg", "sipoholon3.jpg");
    }

    @Then("Validate failed to create a new destination because did not input Harga Tiket and display message {string}")
    public void validateFailedToCreateANewDestinationBecauseDidNotInputHargaTiketAndDisplayMessage(String failedMessageBecauseEmptyHargaTiket) {
        manageDestinationContents.validateFailedAddNewDestinationWBecauseEmptyHargaTiket(failedMessageBecauseEmptyHargaTiket);
    }














    //TC_AW_59 [Negative 11] - Verify failed to create a new destination because did not choose "Status" and do not input "Deskripsi"

    @And("I did not choose Status and empty Deskripsi in the form create destination")
    public void iDidNotChooseStatusAndEmptyDeskripsiInTheFormCreateDestination() {
        manageDestinationContents.inputValidDestinasiKode("PAPS");
        manageDestinationContents.inputValidNamaDestinasi("Pemandian Air Panas Sipoholon");
        manageDestinationContents.inputValidLokasiKota("Tarutung");
        manageDestinationContents.inputValidURLPeta("https://maps.app.goo.gl/GiZo7s7ahnrnSMe57");
        manageDestinationContents.inputValidAlamat("Tarutung, Tapanuli Utara");
        manageDestinationContents.inputValidLatitudePeta("2.074838614491135");
        manageDestinationContents.inputValidLongitudePeta("98.94347507871815");
        manageDestinationContents.inputDeskripsiForStatus("");
        manageDestinationContents.chooseKategori();
        manageDestinationContents.inputFasilitasLokal("Area Parkir Gratis, Kolam Pemandian Air Panas, Spot Foto Instagramable, Warung Makan");
        manageDestinationContents.inputHighlight("Destinasi ini muncul akibat aktivitas vulkanik di kawasan kolam magma yang terus tumbuh di bawah kaldera Toba. Aktivitas vulkanik itulah yang menghasilkan energi dan beberapa di antaranya muncul ke permukaan yang mewujudkan keindahan serta keunikan adalah Air Panas di Desa Sipoholon yang selama ini dikenal luas masyarakat sebagai lokasi pemandian air panas Sipoholon");
        manageDestinationContents.inputJumlahStokTiket("10000");
        manageDestinationContents.inputHargaTiket("10000");
        manageDestinationContents.uploadGambarDestinasi("sipoholon1.jpeg", "sipoholon2.jpg", "sipoholon3.jpg");
    }

    @Then("Validate failed to create a new destination because did not choose Status and empty Deskripsi and display message {string} and {string}")
    public void validateFailedToCreateANewDestinationBecauseDidNotChooseStatusAndEmptyDeskripsiAndDisplayMessageAnd(String failedMessageBecauseEmptyStatus, String failedMessageBecauseEmptyDeskripsi) {
        manageDestinationContents.validateFailedAddNewDestinationWBecauseDidNotChooseStatus(failedMessageBecauseEmptyStatus);
        manageDestinationContents.validateFailedAddNewDestinationWBecauseEmptyDeskripsi(failedMessageBecauseEmptyDeskripsi);
    }

























    //TC_AW_60 [Negative 12] - Verify failed to create a new destination because did not choose "Kategori" and did not input "Fasilitas Lokal"

    @And("I did not choose Kategori and empty Fasilitas Lokal in the form create destination")
    public void iDidNotChooseKategoriAndEmptyFasilitasLokalInTheFormCreateDestination() {
        manageDestinationContents.inputValidDestinasiKode("PAPS");
        manageDestinationContents.inputValidNamaDestinasi("Pemandian Air Panas Sipoholon");
        manageDestinationContents.inputValidLokasiKota("Tarutung");
        manageDestinationContents.inputValidURLPeta("https://maps.app.goo.gl/GiZo7s7ahnrnSMe57");
        manageDestinationContents.inputValidAlamat("Tarutung, Tapanuli Utara");
        manageDestinationContents.inputValidLatitudePeta("2.074838614491135");
        manageDestinationContents.inputValidLongitudePeta("98.94347507871815");
        manageDestinationContents.chooseStatusDestination();
        manageDestinationContents.inputDeskripsiForStatus("Pukul 07.00 - 19.00 WIB");
        manageDestinationContents.inputFasilitasLokal("");
        manageDestinationContents.inputHighlight("Destinasi ini muncul akibat aktivitas vulkanik di kawasan kolam magma yang terus tumbuh di bawah kaldera Toba. Aktivitas vulkanik itulah yang menghasilkan energi dan beberapa di antaranya muncul ke permukaan yang mewujudkan keindahan serta keunikan adalah Air Panas di Desa Sipoholon yang selama ini dikenal luas masyarakat sebagai lokasi pemandian air panas Sipoholon");
        manageDestinationContents.inputJumlahStokTiket("10000");
        manageDestinationContents.inputHargaTiket("10000");
        manageDestinationContents.uploadGambarDestinasi("sipoholon1.jpeg", "sipoholon2.jpg", "sipoholon3.jpg");
    }

    @Then("Validate failed to create a new destination because did not choose Kategori and empty Fasilitas Lokal and display message {string} and {string}")
    public void validateFailedToCreateANewDestinationBecauseDidNotChooseKategoriAndEmptyFasilitasLokalAndDisplayMessageAnd(String failedMessageBecauseEmptyKategori, String failedMessageBecauseEmptyFasilitasLokal) {
        manageDestinationContents.validateFailedAddNewDestinationWBecauseDidNotChooseKategori(failedMessageBecauseEmptyKategori);
        manageDestinationContents.validateFailedAddNewDestinationWBecauseEmptyFasilitasLokal(failedMessageBecauseEmptyFasilitasLokal);
    }





















    //TC_AW_61 [Negative 13] - Verify failed to create a new destination because did not input the picture

    @And("I did not input Picture in the form create destination")
    public void iDidNotInputPictureInTheFormCreateDestination() {
        manageDestinationContents.inputValidDestinasiKode("PAPS");
        manageDestinationContents.inputValidNamaDestinasi("Pemandian Air Panas Sipoholon");
        manageDestinationContents.inputValidLokasiKota("Tarutung");
        manageDestinationContents.inputValidURLPeta("https://maps.app.goo.gl/GiZo7s7ahnrnSMe57");
        manageDestinationContents.inputValidAlamat("Tarutung, Tapanuli Utara");
        manageDestinationContents.inputValidLatitudePeta("2.074838614491135");
        manageDestinationContents.inputValidLongitudePeta("98.94347507871815");
        manageDestinationContents.chooseStatusDestination();
        manageDestinationContents.inputDeskripsiForStatus("Pukul 07.00 - 19.00 WIB");
        manageDestinationContents.chooseKategori();
        manageDestinationContents.inputFasilitasLokal("Area Parkir Gratis, Kolam Pemandian Air Panas, Spot Foto Instagramable, Warung Makan");
        manageDestinationContents.inputHighlight("Destinasi ini muncul akibat aktivitas vulkanik di kawasan kolam magma yang terus tumbuh di bawah kaldera Toba. Aktivitas vulkanik itulah yang menghasilkan energi dan beberapa di antaranya muncul ke permukaan yang mewujudkan keindahan serta keunikan adalah Air Panas di Desa Sipoholon yang selama ini dikenal luas masyarakat sebagai lokasi pemandian air panas Sipoholon");
        manageDestinationContents.inputJumlahStokTiket("10000");
        manageDestinationContents.inputHargaTiket("10000");
    }

    @Then("Validate failed to create a new destination because did not input Picture and display message {string}")
    public void validateFailedToCreateANewDestinationBecauseDidNotInputPictureAndDisplayMessage(String failedMessageBecauseEmptyGambarDestinasi) {
        manageDestinationContents.validateFailedAddNewDestinationWBecauseEmptyGambarDestinasi(failedMessageBecauseEmptyGambarDestinasi);
    }



















    //TC_AW_62 [Positve 2] - Verify success to update destination "Pantai Bulbul" with valid data

    @And("I search the name of the destination that i want to edit")
    public void iSearchTheNameOfTheDestinationThatIWantToEdit() {
        manageDestinationContents.inputNameToBeSearch("Pantai Bulbul");
    }

    @And("I click the update button or icon on the selected category")
    public void iClickTheUpdateButtonOrIconOnTheSelectedCategory() {
        manageDestinationContents.clickEditIcon();
    }

    @And("I edit data destination with valid data")
    public void iEditDataDestinationWithValidData() {
        manageDestinationContents.chooseStatusClose();
    }

    @And("I am click Simpan button")
    public void iAmClickSimpanButton() {
        manageDestinationContents.clickSimpanButton();
    }

    @Then("Validate success to update destination with valid data and display message {string}")
    public void validateSuccessToUpdateDestinationWithValidDataAndDisplayMessage(String successMessageEditDestination) {
        manageDestinationContents.validateSuccessEditDestinationWithStatusClose(successMessageEditDestination);
    }
























    //TC_AW_63 [Negative 14] - Verify failed to update destination because input invalid Destinasi Kode

    @And("I edit data destination with invalid Destinasi Kode")
    public void iEditDataDestinationWithInvalidDestinasiKode() {
        manageDestinationContents.inputInvalidDestinasiKode("P");
    }

    @Then("Validate failed to update destination because invalid Destinasi Kode and display message {string}")
    public void validateFailedToUpdateDestinationBecauseInvalidDestinasiKodeAndDisplayMessage(String failedMessageBecauseInvalidDestinasiKode) {
        manageDestinationContents.validateFailedEditDestinationBecauseInvalidDestinasiKode(failedMessageBecauseInvalidDestinasiKode);
    }



















    //TC_AW_64 [Negative 15] - Verify failed to update destination because input invalid "Nama Destinasi"

    @And("I edit data destination with invalid Nama Destinasi")
    public void iEditDataDestinationWithInvalidNamaDestinasi() {
        manageDestinationContents.inputInvalidNamaDestinasi("P");
    }

    @Then("Validate failed to update destination because invalid Nama Destinasi and display message {string}")
    public void validateFailedToUpdateDestinationBecauseInvalidNamaDestinasiAndDisplayMessage(String failedMessageBecauseInvalidNamaDestinasi) {
        manageDestinationContents.validateFailedEditDestinationBecauseInvalidNamaDestinasi(failedMessageBecauseInvalidNamaDestinasi);
    }



















    //TC_AW_65 [Negative 16] - Verify failed to update destination because input invalid "Lokasi Kota"

    @And("I edit data destination with invalid Lokasi Kota")
    public void iEditDataDestinationWithInvalidLokasiKota() {
        manageDestinationContents.inputInvalidLokasiKota("B");
    }

    @Then("Validate failed to update destination because invalid Lokasi Kota and display message {string}")
    public void validateFailedToUpdateDestinationBecauseInvalidLokasiKotaAndDisplayMessage(String failedMessageBecauseInvalidLokasiKota) {
        manageDestinationContents.validateFailedEditDestinationBecauseInvalidLokasiKota(failedMessageBecauseInvalidLokasiKota);
    }






















    //TC_AW_66 [Negative 17] - Verify failed to update destination because input invalid "Alamat Peta"

    @And("I edit data destination with invalid Alamat Peta")
    public void iEditDataDestinationWithInvalidAlamatPeta() {
        manageDestinationContents.inputInvalidAlamatPeta("hh");
    }

    @Then("Validate failed to update destination because invalid Alamat Peta and display message {string}")
    public void validateFailedToUpdateDestinationBecauseInvalidAlamatPetaAndDisplayMessage(String failedMessageBecauseInvalidAlamatPeta) {
        manageDestinationContents.validateFailedEditDestinationBecauseInvalidAlamatPeta(failedMessageBecauseInvalidAlamatPeta);
    }




































    //TC_AW_67 [Negative 18] - Verify failed to update destination because input invalid "Alamat"

    @And("I edit data destination with invalid Alamat")
    public void iEditDataDestinationWithInvalidAlamat() {
        manageDestinationContents.inputInvalidAlamat("-");
    }

    @Then("Validate failed to update destination because invalid Alamat and display message {string}")
    public void validateFailedToUpdateDestinationBecauseInvalidAlamatAndDisplayMessage(String failedMessageBecauseInvalidAlamat) {
        manageDestinationContents.validateFailedEditDestinationBecauseInvalidAlamat(failedMessageBecauseInvalidAlamat);
    }



















    //TC_AW_68 [Negative 19] - Verify failed to update destination because input invalid "Latitude Peta"

    @And("I edit data destination with invalid Latitude Peta")
    public void iEditDataDestinationWithInvalidLatitudePeta() {
        manageDestinationContents.inputInvalidLatitudePeta("-");
    }

    @Then("Validate failed to update destination because invalid Latitude Peta and display message {string}")
    public void validateFailedToUpdateDestinationBecauseInvalidLatitudePetaAndDisplayMessage(String failedMessageBecauseInvalidLatitudePeta) {
        manageDestinationContents.validateFailedEditDestinationBecauseInvalidLatitudePeta(failedMessageBecauseInvalidLatitudePeta);
    }





















    //TC_AW_69 [Negative 20] - Verify failed to update destination because input invalid "Longitude Peta"

    @And("I edit data destination with invalid Longitude Peta")
    public void iEditDataDestinationWithInvalidLongitudePeta() {
        manageDestinationContents.inputInvalidLongitudePeta("-");
    }

    @Then("Validate failed to update destination because invalid Longitude Peta and display message {string}")
    public void validateFailedToUpdateDestinationBecauseInvalidLongitudePetaAndDisplayMessage(String failedMessageBecauseInvalidLongitudePeta) {
        manageDestinationContents.validateFailedEditDestinationBecauseInvalidLongitudePeta(failedMessageBecauseInvalidLongitudePeta);
    }

















    //TC_AW_70 [Negative 21] - Verify failed to update destination because input invalid "Jumlah Stok Tiket"

    @And("I edit data destination with invalid Jumlah Stok Tiket")
    public void iEditDataDestinationWithInvalidJumlahStokTiket() {
        manageDestinationContents.inputInvalidJumlahStokTiket("0");
    }

    @Then("Validate failed to update destination because invalid Jumlah Stok Tiket and display message {string}")
    public void validateFailedToUpdateDestinationBecauseInvalidJumlahStokTiketAndDisplayMessage(String failedMessageBecauseInvalidJumlahStokTiket) {
        manageDestinationContents.validateFailedEditDestinationBecauseInvalidJumlahStokTiket(failedMessageBecauseInvalidJumlahStokTiket);
    }


















    //TC_AW_71 [Negative 22] - Verify failed to update destination because input invalid Harga Tiket

    @And("I edit data destination with invalid Harga Tiket")
    public void iEditDataDestinationWithInvalidHargaTiket() {
        manageDestinationContents.inputInvalidHargaTiket("0");
    }

    @Then("Validate failed to update destination because invalid Harga Tiket and display message {string}")
    public void validateFailedToUpdateDestinationBecauseInvalidHargaTiketAndDisplayMessage(String failedMessageBecauseInvalidHargaTiket) {
        manageDestinationContents.validateFailedEditDestinationBecauseInvalidHargaTiket(failedMessageBecauseInvalidHargaTiket);
    }


















    //TC_AW_72 [Positive 3] - Verify success to delete destination "Pantai Bulbul"

    @And("I search destination Pantai Bulbul with the aim to remove it")
    public void iSearchDestinationPantaiBulbulWithTheAimToRemoveIt() {
        manageDestinationContents.inputNameInSearchField("Pantai Bulbul");
    }

    @And("I click delete button or icon on the selected destination")
    public void iClickDeleteButtonOrIconOnTheSelectedDestination() {
        manageDestinationContents.clickDeleteIcon();
    }

    @And("I choose Hapus button")
    public void iChooseHapusButton() {
        manageDestinationContents.clickHapusButton();
    }

    @Then("Validate success to delete destination and display message {string}")
    public void validateSuccessToDeleteDestinationAndDisplayMessage(String successMessageDeleteDestination) {
        manageDestinationContents.validateSuccessDeleteDestination(successMessageDeleteDestination);
    }



























    //TC_AW_73 [Positive 4] - Verify success cancel to delete user destination

    @And("I search destination Kebun Raya Bogor")
    public void iSearchDestinationKebunRayaBogor() {
        manageDestinationContents.inputNameInSearchField("Kebun Raya Bogor");
    }

    @And("I choose Cancel button")
    public void iChooseCancelButton() {
        manageDestinationContents.clickCancelButton();
    }

    @Then("Validate success to cancel delete destination")
    public void validateSuccessToCancelDeleteDestination() {
        manageDestinationContents.validateSuccessCancelDeleteDestination();
    }
























    //TC_AW_74 [Positive 5] - Verify success to search category for existing name

    @Then("Validate success to display the search result for the destination")
    public void validateSuccessToDisplayTheSearchResultForTheDestination() {
        manageDestinationContents.validateSuccessToSearchDestinationForExistingData();
    }



















    //TC_AW_75 [Negative 23] - Verify failed to search category because input Non-Existent name

    @And("I input non existent destination like Kebun Binatang in the search field")
    public void iInputNonExistentDestinationLikeKebunBinatangInTheSearchField() {
        manageDestinationContents.inputNameInSearchField("Kebun Binatang");
    }

    @Then("Validate failed to search destination and display message {string}")
    public void validateFailedToSearchDestinationAndDisplayMessage(String notFoundDestination) {
        manageDestinationContents.validateFailedToGetResultOfSearchingDestination(notFoundDestination);
        manageDestinationContents.waitABit();
    }
















    //TC_AW_76 [Positive 6] - Verify success to see details of destination

    @And("I click eyes button or icon on the selected destination to see the details")
    public void iClickEyesButtonOrIconOnTheSelectedDestinationToSeeTheDetails() {
        manageDestinationContents.clickEyesButtonOrIcon();
    }

    @Then("Validate success to display detail of the destination")
    public void validateSuccessToDisplayDetailOfTheDestination() {
        manageDestinationContents.validateSuccessToDisplayDetailDestination();
    }




















    //TC_AW_77 [Positive 7] - Verify success to displays data with a maximum of 50 data results

    @And("I will scrolls down and then click maksimal Tampilan button")
    public void iWillScrollsDownAndThenClickMaksimalTampilanButton() {
        manageDestinationContents.scrollDownAndClickMaksimalTampilanButton();
    }

    @And("I want to choose the option Tampilkan 50 Data")
    public void iWantToChooseTheOptionTampilkanData50() {
        manageDestinationContents.chooseOption50Tampilan();
    }

    @Then("Validate success to display data destination between {int} to {int} data")
    public void validateSuccessToDisplayDataDestinationBetweenToData(int minItems, int maxItems) {
        manageDestinationContents.validateDisplayDataMaximum50(0, 50);
        manageDestinationContents.waitABit();
    }




















    //TC_AW_78 [Positive 8] - Verify success to displays data with a maximum of 100 data results

    @And("I want to choose the option Tampilkan 100 Data")
    public void iWantToChooseTheOptionTampilkanData100() {
        manageDestinationContents.chooseOption100Tampilan();
    }

    @Then("Validate success to display of data destination between {int} to {int} data")
    public void validateSuccessToDisplayOfDataDestinationBetweenToData(int minData, int maxData) {
        manageDestinationContents.validateDisplayDataMaximum100(0, 100);
        manageDestinationContents.waitABit();
    }





















    //TC_AW_79 [Positive 9] - Verify success to displays the next page which also contains other destination

    @And("I will scrolls down and then click the next button")
    public void iWillScrollsDownAndThenClickTheNextButton() {
        manageDestinationContents.scrollDownClickTheNextButton();
    }

    @Then("Validate success to displays the next page which also contains the other destination")
    public void validateSuccessToDisplaysTheNextPageWhichAlsoContainsTheOtherDestination() {
        manageDestinationContents.validateOnTheNextPage();
    }




















    //TC_AW_80 [Positive 10] - Verify success to displays the previous page which also contains other destination

    @And("I click the back button")
    public void iClickTheBackButton() {
        manageDestinationContents.scrollDownClickTheBackButton();
    }

    @Then("Validate success to displays the previous page which also contains the destination")
    public void validateSuccessToDisplaysThePreviousPageWhichAlsoContainsTheDestination() {
        manageDestinationContents.validateOnThePreviousPage();
    }
}
