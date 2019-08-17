package com.vytrack.step_definitions;

import com.vytrack.pages.CalendarEventsPage;
import com.vytrack.utilities.BrowserUtils;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.List;

public class CalendarEventsStepDefs {
    @When("I click on the View per page dropdown")
    public void i_click_on_the_View_per_page_dropdown() {
        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();
        calendarEventsPage.waitForUIOverlay();
        calendarEventsPage.viewPerPageDropDown.click();
    }

    @Then("follow view per page options should be visible")
    public void follow_view_per_page_options_should_be_visible(List<String> expectedOptions) {
        // Expected data coming from feature file as a list of strings
        System.out.println(expectedOptions.size());
        for (String expectedOption : expectedOptions) {
            System.out.println(expectedOption);
        }
        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();

        // getting actual from UI
        List<String> actualOptions = BrowserUtils.getElementsText(calendarEventsPage.viewPerPageOptions);
        Assert.assertEquals(expectedOptions, actualOptions);
    }

}








