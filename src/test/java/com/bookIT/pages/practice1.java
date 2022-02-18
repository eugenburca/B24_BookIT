package com.bookIT.pages;

import com.bookIT.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class practice1 {
    public practice1(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//input[@name='firstname']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@name='lastname']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@value='Male']")
    public WebElement maleBtn;

    @FindBy(xpath = "//input[@value='2']")
    public WebElement expYears;

    @FindBy (xpath = "//tbody/tr[5]/td[2]/input[1]")
    public WebElement date;

    @FindBy(xpath = "//input[@value='Automation Tester']")
    public WebElement profession;

    @FindBy(xpath = "//input[@type='file']")
    public WebElement file;

    @FindBy(xpath = "//input[@value='Selenium Webdriver']")
    public WebElement seleniumType;

    @FindBy(xpath = "//select[@name='continents']")
    public WebElement continent;

    public void selectContinent(String continentBtn) {
        Select select = new Select(continent);
        select.selectByVisibleText(continentBtn);
    }
        @FindBy(xpath = "//select[@name='selenium_commands']")
                public WebElement seleniumCommands;
    public void selectSelenium(String seleniumBtn) {
        Select select = new Select(seleniumCommands);
        select.selectByVisibleText(seleniumBtn);
    }

    @FindBy(xpath = "//button[@name='submit']")
    public WebElement submitBtn;
}
