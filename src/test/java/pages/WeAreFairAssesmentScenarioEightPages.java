package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WeAreFairAssesmentScenarioEightPages {
    public WeAreFairAssesmentScenarioEightPages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "transaction_amount")
    public WebElement transactionAmount;
    @FindBy(id = "transaction_applied_at")
    public WebElement appliedAtDay;
    @FindBy(name = "commit")
    public WebElement saveTransactionButton;
    @FindBy(xpath = ("(//p)[3]"))
    public WebElement creditAvailableText;
    @FindBy(xpath = "(//a[@href='/line_of_credits/2602'])[1]")
    public WebElement showTextLink;

}
