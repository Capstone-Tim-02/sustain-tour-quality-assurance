package starter.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;

public class Admin_ManageCategory extends PageObject {

    // =============================================TC_AW_30============================================================

    private By menuCategory(){
        return By.xpath("/html/body/div/div[2]/div[1]/div[2]/nav/ul/li/ul/li[4]");
    }

    private By tambahCategoryButton(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[2]/button");
    }

    private By addNameCategoryOnField(){
        return By.xpath("/html/body/div[3]/form/div/label/div/input");
    }

    private By tambahCategoryOption(){
        return By.xpath("/html/body/div[3]/div[2]/button[2]");
    }

    private By messageSuccessAddNewCategory(){
        return By.xpath("/html/body/div/div[1]/div");
    }


    // =============================================TC_AW_31============================================================

    private By messageFailedAddNewCategory(){
        return By.xpath("/html/body/div/div[1]/div");
    }

    // =============================================TC_AW_32============================================================

    private By messageFailedUnderTheNameField(){
        return By.xpath("/html/body/div[3]/form/div/div");
    }

    // ===========================================TC_AW_34=========================================================

    private By cancelButton(){
        return By.xpath("/html/body/div[3]/div[2]/button[1]");
    }

    private By displayDataCategory(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[1]/div");
    }

    // ===========================================TC_AW_35=========================================================

    private By searchField(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[2]/div/label/div/input");
    }

    private By EditIcon(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[3]/div/table/tbody/tr[1]/td[3]/div/button[1]");
    }

    private By nameFieldForEditCategory(){
        return By.xpath("/html/body/div[3]/form/div/label/div/input");
    }

    private By simpanButton(){
        return By.xpath("/html/body/div[3]/div[2]/button[2]");
    }

    private By messageSuccessEditCategory(){
        return By.xpath("/html/body/div/div[1]/div");
    }

    // ===========================================TC_AW_36=========================================================

    private By messageFailedUpdateCategory(){
        return By.xpath("/html/body/div/div[1]/div");
    }

    // ===========================================TC_AW_40=========================================================

    private By DeleteIcon(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[3]/div/table/tbody/tr[1]/td[3]/div/button[2]");
    }

    private By HapusButton(){
        return By.xpath("/html/body/div[3]/div[2]/button[2]");
    }

    private By messageSuccessDeleteCategory(){
        return By.xpath("/html/body/div/div[1]/div");
    }

    // ===========================================TC_AW_42=========================================================

    private By validateTableBody(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[3]/div/table/tbody");
    }

    // ===========================================TC_AW_43=========================================================

    private By messageDataNotAvailable(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[3]/div/table/tbody/tr/td");
    }

    // ===========================================TC_AW_44=========================================================

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

    // ===========================================TC_AW_45=========================================================

    private By option100Tampilan(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[4]/div/div[1]/div/label/div/select/option[3]");
    }

    // ===========================================TC_AW_46=========================================================

    private By nextButtonToNextPage(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[4]/div/div[2]/div/button[4]");
    }

    private By onTheNextPage(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[4]/div/div[2]/div/button[3]");
    }

    // ===========================================TC_AW_47=========================================================

    private By backButtonToPreviousPage(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[4]/div/div[2]/div/button[1]");
    }

    private By onThePreviousPage(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[4]/div/div[2]/div/button[2]");
    }















    //TC_AW_30 [Positive 1] - Verify success to create a new category with valid name of category

    @Step
    public void clickMenuCategory(){
        $(menuCategory()).click();
        waitABit(3000);
    }

    @Step
    public void clickTambahCategoryButton(){
        $(tambahCategoryButton()).click();
        waitABit(3000);
    }

    @Step
    public void inputValidNameOfANewCategoryWithValidName(String validNameOfNewCategory){
        $(addNameCategoryOnField()).type(validNameOfNewCategory);
        waitABit(3000);
    }

    @Step
    public void clickTambahCategoryOption(){
        $(tambahCategoryOption()).click();
        waitABit(3000);
    }

    @Step
    public boolean validateSuccessAddNewCategoryWithValidName(String successMessageAddCategory){
        return ($(messageSuccessAddNewCategory()).getText().equalsIgnoreCase(successMessageAddCategory));
    }


















    //TC_AW_31 [Negative 1] - Verify failed to create a new category because input an existing name

    @Step
    public void inputNameOfANewCategoryThatAlreadyExists(String existingNameOfNewCategory){
        $(addNameCategoryOnField()).type(existingNameOfNewCategory);
        waitABit(3000);
    }

    @Step
    public boolean validateFailedAddNewCategoryBecauseInputAnExistingName(String failedMessageAddCategoryBecauseExistingName){
        return ($(messageFailedAddNewCategory()).getText().equalsIgnoreCase(failedMessageAddCategoryBecauseExistingName));
    }















    //TC_AW_32 [Negative 2] - Verify failed to create a new category because input invalid name

    @Step
    public void inputInvalidNameOfANewCategory(String invalidNameOfNewCategory){
        $(addNameCategoryOnField()).type(invalidNameOfNewCategory);
        waitABit(3000);
    }

