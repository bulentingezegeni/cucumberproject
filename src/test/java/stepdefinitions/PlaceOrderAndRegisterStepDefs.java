package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.PlaceOrderAndRegisterPage;

public class PlaceOrderAndRegisterStepDefs {

    PlaceOrderAndRegisterPage placeOrderAndRegisterPage = new PlaceOrderAndRegisterPage();

    @Then("Add products to cart")
    public void add_products_to_cart() {
        placeOrderAndRegisterPage.firstProduct.click();
        placeOrderAndRegisterPage.continueShoppingButton.click();
        placeOrderAndRegisterPage.secondProduct.click();
        placeOrderAndRegisterPage.continueShoppingButton.click();
    }
    @Then("Click Cart button")
    public void click_cart_button() {
        placeOrderAndRegisterPage.cartButton.click();
    }
    @Then("Verify that cart page is displayed")
    public void verify_that_cart_page_is_displayed() {
        Assert.assertTrue(placeOrderAndRegisterPage.shoppingCartText.isDisplayed());
    }
    @Then("Click Proceed To Checkout")
    public void click_proceed_to_checkout() {
        placeOrderAndRegisterPage.proceedToCheckoutButton.click();
    }
    @Then("Click Register Login button")
    public void click_register_login_button() {
        placeOrderAndRegisterPage.registerLoginButton.click();
    }

    @When("Click Proceed To Checkout button")
    public void click_proceed_to_checkout_button() {
        placeOrderAndRegisterPage.proceedToCheckoutButton.click();
    }
    @When("Verify Address Details and Review Your Order")
    public void verify_address_details_and_review_your_order() {
        Assert.assertTrue(placeOrderAndRegisterPage.addressDetailsText.isDisplayed());
        Assert.assertTrue(placeOrderAndRegisterPage.reviewYourOrderText.isDisplayed());
    }
    @When("Enter description in comment text area and click Place Order")
    public void enter_description_in_comment_text_area_and_click_place_order() {
        placeOrderAndRegisterPage.messageBox.sendKeys("Good shopping");
        placeOrderAndRegisterPage.placeOrderButton.click();
    }
    @When("Enter payment details: Name on Card, Card Number, CVC, Expiration date")
    public void enter_payment_details_name_on_card_card_number_cvc_expiration_date() {
        placeOrderAndRegisterPage.nameOnCardBox.sendKeys(new Faker().name().fullName());
        placeOrderAndRegisterPage.cardNumberBox.sendKeys(new Faker().number().digits(16));
        placeOrderAndRegisterPage.cvcBox.sendKeys("211");
        placeOrderAndRegisterPage.expirationDateMonth.sendKeys("12");
        placeOrderAndRegisterPage.expirationDateYear.sendKeys("2027");
    }
    @When("Click Pay and Confirm Order button")
    public void click_pay_and_confirm_order_button() {
        placeOrderAndRegisterPage.payAndConfirmButton.click();
    }
    @Then("Verify success message Your order has been placed successfully!")
    public void verify_success_message_your_order_has_been_placed_successfully() {
        Assert.assertTrue(placeOrderAndRegisterPage.yourOrderHasBeenPlacedSuccessfullyMessage.isDisplayed());
    }


}
