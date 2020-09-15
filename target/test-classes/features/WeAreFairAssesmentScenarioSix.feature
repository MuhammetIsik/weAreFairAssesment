@ScenarioSix
Feature: Updating Credit line
  Background: User is on the http://credit-test.herokuapp.com/line_of_credits website
  Scenario: User should be able to update his or her credit line with clicking the Edit button
  When User clicks on the Edit button
    Then User change the APR from 35 to 40
    And clicks on Update Line of Credit button
    Then verifies the Line of credit was successfully updated. message is displayed.

