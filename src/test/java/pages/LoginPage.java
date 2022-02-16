package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='Login to your account']")
    public WebElement loginToYourAccountText;


    @FindBy(xpath = "//*[@data-qa='login-email']")
    public WebElement loginEmailBox;


    @FindBy(xpath = "//*[@data-qa='login-password']")
    public WebElement loginPasswordBox;

    @FindBy(xpath = "//*[@data-qa='login-button']")
    public WebElement loginButton;


    @FindBy(xpath = "//*[text()='Your email or password is incorrect!']")
    public WebElement invalidLoginText;


    @FindBy(xpath = "//*[@href='/logout']")
    public WebElement logoutButton;



}
