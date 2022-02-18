package com.bookIT.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.ArrayList;
import java.util.List;

public class bookITMMTeamPage extends BasePage{

//   @FindBys({
//           @FindBy(xpath = "//p[.='role']"),
//           @FindBy(xpath = "//p[.='name']")
//   })
    @FindBy(xpath = "//div[@class='card-content is-transparent']//p[.='name']/preceding-sibling::p")
    public List<WebElement> all;

    public List<String> allTeam(){
        List<String> team = new ArrayList<>();
        for (int i = 0; i < all.size(); i++) {
            team.add(all.get(i).getText());
        }
        return team;
    }



}
