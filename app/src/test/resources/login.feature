Feature: Login functionality

  Scenario: Successful login with valid credentials
    Given user is on login page
    When user enters username "standard_user" and password "secret_sauce"
    And clicks login
    Then user should be logged in successfully

  Scenario: Login with invalid credentials
    Given user is on login page
    When user enters username "wrong_user" and password "wrong_pass"
    And clicks login
    Then user should see an error message