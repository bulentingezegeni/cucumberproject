package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CartPage {

    public CartPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//*[text()='Cart is empty!']")
    public WebElement cartIsEmptyText;


    @FindBy(xpath = "(//*[@class='cart_quantity_delete'])[1]")
    public WebElement deleteFirstProductFromCart;

    @FindBy(xpath = "(//*[@class='cart_quantity_delete'])[2]")
    public WebElement deleteSecondProductFromCart;


    @FindBy(xpath = "//tbody")
    public WebElement productsTable;


}



