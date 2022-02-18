package com.bookIT.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;
import java.util.Map;

public class bookITMMSelfPage extends BasePage {

    @FindBy(xpath = "//p[.='name']")
    public WebElement name;
    @FindBy(xpath = "//p[.='name']/preceding-sibling::p")
    public WebElement nameData;

    @FindBy(xpath = "//p[.='role']")
    public WebElement role;
    @FindBy(xpath = "//p[.='role']/preceding-sibling::p")
    public WebElement roleData;

    @FindBy(xpath = "//p[.='team']")
    public WebElement team;
    @FindBy(xpath = "//p[.='team']/preceding-sibling::p")
    public WebElement teamData;

    @FindBy(xpath = "//p[.='batch']")
    public WebElement batch;
    @FindBy(xpath = "//p[.='batch']/preceding-sibling::p")
    public WebElement batchData;

    @FindBy(xpath = "//p[.='campus']")
    public WebElement campus;
    @FindBy(xpath = "//p[.='campus']/preceding-sibling::p")
    public WebElement campusData;

    @FindBy(xpath = "//p[.='side']/preceding-sibling::p")
    public WebElement sideStatus;

    public Map<String, String> userDetailInfoMap(){
        Map<String, String> data = new HashMap<>();
        data.put(name.getText(), nameData.getText());
        data.put(role.getText(), roleData.getText());
        data.put(team.getText(), teamData.getAttribute("textContent"));
        data.put(batch.getText(), batchData.getAttribute("textContent"));
        data.put(campus.getText(), campusData.getText());
        return data;
    }







}
