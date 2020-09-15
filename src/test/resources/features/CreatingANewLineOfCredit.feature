@createCredit
Feature: Creating a new line of credit
  Scenario: User creates a new line of credit
    Given user is on the website
    Then user clicks on New Line of credit link
    And user writes 35 in the Apr textbox
    And user writes 1000 in the Credit limit textbox
    Then user clicks on Create Line of credit button
    Then verify that Line of credit was successfully created. text is showed up on the website
