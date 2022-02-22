package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.CategoryProductsPage;
import utilities.Driver;

public class CartBrandProductsStepDefs {

    CategoryProductsPage categoryProductsPage =new CategoryProductsPage();


    @Given("Verify that Brands are visible on left side bar")
    public void verify_that_brands_are_visible_on_left_side_bar() {
       Assert.assertTrue(categoryProductsPage.brandsList.isDisplayed());
    }

    @Given("Click on any brand name")
    public void click_on_any_brand_name() {
        categoryProductsPage.poloButton.click();
    }

    @Then("Verify that user is navigated to brand page and brand products are displayed")
    public void verify_that_user_is_navigated_to_brand_page_and_brand_products_are_displayed() {
        Assert.assertTrue(categoryProductsPage.poloProductsText.isDisplayed());
    }

    @Then("On left side bar, click on any other brand link")
    public void on_left_side_bar_click_on_any_other_brand_link() {
        categoryProductsPage.madameButton.click();
    }

    @Then("Verify that user is navigated to that brand page and can see products")
    public void verify_that_user_is_navigated_to_that_brand_page_and_can_see_products() {
        Assert.assertTrue(categoryProductsPage.madameProductsText.isDisplayed());
    }

}
