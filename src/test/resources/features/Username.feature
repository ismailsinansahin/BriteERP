@Dashboard
Feature: Username Functionality
  Agile Story: As a user I should be able to see my username on the top menu
  Description: The purpose of this feature is to test the username functionality on the top menu

  @Username
  Scenario Outline: Users should be able to see their usernames on the top menu
    When the user enter valid credentials "<Username>" "<Password>"
    And click on login button
    Then the user should be able to see their "<UsernameOnTheMenu>" on the top menu
    Examples:
      | Username                   | Password         | UsernameOnTheMenu   |
      | salesmanager16@info.com    | salesmanager     | SalesManager16      |
      | posmanager16@info.com      | posmanager       | POSManager16        |
      | imm16@info.com             | inventorymanager | InventoryManager16  |
      | expensesmanager16@info.com | expensesmanager  | ExpensesManager16   |
      | manuf_user16@info.com      | manufuser        | ManufacturingUser16 |