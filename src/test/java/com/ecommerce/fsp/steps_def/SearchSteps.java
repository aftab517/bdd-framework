package com.ecommerce.fsp.steps_def;

import com.ecommerce.fsp.page_objects.Homepage;
import cucumber.api.java.en.Given;

public class SearchSteps {

    private Homepage homepage=new Homepage();

    @Given("^iam on homepage$")
    public void iam_on_homepage() {
        homepage.enterText("nike");
    }

}
