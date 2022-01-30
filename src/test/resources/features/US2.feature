@reservation
Feature: As a user I should be able to make a reservation on bookIT application

  Background:
    Given User is on web page

  Scenario: User should be able to make reservation
    Given User enters valid credentials and clicks [sign in] button
    When User user clicks [hunt] button
    And User enters a date, starting time and ending time
    And User clicks search button
    And User choose free spot in that date
    And User confirm the date
    Then User should see confirmation status "yey, you got it"
