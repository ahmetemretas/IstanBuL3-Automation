package com.istanbul3.stepdefinitions;

import com.istanbul3.utilities.ConfigurationReader;
import com.istanbul3.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public void setUp(){
        Driver.get().get(ConfigurationReader.get("url"));

    }
    @After
    public void tearDown(){
        Driver.closeDriver();
    }
}
