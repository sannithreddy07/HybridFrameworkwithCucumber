Feature: Demo background

  Background: user logged in
    Given nter application url
    When usr enters username and password
    When click on login button

  Scenario: validate login homepage
    And click on Add emp buttons
    Then logut of application

  Scenario: validate login homepage pim module
    And click on pim module
    Then logut of application
