Feature: Google homepage

  Scenario: I open the google homepage and the correct information is displayed
    Given I launch Chrome browser
    When I open Google homepage
    Then the page displays search text box
    And the page displays Google search button
    And the page displays I'm Feeling Lucky button
