@UserModules
Feature: Modules Names
  Agile Story: As a user I should be able to see all modules which I have right to access on the top menu
  Description: The purpose of this feature is to test if users can see all modules they are supposed to see

  Scenario Outline: Users should be able to login with valid credentials
    When the user enter valid credentials "<Username>" "<Password>"
    And click on login button
    Then the user should be able to see related "<Modules>"
    Examples:
      | Username                   | Password         |Modules|
      | salesmanager16@info.com    | salesmanager     |       |
      | posmanager16@info.com      | posmanager       |       |
      | imm16@info.com             | inventorymanager |       |
      | expensesmanager16@info.com | expensesmanager  |       |
      | manuf_user16@info.com      | manufuser        |       |

