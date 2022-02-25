package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class SearchProductPage {

    public SearchProductPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id='search_product']")
    public WebElement searchInputBox;

    @FindBy(xpath = "//*[@id='submit_search']")
    public WebElement searchButton;

    @FindBy(xpath = "//*[text()='Searched Products']")
    public WebElement searchedProductsText;

    @FindBy(xpath = "//*[@class='productinfo text-center']")
    public List<WebElement> listedProducts;

    @FindBy(xpath = "//*[@class='btn btn-default add-to-cart']")
    public List<WebElement> searchedProductsList;

    //*[@class='btn btn-default add-to-cart']











}
