Feature: Log out feature

  @logout
  Scenario: Driver
    Given I login as a "driver"
    When I logout
    Then the page title should be "Login"


