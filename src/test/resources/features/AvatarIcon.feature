@Basepage @AvatarIcon
Feature: Avatar Icon Functionality
  Agile Story: As a user I should be able to see my avatar on the top menu
  Description: The purpose of this feature is to test the avatar functionality on the top menu

  Background: Login with valid credentials
    When the user enter valid credentials "posmanager26@info.com" "posmanager"
    And click on login button

  Scenario: Users should be able to see their avatars on the top menu
    Then the user should be able to see their avatars on the top menu

