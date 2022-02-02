Feature: My module accessibility
  Agile Story: As a user, I should be able to access to My module

  Background:
    Given User is on web page
    When User enters valid credentials and clicks [sign in] button

  Scenario: My module should show 3 options
    Given User navigates to [my] Module
    Then Three options should be displayed:
    | self     |
    | team     |
    | sign out |

  Scenario: Self tab should show all the detail info of the user
    Given User navigates to [my] Module
    When User clicks on "self" tab
    And All the detail info of the user should be displayed:
    | name   | Hunt Durand         |
    | role   | student-team-member |
    | team   | HighTech            |
    | batch  | #7                  |
    | campus | VA                  |
    Then "dark side" theme should be on

  Scenario: User should see all the other team members from teams tab
    Given User navigates to [my] Module
    When User clicks on "team" tab
    Then All the other team members should be displayed

