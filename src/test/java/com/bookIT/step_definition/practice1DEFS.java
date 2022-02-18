package com.bookIT.step_definition;

import com.bookIT.pages.practice1;
import com.bookIT.utils.ConfigurationReader;
import com.bookIT.utils.Driver;
import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class practice1DEFS {
    @Test
    public void test1() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("practiceHome"));

        practice1 practice1 = new practice1();

        Faker faker = new Faker();

        JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();


        practice1.firstName.sendKeys(faker.name().firstName());

        practice1.lastName.sendKeys(faker.name().lastName());

        practice1.maleBtn.click();

        practice1.expYears.click();

        String todayDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
        String fakeDate = todayDate.replace("2022","1980");
        practice1.date.sendKeys(fakeDate);

        practice1.profession.click();

        practice1.file.sendKeys("C:\\Users\\14432\\Downloads\\EUJljXfXsAItuqH.jfif");

        //Actions actions = new Actions(Driver.getDriver());
//        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
//        wait.until(ExpectedConditions.elementToBeClickable(practice1.seleniumType));
        //actions.doubleClick(practice1.seleniumType).perform();



       // practice1.seleniumType.click();
        js.executeScript("arguments[0].click()",practice1.seleniumType);
        practice1.selectContinent("Europe");

        practice1.selectSelenium("Switch Commands");

        practice1.submitBtn.click();

        Alert alert = Driver.getDriver().switchTo().alert();

        alert.accept();


    }
}
