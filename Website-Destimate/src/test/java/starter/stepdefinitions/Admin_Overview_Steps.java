package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Admin_Login;
import starter.pages.Admin_Overview;

public class Admin_Overview_Steps {

    @Steps
    Admin_Login adminLogin;

    @Steps
    Admin_Overview adminOverview;



    //TC_AW_166 [Positive 1] - Verify success to viewing income data by searching from the calendar for today

    @Given("I am login and already on the Overview page")
    public void iAmLoginAndAlreadyOnTheOverviewPage() {
        adminLogin.openDestimateWebsite();
        adminLogin.inputValidUsername("admin");
        adminLogin.inputValidKataSandi("admin123");
        adminLogin.clickEyesIcon();
        adminLogin.clickMasukButton();
    }

    @When("I click field pilih rentang tanggal")
    public void iClickFieldPilihRentangTanggal() {
        adminOverview.clickPilihRentangTanggalField();
    }

    @And("I choose Today to see the income earned today")
    public void iChooseTodayToSeeTheIncomeEarnedToday() {
        adminOverview.clickTodayOption();
    }

    @And("Validate the date in the field rentang tanggal")
    public void validateTheDateInTheFieldRentangTanggal() {
        adminOverview.validateTodayDateDisplayed();
    }

    @And("I click overview text to hide the calendar")
    public void iClickOverviewTextToHideDenganCalendar() {
        adminOverview.clickOverviewText();
    }

    @Then("Validate success to display total income for today")
    public void validateSuccessToDisplayTotalIncomeForToday() {
        adminOverview.validateSuccessDisplayTotalRupiah();
    }












    //TC_AW_167 [Positive 2] - Verify success to viewing income data by searching from the calendar for yesterday

    @And("I choose Yesterday to see the income earned for yesterday")
    public void iChooseYesterdayToSeeTheIncomeEarnedForYesterday() {
        adminOverview.clickYesterdayOption();
    }


    @And("Validate the date range in the field rentang tanggal")
    public void validateTheDateRangeInTheFieldRentangTanggal() {
        adminOverview.validateYesterdayDateDisplayed();
    }

    @Then("Validate success to display total income for yesterday")
    public void validateSuccessToDisplayTotalIncomeForYesterday() {
        adminOverview.validateSuccessDisplayTotalRupiah();
    }








    //TC_AW_168 [Positive 3] - Verify success to viewing income data by searching from the calendar for This Week

    @And("I choose This Week to see the income earned for this week")
    public void iChooseThisWeekToSeeTheIncomeEarnedForThisWeek() {
        adminOverview.clickThisWeekOption();
    }

    @And("Validate the date range in field rentang tanggal")
    public void validateTheDateRangeInFieldRentangTanggal() {
        adminOverview.validateThisWeekDateDisplayed();
    }

    @Then("Validate success to display total income for this week")
    public void validateSuccessToDisplayTotalIncomeForThisWeek() {
        adminOverview.validateSuccessDisplayTotalRupiah();
    }







    
    
    

    //TC_AW_169 [Positive 4] - Verify success to viewing income data by searching from the calendar for Last Week

    @And("I choose This Week to see the income earned for last week")
    public void iChooseThisWeekToSeeTheIncomeEarnedForLastWeek() {
        adminOverview.clickLastWeekOption();
    }

    @And("Validate the date range in a field rentang tanggal")
    public void validateTheDateRangeInAFieldRentangTanggal() {
        adminOverview.validateLastWeekDateDisplayed();
    }

    @Then("Validate success to display total income for last week")
    public void validateSuccessToDisplayTotalIncomeForLastWeek() {
        adminOverview.validateSuccessDisplayTotalRupiah();
    }













    //TC_AW_170 [Positive 5] - Verify success to viewing income data by searching from the calendar for This Month

    @And("I choose This Month to see the income earned for this month")
    public void iChooseThisWeekToSeeTheIncomeEarnedForThisMonth() {
        adminOverview.clickthisMonthOption();
    }

    @And("Validate the range date in a field rentang tanggal")
    public void validateTheRangeDateInAFieldRentangTanggal() {
        adminOverview.validateThisMonthDateDisplayed();
    }

    @Then("Validate success to display total income for this month")
    public void validateSuccessToDisplayTotalIncomeForThisMonth() {
        adminOverview.validateSuccessDisplayTotalRupiah();
    }












    //TC_AW_171 [Positive 6] -  Verify success to viewing income data by searching from the calendar for Last Month

    @And("I choose Last Month to see the income earned for last month")
    public void iChooseLastMonthToSeeTheIncomeEarnedForLastMonth() {
        adminOverview.clickLastMonthOption();
    }

    @And("Validate the range date in the field rentang tanggal")
    public void validateTheRangeDateInTheFieldRentangTanggal() {
        adminOverview.validateLastMonthDateDisplayed();
    }

    @Then("Validate success to display total income for last month")
    public void validateSuccessToDisplayTotalIncomeForLastMonth() {
        adminOverview.validateSuccessDisplayTotalRupiah();
    }













    //TC_AW_172 [Positive 7] - Verify success to viewing income data by searching from the calendar with input "days up to today"

    @And("I input 4 in the field days up to today to see the income earned")
    public void iInputInTheFieldDaysUpToTodayToSeeTheIncomeEarned() {
        adminOverview.inputDaysUpToToday(4);
    }

    @And("Validate a range date in the field rentang tanggal")
    public void validateARangeDateInTheFieldRentangTanggal() {
        adminOverview.validateIncomeOfDaysUpToTodayDisplayed(4);
    }

    @Then("Validate success to display total income for days up to today")
    public void validateSuccessToDisplayTotalIncomeForDaysUpToToday() {
        adminOverview.validateSuccessDisplayTotalRupiah();
    }













    //TC_AW_173 [Positive 8] - Verify success to viewing income data by searching from the calendar with input "days starting today"

    @And("I input total day in the field days starting today to see the income earned")
    public void iInputTotalDayInTheFieldDaysStartingTodayToSeeTheIncomeEarned() {
        adminOverview.inputDaysStartingToday(10);
    }

    @And("Validate a range date in the field of rentang tanggal")
    public void validateARangeDateInTheFieldOfRentangTanggal() {
        adminOverview.validateIncomeOfDaysStartingTodayDisplayed(10);
    }

    @Then("Validate success to display total income for days starting today")
    public void validateSuccessToDisplayTotalIncomeForDaysStartingToday() {
        adminOverview.validateSuccessDisplayTotalRupiah();
    }






    //TC_AW_173 [Positive 8] - Verify success to viewing income data by searching from the calendar with input "days starting today"

    @And("I click back button in calender to choose start date in november")
    public void iClickBackButtonInCalenderToChooseStartDateInNovember() {
        adminOverview.clickBackButtonOnCalender();
    }

    @And("I click on November 23rd for start date")
    public void iClickOnNovemberRdForStartDate() {
        adminOverview.clickNov23rdInCalender();
    }

    @And("I click on December 31st for end date")
    public void iClickOnDecemberStForEndDate() {
        adminOverview.clickDec31stInCalender();
    }

    @Then("Validate success to display total income with click from calender")
    public void validateSuccessToDisplayTotalIncomeWithClickFromCalender() {
        adminOverview.validateSuccessDisplayTotalRupiah();
    }
}
