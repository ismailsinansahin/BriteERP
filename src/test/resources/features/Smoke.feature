@Smoke
Feature: Smoke Test
  Description: This is the smoke test of the application

  Scenario: Positive login
    When the user enter valid credentials "salesmanager26@info.com" "salesmanager"
    And click on login button
    Then the user should be able to login

  Scenario: Activities Link Check
    When the user enter valid credentials "posmanager26@info.com" "posmanager"
    And click on login button
    Then the user should be able to see Activities link on the top menu

  Scenario: Conversations Link Check
    When the user enter valid credentials "posmanager26@info.com" "posmanager"
    And click on login button
    Then the user should be able to see Conversations link on the top menu