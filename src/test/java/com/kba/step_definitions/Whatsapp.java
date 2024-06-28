package com.kba.step_definitions;

import com.kba.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Whatsapp {

    @Given("The user is on LoginPage")
    public void the_user_is_on_login_page() {
        Driver.getDriver().get("https://web.whatsapp.com/");
    }
    @When("The user log in with qr code")
    public void the_user_log_in_with_qr_code() {

    }
    @Then("The user is logged")
    public void the_user_is_logged() {

    }
}
