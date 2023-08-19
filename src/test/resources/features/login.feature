Feature: User Login to the application Test

  @SmokeTest @RegressionSuite
  Scenario: Login to valid credentials
  Given User is on login page
  When User enters valid credentials
  And User should be able to login
  Then Verify user login successfully
