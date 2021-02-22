$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Conversations.feature");
formatter.feature({
  "name": "Conversations Functionality",
  "description": "  Agile Story: As a user I should be able to see Conversations link on the top menu\n  Description: The purpose of this feature is to test the Conversations link functionality on the top menu",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Dashboard"
    },
    {
      "name": "@Conversations"
    },
    {
      "name": "@wip"
    }
  ]
});
formatter.background({
  "name": "Login with valid credentials",
  "description": "",
  "keyword": "Background"
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
formatter.scenario({
  "name": "Users should be able to see Conversations link on the top menu",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Dashboard"
    },
    {
      "name": "@Conversations"
    },
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "the user should be able to see Conversations link on the top menu",
  "keyword": "Then "
});
formatter.match({
  "location": "com.smlsnnshn.step_definitions.ConversationsStepDefs.the_user_should_be_able_to_see_Conversations_link_on_the_top_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});