    @Step
    public boolean validateFailedAddNewCategoryBecauseInvalidName(String failedMessageAddCategoryBecauseInvalidName){
        return ($(messageFailedUnderTheNameField()).getText().equalsIgnoreCase(failedMessageAddCategoryBecauseInvalidName));
    }



















    //TC_AW_33 [Negative 3] - Verify failed to create a new category because did not input name of the category

    @Step
    public void didNotInputNameOfANewCategory(String EmptyNameOfNewCategory){
        $(addNameCategoryOnField()).type(EmptyNameOfNewCategory);
        waitABit(3000);
    }

    @Step
    public boolean validateFailedAddNewCategoryBecauseEmptyName(String failedMessageAddCategoryBecauseEmptyName){
        return ($(messageFailedUnderTheNameField()).getText().equalsIgnoreCase(failedMessageAddCategoryBecauseEmptyName));
    }


















    //TC_AW_34 [Positive 2] - Verify success to cancel for create new category

    @Step
    public void clickCancelButton(){$(cancelButton()).click();
    }

    @Step
    public void validateSuccessCancelAddNewCategory() {
        $(displayDataCategory()).isDisplayed();
    }




















    //TC_AW_35 [Positive 3] - Verify success to update category "Air terjun" with valid name

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
    public void inputValidNameToEditDataCategory(String validName){
        $(nameFieldForEditCategory()).type(validName);
    }

    @Step
    public void clickSimpanButton(){
        $(simpanButton()).click();
        waitABit(3000);
    }

    @Step
    public boolean validateSuccessEditCategoryWithValidName(String successMessageEditCategory){
        return ($(messageSuccessEditCategory()).getText().equalsIgnoreCase(successMessageEditCategory));
    }

    @Step
    public void waitABit(){
        waitABit(3000);
    }


















    //TC_AW_36 [Negative 4] - Verify failed to update category "wisata alam" because input an existing name

    @Step
    public void inputNameWithExistingDataToEditCategory(String existingNameCategory){
        $(nameFieldForEditCategory()).type(existingNameCategory);
        waitABit(3000);
    }

    @Step
    public boolean validateFailedEditCategoryBecauseExistingName(String failedMessageBecauseExistingName){
        return $(messageFailedUpdateCategory()).getText().equalsIgnoreCase(failedMessageBecauseExistingName);
    }

























    //TC_AW_37 [Negative 5] - Verify failed to update category "wisata alam" because input invalid name

    @Step
    public void inputInvalidNameToEditDataCategory(String invalidNameCategory){
        $(nameFieldForEditCategory()).type(invalidNameCategory);
    }

    @Step
    public boolean validateFailedEditDataCategoryBecauseInvalidName(String failedMessageBecauseInvalidName){
        return $(messageFailedUnderTheNameField()).getText().equalsIgnoreCase(failedMessageBecauseInvalidName);
    }

















    //TC_AW_38 [Negative 6] - Verify failed to update category "wisata alam" because did not input name of the category

    @Step
    public void didNotInputNameToEditDataCategory(String emptyName){
        $(nameFieldForEditCategory()).type(emptyName);
    }

    @Step
    public boolean validateFailedEditCategoryBecauseEmptyName(String failedMessageBecauseEmptyName){
        return $(messageFailedUnderTheNameField()).getText().equalsIgnoreCase(failedMessageBecauseEmptyName);
    }






















    //TC_AW_39 [Positive 4] - Verify success to cancel for update data category

    @Step
    public void validateSuccessCancelEditCategory() {
        $(displayDataCategory()).isDisplayed();
    }
















    //TC_AW_40 [Positive 5] - Verify success to delete category

    @Step
    public void inputNameInSearchFieldToDeleteCategory(String searchName){
        $(searchField()).type(searchName);
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
    public boolean validateSuccessDeleteCategory(String successMessageDeleteCategory){
        return $(messageSuccessDeleteCategory()).getText().equalsIgnoreCase(successMessageDeleteCategory);
    }























    //TC_AW_41 [Positive 6] - Verify success to cancel for delete user category

    @Step
    public void validateSuccessCancelUpdateCategory() {
        $(displayDataCategory()).isDisplayed();
    }














    //TC_AW_42 [Positive 7] - Verify success to search category for existing name

    @Step
    public void validateSuccessToSearchCategoryForExistingData() {
        waitABit(3000);
        List<WebElementFacade> dataItems = findAll(validateTableBody());
        assertThat("Search results are not empty", dataItems.size(), greaterThan(0));
        waitABit(3000);
    }


















    //TC_AW_43 [Negative 7] - Verify failed to search category because input Non-Existent name

    @Step
    public boolean validateFailedToGetResultOfSearchingCategory(String notFoundCategory){
        return $(messageDataNotAvailable()).getText().equalsIgnoreCase(notFoundCategory);
    }




















    //TC_AW_44 [Positive 8] - Verify success to displays data with a maximum of 50 data results

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























    //TC_AW_45 [Positive 9] - Verify success to displays data with a maximum of 100 data results

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



















    //TC_AW_46 [Positive 10] - Verify success to displays the next page which also contains other categories

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





















    //TC_AW_47 [Positive 11] - Verify success to displays the previous page which also contains other categories

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
