package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.CartPage;

public class RemoveProductsFromCartStepDefs {

    CartPage cartPage = new CartPage();


    @Then("Click X button corresponding to particular product")
    public void click_x_button_corresponding_to_particular_product() {
        cartPage.deleteFirstProductFromCart.click();
        cartPage.deleteSecondProductFromCart.click();
    }

    @Then("Verify that product is removed from the cart")
    public void verify_that_product_is_removed_from_the_cart() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(cartPage.cartIsEmptyText.isDisplayed());
    }


}
