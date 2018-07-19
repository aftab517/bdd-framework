package com.ecommerce.inno.steps_def;

import com.ecommerce.inno.page_objects.Homepage;
import com.ecommerce.inno.page_objects.RegisterPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;


public class RegisterSteps {

    private RegisterPage registerPage = new RegisterPage();

    @When("^I navigate to \"([^\"]*)\" page$")
    public void i_navigate_to_page(String page) {
        Homepage homepage = new Homepage();
        homepage.createAccount.click();
    }

    @When("^I enter user email address$")
    public void i_enter_user_email_address() {
        registerPage.registerEmail("ffff@gmail.com");
    }

    @When("^I fill the user register details:$")
    public void i_fill_the_user_register_details(List<Map<String, String>> registerData) {
        registerPage.fillRegisterForm(registerData);
    }

    @Then("^I should see a validation message \"([^\"]*)\"$")
    public void i_should_see_a_validation_message(String expectedValidationMsg) {
        assertThat("create account validation error. ",registerPage.getConfirmPasswordValidationMessage(), is(equalTo(expectedValidationMsg)));
    }

}
