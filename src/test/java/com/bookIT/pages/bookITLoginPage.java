package com.bookIT.pages;

import com.bookIT.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class bookITLoginPage {
    public bookITLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);

    @FindBy(name = "email")
    public WebElement email;

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;


    @FindBy(xpath = "//h1[.='map']")
    public WebElement mapSign;

    @FindBy(xpath ="//div[.='[object ProgressEvent]']")
    public WebElement errorMessage;



}
