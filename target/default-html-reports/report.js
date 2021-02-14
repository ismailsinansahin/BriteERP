$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "As a user I should be able to login to the application",
  "description": "  Description: The purpose of this feature is to test the login functionality",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Users should be able to login with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@PositiveLogin"
    }
  ]
});
formatter.step({
  "name": "the user enter valid credentials \"\u003cUsername\u003e\" \"\u003cPassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "click on Login Button",
  "keyword": "And "
});
formatter.step({
  "name": "the user should be able to login",
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
      "name": "@Login"
    },
    {
      "name": "@PositiveLogin"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "the user enter valid credentials \"salesmanager16@info.com\" \"salesmanager\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.smlsnnshn.step_definitions.LoginStepDefs.the_user_enter_valid_credentials(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on Login Button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the user should be able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "com.smlsnnshn.step_definitions.LoginStepDefs.the_user_should_be_able_to_login()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
formatter.scenario({
  "name": "Users should be able to login with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Login"
    },
    {
      "name": "@PositiveLogin"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "the user enter valid credentials \"posmanager16@info.com\" \"posmanager\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.smlsnnshn.step_definitions.LoginStepDefs.the_user_enter_valid_credentials(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on Login Button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the user should be able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "com.smlsnnshn.step_definitions.LoginStepDefs.the_user_should_be_able_to_login()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
formatter.scenario({
  "name": "Users should be able to login with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Login"
    },
    {
      "name": "@PositiveLogin"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "the user enter valid credentials \"imm16@info.com\" \"inventorymanager\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.smlsnnshn.step_definitions.LoginStepDefs.the_user_enter_valid_credentials(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on Login Button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the user should be able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "com.smlsnnshn.step_definitions.LoginStepDefs.the_user_should_be_able_to_login()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
formatter.scenario({
  "name": "Users should be able to login with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Login"
    },
    {
      "name": "@PositiveLogin"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "the user enter valid credentials \"expensesmanager16@info.com\" \"expensesmanager\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.smlsnnshn.step_definitions.LoginStepDefs.the_user_enter_valid_credentials(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on Login Button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the user should be able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "com.smlsnnshn.step_definitions.LoginStepDefs.the_user_should_be_able_to_login()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
formatter.scenario({
  "name": "Users should be able to login with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Login"
    },
    {
      "name": "@PositiveLogin"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "the user enter valid credentials \"manuf_user16@info.com\" \"manufuser\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.smlsnnshn.step_definitions.LoginStepDefs.the_user_enter_valid_credentials(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on Login Button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the user should be able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "com.smlsnnshn.step_definitions.LoginStepDefs.the_user_should_be_able_to_login()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
formatter.scenarioOutline({
  "name": "Try to login with invalid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@NegativeLogin"
    },
    {
      "name": "@WrongCredentials"
    }
  ]
});
formatter.step({
  "name": "the user enter wrong credentials \"\u003cUsername\u003e\" \"\u003cPassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "click on Login Button",
  "keyword": "And "
});
formatter.step({
  "name": "the user should see wrong message \"\u003cMessage\u003e\"",
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
        "Password",
        "Message"
      ]
    },
    {
      "cells": [
        "wrongUsername",
        "posmanager",
        "Wrong login/password"
      ]
    },
    {
      "cells": [
        "posmanager16@info.com",
        "wrongPassword",
        "Wrong login/password"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Try to login with invalid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Login"
    },
    {
      "name": "@NegativeLogin"
    },
    {
      "name": "@WrongCredentials"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "the user enter wrong credentials \"wrongUsername\" \"posmanager\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.smlsnnshn.step_definitions.LoginStepDefs.the_user_enter_wrong_credentials(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on Login Button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the user should see wrong message \"Wrong login/password\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.smlsnnshn.step_definitions.LoginStepDefs.the_user_should_see_wrong_message(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
formatter.scenario({
  "name": "Try to login with invalid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Login"
    },
    {
      "name": "@NegativeLogin"
    },
    {
      "name": "@WrongCredentials"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "the user enter wrong credentials \"posmanager16@info.com\" \"wrongPassword\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.smlsnnshn.step_definitions.LoginStepDefs.the_user_enter_wrong_credentials(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on Login Button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the user should see wrong message \"Wrong login/password\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.smlsnnshn.step_definitions.LoginStepDefs.the_user_should_see_wrong_message(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
formatter.scenarioOutline({
  "name": "Try to login with invalid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@NegativeLogin"
    },
    {
      "name": "@BlankCredentials"
    }
  ]
});
formatter.step({
  "name": "the user enter blank credentials \"\u003cUsername\u003e\" \"\u003cPassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "click on Login Button",
  "keyword": "And "
});
formatter.step({
  "name": "the user should see blank message \"\u003cMessage\u003e\"",
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
        "Password",
        "Message"
      ]
    },
    {
      "cells": [
        "blank",
        "posmanager",
        "Please fill out this field."
      ]
    },
    {
      "cells": [
        "posmanager16@info.com",
        "blank",
        "Please fill out this field."
      ]
    }
  ]
});
formatter.scenario({
  "name": "Try to login with invalid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Login"
    },
    {
      "name": "@NegativeLogin"
    },
    {
      "name": "@BlankCredentials"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "the user enter blank credentials \"blank\" \"posmanager\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.smlsnnshn.step_definitions.LoginStepDefs.the_user_enter_blank_credentials(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on Login Button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the user should see blank message \"Please fill out this field.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.smlsnnshn.step_definitions.LoginStepDefs.the_user_should_see_blank_message(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
formatter.scenario({
  "name": "Try to login with invalid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Login"
    },
    {
      "name": "@NegativeLogin"
    },
    {
      "name": "@BlankCredentials"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "the user enter blank credentials \"posmanager16@info.com\" \"blank\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.smlsnnshn.step_definitions.LoginStepDefs.the_user_enter_blank_credentials(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on Login Button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the user should see blank message \"Please fill out this field.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.smlsnnshn.step_definitions.LoginStepDefs.the_user_should_see_blank_message(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
});