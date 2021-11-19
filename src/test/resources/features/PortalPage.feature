@portal @wip
Feature: Configuring Menu Items

  Background: User login
    Given User logins with username and password

  @addMI
  Scenario: Add custom menu item
    Given User clicks on CONFIGURE MENU
    And User clicks on Add custom menu item
    Given User enters "Google" and "www.google.com" in to related blanks
    When User clicks on ADD button
    And User should be able to see it in menu items

  @openNewTab
  Scenario: Open custom menu in new tab
    And User clicks on Google
    And User is on Google in new tab

  @editItem
  Scenario: Edit custom menu
    And User clicks on CONFIGURE MENU
    And User clicks Configure menu items
    And User clicks mark next to Google
    And User clicks Edit
    Given Change name as "Youtube" and link as "www.youtube.com"
    And User clicks save
    Then User should be able to see Youtube item

  @hideItem
  Scenario: Hide custom menu item
    And User clicks on CONFIGURE MENU
    And User clicks Configure menu items
    And User clicks mark next to Youtube
    And User clicks on Hide item
    And User click save changes
    Then User should not be able to see the Youtube item

  @showItem
   Scenario: Show the hidden item
    And User clicks on CONFIGURE MENU
    And User clicks Configure menu items
    And User clicks mark next to Youtube
    And User clicks on Show item
    And User click save changes
    Then User should be able to see Youtube item

  @deleteItem
  Scenario: Delete custom menu item
    And User clicks on CONFIGURE MENU
    And User clicks Configure menu items
    And User clicks mark next to Youtube
    And click delete custom item
    And click delete on pop-up
    And User click save changes
    Then User should not be able to see the item

  @collapse
  Scenario: Collapse menu
    Given User clicks on CONFIGURE MENU
    And User click collapse menu
    And User click save changes
    Then User collapsed menu

  @reset
  Scenario: Reset menu item
    And User reset menu


