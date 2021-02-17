$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/UserModules.feature");
formatter.feature({
  "name": "Modules Names",
  "description": "  Agile Story: As a user I should be able to see all modules which I have right to access on the top menu\n  Description: The purpose of this feature is to test if users can see all modules they are supposed to see",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Dashboard"
    },
    {
      "name": "@UserModules"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Users should be able to login with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user enter valid credentials \"\u003cUsername\u003e\" \"\u003cPassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "click on login button",
  "keyword": "And "
});
formatter.step({
  "name": "the user should be able to see related modules based on \"\u003cUsername\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ]
    },
    {
      "cells": [
        "posmanager16@info.com",
        "posmanager"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Users should be able to login with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Dashboard"
    },
    {
      "name": "@UserModules"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user enter valid credentials \"posmanager16@info.com\" \"posmanager\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.smlsnnshn.step_definitions.LoginStepDefs.the_user_enter_valid_credentials(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "com.smlsnnshn.step_definitions.LoginStepDefs.click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be able to see related modules based on \"posmanager16@info.com\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.smlsnnshn.step_definitions.UserModulesStepDefs.the_user_should_be_able_to_see_related_modules_based_on(java.lang.String)"
});
formatter.result({
  "error_message": "java.lang.AssertionError: expected:\u003c[Discuss, Calendar, Notes, Contacts, CRM, Sales, Website, Point of Sale, Purchases, Inventory, Manufacturing, Repairs, Project, Events, Surveys, Employees, Attendances, Leaves, Expenses, Maintenance, Fleet, Dashboards]\u003e but was:\u003c[, , , , , , , , , , , , , , , , , , , , , ]\u003e\r\n\tat org.junit.Assert.fail(Assert.java:89)\r\n\tat org.junit.Assert.failNotEquals(Assert.java:835)\r\n\tat org.junit.Assert.assertEquals(Assert.java:120)\r\n\tat org.junit.Assert.assertEquals(Assert.java:146)\r\n\tat com.smlsnnshn.pages.DashboardPage.verifyModuleNamesBasedOnUserTypes(DashboardPage.java:58)\r\n\tat com.smlsnnshn.step_definitions.UserModulesStepDefs.the_user_should_be_able_to_see_related_modules_based_on(UserModulesStepDefs.java:12)\r\n\tat ✽.the user should be able to see related modules based on \"posmanager16@info.com\"(file:///C:/Users/A/IdeaProjects/BriteERP/src/test/resources/features/UserModules.feature:9)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", "screenshot");
formatter.after({
  "status": "passed"
});
});