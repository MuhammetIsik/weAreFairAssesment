package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WeAreFairAssesmentScenarioFivePages {
    @FindBy(id = "transaction_amount")
    public WebElement transactionAmount;
    @FindBy(id = "transaction_type")
    public WebElement typeDropdown;
    @FindBy(id = "transaction_applied_at")
    public WebElement appliedAtDay;
    @FindBy(name = "commit")
    public WebElement saveTransactionButton;
    @FindBy(xpath = "//a[@href='/line_of_credits/2601']")
    public WebElement editTextLink;
    @FindBy(id = "error_explanation")
    public WebElement errorMessage;
    @FindBy(className = "delete-transaction")
    public WebElement remove;
    @FindBy(id = "notice")
    public WebElement text;
}
