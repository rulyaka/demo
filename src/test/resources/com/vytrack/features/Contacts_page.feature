Feature: Contacts page functionality

  @wip
  Scenario: Verify title

    Given I login using these credentials
      | username | salesmanager101 |
      | password | UserUser123     |
    When I navigate to "Customers" "Contacts"
    Then the page title should be "All - Contacts - Customers"