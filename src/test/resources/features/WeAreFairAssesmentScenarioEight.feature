@ScenarioEight
Feature: Checking the credit availability
  Background: User created a line of credit with %35 APR and $1000 credit amount
  Scenario: User draws $275 on his or her account and the credit availability should be $725
    When When user draws $275 on his account
    Then selects 19 on the Applied at Day dropdown for the day
    And clicks on Save Transaction button to save
    Then verify that the Credit Available amount should be $725