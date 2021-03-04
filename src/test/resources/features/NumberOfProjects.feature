@Project @NumberOfProjects
Feature: Number of Projects
  Agile Story: As a POS Manager I should be able to see the total number of projects on the Dashboard page of the Project Module
  Description: The purpose of this feature is to test the number of projects functionality

  Background: Go to Project Module
    When the user enter valid credentials "posmanager16@info.com" "posmanager"
    And click on login button
    And go to "Project" module

  Scenario: Users should see the number of the projects on the Dashboard Page of the Project Module
    Then the user should see the number of projects

