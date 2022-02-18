package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ProductDetailPage {

    public ProductDetailPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//*[@href='/products']")
    public WebElement productsButton;

    @FindBy(xpath = "//*[text()='All Products']")
    public WebElement allProductsText;


    @FindBy(xpath = "//*[@class='nav nav-pills nav-stacked']")
    public WebElement productList;


    @FindBy(xpath = "//*[@href='/product_details/1']")
    public WebElement viewProductOfFirstProduct;


    @FindBy(xpath = "(//h2)[3]")
    public WebElement productName;


    @FindBy(xpath = "//*[text()='Category: Women > Tops']")
    public WebElement category;


    @FindBy(xpath = "//*[text()='Rs. 500']")
    public WebElement price;


    @FindBy(xpath = "//*[text()='Availability:']")
    public WebElement availability;


    @FindBy(xpath = "//*[text()='Condition:']")
    public WebElement condition;


    @FindBy(xpath = "//*[text()='Brand:']")
    public WebElement brand;


    @FindBy(id = "quantity")
    public WebElement quantityBox;


    @FindBy(xpath = "//*[@type='button']")
    public WebElement addToCartButton;


    @FindBy(linkText = "View Cart")
    public WebElement viewCartButton;



    @FindBy(xpath = "//*[@class='disabled']")
    public WebElement quantityText;


    @FindBy(xpath = "//*[@class='product_image']")
    public WebElement productImage;









}
