@ScenarioFive
Feature: Make a payment more than owed
  Background: A credit with 35% APR and 1000 credit is created
  Scenario: user try to make a payment more than his or her debt
    When user draw $500 from his or her account
    And selects  "12" on the Applied at Day dropdown
    And clicks on Save Transaction button
    Then user change the Type dropdown option from Draw to Payment
    Then user pay back $700
    Then selects  "4" on the Appliedd at Day dropdown
    And clicks on Save Transaction button
    Then verify that Amount cannot exceed what is owed warning is displayed
    Then user clicks on Remove link to destroy his or her transaction
    And verifies that Transaction was successfully destroyed. message is displayed