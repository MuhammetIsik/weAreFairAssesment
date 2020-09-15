package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import pages.WeAreFairAssesmentScenarioFourPages;
import utilities.Driver;

public class WeAreFairAssesmentScenarioFourStepDef {
    WeAreFairAssesmentScenarioFourPages webElements = new WeAreFairAssesmentScenarioFourPages();
    @When("user draw $0 on his account")
    public void user_draw_$0_on_his_account() {
        Driver.getDriver().get("http://credit-test.herokuapp.com/");
        webElements.editTextLink.click();
    webElements.transactionAmount.sendKeys("0");
    }

    @Then("selects {string} on the Applied at Day dropdown")
    public void selects_on_the_Applied_at_Day_dropdown(String string) {
    Select select = new Select(webElements.appliedAtDay);
    select.selectByVisibleText("30");
    }

    @Then("verify that Amount must be greater than {int} warning is displayed")
    public void verify_that_Amount_must_be_greater_than_warning_is_displayed(Integer int1) {
    webElements.errorMessage.isDisplayed();
    }

}
