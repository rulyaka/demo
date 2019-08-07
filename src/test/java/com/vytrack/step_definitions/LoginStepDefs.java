package com.vytrack.step_definitions;


import com.vytrack.utilities.Pages;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefs {
    private Pages pages;

    public LoginStepDefs(Pages pages) {
        this.pages = pages;
    }

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("I should be able to see the dashboard page")
    public void i_should_be_able_to_see_the_dashboard_page() {
        System.out.println("Verifying dashboard page");
    }

    @When("I login as a sales manager")
    public void i_login_as_a_sales_manager() {
        System.out.println("Logging in as a sales manager");
    }


}
