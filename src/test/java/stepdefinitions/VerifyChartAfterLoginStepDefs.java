package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.*;

import java.util.List;

public class VerifyChartAfterLoginStepDefs {

    SearchProductPage searchProductPage = new SearchProductPage();
    RegisterWhileCheckoutPage registerWhileCheckoutPage = new RegisterWhileCheckoutPage();
    HomePage homePage = new HomePage();
    CartPage cartPage=new CartPage();
    LoginPage loginPage=new LoginPage();

    @Then("Enter product name in search input and click search button")
    public void enter_product_name_in_search_input_and_click_search_button() {
       searchProductPage.searchInputBox.sendKeys("Jeans");
       searchProductPage.searchButton.click();
    }
    @Then("Verify all the products related to search are visible")
    public void verify_all_the_products_related_to_search_are_visible() throws InterruptedException {
       for (WebElement eachElement: searchProductPage.listedProducts){
           Thread.sleep(3000);
           Assert.assertTrue(eachElement.getText().contains("Jeans"));
       }
    }


    @Then("Add those products to cart")
    public void add_those_products_to_cart() throws InterruptedException {
        for (WebElement eachElement: searchProductPage.searchedProductsList){
            eachElement.click();
            registerWhileCheckoutPage.continueShoppingButton.click();
            Thread.sleep(3000);
        }

    }

    @Then("Click Cart button and verify that products are visible in cart")
    public void click_cart_button_and_verify_that_products_are_visible_in_cart() {
        homePage.cartButton.click();
        Assert.assertTrue(cartPage.productsTable.isDisplayed());

    }

    @Then("Click Signup Login button and submit login details")
    public void click_signup_login_button_and_submit_login_details() {
        homePage.signupLoginButton.click();
        loginPage.loginEmailBox.sendKeys("bulentsplanet@gmail.com");
        loginPage.loginPasswordBox.sendKeys("Bt12345!");


    }

    @Then("Again, go to Cart page")
    public void again_go_to_cart_page() {
        homePage.cartButton.click();
    }

    @Then("Verify that those products are visible in cart after login as well")
    public void verify_that_those_products_are_visible_in_cart_after_login_as_well() {
        Assert.assertTrue(cartPage.productsTable.isDisplayed());
    }

}
