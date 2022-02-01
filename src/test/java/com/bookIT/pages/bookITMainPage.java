package com.bookIT.pages;

import com.bookIT.utils.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class bookITMainPage extends BasePage {

    //a[normalize-space()='schedule']
    @FindBy (xpath = "//a[@class='navbar-link'][.='schedule']")
    public WebElement scheduleModule;

    //a[@class='navbar-link'][normalize-space()='my']
    @FindBy (xpath = "//a[@class='navbar-link'][.='my']")
    public WebElement myModule;

    //a[normalize-space()='self']
    @FindBy (xpath = "//a[normalize-space()='self']")
    public WebElement myModuleSelfOption;

    //a[normalize-space()='team']
    @FindBy (xpath = "//a[normalize-space()='team']")
    public WebElement myModuleTeamOption;

    //a[@class='navbar-item button is-danger']
    @FindBy (xpath = "//a[@class='navbar-item button is-danger']")
    public WebElement myModuleSignOutOption;

    public void hoverToModule(String module) {
        switch (module){
            case "schedule":
                BrowserUtils.hover(scheduleModule);
                break;
            case "my":
                BrowserUtils.hover(myModule);
                break;
        }
    }

    public void clickOnTab(String tabName){
        switch (tabName) {
            case "self":
                myModuleSelfOption.click();
                break;
            case "team":
                myModuleTeamOption.click();
                break;
            case "sign out":
                myModuleSignOutOption.click();
                break;
        }
    }

    public List<String> myModuleOptionsList() {
        List<String> options = new ArrayList<>();
        options.add(myModuleSelfOption.getText());
        options.add(myModuleTeamOption.getText());
        options.add(myModuleSignOutOption.getText());
        return options;
    }



}
