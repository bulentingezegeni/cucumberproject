package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ContactUsPage {

    public ContactUsPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//*[@href='/contact_us']")
    public WebElement contactUsButton;

    @FindBy(xpath = "(//h2)[2]")
    public WebElement getInTouchText;

    @FindBy(name = "name")
    public WebElement nameBox;

    @FindBy(name = "email")
    public WebElement emailBox;


    @FindBy(name = "subject")
    public WebElement subjectBox;


    @FindBy(id = "message")
    public WebElement messageBox;


    @FindBy(name = "upload_file")
    public WebElement choseFileButton;


    @FindBy(name = "submit")
    public WebElement submitButton;


    @FindBy(xpath = "(//*[text()='Success! Your details have been submitted successfully.'])[1]")
    public WebElement successMessageContactUs;

    @FindBy(partialLinkText = "Home")
    public WebElement homeButton;






}
