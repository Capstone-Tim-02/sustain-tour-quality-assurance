package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.NoSuchElementException;

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

    private By emptyUsername(){return By.xpath("/html/body/div/div[2]/div[1]/div/div/div/form/div[1]/div");}

    private By emptyKataSandi(){return By.xpath("/html/body/div/div[2]/div[1]/div/div/div/form/div[2]/div/div");}





    //TC_AW_1 [Positive]


    @Step
    public void openDestimateWebsite(){
        String url1 = "https://cms-dev-destimate.netlify.app/login";
        openAt(url1);
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
    public void clickMasukButton(){
        $(masukButton()).click();
        waitABit(1000);
    }

    @Step
    public void validateSuccessLogin() {
        $(messageSuccessLogin()).isDisplayed();
    }

    @Step
    public void validateSuccessGetText(String successMessage){
        try {
            WebElement resultMessage = find(messageSuccessLogin());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(successMessage)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + successMessage + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }












    //TC_AW_2 [Negative 1]


    @Step
    public void inputInvalidUsername(String invalidUsername) {
        $(usernameFieldForLogin()).type(invalidUsername);
    }

    @Step
    public void validateFailedLoginBecauseInvalidUsername(String messageInvalidUsername){
        try {
            WebElement resultMessage = find(messageFailedLoginBecauseInvalidUsernameorPassword());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(messageInvalidUsername)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + messageInvalidUsername + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }













    //TC_AW_3 [Negative 2]


    @Step
    public void inputInvalidKataSandi(String invalidKataSandi) {
        $(passwordFieldForLogin()).type(invalidKataSandi);
    }

    @Step
    public void validateFailedLoginBecauseInvalidKataSandi(String messageInvalidKataSandi){
        try {
            WebElement resultMessage = find(messageFailedLoginBecauseInvalidUsernameorPassword());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(messageInvalidKataSandi)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + messageInvalidKataSandi + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }




    //TC_AW_4 [Negative 3]

    @Step
    public void validateFailedLoginBecauseInvalidUsernameAndPassword(String messageInvalidUsernameAndPassword){
        try {
            WebElement resultMessage = find(messageFailedLoginBecauseInvalidUsernameorPassword());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(messageInvalidUsernameAndPassword)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + messageInvalidUsernameAndPassword + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }















    //TC_AW_5 [Negative 4]

    @Step
    public void didNotInputUsername() {
        $(usernameFieldForLogin()).click();
    }

    @Step
    public void validateFailedLoginBecauseEmptyUsername(String messageEmptyUsername){
        try {
            WebElement resultMessage = find(emptyUsername());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(messageEmptyUsername)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + messageEmptyUsername + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }













    //TC_AW_6 [Negative 5]

    @Step
    public void didNotInputKataSandi() {
        $(passwordFieldForLogin()).click();
    }

    @Step
    public void validateFailedLoginBecauseEmptyKataSandi(String messageEmptyKataSandi){
        try {
            WebElement resultMessage = find(emptyKataSandi());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(messageEmptyKataSandi)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + messageEmptyKataSandi + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }

}
