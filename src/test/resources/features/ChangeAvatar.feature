@Preferences @ChangeAvatar
Feature: Change Avatar
  Agile Story: As a user I should be able to change my avatar from the Preferences page
  Description: The purpose of this feature is to test the change avatar functionality

  Scenario: Users should be able to change their avatars
    When the user enter valid credentials "posmanager20@info.com" "posmanager"
    And click on login button
    And take the screenshot of "old" avatar
    And click on the username on the basepage
    And click on the "Preferences"
    And change the avatar with new one "white"
    And take the screenshot of "new" avatar
    Then verify the avatar has changed