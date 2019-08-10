package com.vytrack.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/default-cucumber-reports",
        features = "src/test/resources/com/vytrack/features/Login.feature",
        glue = "com/vytrack/step_definitions",
        tags = "@smoke",
        dryRun = false
)
public class CukesRunner {
}
