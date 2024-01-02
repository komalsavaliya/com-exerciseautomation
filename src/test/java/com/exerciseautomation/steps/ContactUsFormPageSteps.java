package com.exerciseautomation.steps;

import com.exerciseautomation.pages.ContactUsFormPage;
import com.exerciseautomation.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.awt.*;

public class ContactUsFormPageSteps {
    @When("I Click on {string} button")
    public void iClickOnContactUsButton(String button) {
        new ContactUsFormPage().clickOnContactUs();
    }

    @Then("I Verify GET IN TOUCH is visible")
    public void iVerifyGETINTOUCHIsVisible() {
        String excepted = "GET IN TOUCH";
        Assert.assertEquals(new ContactUsFormPage().verifyGetInTouchText(),
                excepted, "Incorrect text Displayed");
    }

    @And("I Enter name {string} email {string} subject {string} and message {string}")
    public void iEnterNameEmailSubjectAndMessage(String name, String email, String subject, String message) {
        new ContactUsFormPage().fillDetails(name, email, subject, message);
    }

    @And("I click on ChooseFile Button")
    public void iClickOnChooseFileButton() {
        new ContactUsFormPage().clickOnChooseFile();
    }

    @And("I  Upload file {string}")
    public void iUploadFile(String location) throws AWTException {
        new ContactUsFormPage().uploadingFile(location);
    }

    @And("I  Click {string} button")
    public void iClickSubmitButton(String button) {
        new ContactUsFormPage().clickOnSubmit();
    }

    @And("I  Click OK button")
    public void iClickOKButton() {
      new ContactUsFormPage().clickOnOkButtonForAccept();
    }

    @Then("I Verify success message {string} is visible")
    public void iVerifySuccessMessageSuccessYourDetailsHaveBeenSubmittedSuccessfullyIsVisible(String text) {
        String excepted = "Success! Your details have been submitted successfully.";
        Assert.assertEquals(new ContactUsFormPage().verifySuccessYourDetailsHaveBeenSubmittedSuccessfullyText(),
                excepted, "Incorrect text Displayed");
    }

    @And("I Click Home button")
    public void iClickHomeButton() throws InterruptedException {
        new ContactUsFormPage().clickOnHome();
    }

    @Then("I verify that landed to home page successfully")
    public void iVerifyThatLandedToHomePageSuccessfully() throws InterruptedException {
        new HomePage().verifyNevigateToHomePage();

    }
}
