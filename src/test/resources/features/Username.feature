@Basepage @Username
Feature: Username Functionality
  Agile Story: As a user I should be able to see my username on the top menu
  Description: The purpose of this feature is to test the username functionality on the top menu

  Scenario: Users should be able to see their usernames on the top menu
    When the user enter valid credentials "salesmanager26@info.com " "salesmanager"
    And click on login button
    Then the user should be able to see their "SalesManager26" on the top menu
