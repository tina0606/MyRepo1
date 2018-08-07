$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 2,
  "name": "Login",
  "description": "I want to login into a site",
  "id": "login",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.before({
  "duration": 149330,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Login into a site",
  "description": "",
  "id": "login;login-into-a-site",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@execute"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I want to login",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I enter valid username and password",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "the result should be my login home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDef.i_want_to_login()"
});
formatter.result({
  "duration": 4189354264,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.i_enter_valid_username_and_password()"
});
formatter.result({
  "duration": 8372225810,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.the_result_should_be_my_login_home_page()"
});
formatter.result({
  "duration": 11254296,
  "status": "passed"
});
formatter.after({
  "duration": 2345770644,
  "status": "passed"
});
});