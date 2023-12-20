package starter.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Admin_Overview extends PageObject {

    // =============================================TC_AW_166============================================================

    private By pilihRentangTanggalField(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[2]/div/div/div[1]/div/input");
    }

    private By todayOption(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div[1]/button[1]");
    }

    private By overviewText(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[1]/div");
    }

    private By totalRupiah(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[4]/div[1]/div/div/div/p");
    }

    private void scrollDown() {
        WebElementFacade element = find(totalRupiah());
        String script = "arguments[0].scrollIntoView(true);";
        evaluateJavascript(script, element);
    }

    // =============================================TC_AW_167============================================================

    private By yesterdayOption(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div[1]/button[2]");
    }

    // =============================================TC_AW_168============================================================

    private By thisWeekOption(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div[1]/button[3]");
    }

    // =============================================TC_AW_169============================================================

    private By lastWeekOption(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div[1]/button[4]");
    }

    // =============================================TC_AW_170============================================================

    private By thisMonthOption(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div[1]/button[5]");
    }

    // =============================================TC_AW_171============================================================

    private By lastMonthOption(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div[1]/button[6]");
    }

    // =============================================TC_AW_172============================================================

    private By daysUpToTodayField(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div[2]/div[1]/input");
    }

    // =============================================TC_AW_173============================================================

    private By daysStartingTodayField(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/input");
    }

    // =============================================TC_AW_174============================================================

    private By backButtonInCalender(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[2]/div/div/div[2]/div/div[2]/div[2]/button[1]");
    }

    private By startDate23Nov(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[2]/div/div/div[2]/div/div[2]/div[3]/div[1]/div[3]/button[26]");
    }

    private By endDate31Des(){
        return By.xpath("/html/body/div/div[2]/div[2]/main/div/div/div[2]/div[2]/div/div/div[2]/div/div[2]/div[3]/div[2]/div[3]/button[36]");
    }

















    //TC_AW_166 [Positive 1] - Verify success to viewing income data by searching from the calendar for today

    @Step
    public void clickPilihRentangTanggalField(){
        waitABit(2000);
        $(pilihRentangTanggalField()).click();
        waitABit(2000);
    }

    @Step
    public void clickTodayOption(){
        $(todayOption()).click();
        waitABit(2000);
    }



    public String getTodayDate() {
        LocalDate today = LocalDate.now();
        String day = String.format("%02d", today.getDayOfMonth()); // Format day with leading zero
        String monthInIndonesian = convertMonthToIndonesian(today.getMonth().name().substring(0, 3));

        return day + " " + monthInIndonesian + " " + today.getYear() + " - " + day + " " + monthInIndonesian + " " + today.getYear();
    }

    @Step
    public void validateTodayDateDisplayed() {
        String expectedDate = getTodayDate();

        WebElement dateField = getDriver().findElement(pilihRentangTanggalField());
        String actualDate = dateField.getAttribute("value");

        // Extract the month from the expected date
        String expectedMonth = expectedDate.split(" ")[1];

        // Convert the expected month to Indonesian
        String expectedMonthInIndonesian = convertMonthToIndonesian(expectedMonth);

        // Replace the English month in the actual date with the Indonesian month
        actualDate = actualDate.replace(expectedMonth, expectedMonthInIndonesian);

        assert actualDate.equals(expectedDate) : "Tanggal yang ditampilkan tidak sesuai dengan ekspektasi. Expected: " + expectedDate + ", Actual: " + actualDate;

        waitABit(2000);
    }

    public static String convertMonthToIndonesian(String monthInEnglish) {
        switch (monthInEnglish.toLowerCase()) {
            case "jan":
                return "Jan";
            case "feb":
                return "Feb";
            case "mar":
                return "Mar";
            case "apr":
                return "Apr";
            case "may":
                return "Mei";
            case "jun":
                return "Jun";
            case "jul":
                return "Jul";
            case "aug":
                return "Ags";
            case "sep":
                return "Sep";
            case "oct":
                return "Okt";
            case "nov":
                return "Nov";
            case "dec":
                return "Des";
            default:
                return monthInEnglish;
        }
    }





    @Step
    public void clickOverviewText(){
        $(overviewText()).click();
        waitABit(2000);
    }

    @Step
    public void validateSuccessDisplayTotalRupiah() {
        scrollDown();
        $(totalRupiah()).isDisplayed();
        waitABit(2000);
    }










    //TC_AW_167 [Positive 2] - Verify success to viewing income data by searching from the calendar for yesterday

    @Step
    public void clickYesterdayOption(){
        $(yesterdayOption()).click();
        waitABit(2000);
    }



    // Method to get the date range for Yesterday
    public String getYesterdayDateRange() {
        LocalDate yesterday = LocalDate.now().minusDays(1);
        String day = String.format("%02d", yesterday.getDayOfMonth());
        String monthInIndonesian = convertMonthToIndonesian(yesterday.getMonth().name().substring(0, 3));

        return day + " " + monthInIndonesian + " " + yesterday.getYear() + " - " + day + " " + monthInIndonesian + " " + yesterday.getYear();
    }

    @Step
    public void validateYesterdayDateDisplayed() {
        String expectedDateRange = getYesterdayDateRange();

        WebElement dateField = getDriver().findElement(pilihRentangTanggalField());
        String actualDateRange = dateField.getAttribute("value");

        // Convert actual date range to English month format
        actualDateRange = convertMonthToIndonesian(actualDateRange);

        assert actualDateRange.equals(expectedDateRange) : "Rentang tanggal yang ditampilkan tidak sesuai dengan ekspektasi. Expected: " + expectedDateRange + ", Actual: " + actualDateRange;
    }




















    //TC_AW_168 [Positive 3] - Verify success to viewing income data by searching from the calendar for This Week

    @Step
    public void clickThisWeekOption(){
        $(thisWeekOption()).click();
        waitABit(2000);
    }



    public String getThisWeekDateRange() {
        LocalDate today = LocalDate.now();
        LocalDate startOfWeek = today.with(DayOfWeek.SUNDAY).minusDays(7);
        LocalDate endOfWeek = today.with(DayOfWeek.SATURDAY);

        String startWeek = String.format("%02d", startOfWeek.getDayOfMonth());
        String endWeek = String.format("%02d", endOfWeek.getDayOfMonth());

        // Panggil getMonth() pada objek LocalDate
        String monthInIndonesianStartWeek = convertMonthToIndonesian(startOfWeek.getMonth().name().substring(0, 3));
        String monthInIndonesianEndWeek = convertMonthToIndonesian(endOfWeek.getMonth().name().substring(0, 3));

        return startWeek + " " + monthInIndonesianStartWeek + " " + startOfWeek.getYear() + " - " + endWeek + " " + monthInIndonesianEndWeek + " " + endOfWeek.getYear();
    }


    @Step
    public void validateThisWeekDateDisplayed() {
        String expectedDateRange = getThisWeekDateRange();

        WebElement dateField = getDriver().findElement(pilihRentangTanggalField());
        String actualDateRange = dateField.getAttribute("value");

        // Convert actual date range to English month format
        actualDateRange = convertMonthToIndonesian(actualDateRange);

        assert actualDateRange.equals(expectedDateRange) : "Rentang tanggal yang ditampilkan tidak sesuai dengan ekspektasi. Expected: " + expectedDateRange + ", Actual: " + actualDateRange;
    }














    //TC_AW_169 [Positive 4] - Verify success to viewing income data by searching from the calendar for Last Week

    @Step
    public void clickLastWeekOption(){
        $(lastWeekOption()).click();
        waitABit(2000);
    }



    public String getLastWeekDateRange() {
        LocalDate today = LocalDate.now();
        LocalDate startOfWeek = today.with(DayOfWeek.SUNDAY).minusDays(14);
        LocalDate endOfWeek = today.with(DayOfWeek.SATURDAY).minusDays(7);

        String startWeek = String.format("%02d", startOfWeek.getDayOfMonth());
        String endWeek = String.format("%02d", endOfWeek.getDayOfMonth());

        // Panggil getMonth() pada objek LocalDate
        String monthInIndonesianStartWeek = convertMonthToIndonesian(startOfWeek.getMonth().name().substring(0, 3));
        String monthInIndonesianEndWeek = convertMonthToIndonesian(endOfWeek.getMonth().name().substring(0, 3));

        return startWeek + " " + monthInIndonesianStartWeek + " " + startOfWeek.getYear() + " - " + endWeek + " " + monthInIndonesianEndWeek + " " + endOfWeek.getYear();
    }


    @Step
    public void validateLastWeekDateDisplayed() {
        String expectedDateRange = getLastWeekDateRange();

        WebElement dateField = getDriver().findElement(pilihRentangTanggalField());
        String actualDateRange = dateField.getAttribute("value");

        // Convert actual date range to English month format
        actualDateRange = convertMonthToIndonesian(actualDateRange);

        assert actualDateRange.equals(expectedDateRange) : "Rentang tanggal yang ditampilkan tidak sesuai dengan ekspektasi. Expected: " + expectedDateRange + ", Actual: " + actualDateRange;
    }
















    //TC_AW_170 [Positive 5] - Verify success to viewing income data by searching from the calendar for This Month

    @Step
    public void clickthisMonthOption(){
        $(thisMonthOption()).click();
        waitABit(2000);
    }



    public String getThisMonthDateRange() {
        LocalDate today = LocalDate.now();
        LocalDate startOfMonth = today.withDayOfMonth(1);
        LocalDate endOfMonth = today.withDayOfMonth(today.lengthOfMonth());

        String startMonth = String.format("%02d", startOfMonth.getDayOfMonth());
        String endMonth = String.format("%02d", endOfMonth.getDayOfMonth());

        // Panggil getMonth() pada objek LocalDate
        String monthInIndonesianStartWeek = convertMonthToIndonesian(startOfMonth.getMonth().name().substring(0, 3));
        String monthInIndonesianEndWeek = convertMonthToIndonesian(endOfMonth.getMonth().name().substring(0, 3));

        return startMonth + " " + monthInIndonesianStartWeek + " " + startOfMonth.getYear() + " - " + endMonth + " " + monthInIndonesianEndWeek + " " + endOfMonth.getYear();
    }


    @Step
    public void validateThisMonthDateDisplayed() {
        String expectedDateRange = getThisMonthDateRange();

        WebElement dateField = getDriver().findElement(pilihRentangTanggalField());
        String actualDateRange = dateField.getAttribute("value");

        // Convert actual date range to English month format
        actualDateRange = convertMonthToIndonesian(actualDateRange);

        assert actualDateRange.equals(expectedDateRange) : "Rentang tanggal yang ditampilkan tidak sesuai dengan ekspektasi. Expected: " + expectedDateRange + ", Actual: " + actualDateRange;
    }






















    //TC_AW_171 [Positive 6] -  Verify success to viewing income data by searching from the calendar for Last Month

    @Step
    public void clickLastMonthOption(){
        $(lastMonthOption()).click();
        waitABit(2000);
    }



    public String getLastMonthDateRange() {
        LocalDate today = LocalDate.now();
        LocalDate startOfLastMonth = today.minusMonths(1).withDayOfMonth(1);
        LocalDate endOfLastMonth = today.minusMonths(1).withDayOfMonth(today.minusMonths(1).lengthOfMonth());

        String startMonth = String.format("%02d", startOfLastMonth.getDayOfMonth());
        String endMonth = String.format("%02d", endOfLastMonth.getDayOfMonth());

        // Panggil getMonth() pada objek LocalDate
        String monthInIndonesianStartWeek = convertMonthToIndonesian(startOfLastMonth.getMonth().name().substring(0, 3));
        String monthInIndonesianEndWeek = convertMonthToIndonesian(endOfLastMonth.getMonth().name().substring(0, 3));

        return startMonth + " " + monthInIndonesianStartWeek + " " + startOfLastMonth.getYear() + " - " + endMonth + " " + monthInIndonesianEndWeek + " " + endOfLastMonth.getYear();
    }


    @Step
    public void validateLastMonthDateDisplayed() {
        String expectedDateRange = getLastMonthDateRange();

        WebElement dateField = getDriver().findElement(pilihRentangTanggalField());
        String actualDateRange = dateField.getAttribute("value");

        // Convert actual date range to English month format
        actualDateRange = convertMonthToIndonesian(actualDateRange);

        assert actualDateRange.equals(expectedDateRange) : "Rentang tanggal yang ditampilkan tidak sesuai dengan ekspektasi. Expected: " + expectedDateRange + ", Actual: " + actualDateRange;
    }






















    //TC_AW_172 [Positive 7] - Verify success to viewing income data by searching from the calendar with input "days up to today"

    @Step
    public void inputDaysUpToToday(int numberDay){
        $(daysUpToTodayField()).type(String.valueOf(numberDay));
        waitABit(2000);
    }



    public String getDaysUpToToday(int numberDay) {
        LocalDate today = LocalDate.now();
        LocalDate startDate = today.minusDays(numberDay - 1); // Kurangkan 1 karena hari ini juga dihitung
        LocalDate endDate = today;

        String startDay = String.format("%02d", startDate.getDayOfMonth());
        String endDay = String.format("%02d", endDate.getDayOfMonth());

        // Panggil getMonth() pada objek LocalDate
        String monthInIndonesianStartWeek = convertMonthToIndonesian(startDate.getMonth().name().substring(0, 3));
        String monthInIndonesianEndWeek = convertMonthToIndonesian(endDate.getMonth().name().substring(0, 3));

        return startDay + " " + monthInIndonesianStartWeek + " " + startDate.getYear() + " - " + endDay + " " + monthInIndonesianEndWeek + " " + endDate.getYear();
    }


    @Step
    public void validateIncomeOfDaysUpToTodayDisplayed(int numberDay) {
        String expectedDateRange = getDaysUpToToday(numberDay);

        WebElement dateField = getDriver().findElement(pilihRentangTanggalField());
        String actualDateRange = dateField.getAttribute("value");

        // Convert actual date range to English month format
        actualDateRange = convertMonthToIndonesian(actualDateRange);

        assert actualDateRange.equals(expectedDateRange) : "Rentang tanggal yang ditampilkan tidak sesuai dengan ekspektasi. Expected: " + expectedDateRange + ", Actual: " + actualDateRange;
    }





















    //TC_AW_173 [Positive 8] - Verify success to viewing income data by searching from the calendar with input "days starting today"

    @Step
    public void inputDaysStartingToday(int numberDay){
        $(daysStartingTodayField()).type(String.valueOf(numberDay));
        waitABit(2000);
    }



    public String getDaysStartingToday(int numberDay) {
        LocalDate today = LocalDate.now();
        LocalDate startDate = today;
        LocalDate endDate = today.plusDays(numberDay - 1); // Kurangkan 1 karena hari ini juga dihitung

        String startDay = String.format("%02d", startDate.getDayOfMonth());
        String endDay = String.format("%02d", endDate.getDayOfMonth());

        // Panggil getMonth() pada objek LocalDate
        String monthInIndonesianStartDay = convertMonthToIndonesian(startDate.getMonth().name().substring(0, 3));
        String monthInIndonesianEndDay = convertMonthToIndonesian(endDate.getMonth().name().substring(0, 3));

        return startDay + " " + monthInIndonesianStartDay + " " + startDate.getYear() + " - " + endDay + " " + monthInIndonesianEndDay + " " + endDate.getYear();
    }


    @Step
    public void validateIncomeOfDaysStartingTodayDisplayed(int numberDay) {
        String expectedDateRange = getDaysStartingToday(numberDay);

        WebElement dateField = getDriver().findElement(pilihRentangTanggalField());
        String actualDateRange = dateField.getAttribute("value");

        // Convert actual date range to English month format
        actualDateRange = convertMonthToIndonesian(actualDateRange);

        assert actualDateRange.equals(expectedDateRange) : "Rentang tanggal yang ditampilkan tidak sesuai dengan ekspektasi. Expected: " + expectedDateRange + ", Actual: " + actualDateRange;
    }




















    //TC_AW_173 [Positive 8] - Verify success to viewing income data by searching from the calendar with input "days starting today"

    @Step
    public void clickBackButtonOnCalender(){
        $(backButtonInCalender()).click();
        waitABit(2000);
    }


    @Step
    public void clickNov23rdInCalender(){
        $(startDate23Nov()).click();
        waitABit(2000);
    }

    @Step
    public void clickDec31stInCalender(){
        $(endDate31Des()).click();
        waitABit(2000);
    }

}
