Feature: As a user, I am able to check if a vehicle exists

  Scenario: An error message is displayed if I do not enter any registration details
    Given I have launched the vehicle search website
    When I click Find Vehicle
    Then the error message "Please enter a valid car registration" is displayed

  Scenario: An error message is displayed if I enter an invalid character
    Given I have launched the vehicle search website
    When I enter "A1!" in the search field
    Then the error message "Please enter a valid car registration" is displayed

  Scenario: If I enter an invalid registration, then no vehicle information is displayed
    Given I have launched the vehicle search website
    When I enter "YR18AAZ" in the search field
    Then the message "Sorry record not found" is displayed

  Scenario: If I enter a valid registration, then the correct vehicle information is displayed
    Given I have launched the vehicle search website
    When I enter "OV12UYY" in the search field
    Then the correct details are displayed
