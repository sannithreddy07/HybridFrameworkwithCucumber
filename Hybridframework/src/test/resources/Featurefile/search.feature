@searchfunctionality
Feature: Search functionality of Google application

  Scenario: Validate search functionality of google
    Given Open browser
    And enter app url
    When enter user input in the search box
    And hit Enter
    Then View results and close browser
