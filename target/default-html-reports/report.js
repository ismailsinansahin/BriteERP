$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/NegativeLogin.feature");
formatter.feature({
  "name": "Negative Login",
  "description": "  Agile Story: As a user I should not be able to login with invalid credentials\n  Description: The purpose of this feature is to test the login functionality (Negative Test)",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Login"
    },
    {
      "name": "@NegativeLogin"
    },
    {
      "name": "@Dashboard"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Users should not be able to login with blank credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
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
  "name": "click on login button",
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
  "name": "Users should not be able to login with blank credentials",
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
      "name": "@Dashboard"
    },
    {
      "name": "@BlankCredentials"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user enter blank credentials \"blank\" \"posmanager\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.smlsnnshn.step_definitions.LoginStepDefs.the_user_enter_blank_credentials(java.lang.String,java.lang.String)"
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
  "name": "the user should see blank message \"Please fill out this field.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.smlsnnshn.step_definitions.LoginStepDefs.the_user_should_see_blank_message(java.lang.String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//div[@class\u003d\u0027toast-message\u0027]\"}\n  (Session info: chrome\u003d88.0.4324.182)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-J5QIJV6\u0027, ip: \u0027192.168.1.2\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002713.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 88.0.4324.182, chrome: {chromedriverVersion: 88.0.4324.96 (68dba2d8a0b14..., userDataDir: C:\\Users\\A\\AppData\\Local\\Te...}, goog:chromeOptions: {debuggerAddress: localhost:63433}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 64a4f417b4a7c2b98dbc5137c882cdf6\n*** Element info: {Using\u003dxpath, value\u003d//div[@class\u003d\u0027toast-message\u0027]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy18.getText(Unknown Source)\r\n\tat com.smlsnnshn.pages.LoginPage.verifyBlankMessage(LoginPage.java:82)\r\n\tat com.smlsnnshn.step_definitions.LoginStepDefs.the_user_should_see_blank_message(LoginStepDefs.java:50)\r\n\tat ✽.the user should see blank message \"Please fill out this field.\"(file:///C:/Users/A/IdeaProjects/BriteERP/src/test/resources/features/NegativeLogin.feature:20)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", "screenshot");
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Users should not be able to login with blank credentials",
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
      "name": "@Dashboard"
    },
    {
      "name": "@BlankCredentials"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user enter blank credentials \"posmanager16@info.com\" \"blank\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.smlsnnshn.step_definitions.LoginStepDefs.the_user_enter_blank_credentials(java.lang.String,java.lang.String)"
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
  "name": "the user should see blank message \"Please fill out this field.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.smlsnnshn.step_definitions.LoginStepDefs.the_user_should_see_blank_message(java.lang.String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//div[@class\u003d\u0027toast-message\u0027]\"}\n  (Session info: chrome\u003d88.0.4324.182)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-J5QIJV6\u0027, ip: \u0027192.168.1.2\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002713.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 88.0.4324.182, chrome: {chromedriverVersion: 88.0.4324.96 (68dba2d8a0b14..., userDataDir: C:\\Users\\A\\AppData\\Local\\Te...}, goog:chromeOptions: {debuggerAddress: localhost:63453}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: a588056212a4d0bf6cb1c4806590e02b\n*** Element info: {Using\u003dxpath, value\u003d//div[@class\u003d\u0027toast-message\u0027]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy18.getText(Unknown Source)\r\n\tat com.smlsnnshn.pages.LoginPage.verifyBlankMessage(LoginPage.java:82)\r\n\tat com.smlsnnshn.step_definitions.LoginStepDefs.the_user_should_see_blank_message(LoginStepDefs.java:50)\r\n\tat ✽.the user should see blank message \"Please fill out this field.\"(file:///C:/Users/A/IdeaProjects/BriteERP/src/test/resources/features/NegativeLogin.feature:20)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded1.png", "screenshot");
formatter.after({
  "status": "passed"
});
});