package com.exerciseautomation.steps;

import com.exerciseautomation.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class LoginPageSteps {
    @Then("I Verify {string} is visible")
    public void iVerifyLoginToYourAccountIsVisible(String errorMessage) {
        Assert.assertEquals(new LoginPage().verifyLoginToTourAccountText(),
                errorMessage, "Incorrect text Displayed");

    }

    @And("I Enter correct email address{string} and password {string}")
    public void iEnterCorrectEmailAddressAndPassword(String email, String password) {
        new LoginPage().enterInformation(email, password);
    }

    @And("I Click login button")
    public void iClickLoginButton() {
        new LoginPage().clickOnLogin();
    }

    @And("I Enter incorrect email address {string} and password {string}")
    public void iEnterIncorrectEmailAddressAndPassword(String email, String password) {
        new LoginPage().enterInformation(email, password);
    }

    @Then("I Verify error Your email or password is incorrect! is visible")
    public void iVerifyErrorYourEmailOrPasswordIsIncorrectIsVisible() {
        String excepted = "Your email or password is incorrect!";
        Assert.assertEquals(new LoginPage().verifyYourEmailOrPasswordIsIncorrectText(),
                excepted, "Incorrect text Displayed");
    }

    @Then("I Verify that user is navigated to login page")
    public void iVerifyThatUserIsNavigatedToLoginPage() {
        new LoginPage().verifyLoginPage();
    }
}
