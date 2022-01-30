package com.bookIT.pages;

import com.bookIT.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class bookITReservationPage {
    public bookITReservationPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[.='hunt']")
    public WebElement huntButton;

    //@FindBy(xpath = "(//span[@class='mat-button-wrapper'])[1]")
    //@FindBy(xpath = "(//div[@class='mat-form-field-infix'])[1]")
    @FindBy(xpath = "//input[@formcontrolname='date']")
    public WebElement inputDate;

    @FindBy(xpath = "//span[.='available solid time']")
    public WebElement availableTimeMsg;

    @FindBy(xpath = "(//div[@class='mat-select-value'])[1]")
    public WebElement startTimeBtn;

    @FindBy(xpath = "(//span[@class='mat-option-text'])[1]")
    public WebElement startTime;

    @FindBy(xpath = "//span[contains(text(),'to')]")
    public WebElement finishTimeBtn;

    @FindBy(xpath = "(//span[@class='mat-option-text'])[1]")
    public WebElement finishTime;

    @FindBy(xpath = "//span[@class='mat-option-text']")
    public WebElement finishTimePic;

    @FindBy(xpath = "//mat-icon[.='search']")
    public WebElement searchBtn;

    @FindBy(xpath = "(//button[@class='button is-transparent is-white'])[1]")
    public WebElement bookBtn;

    @FindBy(xpath = "//button[.='confirm']")
    public WebElement confirmBtn;

    @FindBy(xpath = "//h1[.='yey, you got it']")
    public WebElement confirmationMsg;








}
