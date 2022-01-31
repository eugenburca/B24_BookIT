package com.bookIT.step_definition;

import com.bookIT.pages.BasePage;
import com.bookIT.pages.bookITLoginPage;
import com.bookIT.pages.bookITReservationPage;
import com.bookIT.utils.Driver;
import io.cucumber.java.ca.Cal;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.Calendar;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

public class bookITReservationStepDefs {

    bookITReservationPage bookITReservationPage = new bookITReservationPage();
    bookITLoginPage loginPage = new bookITLoginPage();
    protected WebDriver driver;



    @When("User user clicks [hunt] button")
    public void user_user_clicks_hunt_button() {
    bookITReservationPage.huntButton.click();

    }
    @When("User enters a date, starting time and ending time")
    public void user_enters_a_date_starting_time_and_ending_time() {
        //String dateFormat =LocalDateTime.now().format(DateTimeFormatter.ofPattern("MMMM dd, yyyy"));

        bookITReservationPage.inputDate.click();
        //bookITReservationPage.inputDate.sendKeys(dateFormat);
//        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        //loginPage.wait.until(ExpectedConditions.visibilityOf(bookITReservationPage.availableTimeMsg));

        loginPage.wait.until(ExpectedConditions.visibilityOf(bookITReservationPage.nextMonthBtn));
        int tomorrowDate = Integer.parseInt(bookITReservationPage.todayDate.getText())+1;
        System.out.println(tomorrowDate);
        try {

            WebElement nextDate = Driver.getDriver().findElement(By.xpath("//div[.='"+tomorrowDate+"']"));

            nextDate.click();
        }catch (NoSuchElementException e){
        bookITReservationPage.nextMonthBtn.click();
        bookITReservationPage.firstDayOfMonth.click();

        }

        bookITReservationPage.startTimeBtn.click();
        loginPage.wait.until(ExpectedConditions.visibilityOf(bookITReservationPage.startTime));
        bookITReservationPage.startTime.click();

        bookITReservationPage.finishTimeBtn.click();
        loginPage.wait.until(ExpectedConditions.elementToBeClickable(bookITReservationPage.finishTime));
        bookITReservationPage.finishTime.click();


    }
    @When("User clicks search button")
    public void user_clicks_search_button() {
        bookITReservationPage.searchBtn.click();

    }
    @When("User choose free spot in that date")
    public void user_choose_free_spot_in_that_date() {
    bookITReservationPage.bookBtn.click();

    }
    @When("User confirm the date")
    public void user_confirm_the_date() {
    bookITReservationPage.confirmBtn.click();

    }

    @Then("User should see confirmation status {string}")
    public void userShouldSeeConfirmationStatus(String msg) {
        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        loginPage.wait.until(ExpectedConditions.visibilityOf(bookITReservationPage.confirmationMsg));
        Assert.assertEquals(msg,bookITReservationPage.confirmationMsg.getText());
    }
}
