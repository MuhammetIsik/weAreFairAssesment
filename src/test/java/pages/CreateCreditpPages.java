package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CreateCreditpPages {

    public CreateCreditpPages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(linkText = "New Line of credit")
    public WebElement newLineOfTextLink;
    @FindBy(id = "line_of_credit_apr")
    public WebElement APRtextBox;
    @FindBy(id = "line_of_credit_credit_limit")
    public WebElement creditLimitTextBox;
    @FindBy(name = "commit")
    public WebElement createLineOfCreditButton;
    @FindBy(css = "div[id='line_of_credit_id']")
    public WebElement varificationText;
}
