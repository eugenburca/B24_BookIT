package com.bookIT.step_definition;

import com.bookIT.pages.bookITMainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;
import java.util.List;
import java.util.Map;

public class bookITMyModuleStepDefs {

    bookITMainPage myModulePage = new bookITMainPage();

    @Given("User navigates to [my] Module")
    public void user_navigates_to_my_module() {
       myModulePage.hoverToModule("my");
    }

    @Then("Three options should be displayed:")
    public void options_should_be_displayed(List<String> expectedOptions) {
        System.out.println("self Option is Displayed = " + myModulePage.myModuleSelfOption.getText());
        assertTrue(myModulePage.myModuleSelfOption.isDisplayed());

        System.out.println("team Option is Displayed = " + myModulePage.myModuleTeamOption.getText());
        assertTrue(myModulePage.myModuleTeamOption.isDisplayed());

        System.out.println("sign out Option is Displayed = " + myModulePage.myModuleSignOutOption.getText());
        assertTrue(myModulePage.myModuleSignOutOption.isDisplayed());

        assertEquals(expectedOptions, myModulePage.myModuleOptionsList());

    }

    @When("User clicks on {string} tab")
    public void user_clicks_on_tab(String myModuleButton) {
        myModulePage.clickOnTab(myModuleButton);
    }

    @When("All the detail info of the user should be displayed:")
    public void all_the_detail_info_of_the_user_should_be_displayed(Map<String, String> userDetailInfo) {

    }

    @Then("{string} theme should be on")
    public void theme_should_be_on(String theme) {

    }

    @Then("All the other team members should be displayed")
    public void all_the_other_team_members_should_be_displayed() {

    }

}
