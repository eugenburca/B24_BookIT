package com.bookIT.pages;

import com.bookIT.utils.Driver;
import io.cucumber.java.en_old.Ac;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookItMapPage {

    public BookItMapPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//div[@class='navbar-item has-dropdown is-hoverable']/a[.='my']")
    public WebElement myButton;

    @FindBy(xpath = "//div[@class='navbar-item has-dropdown is-hoverable']/a[.='team']")
    public WebElement teamButton;



}
