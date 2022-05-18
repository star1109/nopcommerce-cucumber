$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ComputerPageTest.feature");
formatter.feature({
  "line": 1,
  "name": "Computer page test",
  "description": "As a user I want to check following scenario on computer page of nop commerce website",
  "id": "computer-page-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4258580100,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "verify User Should Navigate To Computer Page Successfully",
  "description": "",
  "id": "computer-page-test;verify-user-should-navigate-to-computer-page-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Sanity"
    },
    {
      "line": 4,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on\"Computers\" tab",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Verify the \u0027computer\u0027 text",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 64684300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Computers",
      "offset": 11
    }
  ],
  "location": "ComputerSteps.iClickOnTab(String)"
});
formatter.result({
  "duration": 1213856600,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.verifyTheComputerText()"
});
formatter.result({
  "duration": 20188700,
  "status": "passed"
});
formatter.after({
  "duration": 637793000,
  "status": "passed"
});
formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Test",
  "description": "As user I want to login into nop commerce website",
  "id": "login-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2520425800,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User should navigate to login page successfully",
  "description": "",
  "id": "login-test;user-should-navigate-to-login-page-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Sanity"
    },
    {
      "line": 4,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I click on login link",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I should navigate to login page successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 13400,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickOnLoginLink()"
});
formatter.result({
  "duration": 869450700,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iShouldNavigateToLoginPageSuccessfully()"
});
formatter.result({
  "duration": 23779700,
  "status": "passed"
});
formatter.after({
  "duration": 614118500,
  "status": "passed"
});
formatter.uri("register.feature");
formatter.feature({
  "line": 1,
  "name": "Register",
  "description": "As user I want to register into nop commerce website",
  "id": "register",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2797469200,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "verify User Should Navigate To Register Page Successfully",
  "description": "",
  "id": "register;verify-user-should-navigate-to-register-page-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Sanity"
    },
    {
      "line": 4,
      "name": "@Regression"
    },
    {
      "line": 4,
      "name": "@check"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on register link",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Verify the register text",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 24400,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.iClickOnRegisterLink()"
});
formatter.result({
  "duration": 704714600,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.verifyTheRegisterText()"
});
formatter.result({
  "duration": 22870400,
  "status": "passed"
});
formatter.after({
  "duration": 614254000,
  "status": "passed"
});
});