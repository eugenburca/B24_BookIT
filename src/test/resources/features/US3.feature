@reservation
Feature: As a uUser, I should be able to see which rooms are reserved by my team through schedule link.

  Scenario: User should be able to see reserved rooms made by her Team Lead in "My" section by the current Week's view schedule.
   Given User should  hover over to my section
    When User should click team under my section
    Then User should see reserved rooms

