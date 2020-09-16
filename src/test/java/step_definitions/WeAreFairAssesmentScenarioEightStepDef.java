package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.WeAreFairAssesmentScenarioEightPages;
import utilities.Driver;

public class WeAreFairAssesmentScenarioEightStepDef {
    WeAreFairAssesmentScenarioEightPages webElements = new WeAreFairAssesmentScenarioEightPages();
    @When("When user draws $275 on his account")
    public void when_user_draws_$275_on_his_account() {
        Driver.getDriver().get("http://credit-test.herokuapp.com/");
        JavascriptExecutor jsexecutor = ((JavascriptExecutor) Driver.getDriver());
        jsexecutor.executeScript("window.scrollTo(0,document.body.scrollHeight)");
       webElements.showTextLink.click();
//        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transaction_amount")));
    webElements.transactionAmount.sendKeys("275");
    }

    @Then("selects {int} on the Applied at Day dropdown for the day")
    public void selects_on_the_Applied_at_Day_dropdown_for_the_day(Integer int1) {
    Select select = new Select(webElements.appliedAtDay);
    select.selectByVisibleText("19");
    }

    @Then("clicks on Save Transaction button to save")
    public void clicks_on_Save_Transaction_button_to_save() {
    webElements.saveTransactionButton.click();
    }

    @Then("verify that the Credit Available amount should be $725")
    public void verify_that_the_Credit_Available_amount_should_be_$725() {
        Assert.assertEquals("Credit Available: $725.00 of $1,000.00",webElements.creditAvailableText.getText());
    }
}
