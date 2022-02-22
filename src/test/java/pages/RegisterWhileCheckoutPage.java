package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegisterWhileCheckoutPage {

    public RegisterWhileCheckoutPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "(//*[@class='btn btn-default add-to-cart'])[1]")
    public WebElement firstProduct;

    @FindBy(xpath = "(//*[@class='btn btn-default add-to-cart'])[3]")
    public WebElement secondProduct;


    @FindBy(xpath = "//*[@data-dismiss='modal']")
    public WebElement continueShoppingButton;


    @FindBy(xpath = "(//*[@href='/view_cart'])[1]")
    public WebElement cartButton;


    @FindBy(xpath = "//*[text()='Shopping Cart']")
    public WebElement shoppingCartText;


    @FindBy(linkText = "Proceed To Checkout")
    public WebElement proceedToCheckoutButton;


    @FindBy(linkText = "Register / Login")
    public WebElement registerLoginButton;


    @FindBy(xpath = "//*[text()='Address Details']")
    public WebElement addressDetailsText;


    @FindBy(xpath = "//*[text()='Review Your Order']")
    public WebElement reviewYourOrderText;


    @FindBy(name = "message")
    public WebElement messageBox;


    @FindBy(xpath = "//*[@href='/payment']")
    public WebElement placeOrderButton;


    @FindBy(name = "name_on_card")
    public WebElement nameOnCardBox;


    @FindBy(name = "card_number")
    public WebElement cardNumberBox;


    @FindBy(name = "cvc")
    public WebElement cvcBox;


    @FindBy(name = "expiry_month")
    public WebElement expirationDateMonth;


    @FindBy(name = "expiry_year")
    public WebElement expirationDateYear;


    @FindBy(id = "submit")
    public WebElement payAndConfirmButton;


    @FindBy(xpath = "//*[text()='Congratulations! Your order has been confirmed!']")
    public WebElement yourOrderHasBeenPlacedSuccessfullyMessage;








}
