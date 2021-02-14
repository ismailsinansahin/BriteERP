@Login
Feature: As a user I should be able to login to the application
  Description: The purpose of this feature is to test the login functionality

  @PositiveLogin
  Scenario Outline: Users should be able to login with valid credentials
    When the user enter valid credentials "<Username>" "<Password>"
    And click on Login Button
    Then the user should be able to login
    Examples:
      | Username                   | Password         |
      | salesmanager16@info.com    | salesmanager     |
      | posmanager16@info.com      | posmanager       |
      | imm16@info.com             | inventorymanager |
      | expensesmanager16@info.com | expensesmanager  |
      | manuf_user16@info.com      | manufuser        |

  @NegativeLogin @WrongCredentials
  Scenario Outline: Try to login with invalid credentials
    When the user enter wrong credentials "<Username>" "<Password>"
    And click on Login Button
    Then the user should see wrong message "<Message>"
    Examples:
      | Username              | Password      | Message                     |
      | wrongUsername         | posmanager    | Wrong login/password        |
      | posmanager16@info.com | wrongPassword | Wrong login/password        |

  @NegativeLogin @BlankCredentials
  Scenario Outline: Try to login with invalid credentials
    When the user enter blank credentials "<Username>" "<Password>"
    And click on Login Button

    Then the user should see blank message "<Message>"
    Examples:
      | Username              | Password      | Message                     |
      | blank                 | posmanager    | Please fill out this field. |
      | posmanager16@info.com | blank         | Please fill out this field. |


