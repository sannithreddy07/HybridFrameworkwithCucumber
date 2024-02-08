Feature: Test Login functionality

  Scenario Outline: Validate Login Functionality
    Given open browser
    And enter application url
    When user enter <username> and <password>
    And click login
    Then home page of app and logout of app

    Examples: 
      | username | password |
      | nareshit | nareshit |
