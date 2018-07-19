package com.ecommerce.inno.steps_def;

import com.ecommerce.inno.page_objects.Homepage;
import cucumber.api.java.en.Given;

import static org.hamcrest.Matchers.endsWith;
import static org.hamcrest.Matchers.is;

import static org.hamcrest.MatcherAssert.assertThat;

public class CommonStepDef {

    private Homepage homepage = new Homepage();

    @Given("^I am on homepage$")
    public void i_am_on_homepage() {
        assertThat("user might not on homepage", homepage.isOnHomePage(), is(endsWith(".com/")));
    }
}
