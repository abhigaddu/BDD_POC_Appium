Feature: Login to the Mobile Application

  Background: 
    Given Access the url link

  Scenario: Login to Mobile Application
    When User enters the login details
    Then User will be able to see Home Page
    And Access menu test data
    When Access menu profile
    And Logout from the application
    Then User will be redirected back to login page
    And Close the session

  Scenario: Invalid Login to Mobile Application
    When User enters the wrong login details
    Then User will be redirected back to login page
    And User will get an error message "Username and password did not match or not found"
    And Close the session
