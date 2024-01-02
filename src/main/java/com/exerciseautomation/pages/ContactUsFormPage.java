package com.exerciseautomation.pages;

import com.exerciseautomation.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.awt.*;

public class ContactUsFormPage extends Utility {
    private static final Logger log = LogManager.getLogger(ContactUsFormPage.class.getName());

    //Click on 'Contact Us' button
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Contact us']")
    WebElement clickOnContactUs;

    //Verify GET IN TOUCH is visible
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Get In Touch']")
    WebElement verifyGetInTouchText;

    //I Enter name
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Name']")
    WebElement enterName;

    //I Enter Email
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Email']")
    WebElement enterEmail;

    //I Enter Subject
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Subject']")
    WebElement enterSubject;

    //I Enter message
    @CacheLookup
    @FindBy(xpath = "//textarea[@id='message']")
    WebElement enterMessage;

    //Upload file
    @CacheLookup
    @FindBy(xpath = "//input[@name='upload_file']")
    WebElement clickOnChooseFile;


    //Click 'Submit' button
    @CacheLookup
    @FindBy(xpath = "//input[@name='submit']")
    WebElement clickOnSubmit;

    //Verify success message 'Success! Your details have been submitted successfully.' is visible
    @CacheLookup
    @FindBy(xpath = "//div[@class='status alert alert-success']")
    WebElement verifySuccessYourDetailsHaveBeenSubmittedSuccessfullyText;

    //I Click Home button
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Home']")
    WebElement clickOnHome;


    //==========================================================================//

    //Click on 'Contact Us' button
    public void clickOnContactUs() {
        clickOnElement(clickOnContactUs);
        log.info("Click On Button : " + clickOnContactUs.toString());
    }

    //Verify GET IN TOUCH is visible
    public String verifyGetInTouchText() {
        String text = getTextFromElement(verifyGetInTouchText);
        log.info("Getting text from : " + verifyGetInTouchText.toString());
        return text;
    }

    //I Enter name, email, subject and message
    public void fillDetails(String name, String email, String subject, String message) {
        sendTextToElement(enterName,name);
        sendTextToElement(enterEmail, email);
        sendTextToElement(enterSubject, subject);
        sendTextToElement(enterMessage, message);
        log.info("Fill Details");
    }

    //Click 'Submit' button
    public void clickOnSubmit() {
        clickOnElement(clickOnSubmit);
        log.info("Click On Button : " + clickOnSubmit.toString());
    }

    //Upload file
    public void clickOnChooseFile() {
        clickOnElement(clickOnChooseFile);
        log.info("Choose File : " + clickOnChooseFile.toString());
    }

    //Accept Ok
    public void clickOnOkButtonForAccept() {
        acceptAlert();
    }

    //Verify success message 'Success! Your details have been submitted successfully.' is visible
    public String verifySuccessYourDetailsHaveBeenSubmittedSuccessfullyText() {
        String text = getTextFromElement(verifySuccessYourDetailsHaveBeenSubmittedSuccessfullyText);
        log.info("Getting text from : " + verifySuccessYourDetailsHaveBeenSubmittedSuccessfullyText.toString());
        return text;
    }

    //I Click Home button
    public void clickOnHome() throws InterruptedException {
        Thread.sleep(5000);
        clickOnElement(clickOnHome);
        log.info("Click On Button : " + clickOnHome.toString());
    }

    public void uploadingFile(String filePath) throws AWTException {
        filePath = "C:\\Users\\komal\\IdeaProjects\\com-exerciseautomation\\src\\info.txt";
        uploadFile(filePath, clickOnChooseFile);
        log.info("upload file : " + clickOnChooseFile.toString());
    }

}
