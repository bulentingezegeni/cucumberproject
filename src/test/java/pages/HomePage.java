package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(partialLinkText = "Signup")
    public WebElement signupLoginButton;

    @FindBy(xpath = "(//h2)[3]")
    public WebElement signupText;

    @FindBy(name = "name")
    public WebElement nameBox;

    @FindBy(xpath = "(//*[@name='email'])[2]")
    public WebElement emailBox;

    @FindBy(xpath = "//*[@data-qa='signup-button']")
    public WebElement accountCreatSignupButton;

    @FindBy(xpath = " (//h2)[1]")
    public WebElement enterAccountInformationText;


    @FindBy(id = "accordian")
    public WebElement categories;

    @FindBy(linkText = "WOMEN")
    public WebElement womenCategoryButton;

    @FindBy(xpath = "//*[@href='/category_products/1']")
    public WebElement dressButton;










}
