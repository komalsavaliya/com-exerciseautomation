package com.exerciseautomation.steps;

import com.exerciseautomation.pages.HomePage;
import com.exerciseautomation.pages.RegisterUserPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegisterUserPageSteps {
    @Given("I Launch browser")
    public void iLaunchBrowser() {

    }

    @And("I Navigate to url {string}")
    public void iNavigateToUrl(String baseUrl) {

    }

    @Then("I Verify that home page is visible successfully")
    public void iVerifyThatHomePageIsVisibleSuccessfully() throws InterruptedException {
        new HomePage().verifyNevigateToHomePage();

    }

    @When("Click on {string} button")
    public void clickOnSignupLoginButton(String signUpOrLogin) {
        new HomePage().clickOnButton();
    }

    @Then("Verify {string} is visible")
    public void verifyNewUserSignupIsVisible(String text) {
        Assert.assertEquals(new RegisterUserPage().verifyNewUserSignUpText(),
                text, "Incorrect text Displayed");
    }

    @And("I Enter name {string} and email address {string}")
    public void iEnterNameAndEmailAddress(String name, String email) {
        new RegisterUserPage().enterNameAndEmail(name, email);
    }


    @And("I Click {string} button")
    public void iClickSignupButton(String signUp) {
        new RegisterUserPage().clickOnSignUpButton();
    }

    @And("I Verify that {string} is visible")
    public void iVerifyThatENTERACCOUNTINFORMATIONIsVisible(String text) {
        Assert.assertEquals(new RegisterUserPage().verifyAccountInformationText(),
                text, "Incorrect text Displayed");
    }

    @And("I Fill details: Title {string} Password {string} Day {string} Month {string} Year {string}")
    public void iFillDetailsTitlePasswordDayMonthYear(String title, String password, String day, String month, String year) {
        new RegisterUserPage().fillDetails(title, password, day, month, year);
    }

    @And("I Select checkbox {string}")
    public void iSelectCheckboxSignUpForOurNewsletter(String checkBox) {
        new RegisterUserPage().clickOnNewsletter();
    }

    @And("I Select a checkbox {string}")
    public void iSelectACheckboxReceiveSpecialOffersFromOurPartners(String checkBox) {
        new RegisterUserPage().clickOnReceiveSpecialOffersFromOurPartners();
    }

    @And("I Fill details: First name {string} Last name {string} Company {string} Address {string} AddressTwo {string} Country {string} State {string} City {string} Zipcode {string} Mobile Number{string}")
    public void iFillDetailsFirstNameLastNameCompanyAddressCountryStateCityZipcodeMobileNumber(String firstName, String lastName, String company, String address, String addressTwo, String country, String state, String city, String zipcode, String mobileNumber) {
        new RegisterUserPage().fillDetails1(firstName, lastName, company, address, addressTwo, country, state, city, zipcode, mobileNumber);
    }

    @And("I Click {string}")
    public void iClickCreateAccountButton(String clickOnCreateAccount) {
        new RegisterUserPage().clickOnCreateAccount();
    }

    @Then("I Verify a that {string} is visible")
    public void iVerifyAThatACCOUNTCREATEDIsVisible(String text) {
        Assert.assertEquals(new RegisterUserPage().verifyAccountCreatedText(),
                text, "Incorrect text Displayed");
    }

    @And("I Click a {string} button")
    public void iClickAContinueButton(String click) {
        new RegisterUserPage().clickOnContinue();
    }

    //    @And("I Verify that a {string} is visible")
//    public void iVerifyThatALoggedInAsUsernameIsVisible(String text) {
//        Assert.assertEquals(new RegisterUserPage().verifyLoggedInAsUserName(),
//                text, "Incorrect text Displayed");
//    }
    @And("I Verify that Logged in as username is visible")
    public void iVerifyThatLoggedInAsUsernameIsVisible() {
        String excepted = "Logged in as John";
        Assert.assertEquals(new RegisterUserPage().verifyLoggedInAsUserName(),
                excepted, "Incorrect text Displayed");
    }

    @And("I click  {string} button")
    public void iClickDeleteAccountButton(String button) {
        new RegisterUserPage().clickOnDeleteAccount();
    }

    @Then("I Verify that ACCOUNT DELETED! is visible")
    public void iVerifyThatACCOUNTDELETEDIsVisible() {
        String excepted = "ACCOUNT DELETED!";
        Assert.assertEquals(new RegisterUserPage().verifyAccountDeletedText(),
                excepted, "Incorrect text Displayed");
    }

    @And("I Click On {string} button")
    public void iClickOnContinueButton(String button) {
        new RegisterUserPage().clickOnContinueButton();
    }

    @And("I click on LogOut Button")
    public void iClickOnLogOutButton() {
        new RegisterUserPage().clickOnLogOutButton();
    }

    @Then("I Verify error {string} is visible")
    public void iVerifyErrorEmailAddressAlreadyExistIsVisible(String errorMessage) {
        Assert.assertEquals(new RegisterUserPage().verifyEmailAddressAlreadyExistText(),
                errorMessage, "Incorrect text Displayed");
    }
}












