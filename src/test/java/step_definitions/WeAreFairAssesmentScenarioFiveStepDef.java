package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.support.ui.Select;
import pages.WeAreFairAssesmentScenarioFivePages;
import utilities.Driver;

public class WeAreFairAssesmentScenarioFiveStepDef {
    WeAreFairAssesmentScenarioFivePages webElements = new WeAreFairAssesmentScenarioFivePages();

    @When("selects  {string} on the Applied at Day dropdown")
    public void selects_on_the_Applied_at_Day_dropdown(String string) {
        Driver.getDriver().get("http://credit-test.herokuapp.com/");
        webElements.editTextLink.click();
        Select select = new Select(webElements.appliedAtDay);
        select.selectByVisibleText("14");
    }

    @Then("user pay back $700")
    public void user_pay_back_$700() {
    webElements.transactionAmount.sendKeys("700");
    }

    @Then("selects  {string} on the Appliedd at Day dropdown")
    public void selects_on_the_Appliedd_at_Day_dropdown(String string) {
        Select select = new Select(webElements.appliedAtDay);
        select.selectByVisibleText("15");
    }

    @Then("verify that Amount cannot exceed what is owed warning is displayed")
    public void verify_that_Amount_cannot_exceed_what_is_owed_warning_is_displayed() {
    webElements.errorMessage.isDisplayed();
    }

    @Then("user clicks on Remove link to destroy his or her transaction")
    public void user_clicks_on_Remove_link_to_destroy_his_or_her_transaction() {
    webElements.remove.click();
    }

    @Then("verifies that Transaction was successfully destroyed. message is displayed")
    public void verifies_that_Transaction_was_successfully_destroyed_message_is_displayed() {
    webElements.text.isDisplayed();
    }

}
