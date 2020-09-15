$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/WeAreFairAssesmentScenarioOne.feature");
formatter.feature({
  "name": "Interest Check",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@ScenarioOne"
    }
  ]
});
formatter.background({
  "name": "user is on the website",
  "description": "",
  "keyword": "Background"
});
formatter.scenario({
  "name": "Drawing money and check the interest",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ScenarioOne"
    }
  ]
});
formatter.step({
  "name": "use clicks on the credit that he or she created",
  "keyword": "When "
});
formatter.match({
  "location": "step_definitions.WeAreFairAssesmentScenarioOneStepDef.use_clicks_on_the_credit_that_he_or_she_created()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user makes sure that Type dropdown is on draw option",
  "keyword": "Given "
});
formatter.match({
  "location": "step_definitions.WeAreFairAssesmentScenarioOneStepDef.user_makes_sure_that_Type_dropdown_is_on_draw_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user draw \"500\" from his account",
  "keyword": "When "
});
formatter.match({
  "location": "step_definitions.WeAreFairAssesmentScenarioOneStepDef.user_draw_from_his_account(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects \"30\" on the Applied at Day dropdown means the whole month",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.WeAreFairAssesmentScenarioOneStepDef.user_selects_on_the_Applied_at_Day_dropdown_means_the_whole_month(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on Save Transaction button",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.WeAreFairAssesmentScenarioOneStepDef.clicks_on_Save_Transaction_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the Credit Available section on the page",
  "keyword": "Then "
});
formatter.match({
  "location": "step_definitions.WeAreFairAssesmentScenarioOneStepDef.verify_the_Credit_Available_section_on_the_page()"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003cCredit Available: $[50]0.00 of $1,000.00\u003e but was:\u003cCredit Available: $[]0.00 of $1,000.00\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:117)\r\n\tat org.junit.Assert.assertEquals(Assert.java:146)\r\n\tat step_definitions.WeAreFairAssesmentScenarioOneStepDef.verify_the_Credit_Available_section_on_the_page(WeAreFairAssesmentScenarioOneStepDef.java:64)\r\n\tat ✽.verify the Credit Available section on the page(file:///C:/Users/Muhammet%20IŞIK/IdeaProjects/taskProject/src/test/resources/features/WeAreFairAssesmentScenarioOne.feature:10)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "verify that Interest  is \"$14.38\"",
  "keyword": "Then "
});
formatter.match({
  "location": "step_definitions.WeAreFairAssesmentScenarioOneStepDef.verify_that_Interest_is(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "verify that Total payoff is \"$514.38\"",
  "keyword": "Then "
});
formatter.match({
  "location": "step_definitions.WeAreFairAssesmentScenarioOneStepDef.verify_that_Total_payoff_is()"
});
formatter.result({
  "status": "skipped"
});
});