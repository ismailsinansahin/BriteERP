@Login @NegativeLogin
Feature: Negative Login
  Agile Story: As a user I should not be able to login with invalid credentials
  Description: The purpose of this feature is to test the login functionality (Negative Test)

  @WrongCredentials
  Scenario Outline: Users should not be able to login with wrong credentials
    When the user enter wrong credentials "<Username>" "<Password>"
    And click on login button
    Then the user should see wrong message "<Message>"
    Examples:
      | Username              | Password      | Message                     |
      | wrongUsername         | posmanager    | Wrong login/password        |
      | posmanager26@info.com | wrongPassword | Wrong login/password        |

  @BlankCredentials
  Scenario Outline: Users should not be able to login with blank credentials
    When the user enter blank credentials "<Username>" "<Password>"
    And click on login button
    Then the user should see blank message "<Message>" "<Username>" "<Password>"
    Examples:
      | Username              | Password   | Message                     |
      |                       | posmanager | Please fill out this field. |
      | posmanager26@info.com |            | Please fill out this field. |


