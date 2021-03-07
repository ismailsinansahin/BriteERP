@Login
Feature: Positive Login
  Agile Story: As a user I should be able to login with valid credentials
  Description: The purpose of this feature is to test the login functionality

  @PositiveLogin
  Scenario Outline: Users should be able to login with valid credentials
    When the user enter valid credentials "<Username>" "<Password>"
    And click on login button
    Then the user should be able to login
    Examples:
      | Username                   | Password         |
      | salesmanager26@info.com    | salesmanager     |
      | posmanager26@info.com      | posmanager       |
      | imm26@info.com             | inventorymanager |
      | expensesmanager26@info.com | expensesmanager  |
      | manuf_user26@info.com      | manufuser        |

  @POSManagerLogin
  Scenario: Users should be able to login with valid credentials
    When the user enter valid credentials "posmanager26@info.com" "posmanager"
    And click on login button