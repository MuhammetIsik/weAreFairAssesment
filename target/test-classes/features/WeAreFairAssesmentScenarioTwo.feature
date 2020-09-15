@ScenarioTwo
Feature: Drawing and pay back transaction
  Scenario: Balance after drawing and paying back
    Given user makes sure that Type dropdown is on draw option
    When user draw $500 from his or her account
    And selects day1 on the Applied at Day dropdown
    And clicks on Save Transaction button
    Then user change the Type dropdown option from Draw to Payment
    Then user pay back $200
    Then selects day15 on the Applied at Day dropdown
    And clicks on Save Transaction button
    Then user makes sure that Type dropdown is on draw option
    Then draws another $100 from his or her account
    Then select day25 on the Applied at Day dropdown
    Then clicks on Save Transaction button
    Then verify that Interest is "$1.99"
    Then verify that the Total is "$411.99"