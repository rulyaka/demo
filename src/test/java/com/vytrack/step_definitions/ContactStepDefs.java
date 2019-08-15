package com.vytrack.step_definitions;

import com.vytrack.pages.ContactsPage;
import com.vytrack.pages.ViewContactPage;
import com.vytrack.utilities.BrowserUtils;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class ContactStepDefs {

    @When("I click on customer with email {string}")
    public void i_click_on_customer_with_email(String email) {
        ContactsPage contactsPage = new ContactsPage();
        contactsPage.waitForUIOverlay();
        contactsPage.getUserRow(email).click();
    }

    @Then("customer email should be {string} in the account page")
    public void customer_email_should_be_in_the_account_page(String expectedEmail) {
        String actual = new ViewContactPage().email.getText();
        Assert.assertEquals("Customer email did not match", expectedEmail, actual);
    }

}
