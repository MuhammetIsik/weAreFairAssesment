@ScenarioThree
Feature: Drawing money more than total balance
  Background: A credit with 35% APR and 1000 credit is created
  Scenario: user try to draw more than his or her account
    When user draw $1200 on his account
    Then selects 30 on the Applied at Day dropdown
    And clicks on Save Transaction button
    Then verify that Amount cannot exceed the credit limit warning is displayed
