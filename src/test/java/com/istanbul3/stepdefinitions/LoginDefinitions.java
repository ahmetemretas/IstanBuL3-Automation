package com.istanbul3.stepdefinitions;

import com.istanbul3.pages.LoginPage;
import io.cucumber.java.en.Given;

import java.util.List;

public class LoginDefinitions {
    @Given("User logins with username and password")
    public void user_logins_with_username_and_password() {
        LoginPage loginPage = new LoginPage();
        loginPage.login();
    }

}
