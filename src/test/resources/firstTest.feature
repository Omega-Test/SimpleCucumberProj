@critical
Feature: Web Login

  @regression @smoke @functional
  Scenario: Attempt login with valid credentials
    Given the user is on login page
    When the user enters valid credentials
    And hits submit
    Then the user should be logged in successfully

  @functional @regression
  Scenario: Attempt Login with invalid credentials
    Given the user is on login page
    When the user enters invalid credentials
    And hits submit
    Then an invalid credentials error message should be displayed to the user
    And login should be unsuccessful

  @ui @regression
  Scenario: Check for company logo on login form
    Given the user is on login page
    Then the Company logo should be present in the login form

  @functional @regression @smoke
  Scenario: Initiate Forgot password flow
    Given the user is on login page
    When the user clicks on Forgot Username
    Then the user should be navigated to the first page of forgot username flow
