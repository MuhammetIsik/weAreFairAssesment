package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.WeAreFairAssesmentScenarioSevenPages;
import utilities.Driver;

public class WeAreFairAssesmentScenarioSevenStepDef {
    WeAreFairAssesmentScenarioSevenPages webElements = new WeAreFairAssesmentScenarioSevenPages();
    @When("User clicks on New Line of Credit link")
    public void user_clicks_on_New_Line_of_Credit_link() {
        Driver.getDriver().get("http://credit-test.herokuapp.com/");
webElements.newLineOfTextLink.click();
    }

    @Then("user types APR in the APR textbox including numbers,letters and special characters")
    public void user_types_APR_in_the_APR_textbox_including_numbers_letters_and_special_characters() {
webElements.lineOfCreditAPR.sendKeys("35aA!@");
    }

    @Then("user types amount of credit on the Credit limit textbox including numbers,letters and special characters")
    public void user_types_amount_of_credit_on_the_Credit_limit_textbox_including_numbers_letters_and_special_characters() {
webElements.creditLimit.sendKeys("1000sA!@");
    }

    @Then("clicks on the Create Line of credit button")
    public void clicks_on_the_Create_Line_of_credit_button() {
webElements.button.click();
    }

    @Then("user should be able to see the error message on the web page")
    public void user_should_be_able_to_see_the_error_message_on_the_web_page() {
webElements.errorMessage.isDisplayed();
    }

}
