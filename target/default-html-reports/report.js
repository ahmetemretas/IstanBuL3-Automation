$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/PortalPage.feature");
formatter.feature({
  "name": "Configuring Menu Items",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@portal"
    },
    {
      "name": "@wip"
    }
  ]
});
formatter.background({
  "name": "User login",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User logins with username and password",
  "keyword": "Given "
});
formatter.match({
  "location": "com.istanbul3.stepdefinitions.LoginDefinitions.user_logins_with_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add custom menu item",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@portal"
    },
    {
      "name": "@wip"
    },
    {
      "name": "@addMI"
    }
  ]
});
formatter.step({
  "name": "User clicks on CONFIGURE MENU",
  "keyword": "Given "
});
formatter.match({
  "location": "com.istanbul3.stepdefinitions.MenuItemDefinitions.user_clicks_on_CONFIGURE_MENU()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Add custom menu item",
  "keyword": "And "
});
formatter.match({
  "location": "com.istanbul3.stepdefinitions.MenuItemDefinitions.user_clicks_on_Add_custom_menu_item()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"Google\" and \"www.google.com\" in to related blanks",
  "keyword": "Given "
});
formatter.match({
  "location": "com.istanbul3.stepdefinitions.MenuItemDefinitions.user_enters_and_in_to_related_blanks(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on ADD button",
  "keyword": "When "
});
formatter.match({
  "location": "com.istanbul3.stepdefinitions.MenuItemDefinitions.user_clicks_on_ADD_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be able to see it in menu items",
  "keyword": "And "
});
formatter.match({
  "location": "com.istanbul3.stepdefinitions.MenuItemDefinitions.user_should_be_able_to_see_it_in_menu_items()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "User login",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User logins with username and password",
  "keyword": "Given "
});
formatter.match({
  "location": "com.istanbul3.stepdefinitions.LoginDefinitions.user_logins_with_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Open custom menu in new tab",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@portal"
    },
    {
      "name": "@wip"
    },
    {
      "name": "@openNewTab"
    }
  ]
});
formatter.step({
  "name": "User clicks on Google",
  "keyword": "And "
});
formatter.match({
  "location": "com.istanbul3.stepdefinitions.MenuItemDefinitions.user_clicks_on_Google()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is on Google in new tab",
  "keyword": "And "
});
formatter.match({
  "location": "com.istanbul3.stepdefinitions.MenuItemDefinitions.user_is_on_Google_in_new_tab()"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[Google]\u003e but was:\u003c[(3) Portal]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:117)\r\n\tat org.junit.Assert.assertEquals(Assert.java:146)\r\n\tat com.istanbul3.stepdefinitions.MenuItemDefinitions.user_is_on_Google_in_new_tab(MenuItemDefinitions.java:66)\r\n\tat ✽.User is on Google in new tab(file:///C:/Users/ahmet/IdeaProjects/IstanBuL3-Automation/src/test/resources/features/PortalPage.feature:18)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "User login",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User logins with username and password",
  "keyword": "Given "
});
formatter.match({
  "location": "com.istanbul3.stepdefinitions.LoginDefinitions.user_logins_with_username_and_password()"
});
