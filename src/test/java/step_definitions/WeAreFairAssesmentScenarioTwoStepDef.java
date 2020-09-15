package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.WeAreFairAssesmentScenarioTwoPages;
import utilities.Driver;
import utilities.creditUtils;

public class WeAreFairAssesmentScenarioTwoStepDef {
    WeAreFairAssesmentScenarioTwoPages webElements = new WeAreFairAssesmentScenarioTwoPages();
    creditUtils utils = new creditUtils();
    @When("user draw $500 from his or her account")
    public void user_draw_$500_from_his_or_her_account() {
        Driver.getDriver().get("http://credit-test.herokuapp.com/");
        webElements.editTextLink.click();
        webElements.transactionAmount.sendKeys("500");
    }

    @When("selects day1 on the Applied at Day dropdown")
    public void selects_day1_on_the_Applied_at_Day_dropdown() {
     Select select = new Select(webElements.appliedAtDay);
     select.selectByVisibleText("1");
    }

    @Then("user change the Type dropdown option from Draw to Payment")
    public void user_change_the_Type_dropdown_option_from_Draw_to_Payment() {
     Select select = new Select(webElements.typeDropdown);
     select.selectByVisibleText("Payment");
    }

    @Then("user pay back $200")
    public void user_pay_back_$200() {
       webElements.transactionAmount.sendKeys("200");
    }

    @Then("selects day15 on the Applied at Day dropdown")
    public void selects_day15_on_the_Applied_at_Day_dropdown() {
       Select select = new Select(webElements.typeDropdown);
       select.selectByVisibleText("15");
    }

    @Then("draws another $100 from his or her account")
    public void draws_another_$100_from_his_or_her_account() {
      webElements.transactionAmount.sendKeys("100");
    }

    @Then("select day25 on the Applied at Day dropdown")
    public void select_day25_on_the_Applied_at_Day_dropdown() {
       Select select = new Select(webElements.appliedAtDay);
       select.selectByVisibleText("25");
    }

    @Then("verify that Interest is {string}")
    public void verify_that_Interest_is(String string) {
        Assert.assertEquals(creditUtils.interestSum(400)+creditUtils.interestSum(300)+creditUtils.interestSum(300),webElements.InterestAt30DaysText.getText());
    }

    @Then("verify that the Total is {string}")
    public void verify_that_the_Total_is(String string) {
    Assert.assertEquals(creditUtils.total(400),webElements.TotalPayoffAt30DaysText.getText());
    }


}
