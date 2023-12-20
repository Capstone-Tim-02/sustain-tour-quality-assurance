package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Admin_Login;
import starter.pages.Admin_ManageCategory;

public class Admin_ManageCategory_Steps {

    @Steps
    Admin_Login adminLogin;

    @Steps
    Admin_ManageCategory manageCategory;



    //TC_AW_30 [Positive 1] - Verify success to create a new category with valid name of category

    @Given("I will login and already on the dashboard of the Destimate")
    public void iWillLoginAndAlreadyOnTheDashboardOfTheDestimate() {
        adminLogin.openDestimateWebsite();
        adminLogin.inputValidUsername("admin");
        adminLogin.inputValidKataSandi("admin123");
        adminLogin.clickEyesIcon();
        adminLogin.clickMasukButton();
    }

    @When("I click menu Category")
    public void iClickMenuCategory() {
        manageCategory.clickMenuCategory();
    }

    @And("I click Tambah Kategori button")
    public void iClickTambahKategoriButton() {
        manageCategory.clickTambahCategoryButton();
    }

    @And("I input valid name of new category")
    public void iInputValidNameOfNewCategory() {
        manageCategory.inputValidNameOfANewCategoryWithValidName("Air terjun");
    }

    @And("I click Tambah Kategori option")
    public void iClickTambahKategoriOption() {
        manageCategory.clickTambahCategoryOption();
    }

    @Then("Validate success to create a new category with valid name and display message {string}")
    public void validateSuccessToCreateANewCategoryWithValidNameAndDisplayMessage(String successMessageAddCategory) {
        manageCategory.validateSuccessAddNewCategoryWithValidName(successMessageAddCategory);
    }












    //TC_AW_31 [Negative 1] - Verify failed to create a new category because input an existing name

    @And("I input the name of the category that already exists")
    public void iInputTheNameOfTheCategoryThatAlreadyExists() {
        manageCategory.inputNameOfANewCategoryThatAlreadyExists("wisata alam");
    }

    @Then("Validate failed to create a new category because input an existing name and display message {string}")
    public void validateFailedToCreateANewCategoryBecauseInputAnExistingNameAndDisplayMessage(String failedMessageAddCategoryBecauseExistingName) {
        manageCategory.validateFailedAddNewCategoryBecauseInputAnExistingName(failedMessageAddCategoryBecauseExistingName);
    }











    //TC_AW_32 [Negative 2] - Verify failed to create a new category because input invalid name


    @And("I input invalid name of category")
    public void iInputInvalidNameOfCategory() {
        manageCategory.inputInvalidNameOfANewCategory("A");
    }

    @Then("Validate failed to create a new category because input invalid name and display message {string}")
    public void validateFailedToCreateANewCategoryBecauseInputInvalidNameAndDisplayMessage(String failedMessageAddCategoryBecauseInvalidName) {
        manageCategory.validateFailedAddNewCategoryBecauseInvalidName(failedMessageAddCategoryBecauseInvalidName);
        manageCategory. waitABit();
    }














    //TC_AW_33 [Negative 3] - Verify failed to create a new category because did not input name of the category

    @And("I did not input name of the category")
    public void iDidNotInputNameOfTheCategory() {
        manageCategory.didNotInputNameOfANewCategory("");
    }

    @Then("Validate failed to create a new category because did not input name and display message {string}")
    public void validateFailedToCreateANewCategoryBecauseDidNotInputNameAndDisplayMessage(String failedMessageAddCategoryBecauseEmptyName) {
        manageCategory.validateFailedAddNewCategoryBecauseEmptyName(failedMessageAddCategoryBecauseEmptyName);
        manageCategory. waitABit();
    }















    //TC_AW_34 [Positive 2] - Verify success to cancel for create new category

    @And("I click Cancel option")
    public void iClickCancelOption() {
        manageCategory.clickCancelButton();
    }

    @Then("Validate success to cancel for create new category")
    public void validateSuccessToCancelForCreateNewCategory() {
        manageCategory.validateSuccessCancelAddNewCategory();
        manageCategory. waitABit();
    }















    //TC_AW_35 [Positive 3] - Verify success to update category "Air terjun" with valid name

