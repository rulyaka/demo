Feature: Contacts page functionality

<<<<<<< HEAD

=======
>>>>>>> 8d4e7a80e02694da9d056790bf1e3ee9374f594c
  Scenario: Verify title
    Given I login using these credentials
      | username | salesmanager101 |
      | password | UserUser123     |
<<<<<<< HEAD

    When I navigate to "Customers" "Contacts"
    Then the page tile should be "All - Contacts - Customers"
=======
    When I navigate to "Customers" "Contacts"
    Then the page title should be "All - Contacts - Customers"

>>>>>>> 8d4e7a80e02694da9d056790bf1e3ee9374f594c
  @wip
  Scenario: Verify contact create details
    Given I login as a driver
    And I navigate to "Customers" "Contacts"
    When I click on customer with email "mbrackstone9@example.com"
    Then contact creation details should display correctly
      | Created At | Aug 14, 2019, 2:20 PM |
      | Owner      |  cyber tek            |
<<<<<<< HEAD
=======

>>>>>>> 8d4e7a80e02694da9d056790bf1e3ee9374f594c
