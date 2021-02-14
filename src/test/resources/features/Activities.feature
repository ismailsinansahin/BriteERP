@Dashboard
Feature: As a user I should be able to see Activities link on the top menu
  Description: The purpose of this feature is to test the Activities link functionality on the top menu

  @Username
  Scenario: Users should be able to see Activities link on the top menu
    When the user enter valid credentials "posmanager16@info.com" "posmanager"
    And click on login button
    Then the user should be able to see Activities link on the top menu
