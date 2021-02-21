@Dashboard @Conversations @wip
Feature: Conversations Functionality
  Agile Story: As a user I should be able to see Conversations link on the top menu
  Description: The purpose of this feature is to test the Conversations link functionality on the top menu

  Background: Login with valid credentials
    When the user enter valid credentials "posmanager16@info.com" "posmanager"
    And click on login button

  Scenario: Users should be able to see Conversations link on the top menu
    Then the user should be able to see Conversations link on the top menu
