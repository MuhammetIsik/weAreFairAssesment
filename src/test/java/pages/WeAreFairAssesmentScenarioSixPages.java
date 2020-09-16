package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WeAreFairAssesmentScenarioSixPages {
    public WeAreFairAssesmentScenarioSixPages(){
        PageFactory.initElements(Driver.getDriver(),this);}

@FindBy(xpath = "//a[@href='/line_of_credits/2602/edit']")
    public WebElement editLink;
@FindBy(id = "line_of_credit_apr")
    public WebElement APRtextBox;
@FindBy(name = "commit")
    public WebElement updateLineOfCreditButton;
@FindBy(id = "notice")
    public WebElement message;

}
