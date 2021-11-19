package com.istanbul3.stepdefinitions;

import com.istanbul3.pages.PortalPage;
import com.istanbul3.utilities.BrowserUtils;
import com.istanbul3.utilities.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class MenuItemDefinitions {

    PortalPage portalPage = new PortalPage();

    @Given("User clicks on CONFIGURE MENU")
    public void user_clicks_on_CONFIGURE_MENU() {
        portalPage.configureMenu.click();
    }

    @Given("User clicks on Add custom menu item")
    public void user_clicks_on_Add_custom_menu_item() {
        portalPage.addCustomMenuItem.click();
    }

    @Given("User enters {string} and {string} in to related blanks")
    public void user_enters_and_in_to_related_blanks(String string, String string2) {
        portalPage.name.sendKeys(string);
        portalPage.link.sendKeys(string2);
    }

    @When("User clicks on ADD button")
    public void user_clicks_on_ADD_button() {
        portalPage.add.click();
        BrowserUtils.waitFor(2);
    }

    @And("User should be able to see it in menu items")
    public void user_should_be_able_to_see_it_in_menu_items() {
        boolean flag = portalPage.google.isDisplayed();
        Assert.assertTrue(flag);
    }

    @Given("User click collapse menu")
    public void user_click_collapse_menu() {
        portalPage.collapseMenu.click();
    }

    @Then("User collapsed menu")
    public void user_collapsed_menu() {
        Assert.assertFalse(portalPage.activityStream.isEnabled());
    }

    @Given("User clicks on Google")
    public void user_clicks_on_Google() {
        BrowserUtils.waitFor(2);
        portalPage.google.click();
    }

    @Given("User is on Google in new tab")
    public void user_is_on_Google_in_new_tab() {
        String title = Driver.get().getTitle();
        Assert.assertEquals("Google", title);
    }

    @Given("User clicks Configure menu items")
    public void user_clicks_Configure_menu_items() {
        portalPage.configureMenuItem.click();
        BrowserUtils.waitFor(2);
    }

    @Given("User clicks mark next to Google")
    public void user_clicks_mark_next_to_Google() {
        portalPage.markOfGoogle.click();
        BrowserUtils.waitFor(2);
    }

    @Given("click delete custom item")
    public void click_delete_custom_item() {
        portalPage.deleteCustomItem.click();
    }

    @Given("click delete on pop-up")
    public void click_delete_on_pop_up() {
        portalPage.deleteButton.click();
    }

    @Then("User should not be able to see the item")
    public void user_should_not_be_able_to_see_the_item() {
        Assert.assertFalse(portalPage.google.isDisplayed());
    }

    @When("User clicks on Hide item")
    public void user_clicks_on_Hide_item() {
        portalPage.hideItem.click();
    }

    @When("User click save changes")
    public void user_click_save_changes() {
        portalPage.saveChanges.click();
    }

    @When("User clicks Edit")
    public void user_clicks_Edit() {
        portalPage.editCustomItem.click();
    }

    @Given("Change name as {string} and link as {string}")
    public void change_name_as_and_link_as(String string, String string2) {
        portalPage.nameForEdit.clear();
        portalPage.linkForEdit.clear();
        portalPage.nameForEdit.sendKeys(string);
        portalPage.linkForEdit.sendKeys(string2);
    }

    @Given("User clicks save")
    public void user_clicks_save() {
        portalPage.saveButton.click();
    }

    @Then("User should be able to see Youtube item")
    public void user_should_be_able_to_see_Youtube_item() {
        Assert.assertTrue(portalPage.youtube.isDisplayed());
    }

    @When("User reset menu")
    public void user_reset_menu() {
        portalPage.resetOk();
    }

    @Given("User click on more")
    public void user_click_on_more() {
        portalPage.more.click();
    }

    @Then("Hide should be visible")
    public void hide_should_be_visible() {
        Assert.assertTrue(portalPage.hide.isDisplayed());
    }


    @Given("User clicks mark next to Youtube")
    public void user_clicks_mark_next_to_Youtube() {
        portalPage.markOfYoutube.click();
    }

    @Then("User should not be able to see the Youtube item")
    public void user_should_not_be_able_to_see_the_Youtube_item() {
        Assert.assertFalse(portalPage.youtube.isDisplayed());
    }

    @Given("User clicks on Show item")
    public void user_clicks_on_Show_item() {
        portalPage.showItem.click();
    }
}