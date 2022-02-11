package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.RegisterUserPage;
import pages.MainPageFunctionalities;
import utilities.ConfigurationReader;
import utilities.Driver;

public class RegisterUserStepDefs {

    MainPageFunctionalities mainPageFunctionalities= new MainPageFunctionalities();
    RegisterUserPage registerUserPage=new RegisterUserPage();

    @Given("launch browser")
    public void user_launches_the_browser() {
        Driver.getDriver();
    }

    @Given("navigate to url")
    public void user_navigates_to_home_page() {
        Driver.getDriver().navigate().to(ConfigurationReader.getProperty("automation_url"));
    }

    @Then("Verify that home page is visible successfully")
    public void user_verifies_home_page_is_visible() {
        String homepageTitle=Driver.getDriver().getTitle();
        Assert.assertEquals("Automation Exercise",homepageTitle);
    }

    @When("Click on signup login button")
    public void user_clicks_on_signup_login_button() {
        mainPageFunctionalities.signupLoginButton.click();
    }


    @Then("Verify new user signup is visible")
    public void user_verifies_new_user_signup_is_visible() {
        Assert.assertTrue(mainPageFunctionalities.signupText.isDisplayed());
    }

    @When("Enter name and email address")
    public void user_enters_name_and_email() {
        mainPageFunctionalities.nameBox.sendKeys("Bulent");
        mainPageFunctionalities.emailBox.sendKeys(new Faker().internet().emailAddress());
    }

    @When("Click Signup button")
    public void user_clicks_signup_button() {
        mainPageFunctionalities.accountCreatSignupButton.click();
    }

    @When("Verify that ENTER ACCOUNT INFORMATION is visible")
    public void user_verifies_that_enter_account_information_is_visible() {
        Assert.assertTrue(mainPageFunctionalities.enterAccountInformationText.isDisplayed());
    }
    @When("Fill details: Title, Name, Email, Password, Date of birth")
    public void user_fills_details() {
        registerUserPage.genderBox.click();
        registerUserPage.passwordBox.sendKeys("bt12345!");
        Driver.selectByIndex(registerUserPage.dayDropdown,10);
        Driver.selectByIndex(registerUserPage.monthDropdown, 5);
        Driver.selectByIndex(registerUserPage.yearDropdown,22);
    }
    @When("Select checkbox Sign up for our newsletter!")
    public void user_selects_checkbox_signup_for_our_newslater() {
        registerUserPage.newsletterCheckBox.click();
    }

    @When("Select checkbox Receive special offers from our partners!")
    public void user_selects_checkbox_receive_special_offers() {
        registerUserPage.specialOffersCheckBox.click();
    }

    @And("Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number")
    public void userFillsOtherDetails() {
        registerUserPage.firstName.sendKeys("bulent");
        registerUserPage.lastName.sendKeys("planet");
        registerUserPage.company.sendKeys("mycompany");
        registerUserPage.address1.sendKeys(new Faker().address().fullAddress());
        Driver.selectByIndex(registerUserPage.countryDropdown,1);
        registerUserPage.stateBox.sendKeys("New Jersey");
        registerUserPage.cityBox.sendKeys("WoodlandPark");
        registerUserPage.zipcodeBox.sendKeys("07424");
        registerUserPage.mobileNumberBox.sendKeys("+19736745424");
    }

    @When("Click Create Account button")
    public void user_clicks_create_account_button() {
        registerUserPage.createAccountButton.click();
    }
    @Then("user verifies that acount is created")
    public void user_verifies_that_acount_is_created() {
       Assert.assertTrue(registerUserPage.accountCreatedText.isDisplayed());
    }

    @When("user clicks continue button")
    public void user_clicks_continue_button() {
        registerUserPage.continueButton.click();
    }

    @When("user verifies that logged in")
    public void user_verifies_that_logged_in() {
        Assert.assertTrue(registerUserPage.loggedInAsText.isDisplayed());
    }

    @When("user clicks delete account button")
    public void user_clicks_delete_account_button() {
        registerUserPage.deleteAccountButton.click();
    }

    @Then("user verifies that acount deleted")
    public void user_verifies_that_acount_deleted() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Delete Account"));
    }


}
