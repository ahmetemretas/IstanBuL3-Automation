package com.istanbul3.pages;

import com.istanbul3.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PortalPage {
    public PortalPage (){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "left-menu-settings")
    public WebElement configureMenu;

    @FindBy(xpath = "(//span[@class='menu-popup-item-text'])[4]")
    public WebElement addCustomMenuItem;

    @FindBy(css = "input[name=\"menuPageToFavoriteName\"]")
    public WebElement name;

    @FindBy(css = "input[name=\"menuPageToFavoriteLink\"]")
    public WebElement link;

    @FindBy(xpath = "//span[@class='popup-window-button popup-window-button-create']")
    public WebElement add;

    @FindBy(xpath = "(//span[@class='menu-popup-item-text'])[1]")
    public WebElement configureMenuItem;

    @FindBy(xpath = "(//span[@class='menu-popup-item-text'])[2]")
    public WebElement collapseMenu;

    @FindBy(xpath = "(//span[@class='menu-popup-item-text'])[6]")
    public WebElement resetMenu;

    @FindBy(xpath = "(//ul[@class='menu-items']//li)[14]")
    public WebElement google;

    @FindBy(xpath = "//span[@class='menu-resize-btn'] ")
    public WebElement resizeButton;

    @FindBy(xpath = "//span[.='Hide item']")
    public WebElement hideItem;

    @FindBy(xpath = "//span[.='Delete custom item']")
    public WebElement deleteCustomItem;

    @FindBy(xpath = "(//span[.='Edit'])[2]")
    public WebElement editCustomItem;

    @FindBy(id = "left-menu-more-btn")
    public WebElement more;

    @FindBy(xpath = "//*[@id='bx_left_menu_1587574693']/a")
    public WebElement markOfGoogle;

    @FindBy(xpath = "//input[@name='menuPageToFavoriteName']")
    public WebElement nameForEdit;

    @FindBy(xpath = "//input[@name='menuPageToFavoriteLink']")
    public WebElement linkForEdit;

    @FindBy(xpath = "//span[@class='popup-window-button popup-window-button-create']")
    public WebElement saveButton;

    @FindBy(xpath = "//*[.='Save changes'][@class='menu-favorites-btn-done']")
    public WebElement saveChanges;

    @FindBy(xpath = "(//span[@class='menu-item-link-text'])[1]")
    public WebElement activityStream;

    @FindBy(xpath = "//span[@class='popup-window-button popup-window-button-create']")
    public WebElement deleteButton;

    @FindBy(xpath = "//li/a[@target='_blank']")
    public WebElement youtube;

    @FindBy(xpath = "//span[.='Hide']")
    public WebElement hide;

    @FindBy(xpath = "//span[@class='menu-popup-item menu-popup-no-icon ']")
    public WebElement showItem;

    @FindBy(xpath = "//li[@data-link='http://youtube.com']//span[1]")
    public WebElement markOfYoutube;



    public void resetOk(){
        configureMenu.click();
        resetMenu.click();
        Alert alert = Driver.get().switchTo().alert();
        alert.accept();
    }

}
