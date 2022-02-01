package com.bookIT.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class bookITMyModulePage extends BasePage {

    //a[@class='navbar-link'][normalize-space()='my']
    @FindBy (xpath = "//a[@class='navbar-link'][.='my']")
    public WebElement myModuleButton;

    //a[normalize-space()='self']
    @FindBy (xpath = "//a[normalize-space()='self']")
    public WebElement myModuleSelfOption;

    //a[normalize-space()='team']
    @FindBy (xpath = "//a[normalize-space()='team']")
    public WebElement myModuleTeamOption;

    //a[@class='navbar-item button is-danger']
    @FindBy (xpath = "//a[@class='navbar-item button is-danger']")
    public WebElement myModuleSignOutOption;

    




}
