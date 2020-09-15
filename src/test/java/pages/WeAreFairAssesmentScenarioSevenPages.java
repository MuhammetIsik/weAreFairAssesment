package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WeAreFairAssesmentScenarioSevenPages {
    public WeAreFairAssesmentScenarioSevenPages(){
        PageFactory.initElements(Driver.getDriver(),this);}
    @FindBy(linkText = "New Line of credit")
    public WebElement newLineOfTextLink;
    @FindBy(id = "line_of_credit_apr")
    public WebElement lineOfCreditAPR;
    @FindBy(id = "line_of_credit_credit_limit")
    public WebElement creditLimit;
    @FindBy(name = "commit")
    public WebElement button;
    @FindBy(id="error_explanation")
    public WebElement errorMessage;

}
