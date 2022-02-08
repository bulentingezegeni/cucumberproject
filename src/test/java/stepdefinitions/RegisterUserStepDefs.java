package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.MainPageFunctionalities;
import utilities.ConfigurationReader;
import utilities.Driver;

public class RegisterUserStepDefs {

    MainPageFunctionalities mainPageFunctionalities= new MainPageFunctionalities();

    @Given("user launches the browser")
    public void user_launches_the_browser() {
        Driver.getDriver();
    }

    @Given("user navigates to home page")
    public void user_navigates_to_home_page() {
        Driver.getDriver().navigate().to(ConfigurationReader.getProperty("automation_url"));
    }

    @Then("user verifies home page is visible")
    public void user_verifies_home_page_is_visible() {
        String homepageTitle=Driver.getDriver().getTitle();
        Assert.assertEquals("Automation Exercise",homepageTitle);
    }

    @When("user clicks on signup button")
    public void user_clicks_on_signup_button() {
        mainPageFunctionalities.signupButton.click();
    }


    @Then("user verifies new user signup is visible")
    public void user_verifies_new_user_signup_is_visible() {
        Assert.assertTrue(mainPageFunctionalities.signupText.isDisplayed());
    }

    @When("user enters name and email")
    public void user_enters_name_and_email() {

    }
    @When("user clicks signup button")
    public void user_clicks_signup_button() {

    }
    @When("user verifies that enter account information is visible")
    public void user_verifies_that_enter_account_information_is_visible() {

    }
    @When("user fills details")
    public void user_fills_details() {

    }
    @When("user selects checkbox signup for our newslater")
    public void user_selects_checkbox_signup_for_our_newslater() {

    }
    @When("user selects checkbox receive special offers")
    public void user_selects_checkbox_receive_special_offers() {

    }
    @When("user clicks create account button")
    public void user_clicks_create_account_button() {

    }
    @Then("user verifies that acount is created")
    public void user_verifies_that_acount_is_created() {

    }

    @When("user clicks continue button")
    public void user_clicks_continue_button() {

    }
    @When("user verifies that logged in")
    public void user_verifies_that_logged_in() {

    }
    @When("user clicks delete account button")
    public void user_clicks_delete_account_button() {

    }
    @Then("user verifies that acount deleted")
    public void user_verifies_that_acount_deleted() {

    }



}
