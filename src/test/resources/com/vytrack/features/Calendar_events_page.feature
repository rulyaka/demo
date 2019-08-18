Feature: Calendar events page options

<<<<<<< HEAD

=======
>>>>>>> 8d4e7a80e02694da9d056790bf1e3ee9374f594c
  Scenario: View per page options
    Given I login as a "sales manager"
    And I navigate to "Activities" "Calendar Events"
    When I click on the View per page dropdown
    Then follow view per page options should be visible
      | 10  |
      | 25  |
      | 50  |
      | 100 |

<<<<<<< HEAD


    Scenario: Activities table headers
      Given I login as a "sales manager"
      When I navigate to "Activities" "Calendar Events"
      Then table should have the following headers
      |TITLE               |
      |CALENDAR            |
      |START               |
      |RECURRENT           |
      |RECURRENCE          |
      |INVITATION STATUS   |

      #################
  Then contacts table should have the following conacts
=======
  Scenario: Activities table headers
    Given I login as a "sales manager"
    When I navigate to "Activities" "Calendar Events"
    Then table should have the following headers
      | TITLE             |
      | CALENDAR          |
      | START             |
      | END               |
      | RECURRENT         |
      | RECURRENCE        |
      | INVITATION STATUS |

    ##########
#    Then contacts table should have the following contacts
#    |Mariam |	Brackstone |	mbrackstone9@example.com|

#    CODE PUSHED
#    BREAK 1.50
>>>>>>> 8d4e7a80e02694da9d056790bf1e3ee9374f594c
