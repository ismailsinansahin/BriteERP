@Dashboard
Feature: Avatar Functionality
  Agile Story: As a user I should be able to see my avatar on the top menu
  Description: The purpose of this feature is to test the avatar functionality on the top menu

  @Avatar
  Scenario: Users should be able to see their avatars on the top menu
    When the user enter valid credentials "posmanager16@info.com" "posmanager"
    And click on login button
    Then the user should be able to see their avatars on the top menu
