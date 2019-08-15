Feature: User account information

  @wip
  Scenario: test with manager
    Given I login as a "driver"
    And I navigate to "Customers" "Contacts"
    When I click on customer with email "odugmore5@sakura.ne.jp"
    Then customer email should be "odugmore5@sakura.ne.jp" in the account page

