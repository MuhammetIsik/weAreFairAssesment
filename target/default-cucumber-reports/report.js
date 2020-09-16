$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/WeAreFairAssesmentScenarioEight.feature");
formatter.feature({
  "name": "Checking the credit availability",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@ScenarioEight"
    }
  ]
});
formatter.background({
  "name": "User created a line of credit with %35 APR and $1000 credit amount",
  "description": "",
  "keyword": "Background"
});
formatter.scenario({
  "name": "User draws $275 on his or her account and the credit availability should be $725",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ScenarioEight"
    }
  ]
});
formatter.step({
  "name": "When user draws $275 on his account",
  "keyword": "When "
});
formatter.match({
  "location": "step_definitions.WeAreFairAssesmentScenarioEightStepDef.when_user_draws_$275_on_his_account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selects 19 on the Applied at Day dropdown for the day",
  "keyword": "Then "
});
formatter.match({
  "location": "step_definitions.WeAreFairAssesmentScenarioEightStepDef.selects_on_the_Applied_at_Day_dropdown_for_the_day(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on Save Transaction button to save",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.WeAreFairAssesmentScenarioEightStepDef.clicks_on_Save_Transaction_button_to_save()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify that the Credit Available amount should be $725",
  "keyword": "Then "
});
formatter.match({
  "location": "step_definitions.WeAreFairAssesmentScenarioEightStepDef.verify_that_the_Credit_Available_amount_should_be_$725()"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003cCredit Available: $[72]5.00 of $1,000.00\u003e but was:\u003cCredit Available: $[27]5.00 of $1,000.00\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:117)\r\n\tat org.junit.Assert.assertEquals(Assert.java:146)\r\n\tat step_definitions.WeAreFairAssesmentScenarioEightStepDef.verify_that_the_Credit_Available_amount_should_be_$725(WeAreFairAssesmentScenarioEightStepDef.java:41)\r\n\tat ✽.verify that the Credit Available amount should be $725(file:///C:/Users/Muhammet%20IŞIK/IdeaProjects/taskProject/src/test/resources/features/WeAreFairAssesmentScenarioEight.feature:8)\r\n",
  "status": "failed"
});
});