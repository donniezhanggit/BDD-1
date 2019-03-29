Feature: Data Driven Tests
  This feature covers different examples of data driven testing in cucumber

  Scenario: Perform search operation on Google Homepage
    Given I launch Chrome browser
    When I open Google homepage
    Then I search for "Weather tomorrow" on Google
