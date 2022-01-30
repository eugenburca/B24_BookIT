package com.bookIT.step_definition;

import com.bookIT.pages.bookITLoginPage;
import com.bookIT.utils.ConfigurationReader;
import com.bookIT.utils.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class bookITLoginStepDefs {

    bookITLoginPage bookITLoginPage = new bookITLoginPage();

    @Given("User is on web page")
    public void user_is_on_web_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("bookItWebPage"));
        Assert.assertEquals("bookit", Driver.getDriver().getTitle());
    }
    @When("User enters valid credentials and clicks [sign in] button")
    public void userEntersValidCredentialsAndClicksSignInButton() {
        bookITLoginPage.email.sendKeys(ConfigurationReader.getProperty("user_name"));
        bookITLoginPage.password.sendKeys(ConfigurationReader.getProperty("password"));
        bookITLoginPage.signInButton.click();
    }
    @Then("User should be on home page")
    public void user_should_be_on_home_page() {
        Assert.assertEquals("map", bookITLoginPage.mapSign.getText());

    }


    @When("User enters invalid login {string}")
    public void userEntersInvalidLogin(String email) {
        bookITLoginPage.email.sendKeys(email);
    }

    @And("User enters invalid {string}")
    public void userEntersInvalid(String password) {
        bookITLoginPage.password.sendKeys(password);
    }

    @Then("User should be not able to log in with invalid credentials")
    public void userShouldBeNotAbleToLogInWithInvalidCredentials() {
    Assert.assertEquals("[object ProgressEvent]", bookITLoginPage.errorMessage.getText());
    }


    @And("User clicks on sign in button")
    public void userClicksOnSignInButton() {
        bookITLoginPage.signInButton.click();
    }
}
