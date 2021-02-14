@Login
Feature: As a user I should be able to login with valid credentials
  Description: The purpose of this feature is to test the login functionality

  @PositiveLogin
  Scenario Outline: Users should be able to login with valid credentials
    When the user enter valid credentials "<Username>" "<Password>"
    And click on login button
    Then the user should be able to login
    Examples:
      | Username                   | Password         |
      | salesmanager16@info.com    | salesmanager     |
      | posmanager16@info.com      | posmanager       |
      | imm16@info.com             | inventorymanager |
      | expensesmanager16@info.com | expensesmanager  |
      | manuf_user16@info.com      | manufuser        |

