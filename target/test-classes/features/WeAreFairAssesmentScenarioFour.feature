@ScenarioFour
Feature: Trying to draw $0 on the account
  Background: A credit with 35% APR and 1000 credit is created
  Scenario: User tries to draw $0 on the account
    When user draw $0 on his account
    Then selects "18" on the Applied at Day dropdown
    And clicks on Save Transaction button
    Then verify that Amount must be greater than 0 warning is displayed