    @And("I search the name of the category that i want to edit")
    public void iSearchTheNameOfTheCategoryThatIWantToEdit() {
        manageCategory.inputNameToBeSearch("Air terjun");
    }

    @And("I click the update button on the selected category")
    public void iClickTheUpdateButtonOnTheSelectedCategory() {
        manageCategory.clickEditIcon();
    }

    @And("I edit data category with valid name")
    public void iEditDataCategoryWithValidName() {
        manageCategory.inputValidNameToEditDataCategory("Wisata Air Terjun");
    }

    @And("I click the Simpan button")
    public void iClickTheSimpanButton() {
        manageCategory.clickSimpanButton();
    }

    @Then("Validate success to update category with valid name and display message {string}")
    public void validateSuccessToUpdateCategoryWithValidNameAndDisplayMessage(String successMessageEditCategory) {
        manageCategory.validateSuccessEditCategoryWithValidName(successMessageEditCategory);
    }




















    //TC_AW_36 [Negative 4] - Verify failed to update category "wisata air terjun because input an existing name

    @And("I input name of the category that already exists")
    public void iInputNameOfTheCategoryThatAlreadyExists() {
        manageCategory.inputNameWithExistingDataToEditCategory("wisata alam");
    }

    @Then("Validate failed to update category because name already exists and display message {string}")
    public void validateFailedToUpdateCategoryBecauseNameAlreadyExistsAndDisplayMessage(String failedMessageBecauseExistingName) {
        manageCategory.validateFailedEditCategoryBecauseExistingName(failedMessageBecauseExistingName);
    }



















    //TC_AW_37 [Negative 5] - Verify failed to update category "Air Terjun" because input invalid name

    @And("I edit data category with invalid name")
    public void iEditDataCategoryWithInvalidName() {
        manageCategory.inputInvalidNameToEditDataCategory("1");
    }

    @Then("Validate failed to update category because invalid name and display message {string}")
    public void validateFailedToUpdateCategoryBecauseInvalidNameAndDisplayMessage(String failedMessageBecauseInvalidName) {
        manageCategory.validateFailedEditDataCategoryBecauseInvalidName(failedMessageBecauseInvalidName);
    }


















    //TC_AW_38 [Negative 6] - Verify failed to update category "Air terjun" because did not input name of the category

    @And("I edit data category without input the name of category")
    public void iEditDataCategoryWithoutInputTheNameOfCategory() {
        manageCategory.didNotInputNameToEditDataCategory("");
    }

    @Then("Validate failed to update category because did not input name and display message {string}")
    public void validateFailedToUpdateCategoryBecauseDidNotInputNameAndDisplayMessage(String failedMessageBecauseEmptyName) {
        manageCategory.validateFailedEditCategoryBecauseEmptyName(failedMessageBecauseEmptyName);
    }















    //TC_AW_39 [Positive 4] - Verify success to cancel for update data category

    @And("I click the Cancel button")
    public void iClickTheCancelButton() {
        manageCategory.clickCancelButton();
    }

    @Then("Validate success to cancel for update category")
    public void validateSuccessToCancelForUpdateCategory() {
        manageCategory.validateSuccessCancelEditCategory();
        manageCategory.waitABit();
    }















    //TC_AW_40 [Positive 5] - Verify success to delete category

    @And("I search the name of the category that i want to delete")
    public void iSearchTheNameOfTheCategoryThatIWantToDelete() {
        manageCategory.inputNameInSearchFieldToDeleteCategory("Wisata Air Terjun");
    }

    @And("I click the delete button or icon on the selected category")
    public void iClickTheDeleteButtonOrIconOnTheSelectedCategory() {
        manageCategory.clickDeleteIcon();
    }

    @And("I click the Hapus button")
    public void iClickTheHapusButton() {
        manageCategory.clickHapusButton();
    }

    @Then("Validate success to delete category and display message {string}")
    public void validateSuccessToDeleteCategoryAndDisplayMessage(String successMessageDeleteCategory) {
        manageCategory.validateSuccessDeleteCategory(successMessageDeleteCategory);}

















