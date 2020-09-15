@ScenarioOne
Feature: Interest Check
  Background: user is on the website
  Scenario: Drawing money and check the interest
    When use clicks on the credit that he or she created
    Given user makes sure that Type dropdown is on draw option
    When user draw "500" from his account
    And user selects "30" on the Applied at Day dropdown means the whole month
    And clicks on Save Transaction button
    Then verify the Credit Available section on the page
    Then verify that Interest  is "$14.38"
    Then verify that Total payoff is "$514.38"
