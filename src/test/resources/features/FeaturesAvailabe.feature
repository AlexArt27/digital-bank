Feature: This feature file to test functionality related to login

  @Regression
  Scenario: Verify all details in account home page is available
    Given user open website
    When user do login
    Then user see welcome message with their name
    And user see home button
    And user see checking button
    And user see savings button
    And user see external button
