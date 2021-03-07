@Project @SearchProjectsWithFavorites
Feature: Search Project Functionality
  Agile Story: As a POS Manager I should be able to see only my favorite projects on the Dashboard Page by using
  My Favorite search functionality of the Project Module
  Description: The purpose of this feature is to test the search project functionality with project name

  Background: Go to Project Module
    When the user enter valid credentials "posmanager30@info.com" "posmanager"
    And click on login button
    And go to "Project" module

  Scenario: Users should be able to search projects with My Favorites functionality
    And get how many favorite project exists on the Dashboard
    And click on Advanced Search button
    And click on Filters dropdown
    And click on My Favorites
    Then verify all projects displayed on the dashboard are favorite projects
    And verify all favorite projects are shown