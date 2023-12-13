package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Admin_Login extends PageObject {

    private By usernameFieldForLogin(){
        return By.xpath("/html/body/div/div[2]/div[1]/div/div/div/form/div[1]/label/div/input");
    }

    private By passwordFieldForLogin(){
        return By.xpath("/html/body/div/div[2]/div[1]/div/div/div/form/div[2]/div/label/div/input");
    }

    private By eyesIconToSeePassword(){
        return By.xpath("/html/body/div/div[2]/div[1]/div/div/div/form/div[2]/button");
    }

    private By masukButton(){
        return By.xpath("/html/body/div/div[2]/div[1]/div/div/div/form/button");
    }


    private By messageSuccessLogin(){
        return By.xpath("/html/body/div/div[1]/div");
    }

    private By messageFailedLoginBecauseInvalidUsernameorPassword(){
        return By.xpath("/html/body/div/div[1]/div/div");
    }

    private By emptyUsername(){return By.xpath("/html/body/div/div[2]/div[1]/div[2]/div[2]/div/form/div[1]/div");}

    private By emptyKataSandi(){return By.xpath("/html/body/div/div[2]/div[1]/div[2]/div[2]/div/form/div[2]/div/div");}





    //TC_AW_1 [Positive]


    @Step
    public void openDestimateWebsite(){
        open();
    }

    @Step
    public void inputValidUsername(String validUsername){
        $(usernameFieldForLogin()).type(validUsername);
    }

    @Step
    public void inputValidKataSandi(String validPassword){
        $(passwordFieldForLogin()).type(validPassword);
    }

    @Step
    public void clickEyesIcon(){$(eyesIconToSeePassword()).click();
    }

    @Step
    public void clickMasukButton(){$(masukButton()).click();
    }

    @Step
    public void validateSuccessLogin() {
        $(messageSuccessLogin()).isDisplayed();
    }

    @Step
    public boolean validateSuccessGetText(String successMessage){
        return $(messageSuccessLogin()).getText().equalsIgnoreCase(successMessage);
    }












    //TC_AW_2 [Negative 1]


    @Step
    public void inputInvalidUsername(String invalidUsername) {
        $(usernameFieldForLogin()).type(invalidUsername);
    }

    @Step
    public boolean validateFailedLoginBecauseInvalidUsername(String messageInvalidUsername){
        return $(messageFailedLoginBecauseInvalidUsernameorPassword()).getText().equalsIgnoreCase(messageInvalidUsername);
    }













    //TC_AW_3 [Negative 2]


    @Step
    public void inputInvalidKataSandi(String invalidKataSandi) {
        $(passwordFieldForLogin()).type(invalidKataSandi);
    }

    @Step
    public boolean validateFailedLoginBecauseInvalidKataSandi(String messageInvalidKataSandi){
        return $(messageFailedLoginBecauseInvalidUsernameorPassword()).getText().equalsIgnoreCase(messageInvalidKataSandi);
    }















    //TC_AW_5 [Negative 4]

    @Step
    public void didNotInputUsername() {
        $(usernameFieldForLogin()).click();
    }

    @Step
    public boolean validateFailedLoginBecauseEmptyUsername(String messageEmptyUsername){
        return $(emptyUsername()).getText().equalsIgnoreCase(messageEmptyUsername);
    }













    //TC_AW_6 [Negative 5]

    @Step
    public void didNotInputKataSandi() {
        $(passwordFieldForLogin()).click();
    }

    @Step
    public boolean validateFailedLoginBecauseEmptyKataSandi(String messageEmptyKataSandi){
        return $(emptyKataSandi()).getText().equalsIgnoreCase(messageEmptyKataSandi);
    }

}
