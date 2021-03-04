@Preferences @ChangePassword
Feature: Change Password
  Agile Story: As a user I should be able to change my password from the Preferences page
  Description: The purpose of this feature is to test the change password functionality

  Scenario: Users should be able to change their passwords
    When the user enter valid credentials "posmanager15@info.com" "posmanager15"
    And click on login button
    And click on the username on the basepage
    And click on the "Preferences"
    And click on the Change Password button
    And enter Old Password "posmanager15"
    And enter New Password "posmanager"
    And enter New Password again "posmanager"
    And click on Change Password button
    And the user should be in the Login Page
    And the user enter valid credentials "posmanager15@info.com" "posmanager"
    And click on login button
    Then the user should be able to login