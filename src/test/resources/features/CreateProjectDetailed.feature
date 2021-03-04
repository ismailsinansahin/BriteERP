@Project @CreateProjectDetailed
Feature: Create Project Functionality
  Agile Story: As a POS Manager I should be able to create new project with detailed information
  Description: The purpose of this feature is to test the project creation functionality with detailed information

  Background: Go to Project Module
    When the user enter valid credentials "posmanager16@info.com" "posmanager"
    And click on login button
    And go to "Project" module

  Scenario: Users should be able to create new project with detailed information
    And get how many project exist with the new project name "AAAA1"
    And click on the "Create" button on the Dashboard page of the Project Module
    And enter a Project Name on the new page "AAAA1"
    And click on the "Create & Edit" button on the Create New Project page
    And select a customer from the customer dropdown
    And click on Emails tab
    And enter an email alias "AAAA1"
    And click on the "Save" button on the Dashboard page of the Project Module
    And click on the Dashboard link from the left menu
    Then the user should see one additional project with the new project name "AAAA1"
