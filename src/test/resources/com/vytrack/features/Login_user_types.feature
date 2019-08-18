Feature: Login different types type of users

  Scenario Outline: Login as different users
    Given I login as a "<user>"
    When I logout
    Then the page title should be "Login"
    Examples:
    |user  |
    |sales manager|
    |driver|



  Scenario Outline: Login as different users
    Given I login as a <user>
    When I logout
    Then the page title should be "Login"
    Examples:
      |user  |
      |sales manager|
      |driver|
      |store manager|