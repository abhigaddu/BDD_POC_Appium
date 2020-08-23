$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/Feature/login.feature");
formatter.feature({
  "line": 1,
  "name": "Login to the Application",
  "description": "",
  "id": "login-to-the-application",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Access the url link",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStep2.User_Enters_Application_Url()"
});
formatter.result({
  "duration": 26862726800,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Login to Application",
  "description": "",
  "id": "login-to-the-application;login-to-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "User enters the login details",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User will not get an error message \"Username and password did not match or not found\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User will be able to see Home Page",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Access menu profile",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Logout from the application",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User will be redirected back to login page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep2.User_enters_login_details()"
});
formatter.result({
  "duration": 5660398200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": " not ",
      "offset": 9
    },
    {
      "val": "Username and password did not match or not found",
      "offset": 36
    }
  ],
  "location": "LoginStep2.User_Will_Get_Error_Message(String,String)"
});
formatter.result({
  "duration": 2003942100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep2.User_In_Home_Page()"
});
formatter.result({
  "duration": 1449698900,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep2.Access_menu_profile()"
});
formatter.result({
  "duration": 1347277200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep2.Logout_from_the_application()"
});
formatter.result({
  "duration": 1588164300,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep2.User_In_login_Page()"
});
formatter.result({
  "duration": 2054718000,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Access the url link",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStep2.User_Enters_Application_Url()"
});
formatter.result({
  "duration": 125283215100,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Invalid Login to Application",
  "description": "",
  "id": "login-to-the-application;invalid-login-to-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "User enters the wrong login details",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "User will be redirected back to login page",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "User will get an error message \"Username and password did not match or not found\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStep2.User_enters_wrong_login_details()"
});
formatter.result({
  "duration": 4954148900,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep2.User_In_login_Page()"
});
formatter.result({
  "duration": 2137985400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": " ",
      "offset": 9
    },
    {
      "val": "Username and password did not match or not found",
      "offset": 32
    }
  ],
  "location": "LoginStep2.User_Will_Get_Error_Message(String,String)"
});
formatter.result({
  "duration": 1248945600,
  "status": "passed"
});
});