    //TC_AW_41 [Positive 6] - Verify success to cancel for delete user category

    @And("I search name of the category that i want to delete")
    public void iSearchNameOfTheCategoryThatIWantToDelete() {
        manageCategory.inputNameInSearchFieldToDeleteCategory("Wisata Pegunungan");
    }

    @And("I click the delete button or icon on the wisata pegunungan")
    public void iClickTheDeleteButtonOrIconOnTheWisataPegunungan() {
        manageCategory.clickDeleteIconForWisataPegunungan();
    }


    @And("I click Cancel button")
    public void iClickCancelButton() {
        manageCategory.clickCancelButton();
    }

    @Then("Validate success to cancel for delete category")
    public void validateSuccessToCancelForDeleteCategory() {
        manageCategory.validateSuccessCancelUpdateCategory();
        manageCategory.waitABit();
    }















    //TC_AW_42 [Positive 7] - Verify success to search category for existing name

    @And("I search the name of the category that i want to search")
    public void iSearchTheNameOfTheCategoryThatIWantToSearch() {
        manageCategory.inputNameToBeSearch("Wisata Sejarah");
    }

    @Then("Validate success to display the search result for the category")
    public void validateSuccessToDisplayTheSearchResultForTheCategory() {
        manageCategory.validateSuccessToSearchCategoryForExistingData();
    }



















    //TC_AW_43 [Negative 7] - Verify failed to search category because input Non-Existent name

    @And("I input non existent category in the search field")
    public void iInputNonExistentCategoryInTheSearchField() {
        manageCategory.inputNameToBeSearch("Wisata Air Panas");
        manageCategory.waitABit();
    }

    @Then("Validate failed to search category and display message {string}")
    public void validateFailedToSearchCategoryAndDisplayMessage(String notFoundCategory) {
        manageCategory.validateFailedToGetResultOfSearchingCategory(notFoundCategory);
    }















    //TC_AW_44 [Positive 8] - Verify success to displays data with a maximum of 50 data results

    @And("I scrolls down and then click maksimal Tampilan button")
    public void iScrollsDownAndThenClickMaksimalTampilanButton() {
        manageCategory.scrollDownAndClickMaksimalTampilanButton();
    }

    @And("I choose the option Tampilkan 50 Data")
    public void iChooseTheOptionTampilkanData50() {
        manageCategory.chooseOption50Tampilan();
    }

    @Then("Validate success to display data category between {int} to {int} data")
    public void validateSuccessToDisplayDataCategoryBetweenToData(int minItems, int maxItems) {
        manageCategory.validateDisplayDataMaximum50(0, 50);
        manageCategory.waitABit();
    }
















    //TC_AW_45 [Positive 9] - Verify success to displays data with a maximum of 100 data results

    @And("I choose the option Tampilkan 100 Data")
    public void iChooseTheOptionTampilkanData100() {
        manageCategory.chooseOption100Tampilan();
    }

    @Then("Validate success to display category between {int} to {int} data")
    public void validateSuccessToDisplayCategoryBetweenToData(int minData, int maxData) {
        manageCategory.validateDisplayDataMaximum100(0, 100);
        manageCategory.waitABit();
    }




















    //TC_AW_46 [Positive 10] - Verify success to displays the next page which also contains other categories

    @And("I scrolls down and then click the next button")
    public void iScrollsDownAndThenClickTheNextButton() {
        manageCategory.scrollDownClickTheNextButton();
    }

    @Then("Validate success to displays the next page which also contains the other categories")
    public void validateSuccessToDisplaysTheNextPageWhichAlsoContainsTheOtherCategories() {
        manageCategory.validateOnTheNextPage();
    }


















    //TC_AW_47 [Positive 11] - Verify success to displays the previous page which also contains other categories

    @And("I scrolls down and then click the back button")
    public void iScrollsDownAndThenClickTheBackButton() {
        manageCategory.scrollDownClickTheBackButton();
    }


    @Then("Validate success to displays the previous page which also contains the category")
    public void validateSuccessToDisplaysThePreviousPageWhichAlsoContainsTheCategory() {
        manageCategory.validateOnThePreviousPage();
    }


}
