package com.vytrack.step_definitions;

import com.vytrack.pages.DashboardPage;
import cucumber.api.java.en.When;

public class NavigationMenuStepDefs {

    @When("I navigate to {string} {string}")
    public void i_navigate_to(String tab, String module) {
        System.out.println("tab = " + tab);
        System.out.println("module = " + module);

        new DashboardPage().selectMenuOption(tab, module);
    }


}
