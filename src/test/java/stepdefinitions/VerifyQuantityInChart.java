package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.ProductDetailPage;
import utilities.JSUtils;

public class VerifyQuantityInChart {

    ProductDetailPage productDetailPage = new ProductDetailPage();

    @Then("Increase quantity to {string}")
    public void increase_quantity_to(String string) {
        productDetailPage.quantityBox.clear();
        productDetailPage.quantityBox.sendKeys(string);
    }
    @Then("Click Add to cart button")
    public void click_add_to_cart_button() {
        productDetailPage.addToCartButton.click();
    }
    @Then("Click View Cart button")
    public void click_view_cart_button() {
        productDetailPage.viewCartButton.click();
    }

    @Then("Verify that product is displayed in cart page with {string} exact quantity")
    public void verify_that_product_is_displayed_in_cart_page_with_exact_quantity(String string) {
        Assert.assertTrue(productDetailPage.productImage.isDisplayed());
        Assert.assertEquals(string,productDetailPage.quantityText.getText());
    }



}
