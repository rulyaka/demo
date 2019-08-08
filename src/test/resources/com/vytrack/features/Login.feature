@login @vyt-111
Feature: Login
  Agile story:
  As a user,
  when I enter valid login credentials
  I should be able to see the dashboard page

  @smoke
  Scenario: Login as driver
    Given I am on the login page
    When I login as a driver
    Then I should be able to see the dashboard page

  @smoke @wip
  Scenario: Login as a sales manager
    Given I am on the login page
    When I login as a sales manager
    Then I should be able to see the dashboard page

  @vyt-222
  Scenario: Login as a store manager
    Given I am on the login page
    When I login as a store manager
    Then I should be able to see the dashboard page