package com.bookIT.step_definition;

import com.bookIT.pages.BookItMapPage;
import com.bookIT.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class BookItMapStepDefs {
    BookItMapPage mapPage = new BookItMapPage();
    Actions actions = new Actions(Driver.getDriver());
    @Given("User should  hover over to my section")
    public void user_should_hover_over_to_my_section() {
actions.moveToElement(mapPage.myButton);
    }
    @When("User should click team under my section")
    public void user_should_click_team_under_my_section() {
actions.click(mapPage.teamButton);
    }
    @Then("User should see reserved rooms")
    public void user_should_see_reserved_rooms() {

    }
}
