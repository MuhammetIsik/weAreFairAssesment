package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.CreateCreditpPages;
import utilities.Driver;

public class CreatingANewLineOfCreditStepDef {
    CreateCreditpPages objects = new CreateCreditpPages();
    @Given("user is on the website")
    public void user_is_on_the_website() {
        Driver.getDriver().get("http://credit-test.herokuapp.com/");
    }

    @Then("user clicks on New Line of credit link")
    public void user_clicks_on_New_Line_of_credit_link() {
   objects.newLineOfTextLink.click();

    }

    @Then("user writes {int} in the Apr textbox")
    public void user_writes_in_the_Apr_textbox(Integer int1) {
        objects.APRtextBox.sendKeys("35");
    }

    @Then("user writes {int} in the Credit limit textbox")
    public void user_writes_in_the_Credit_limit_textbox(Integer int1) {
        objects.creditLimitTextBox.sendKeys("1000");
    }

    @Then("user clicks on Create Line of credit button")
    public void user_clicks_on_Create_Line_of_credit_button() {
        objects.createLineOfCreditButton.click();
    }

    @Then("verify that Line of credit was successfully created. text is showed up on the website")
    public void verify_that_Line_of_credit_was_successfully_created_text_is_showed_up_on_the_website() {
        objects.varificationText.isDisplayed();
    }

}
