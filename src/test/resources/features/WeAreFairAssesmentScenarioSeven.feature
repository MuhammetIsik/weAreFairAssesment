@ScenarioSeven
Feature: Check if APR and credit limit accept letters and special characters
  Background: user is on the website
  Scenario: Try to type letters and special characters in APR and credit limit textboxes
    When User clicks on New Line of Credit link
    Then user types APR in the APR textbox including numbers,letters and special characters
    Then user types amount of credit on the Credit limit textbox including numbers,letters and special characters
    Then clicks on the Create Line of credit button
    And user should be able to see the error message on the web page