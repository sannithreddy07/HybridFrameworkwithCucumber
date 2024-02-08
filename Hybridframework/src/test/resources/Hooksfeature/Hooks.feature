Feature: Hooks demo

  @loginpageHooks
  Scenario: verify login page for hooks
    Given open browser and enter URL
    When enter uname and pwd
    And click login button
    Then user is navigated to home page

  @smoketst
  Scenario: verify login page for hooks2
    Given open browser and enter URL
    When enter uname and pwd
    And click login button
    Then user is navigated to home page
