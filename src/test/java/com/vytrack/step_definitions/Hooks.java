package com.vytrack.step_definitions;

import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.util.concurrent.TimeUnit;

public class Hooks {



    @Before
    public void asetUp(){
        System.out.println("Before hooks");
        Driver.get().get(ConfigurationReader.get("url"));
        Driver.get().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Before("@database")
    public void setUpDBCOnn(){
        System.out.println("Setting up DB connection");
    }

    @After
    public void tearDown(){
        System.out.println("After hooks");
        Driver.closeDriver();
    }

    @After("@database")
    public void tearDownConnection(){
        System.out.println("Closing DB connection");
    }
}
