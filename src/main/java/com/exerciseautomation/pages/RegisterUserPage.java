package com.exerciseautomation.pages;

import com.exerciseautomation.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegisterUserPage extends Utility {
    private static final Logger log = LogManager.getLogger(RegisterUserPage.class.getName());

    //Then Verify 'New User Signup!' is visible
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='New User Signup!']")
    WebElement verifyNewUserSignUpText;

    //And I Enter name
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Name']")
    WebElement enterName;

    //and email address
    @CacheLookup
    @FindBy(xpath = "//input[@data-qa='signup-email']")
    WebElement enterEmail;

    //I Click 'Signup' button
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Signup']")
    WebElement clickOnSignUpButton;

    //I Verify that 'ENTER ACCOUNT INFORMATION' is visible
    @CacheLookup
    @FindBy(xpath = "//b[normalize-space()='Enter Account Information']")
    WebElement verifyEnterAccountInformationText;

    //I Fill details: Title, Name, Email, Password, Date of birth

    //Select gender "Male"
    @CacheLookup
    @FindBy(xpath = "//div[@id='uniform-id_gender1']")
    WebElement selectMr;

    //Select gender "Female"
    @CacheLookup
    @FindBy(xpath = "//input[@id='id_gender2']")
    WebElement selectMrs;

    //Enter Name
    @CacheLookup
    @FindBy(xpath = "//input[@id='name']")
    WebElement enterName1;

    //Enter Email1
    @CacheLookup
    @FindBy(xpath = "//input[@id='email']")
    WebElement enterEmail1;

    //Enter Password
    @CacheLookup
    @FindBy(xpath = "//input[@id='password']")
    WebElement enterPassword;

    //Enter BirthDay
    @CacheLookup
    @FindBy(xpath = "//select[@id='days']")
    WebElement enterDayOfBirth;

    //Enter BirthMonth
    @CacheLookup
    @FindBy(xpath = "//select[@id='months']")
    WebElement enterMonthOfBirth;

    //Enter BirthYear
    @CacheLookup
    @FindBy(xpath = "//select[@id='years']")
    WebElement enterYearOfBirth;

    //Select checkbox 'Sign up for our newsletter!'
    @CacheLookup
    @FindBy(xpath = "//input[@id='newsletter']")
    WebElement clickOnNewsletter;

    // I Select a checkbox 'Receive special offers from our partners!'
    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='Receive special offers from our partners!']")
    WebElement clickOnReceiveSpecialOffersFromOurPartners;

    //I Fill details:
    //Enter First Name
    @CacheLookup
    @FindBy(xpath = "//input[@id='first_name']")
    WebElement enterFirstName;

    //Enter Last Name
    @CacheLookup
    @FindBy(xpath = "//input[@id='last_name']")
    WebElement enterLastName;

    //Enter Company Name
    @CacheLookup
    @FindBy(xpath = "//input[@id='company']")
    WebElement enterCompanyName;

    //Enter Address
    @CacheLookup
    @FindBy(xpath = "//input[@id='address1']")
    WebElement enterAddress;

    //Enter Address2
    @CacheLookup
    @FindBy(xpath = "//input[@id='address2']")
    WebElement enterAddress2;

    //Enter Country
    @CacheLookup
    @FindBy(xpath = "//select[@id='country']")
    WebElement enterCountryName;

    //Enter State
    @CacheLookup
    @FindBy(xpath = "//input[@id='state']")
    WebElement enterStateName;

    //Enter City
    @CacheLookup
    @FindBy(xpath = "//input[@id='city']")
    WebElement enterCityName;

    //Enter ZipCode
    @CacheLookup
    @FindBy(xpath = "//input[@id='zipcode']")
    WebElement enterZipcode;

    //Enter Mobile Number
    @CacheLookup
    @FindBy(xpath = "//input[@id='mobile_number']")
    WebElement enterMobileNumber;

    //Click 'Create Account button'
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Create Account']")
    WebElement clickOnCreateAccount;

    //I Verify a that 'ACCOUNT CREATED!' is visible
    @CacheLookup
    @FindBy(xpath = "//b[normalize-space()='Account Created!']")
    WebElement verifyAccountCreatedText;

   //Click a 'Continue' button
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Continue']")
    WebElement clickOnContinue;

    //Verify that 'Logged in as username' is visible
    @CacheLookup
    @FindBy(xpath = "//li[10]//a[1]")
    WebElement verifyLoggedInAsUserName;

    //Click on 'Delete Account' button
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Delete Account']")
    WebElement clickOnDeleteAccount;

    //Verify that 'ACCOUNT DELETED!' is visible
    @CacheLookup
    @FindBy(xpath = "//b[normalize-space()='Account Deleted!']")
    WebElement verifyAccountDeletedText;

    //I Click On 'Continue' button
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Continue']")
    WebElement clickOnContinueButton;

    //I click on LogOut Button
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Logout']")
    WebElement clickOnLogOut;

    //Verify error 'Email Address already exist!' is visible
    @CacheLookup
    @FindBy(xpath = "//p[normalize-space()='Email Address already exist!']")
    WebElement verifyEmailAddressAlreadyExistText;

    //===========================================================================================//

    //Then Verify 'New User Signup!' is visible
    public String verifyNewUserSignUpText() {
        String text = getTextFromElement(verifyNewUserSignUpText);
        log.info("Getting text from : " + verifyNewUserSignUpText.toString());
        return text;
    }

    //And I Enter name and email address
    public void enterNameAndEmail(String name, String email) {
        sendTextToElement(enterName,name);
        sendTextToElement(enterEmail,email);
        log.info("Enter Details : " + enterName.toString());
        log.info("Enter Details : " + enterEmail.toString());
    }


    //I Click 'Signup' button
    public void clickOnSignUpButton() {
        clickOnElement(clickOnSignUpButton);
        log.info("Click on Button : " + clickOnSignUpButton.toString());
    }

    //I Verify that 'ENTER ACCOUNT INFORMATION' is visible
    public String verifyAccountInformationText() {
        String text = getTextFromElement(verifyEnterAccountInformationText);
        log.info("Getting text from : " + verifyEnterAccountInformationText.toString());
        return text;
    }

    //I Fill details: Title, Name, Email, Password, Date of birth
    public void selectGender(String title) {
        switch (title) {
            case "Mr.":
                clickOnElement(selectMr);
                break;
            case "Mrs.":
                clickOnElement(selectMrs);
                break;
            default:
                break;
        }
        log.info("Select gender : " + title.toString());
    }

    //Enter FillDetails
    public void fillDetails(String title, String password, String dayOfBirth, String monthOfBirth, String yearOfBirth) {
        selectGender(title);
//        sendTextToElement(enterName1,name);
//        sendTextToElement(enterEmail1,email1);
        sendTextToElement(enterPassword, password);
        selectByVisibleTextFromDropDown(enterDayOfBirth, dayOfBirth);
        selectByVisibleTextFromDropDown(enterMonthOfBirth, monthOfBirth);
        selectByVisibleTextFromDropDown(enterYearOfBirth, yearOfBirth);
        log.info("Fill Details");
    }

    //Select checkbox 'Sign up for our newsletter!'
    public void clickOnNewsletter() {
        clickOnElement(clickOnNewsletter);
        log.info("Click on Button : " + clickOnNewsletter.toString());
    }

    //Select a checkbox 'Receive special offers from our partners!'
    public void clickOnReceiveSpecialOffersFromOurPartners() {
        clickOnElement(clickOnReceiveSpecialOffersFromOurPartners);
        log.info("Click on Button : " + clickOnReceiveSpecialOffersFromOurPartners.toString());
    }

    // I Fill details2
    public void fillDetails1(String firstName, String lastName, String company, String address, String addressTwo, String country, String state, String cityName, String zipcode, String mobileNumber) {
        sendTextToElement(enterFirstName, firstName);
        sendTextToElement(enterLastName, lastName);
        sendTextToElement(enterCompanyName, company);
        sendTextToElement(enterAddress, address);
        sendTextToElement(enterAddress2, addressTwo);
        selectByVisibleTextFromDropDown(enterCountryName, country);
        sendTextToElement(enterStateName, state);
        sendTextToElement(enterCityName, cityName);
        sendTextToElement(enterZipcode, zipcode);
        sendTextToElement(enterMobileNumber, mobileNumber);
        log.info("Fill Details1");
    }

    //Click 'Create Account button'
    public void clickOnCreateAccount() {
        clickOnElement(clickOnCreateAccount);
        log.info("Click on Button : " + clickOnCreateAccount.toString());
    }

    //Verify a that 'ACCOUNT CREATED!' is visible
    public String verifyAccountCreatedText() {
        String text = getTextFromElement(verifyAccountCreatedText);
        log.info("Getting text from : " + verifyAccountCreatedText.toString());
        return text;
    }

    //Click a 'Continue' button
    public void clickOnContinue() {
        clickOnElement(clickOnContinue);
        log.info("Click on Button : " + clickOnContinue.toString());
    }


    //Verify that a 'Logged in as username' is visible
    public String verifyLoggedInAsUserName() {
        log.info("Getting text from : " + verifyLoggedInAsUserName.toString());
        return getTextFromElement(verifyLoggedInAsUserName);
    }

    //Click on 'Delete Account' button
    public void clickOnDeleteAccount() {
        clickOnElement(clickOnDeleteAccount);
        log.info("Click on Button : " + clickOnDeleteAccount.toString());
    }

    //Verify that 'ACCOUNT DELETED!' is visible
    public String verifyAccountDeletedText() {
        log.info("Getting text from : " + verifyAccountDeletedText.toString());
        return getTextFromElement(verifyAccountDeletedText);
    }

    //I Click On 'Continue' button
    public void clickOnContinueButton(){
        clickOnElement(clickOnContinueButton);
        log.info("Click On Button : " + clickOnContinueButton.toString());
    }

    //I Click On 'LogOut' button
    public void clickOnLogOutButton(){
        clickOnElement(clickOnLogOut);
        log.info("Click On Button : " + clickOnLogOut.toString());
    }
    //Verify error 'Email Address already exist!' is visible

    public String verifyEmailAddressAlreadyExistText () {
        log.info("Getting text from : " + verifyEmailAddressAlreadyExistText.toString());
        return getTextFromElement(verifyEmailAddressAlreadyExistText);
    }

}