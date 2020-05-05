$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/shrik/eclipse-workspace/cucumberhybridframework/src/test/resources/Features/TestCase.feature");
formatter.feature({
  "line": 2,
  "name": "orangeHrm website",
  "description": "",
  "id": "orangehrm-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@orangeHRM"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "validate the login functionality",
  "description": "",
  "id": "orangehrm-website;validate-the-login-functionality",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@tc_01_login"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "launch the browser and enter the url",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "login page is opened",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "enter the \"\u003cusername\u003e\" and \"\u003cpassword1\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "click the login button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "take screenshot and close the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "orangehrm-website;validate-the-login-functionality;",
  "rows": [
    {
      "cells": [
        "username1",
        "password1"
      ],
      "line": 14,
      "id": "orangehrm-website;validate-the-login-functionality;;1"
    },
    {
      "cells": [
        "Admin",
        "admin123"
      ],
      "line": 15,
      "id": "orangehrm-website;validate-the-login-functionality;;2"
    },
    {
      "cells": [
        "admin",
        "Admin124"
      ],
      "line": 16,
      "id": "orangehrm-website;validate-the-login-functionality;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 15,
  "name": "validate the login functionality",
  "description": "",
  "id": "orangehrm-website;validate-the-login-functionality;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@tc_01_login"
    },
    {
      "line": 1,
      "name": "@orangeHRM"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "launch the browser and enter the url",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "login page is opened",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "enter the \"\u003cusername\u003e\" and \"admin123\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "click the login button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "take screenshot and close the browser",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 16,
  "name": "validate the login functionality",
  "description": "",
  "id": "orangehrm-website;validate-the-login-functionality;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@tc_01_login"
    },
    {
      "line": 1,
      "name": "@orangeHRM"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "launch the browser and enter the url",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "login page is opened",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "enter the \"\u003cusername\u003e\" and \"Admin124\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "click the login button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "take screenshot and close the browser",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});