package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CategoryProductsPage {

    public CategoryProductsPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//*[text()='Women - Dress Products']")
    public WebElement dressProductsText;

    @FindBy(linkText = "MEN")
    public WebElement menCategoryButton;

    @FindBy(linkText = "JEANS")
    public WebElement jeansButton;


    @FindBy(xpath = "//*[text()='Men - Jeans Products']")
    public WebElement menJeansProductsText;


    @FindBy(xpath = "//*[@class='nav nav-pills nav-stacked']")
    public WebElement brandsList;

    @FindBy(xpath = "//*[@href='/brand_products/Polo']")
    public WebElement poloButton;


    @FindBy(xpath = "//*[text()='Brand - Polo Products']")
    public WebElement poloProductsText;

    @FindBy(xpath = "//*[@href='/brand_products/Madame']")
    public WebElement madameButton;


    @FindBy(xpath = "//*[text()='Brand - Madame Products']")
    public WebElement madameProductsText;


















}
