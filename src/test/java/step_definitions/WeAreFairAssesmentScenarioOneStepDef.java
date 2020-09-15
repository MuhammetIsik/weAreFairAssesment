package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.WeAreFairAssesmentScenarioOnePages;
import utilities.Driver;
import utilities.creditUtils;

import static java.lang.Thread.sleep;

public class WeAreFairAssesmentScenarioOneStepDef {
    WeAreFairAssesmentScenarioOnePages webElement = new WeAreFairAssesmentScenarioOnePages();
    creditUtils utils = new creditUtils();
    @When("use clicks on the credit that he or she created")
    public void use_clicks_on_the_credit_that_he_or_she_created() {
        Driver.getDriver().get("http://credit-test.herokuapp.com/");
        webElement.editTextLink.click();
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Given("user makes sure that Type dropdown is on draw option")
    public void user_makes_sure_that_Type_dropdown_is_on_draw_option() {
    Select select = new Select(webElement.typeDropdown);
    select.selectByVisibleText("Draw");
    }

    @When("user draw {string} from his account")
    public void user_draw_from_his_account(String string) {
    webElement.transactionAmount.sendKeys(string);
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @When("user selects {string} on the Applied at Day dropdown means the whole month")
    public void user_selects_on_the_Applied_at_Day_dropdown_means_the_whole_month(String string) {

        Select select = new Select(webElement.appliedAtDay);
    select.selectByVisibleText("30");
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @When("clicks on Save Transaction button")
    public void clicks_on_Save_Transaction_button() {
    webElement.saveTransactionButton.click();
    }

    @Then("verify the Credit Available section on the page")
    public void verify_the_Credit_Available_section_on_the_page() {
        Assert.assertEquals("Credit Available: $500.00 of $1,000.00",webElement.creditAvailableText.getText());
    }

    @Then("verify that Interest  is {string}")
    public void verify_that_Interest_is(String string) {
    Assert.assertEquals(creditUtils.interestSum(500),webElement.InterestAt30DaysText.getText());
    }

    @Then("verify that Total payoff is {string}")
    public void verify_that_Total_payoff_is() {
    Assert.assertEquals(creditUtils.total(1000),webElement.TotalPayoffAt30DaysText.getText());
    }
}
