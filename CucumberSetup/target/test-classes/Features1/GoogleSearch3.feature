Feature: Check google search functionality

  Scenario: Validate google search is working
    Given browser is open
    And user is on goolge search page
    When user enters a text on google search box
    And hits enter
    Then user is navigated to the search reasults page