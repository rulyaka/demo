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
        // Write code here that turns the phrase above into concrete actions
        CalendarEventsPage calendareventspage = new CalendarEventsPage();
        calendareventspage.waitForUIOverlay();
        calendareventspage.viewPerPageDropDown.click();

    }
    @Then("follow view per page options should be visible")
    public void follow_view_per_page_options_should_be_visible(List<String> exceptedOptions) {
        System.out.println(exceptedOptions.size());
        for(String expectedoption:exceptedOptions ){
            System.out.println(expectedoption);
        }
        CalendarEventsPage calendareventpage = new CalendarEventsPage();
        List<String> actualOptions = BrowserUtils.getElementsText(calendareventpage.viewPerPageOptions);

        Assert.assertEquals(exceptedOptions, actualOptions);

    }

}
