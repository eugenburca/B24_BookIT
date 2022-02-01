package com.bookIT.step_definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class bookITMyModuleStepDefs {

    @Given("User navigates to [my] Module")
    public void user_navigates_to_my_module() {

    }

    @Then("{int} options should be displayed:")
    public void options_should_be_displayed(int optionsCount, List<String> options) {

    }

    @When("User clicks on {string} tab")
    public void user_clicks_on_tab(String myModuleButton) {

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
