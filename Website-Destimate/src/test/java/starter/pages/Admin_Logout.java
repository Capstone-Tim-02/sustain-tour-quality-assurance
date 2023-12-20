package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.NoSuchElementException;

public class Admin_Logout extends PageObject {

    // =============================================TC_AW_142============================================================

    private By logoutIcon(){
        return By.xpath("/html/body/div/div[2]/div[1]/div[3]/div[2]/button");
    }

    private By keluarOption(){
        return By.xpath("//button[contains(text(), 'Keluar')]");
    }

    private By validateSuccessLogout(){
        return By.xpath("/html/body/div/div[1]/div/div/div[1]");
    }


    // =============================================TC_AW_143============================================================

    private By cancelOption(){
        return By.xpath("//button[contains(text(), 'Batal')]");
    }

    private By validateStayOnTheOverview(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[1]/div");
    }















    //TC_AW_142 [Positive 1] - Verify success logout from account Destimate

    @Step
    public void clickLogoutIcon(){
        waitABit(3000);
        $(logoutIcon()).click();
        waitABit(3000);
    }

    @Step
    public void clickKeluarOption(){
        $(keluarOption()).click();
        waitABit(3000);
    }


    @Step
    public void validateSuccessLogoutAndOnTheLoginPage(String successLogout){
        try {
            WebElement resultMessage = find(validateSuccessLogout());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(successLogout)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + successLogout + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }











    //TC_AW_143 [Positive 2] - Verify success cancel to logout

    @Step
    public void clickCancelOption(){
        $(cancelOption()).click();
        waitABit(3000);
    }

    @Step
    public void validateStayOnTheOverview(String stayOnTheOverview){
        try {
            WebElement resultMessage = find(validateStayOnTheOverview());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(stayOnTheOverview)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + stayOnTheOverview + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }








}
