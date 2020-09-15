package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import pages.WeAreFairAssesmentScenarioThreePages;
import utilities.Driver;

public class WeAreFairAssesmentScenarioThreeStepDef {
    WeAreFairAssesmentScenarioThreePages webElements = new WeAreFairAssesmentScenarioThreePages();
    @When("user draw $1200 on his account")
    public void user_draw_$1200_on_his_account() {
        Driver.getDriver().get("http://credit-test.herokuapp.com/");
        webElements.editTextLink.click();
        webElements.transactionAmount.sendKeys("1200");
    }

    @Then("selects {int} on the Applied at Day dropdown")
    public void selects_on_the_Applied_at_Day_dropdown(Integer int1) {
    Select select = new Select(webElements.appliedAtDay);
        select.selectByVisibleText("30");
    }

    @Then("verify that Amount cannot exceed the credit limit warning is displayed")
    public void verify_that_Amount_cannot_exceed_the_credit_limit_warning_is_displayed() {
    webElements.errorMessage.isDisplayed();
    }

}
