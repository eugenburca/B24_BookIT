package com.bookIT.pages;

import com.bookIT.utils.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public abstract class BasePage {

    public BasePage(){
      PageFactory.initElements(Driver.getDriver(),this);
    //    WebDriver driver = new ChromeDriver();
     //   Driver.getDriver().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
    }



}
