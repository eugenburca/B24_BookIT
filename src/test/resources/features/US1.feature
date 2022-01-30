Feature:  As a user, I should be able to login in BookIT

  Scenario:  User should be able to login with valid credentials
  Given User is on web page
  When User enters valid credentials and clicks [sign in] button
  Then User should be on home page

  Scenario Outline:  User should be NOT able to login with invalid credentials
    Given User is on web page
    When User enters invalid login "<email>"
    And User enters invalid "<password>"
    And User clicks on sign in button
    Then User should be not able to log in with invalid credentials
    Examples:
    |email|password|
    |nyablsley8g@nasa.gov|123456789 |
    |jamesBond@gmail.com |huntdurand|
    |jamesBond@gmail.com |123456789 |