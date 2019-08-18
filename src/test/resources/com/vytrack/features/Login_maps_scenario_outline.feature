Feature: Login as different people using maps
@wip
  Scenario Outline: Verify title
    Given I login using these credentials
    |username| <username> |
    |password| <password> |
    When I navigate to "Customers" "Contacts"
    Then the page title should be "All - Conacts _ Customers"

    Examples:
      |username|salesmanager101|
      |password| UserUser123   |