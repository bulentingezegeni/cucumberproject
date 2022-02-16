package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.LoginPage;
import utilities.ExcelUtil;

import java.util.List;
import java.util.Map;

public class TC2_LoginWithExcel {

    ExcelUtil excelUtil;
    List<Map<String,String>> loginData;
    LoginPage loginPage;

    @Then("Enter correct email_address and password via excel")
    public void enter_correct_email_address_and_password_via_excel() {
        String path = "./src/test/resources/testdata/Workbook1.xlsx";
        String sheetName = "Sheet1";
       excelUtil=new ExcelUtil(path,sheetName);
       loginData =excelUtil.getDataList();
       loginPage= new LoginPage();
       loginPage.loginEmailBox.sendKeys(loginData.get(0).get("email"));
       loginPage.loginPasswordBox.sendKeys(loginData.get(0).get("password"));
    }

    @Then("Enter wrong email_address and password via excel")
    public void enter_wrong_email_address_and_password_via_excel() {
        String path = "./src/test/resources/testdata/Workbook1.xlsx";
        String sheetName = "Sheet1";
        excelUtil=new ExcelUtil(path,sheetName);
        loginData =excelUtil.getDataList();
        loginPage= new LoginPage();
        loginPage.loginEmailBox.sendKeys(loginData.get(1).get("email"));
        loginPage.loginPasswordBox.sendKeys(loginData.get(1).get("password"));
    }

    @Then("user verifies that invalid Login Text is visible")
    public void user_verifies_that_invalid_login_text_is_visible() {
        Assert.assertTrue(loginPage.invalidLoginText.isDisplayed());
    }


    @Then("Click Logout button")
    public void click_logout_button() {
        loginPage.logoutButton.click();
    }


}
