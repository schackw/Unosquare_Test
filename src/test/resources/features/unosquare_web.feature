Feature: i as user want to be in a Unosquare web site

  Scenario: Select the option Nearshore Development Services
    Given The user must be on the Unosquare web site home page.
    When The user select the option
    Then The user must be in the Nearshore Development Services

  Scenario: I as user can not follow if the field place filter is empty in contact us section
    Given The user must be on the Unosquare web site home page.
    When The user be in the Nearshore Development Services
    And The user go to the contact us section and select the submit botton
    Then The user will be see the message error


  Scenario: I as user can fill the fields Company number and telephone number
    Given The user be in Contact us section
    When The enter the values in company numer and telephone number fields
      | company number | telephone number |
      | 839-1855       | 9031-2727        |


  Scenario: I as user want be in About section
    Given The user be in Contact us section
    When The user select the about us option
    Then The user should see the Personal,Profesional and social tittle
