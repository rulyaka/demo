package com.vytrack.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/rerun.txt",
        glue = "com/vytrack/step_definitions",

        plugin = {"html:target/default-cucumber-reports",
                "json:target/cucumber.json"


        }
)

public class FailedTestRunners {


}
