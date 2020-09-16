$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/WeAreFairAssesmentScenarioFive.feature");
formatter.feature({
  "name": "Make a payment more than owed",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@ScenarioFive"
    }
  ]
});
formatter.background({
  "name": "A credit with 35% APR and 1000 credit is created",
  "description": "",
  "keyword": "Background"
});
formatter.scenario({
  "name": "user try to make a payment more than his or her debt",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ScenarioFive"
    }
  ]
});
formatter.step({
  "name": "user draw $500 from his or her account",
  "keyword": "When "
});
formatter.match({
  "location": "step_definitions.WeAreFairAssesmentScenarioTwoStepDef.user_draw_$500_from_his_or_her_account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selects  \"12\" on the Applied at Day dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.WeAreFairAssesmentScenarioFiveStepDef.selects_on_the_Applied_at_Day_dropdown(java.lang.String)"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat step_definitions.WeAreFairAssesmentScenarioFiveStepDef.selects_on_the_Applied_at_Day_dropdown(WeAreFairAssesmentScenarioFiveStepDef.java:16)\r\n\tat ✽.selects  \"12\" on the Applied at Day dropdown(file:///C:/Users/Muhammet%20IŞIK/IdeaProjects/taskProject/src/test/resources/features/WeAreFairAssesmentScenarioFive.feature:6)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "clicks on Save Transaction button",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.WeAreFairAssesmentScenarioOneStepDef.clicks_on_Save_Transaction_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user change the Type dropdown option from Draw to Payment",
  "keyword": "Then "
});
formatter.match({
  "location": "step_definitions.WeAreFairAssesmentScenarioTwoStepDef.user_change_the_Type_dropdown_option_from_Draw_to_Payment()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user pay back $700",
  "keyword": "Then "
});
formatter.match({
  "location": "step_definitions.WeAreFairAssesmentScenarioFiveStepDef.user_pay_back_$700()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "selects  \"4\" on the Appliedd at Day dropdown",
  "keyword": "Then "
});
formatter.match({
  "location": "step_definitions.WeAreFairAssesmentScenarioFiveStepDef.selects_on_the_Appliedd_at_Day_dropdown(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "clicks on Save Transaction button",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.WeAreFairAssesmentScenarioOneStepDef.clicks_on_Save_Transaction_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "verify that Amount cannot exceed what is owed warning is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "step_definitions.WeAreFairAssesmentScenarioFiveStepDef.verify_that_Amount_cannot_exceed_what_is_owed_warning_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on Remove link to destroy his or her transaction",
  "keyword": "Then "
});
formatter.match({
  "location": "step_definitions.WeAreFairAssesmentScenarioFiveStepDef.user_clicks_on_Remove_link_to_destroy_his_or_her_transaction()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "verifies that Transaction was successfully destroyed. message is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.WeAreFairAssesmentScenarioFiveStepDef.verifies_that_Transaction_was_successfully_destroyed_message_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
});