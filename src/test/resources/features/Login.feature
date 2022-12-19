Feature: Login functionality

  @sprint1 @regression @lg1
  Scenario: Valid admin login
  //  Given user is navigated to Amazon application
    When user clicks sign in button
    When user enters valid username and clicks continue
    And user enters valid password and clicks on sign in button
    Then user is successfully logged in
