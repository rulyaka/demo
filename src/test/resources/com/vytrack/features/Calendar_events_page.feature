Feature: Calendar events page options

  @wip
  Scenario: View per page options
    Given I login as a "sales manager"
    And I navigate to "Activities" "Calendar events"
    When I click on the View per page dropdown
    Then follow view per page options should be visible
      | 10  |
      | 25  |
      | 50  |
      | 100 |