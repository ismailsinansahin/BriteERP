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
        "salesmanager16@info.com",
        "salesmanager"
      ]
    },
    {
      "cells": [
        "posmanager16@info.com",
        "posmanager"
      ]
    },
    {
      "cells": [
        "imm16@info.com",
        "inventorymanager"
      ]
    },
    {
      "cells": [
        "expensesmanager16@info.com",
        "expensesmanager"
      ]
    },
    {
      "cells": [
        "manuf_user16@info.com",
        "manufuser"
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
  "name": "the user enter valid credentials \"salesmanager16@info.com\" \"salesmanager\"",
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
  "name": "the user should be able to see related modules based on \"salesmanager16@info.com\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.smlsnnshn.step_definitions.UserModulesStepDefs.the_user_should_be_able_to_see_related_modules_based_on(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
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
  "status": "passed"
});
formatter.after({
  "status": "passed"
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
  "name": "the user enter valid credentials \"imm16@info.com\" \"inventorymanager\"",
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
  "name": "the user should be able to see related modules based on \"imm16@info.com\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.smlsnnshn.step_definitions.UserModulesStepDefs.the_user_should_be_able_to_see_related_modules_based_on(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
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
  "name": "the user enter valid credentials \"expensesmanager16@info.com\" \"expensesmanager\"",
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
  "name": "the user should be able to see related modules based on \"expensesmanager16@info.com\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.smlsnnshn.step_definitions.UserModulesStepDefs.the_user_should_be_able_to_see_related_modules_based_on(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
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
  "name": "the user enter valid credentials \"manuf_user16@info.com\" \"manufuser\"",
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
  "name": "the user should be able to see related modules based on \"manuf_user16@info.com\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.smlsnnshn.step_definitions.UserModulesStepDefs.the_user_should_be_able_to_see_related_modules_based_on(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});