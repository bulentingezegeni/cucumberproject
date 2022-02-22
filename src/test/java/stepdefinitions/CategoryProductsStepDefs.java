package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.CategoryProductsPage;
import pages.HomePage;
import utilities.Driver;

public class CategoryProductsStepDefs {

    HomePage homePage=new HomePage();
    CategoryProductsPage categoryProductsPage=new CategoryProductsPage();

    @Then("Verify that categories are visible on left side bar")
    public void verify_that_categories_are_visible_on_left_side_bar() {
        Assert.assertTrue(homePage.categories.isDisplayed());
    }

    @Then("Click on Women category")
    public void click_on_women_category() {
        homePage.womenCategoryButton.click();
    }

    @Then("Click on any category link under Women category, for example: Dress")
    public void click_on_any_category_link_under_women_category_for_example_dress() {
        homePage.dressButton.click();
    }

    @Then("Verify that category page is displayed and confirm text WOMEN - DRESS PRODUCTS")
    public void verify_that_category_page_is_displayed_and_confirm_text_women_dress_products() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Dress Products"));
        Assert.assertTrue(categoryProductsPage.dressProductsText.isDisplayed());
    }

    @Then("On left side bar, click on any sub-category link of Men category")
    public void on_left_side_bar_click_on_any_sub_category_link_of_men_category() {
        categoryProductsPage.menCategoryButton.click();
        categoryProductsPage.jeansButton.click();
    }

    @Then("Verify that user is navigated to that category page")
    public void verify_that_user_is_navigated_to_that_category_page() {
        Assert.assertTrue(categoryProductsPage.menJeansProductsText.isDisplayed());
    }



}
