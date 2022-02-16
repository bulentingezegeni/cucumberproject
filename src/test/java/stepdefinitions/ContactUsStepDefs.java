package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.ContactUsPage;
import utilities.Driver;

public class ContactUsStepDefs {

    ContactUsPage contactUsPage=new ContactUsPage();

    @And("Click on Contact Us button")
    public void clickOnContactUsButton() {
        contactUsPage.contactUsButton.click();
    }

    @Then("Verify GET IN TOUCH is visible")
    public void verifyGETINTOUCHIsVisible() {
        Assert.assertTrue(contactUsPage.getInTouchText.isDisplayed());
    }

    @And("Enter name, email, subject and message")
    public void enterNameEmailSubjectAndMessage() {
        contactUsPage.nameBox.sendKeys(new Faker().name().fullName());
        contactUsPage.emailBox.sendKeys(new Faker().internet().emailAddress());
        contactUsPage.subjectBox.sendKeys("My message");
        contactUsPage.messageBox.sendKeys("Too expensive");
    }

    @And("Upload file")
    public void uploadFile() {
        String path=System.getProperty("user.home")+"/Desktop/Too expensive.docx";
        contactUsPage.choseFileButton.sendKeys(path);
    }

    @And("Click Submit button")
    public void clickSubmitButton() {
        contactUsPage.submitButton.click();
    }

    @And("Click OK button")
    public void clickOKButton() throws InterruptedException {
        Thread.sleep(3000);
        Driver.getDriver().switchTo().alert().accept();
    }

    @Then("Verify success message Success! Your details have been submitted successfully. is visible")
    public void verifySuccessMessageSuccessYourDetailsHaveBeenSubmittedSuccessfullyIsVisible() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(contactUsPage.successMessageContactUs.isDisplayed());
    }

    @And("Click Home button and verify that landed to home page successfully")
    public void clickHomeButtonAndVerifyThatLandedToHomePageSuccessfully() {
        contactUsPage.homeButton.click();
        Assert.assertEquals("Automation Exercise",Driver.getDriver().getTitle());
    }

}
