package com.exerciseautomation.pages;

import com.exerciseautomation.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    //Verify 'Login to your account' is visible
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Login to your account']")
    WebElement verifyLoginToTourAccountText;

    //I Enter correct email address
    @CacheLookup
    @FindBy(xpath = "//input[@data-qa='login-email']")
    WebElement enterEmailAddress;

    //and password
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement enterPasswordField;

    //Click login button
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement clickOnLogin;

    //Verify error 'Your email or password is incorrect!' is visible
    @CacheLookup
    @FindBy(xpath = "//p[normalize-space()='Your email or password is incorrect!']")
    WebElement verifyYourEmailOrPasswordIsIncorrectText;

    //Verify that user is navigated to login page
    @CacheLookup
    @FindBy(xpath = "//div[@class='login-form']")
    WebElement verifyLoginPage;


    //======================================================================//

    //Verify 'Login to your account' is visible
    public String verifyLoginToTourAccountText() {
        log.info("Getting text from : " + verifyLoginToTourAccountText.toString());
        return getTextFromElement(verifyLoginToTourAccountText);
    }

    //I Enter correct email address
    public void enterInformation(String email, String password) {
        sendTextToElement(enterEmailAddress, email);
        sendTextToElement(enterPasswordField,password);
        log.info("Enter Information");
    }

    //Click login button
    public void clickOnLogin() {
        clickOnElement(clickOnLogin);
        log.info("Click On Button: " + clickOnLogin.toString());
    }

    //Verify error 'Your email or password is incorrect!' is visible
    public String verifyYourEmailOrPasswordIsIncorrectText() {
        log.info("Getting text from : " + verifyYourEmailOrPasswordIsIncorrectText.toString());
        return getTextFromElement(verifyYourEmailOrPasswordIsIncorrectText);
    }

    //Verify that user is navigated to login page
    public String verifyLoginPage() {
        log.info("Login to your account text displayed : " + verifyLoginPage.toString());
        return getTextFromElement(verifyLoginPage);
    }

//    public void iCanSeeTheText(String text) {
//        if (text.equalsIgnoreCase("New User Signup!")) {
//            Assert.assertEquals(new HomePage().ver(), text, text + " text not displayed");
//        } else if (text.equalsIgnoreCase("ENTER ACCOUNT INFORMATION")) {
//            Assert.assertEquals(new RegisterPage().ver(), text, text + "text not displayed");
//        } else if (text.equalsIgnoreCase("ACCOUNT CREATED!")) {
//            Assert.assertEquals(new RegisterUserPage().verifyAccountCreatedText(), text, text + "text not displayed");
//        } else if (text.equalsIgnoreCase("Logged in as username")) {
//            Assert.assertEquals(new HomePage().verifyLoggedInAsUserNameIsVisible(), text, text + "text not displayed");
//        }else if (text.equalsIgnoreCase("GET IN TOUCH")) {
//          Assert.assertEquals(new ContactUsFormPage().verifyGetInTouchText(), text, text + "text not displayed");
//    }
}
