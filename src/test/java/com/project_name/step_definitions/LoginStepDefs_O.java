package com.project_name.step_definitions;

import com.project_name.pages.LoginPage_O;
import com.project_name.utilities.ConfigurationReader;
import com.project_name.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs_O {

    LoginPage_O loginPage = new LoginPage_O();
    @Given("User is on the login page")
    public void user_is_on_the_login_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @When("User logged is with valid credential")
    public void user_logged_is_with_valid_credential() {
        loginPage.login();
    }
    @Then("User should see this title {string}")
    public void user_should_see_this_title(String expectedTitle) {

        Assert.assertEquals(expectedTitle,Driver.getDriver().getTitle());

    }
}

