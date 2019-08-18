Feature:

Scenario Outline: Login as different users
Given I login as a "<user>"
When I logout
Then the page title should be "Login"
  And I cli
Examples:
|user  |
|sales manager|
|driver|



Scenario Outline: Login as different users
And I click on customer with email "<email>"
Examples:
|email  |
|qrqw@mail.ru|
|asda@mail.com|
