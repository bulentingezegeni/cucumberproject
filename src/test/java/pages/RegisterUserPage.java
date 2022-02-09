package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegisterUserPage {

    public RegisterUserPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "id_gender1")
    public WebElement genderBox;


    @FindBy(id = "password")
    public WebElement passwordBox;


    @FindBy(id = "days")
    public WebElement dayDropdown;


    @FindBy(id = "months")
    public WebElement monthDropdown;


    @FindBy(id = "years")
    public WebElement yearDropdown;


    @FindBy(id = "newsletter")
    public WebElement newsletterCheckBox;

    @FindBy(id = "optin")
    public WebElement specialOffersCheckBox;


    @FindBy(id = "first_name")
    public WebElement firstName;


    @FindBy(id = "last_name")
    public WebElement lastName;


    @FindBy(id = "company")
    public WebElement company;


    @FindBy(id = "address1")
    public WebElement address1;


    @FindBy(id = "address2")
    public WebElement address2;


    @FindBy(id = "country")
    public WebElement countryDropdown;


    @FindBy(id = "state")
    public WebElement stateBox;


    @FindBy(id = "city")
    public WebElement cityBox;


    @FindBy(id = "zipcode")
    public WebElement zipcodeBox;


    @FindBy(id = "mobile_number")
    public WebElement mobileNumberBox;


    @FindBy(xpath = "//*[@data-qa='create-account']")
    public WebElement createAccountButton;


    @FindBy(xpath = "(//h2)[1]")
    public WebElement accountCreatedText;



    @FindBy(xpath = "//*[@data-qa='continue-button']")
    public WebElement continueButton;


    @FindBy(xpath = "//*[text( )=' Logged in as ']")
    public WebElement loggedInAsText;


    @FindBy(xpath = "//*[text()=' Delete Account']")
    public WebElement deleteAccountButton;


    @FindBy(xpath = "//*[text()='Delete']")
    public WebElement confirmDeleteButton;










}
