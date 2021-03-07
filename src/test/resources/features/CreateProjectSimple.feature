@Project @CreateProjectSimple
Feature: Create Project Functionality
  Agile Story: As a POS Manager I should be able to create new project with only Project Name information
  Description: The purpose of this feature is to test the project creation functionality with only Project Name information

  Background: Go to Project Module
    When the user enter valid credentials "posmanager30@info.com" "posmanager"
    And click on login button
    And go to "Project" module

  Scenario: Users should be able to create new project with only Project Name information
    And get how many project exist with the new project name "001"
    And click on the "Create" button on the Dashboard page of the Project Module
    And enter a Project Name on the new page "001"
    And click on the "Create" button on the Create New Project page
    Then the user should see one additional project with the new project name "001"
