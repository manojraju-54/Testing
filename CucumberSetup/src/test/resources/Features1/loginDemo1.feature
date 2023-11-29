Feature: Login functionality

  Scenario: Check login successful with valid credentials
  #Scenario Outline: Check login successful with valid credentials
    Given Browser is open
    And user is on login page
   # When user enters <username> and <password>
   When user enters username and password
    And user clicks on Sign In button
    Then user is navigated to home screen

   # Examples: 
     # | username   | password |
     # | 9632261367 | log      |
      #| 9069746923 | test     |
