package com.vytrack.step_definitions;

import com.vytrack.pages.ContactsPage;
import com.vytrack.pages.ViewContactPage;
import com.vytrack.utilities.BrowserUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.Map;

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

    @Then("contact creation details should display correctly")
    public void contact_creation_details_should_display_correctly(Map<String, String> userInfo) {
        System.out.println(userInfo);

        String expectedCreateDate = userInfo.get("Created at");
        String expectedOwner = userInfo.get("Owner");
        System.out.println("expectedCreateDate = " + expectedCreateDate);
        System.out.println("expectedOwner = " + expectedOwner);


        ViewContactPage viewcontactpage = new ViewContactPage();
        String actualCreateDate = viewcontactpage.createdAt.getText();

        String actualOwner = viewcontactpage.owner.getText();

        System.out.println("actualCreateDate = "+actualCreateDate);
        System.out.println("actualOwner = "+actualOwner);

        Assert.assertTrue(actualCreateDate.contains(expectedCreateDate));
        Assert.assertEquals(expectedOwner, actualOwner);
    }
}
