package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.SearchProductPage;

public class SearchProductStepDefs {

    SearchProductPage searchProductPage = new SearchProductPage();

    @Then("Enter product name as {string} in search input and click search button")
    public void enter_product_name_as_in_search_input_and_click_search_button(String string) {
       searchProductPage.searchInputBox.sendKeys(string);
       searchProductPage.searchButton.click();
    }

    @Then("Verify SEARCHED PRODUCTS is visible")
    public void verify_searched_products_is_visible() {
      Assert.assertTrue(searchProductPage.searchedProductsText.isDisplayed());
    }

    @Then("Verify all the products as {string} related to search are visible")
    public void verify_all_the_products_as_related_to_search_are_visible(String string) {
        for(WebElement eachElement:searchProductPage.listedProducts){
            if (eachElement.getText().contains(string))
            Assert.assertTrue(eachElement.isDisplayed());
        }
    }



}
