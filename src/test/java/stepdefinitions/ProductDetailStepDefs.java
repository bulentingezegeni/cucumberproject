package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.ProductDetailPage;
import utilities.Driver;

public class ProductDetailStepDefs {

    ProductDetailPage productDetailPage = new ProductDetailPage();

    @Then("Click on Products button")
    public void click_on_products_button() {
       productDetailPage.productsButton.click();
    }

    @Then("Verify user is navigated to ALL PRODUCTS page successfully")
    public void verify_user_is_navigated_to_all_products_page_successfully() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("All Products"));
    }

    @Then("The products list is visible")
    public void the_products_list_is_visible() {
        Assert.assertTrue(productDetailPage.productList.isDisplayed());
    }

    @Then("Click on View Product of first product")
    public void click_on_view_product_of_first_product() {
        productDetailPage.viewProductOfFirstProduct.click();
    }

    @Then("User is landed to product detail page")
    public void user_is_landed_to_product_detail_page() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Product Details"));
    }

    @Then("Verify that detail is visible: product name, category, price, availability, condition, brand")
    public void verify_that_detail_is_visible_product_name_category_price_availability_condition_brand() {
        Assert.assertTrue(productDetailPage.productName.isDisplayed());
        Assert.assertTrue(productDetailPage.category.isDisplayed());
        Assert.assertTrue(productDetailPage.price.isDisplayed());
        Assert.assertTrue(productDetailPage.availability.isDisplayed());
        Assert.assertTrue(productDetailPage.condition.isDisplayed());
        Assert.assertTrue(productDetailPage.brand.isDisplayed());
    }

}
