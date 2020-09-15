package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.WeAreFairAssesmentScenarioSixPages;
import utilities.Driver;

public class WeAreFairAssesmentScenarioSixStepDef {
    WeAreFairAssesmentScenarioSixPages webElements = new WeAreFairAssesmentScenarioSixPages();
    @When("User clicks on the Edit button")
    public void user_clicks_on_the_Edit_button() {
        Driver.getDriver().get("http://credit-test.herokuapp.com/");
    webElements.editLink.click();
    }

    @Then("User change the APR from {int} to {int}")
    public void user_change_the_APR_from_to(Integer int1, Integer int2) {
    webElements.APRtextBox.clear();
    webElements.APRtextBox.sendKeys("40");
    }

    @Then("clicks on Update Line of Credit button")
    public void clicks_on_Update_Line_of_Credit_button() {
    webElements.updateLineOfCreditButton.click();
    }

    @Then("verifies the Line of credit was successfully updated. message is displayed.")
    public void verifies_the_Line_of_credit_was_successfully_updated_message_is_displayed() {
    webElements.message.isDisplayed();
    }

}
