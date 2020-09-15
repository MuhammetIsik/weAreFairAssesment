package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WeAreFairAssesmentScenarioTwoPages {
    public WeAreFairAssesmentScenarioTwoPages(){ PageFactory.initElements(Driver.getDriver(),this); }
    @FindBy(id = "transaction_amount")
    public WebElement transactionAmount;
    @FindBy(id = "transaction_type")
    public WebElement typeDropdown;
    @FindBy(id = "transaction_applied_at")
    public WebElement appliedAtDay;
    @FindBy(name = "commit")
    public WebElement saveTransactionButton;
    @FindBy(xpath = "(//strong)[5]")
    public WebElement InterestAt30DaysText;
    @FindBy(xpath = "((//strong)[4]")
    public WebElement TotalPayoffAt30DaysText;
    @FindBy(xpath = "//a[@href='/line_of_credits/2601']")
    public WebElement editTextLink;

}
