package com.ecommerce.fsp.steps_def;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterSteps {
    @Given("^I am on homepage$")
    public void i_am_on_homepage() {}

    @When("^I navigate to \"([^\"]*)\" page$")
    public void i_navigate_to_page(String arg1) {
    }

    @When("^I enter user email address$")
    public void i_enter_user_email_address() {
    }

    @When("^I fill the user register details:$")
    public void i_fill_the_user_register_details(DataTable arg1) {
    }

    @Then("^I should see a validation message \"([^\"]*)\"$")
    public void i_should_see_a_validation_message(String arg1) {}

}
