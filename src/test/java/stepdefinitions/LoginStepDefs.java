package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.LoginPage;
import io.cucumber.datatable.DataTable;

import java.util.List;

public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();

    @Then("Verify login to your account is visible")
    public void verify_login_to_your_account_is_visible() {
      Assert.assertTrue(loginPage.loginToYourAccountText.isDisplayed());
    }

    @Then("Enter correct email_address and password")
    public void enter_correct_email_address_and_password(DataTable credentials) {
        List<String> correctCredentials = credentials.row(1);
        loginPage.loginEmailBox.sendKeys(correctCredentials.get(0));
        loginPage.loginPasswordBox.sendKeys(correctCredentials.get(1));
    }

    @And("Click login button")
    public void clickLoginButton() {
        loginPage.loginButton.click();
    }


    @And("Enter correct {string} and {string}")
    public void enterCorrectAnd(String email, String password) {
        loginPage.loginEmailBox.sendKeys(email);
        loginPage.loginPasswordBox.sendKeys(password);
    }


}
