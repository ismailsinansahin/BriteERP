@Basepage @Activities
Feature: Activities Link
  Agile Story: As a user I should be able to see Activities link on the top menu
  Description: The purpose of this feature is to test the Activities link functionality on the top menu

  Background: Login with valid credentials
    When the user enter valid credentials "posmanager26@info.com" "posmanager"
    And click on login button

  Scenario: Users should be able to see Activities link on the top menu
    Then the user should be able to see Activities link on the top menu
