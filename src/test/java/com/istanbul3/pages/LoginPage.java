package com.istanbul3.pages;

import com.istanbul3.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage (){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//*[@name='USER_LOGIN']")
    public WebElement name;

    @FindBy(xpath = "//*[@name='USER_PASSWORD']")
    public WebElement password;

    @FindBy(xpath = "//input[@value='Log In']")
    public WebElement loginButton;

    public void login(){
        name.sendKeys("hr49@cybertekschool.com");
        password.sendKeys("UserUser");
        loginButton.click();
    }
}
