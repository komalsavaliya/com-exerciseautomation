package com.exerciseautomation.pages;

import com.exerciseautomation.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class SubscriptionHomePage extends Utility {
    private static final Logger log = LogManager.getLogger(SubscriptionHomePage.class.getName());
    JavascriptExecutor js = (JavascriptExecutor) driver;

    //I Verify text 'SUBSCRIPTION'
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Subscription']")
    WebElement verifySubscriptionText;

    @CacheLookup
    @FindBy(xpath = "//input[@id='susbscribe_email']")
    WebElement subscriptionEmail;

    @CacheLookup
    @FindBy(xpath = "//button[@id='subscribe']")
    WebElement subscriptionEmailButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='alert-success alert']")
    WebElement subscribeSuccessfullyMessage;


    //===================================================================================//
    public void scrollDownToFooter() {
        log.info("Scroll Down to Footer");
        js.executeScript("window.scrollBy(0,5000)");
       // js.executeScript("argument[0].scrollIntoView();",element);
    }
    public void scrollDownToThePage() {
        javaExecutorScriptExecuteScriptToScrollThePageTillElementFound(verifySubscriptionText);
    }

    //I Verify text 'SUBSCRIPTION'
    public String verifySubscriptionText(){
        log.info("Getting Text : " + verifySubscriptionText.toString());
        return getTextFromElement(verifySubscriptionText);
    }

    public void subscriptionEmail(String email){
        sendTextToElement(subscriptionEmail,email);
        clickOnElement(subscriptionEmailButton);
        log.info("Subcription info: ");

    }
    //Verify success message You have been successfully subscribed! is visible
    public String VerifySuccessMessageYouHaveBeenSuccessfullySubscribed() {
        return getTextFromElement(subscribeSuccessfullyMessage);
    }
}