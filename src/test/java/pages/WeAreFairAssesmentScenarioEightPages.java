package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WeAreFairAssesmentScenarioEightPages {
    @FindBy(id = "transaction_amount")
    public WebElement transactionAmount;
    @FindBy(id = "transaction_applied_at")
    public WebElement appliedAtDay;
    @FindBy(name = "commit")
    public WebElement saveTransactionButton;
    @FindBy(xpath = "((//strong)[2]")
    public WebElement creditAvailableText;
    @FindBy(xpath = "//a[@href='/line_of_credits/2601']")
    public WebElement editTextLink;

}
