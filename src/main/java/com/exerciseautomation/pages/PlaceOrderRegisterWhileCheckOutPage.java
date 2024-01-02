package com.exerciseautomation.pages;

import com.exerciseautomation.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PlaceOrderRegisterWhileCheckOutPage extends Utility {
    private static final Logger log = LogManager.getLogger(PlaceOrderRegisterWhileCheckOutPage.class.getName());

    //Verify that cart page is displayed
    @CacheLookup
    @FindBy(xpath = "//div[@id='cart_info']")
    WebElement verifyThatCartPageISDisplayed;

    //Click Proceed To Checkout
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Proceed To Checkout']")
    WebElement clickOnProceedToCheckOut;

    //Click Register and Login button
    @CacheLookup
    @FindBy(xpath = "//u[normalize-space()='Register / Login']")
    WebElement clickOnRegisterAndLogin;

    //Click 'Cart' button on header Button
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Cart']")
    WebElement clickOnCart;

    //I Verify Address Details and Review Your Order
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Address Details']")
    WebElement verifyAddressDetails;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Review Your Order']")
    WebElement verifyReviewYourOrder;

    //I Enter description in comment text area and click 'Place Order'
    @CacheLookup
    @FindBy(xpath = "//textarea[@name='message']")
    WebElement addComment;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Place Order']")
    WebElement clickOnPlaceOrder;

    //I Enter payment details: Name on Card,Card Number,CVC,Expiration Date Of Month and Year
    @CacheLookup
    @FindBy(xpath = "//input[@name='name_on_card']")
    WebElement enterNameOnCard;

    @CacheLookup
    @FindBy(xpath = "//input[@name='card_number']")
    WebElement enterCardNumber;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='ex. 311']")
    WebElement enterCvcNumber;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='MM']")
    WebElement enterDateOfMonth;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='YYYY']")
    WebElement enterDateOfYear;

    //Click Pay and Confirm Order button
    @CacheLookup
    @FindBy(xpath = "//button[@id='submit']")
    WebElement clickOnPayAndConfirmOrder;

    //Verify success message 'Your order has been placed successfully!'
    @CacheLookup
    @FindBy(xpath = "//p[contains(text(), 'Congratulations! Your order has been confirmed!')]")
    WebElement verifyYourOrderHasBeenConfirmedText;




    //========================================================================================//

    //Verify that cart page is displayed
    public void verifyThatCartPageISDisplayed() {
        log.info("Verify the Products Quantity displayed Correctly: " + verifyThatCartPageISDisplayed.toString());
        verifyThatCartPageISDisplayed.isDisplayed();
    }

    //Click Proceed To Checkout
    public void clickOnProceedToCheckOut() {
        clickOnElement(clickOnProceedToCheckOut);
        log.info("Click On Button : " + clickOnProceedToCheckOut.toString());
    }

    //Click Register and Login button
    public void clickOnRegisterAndLogin() {
        clickOnElement(clickOnRegisterAndLogin);
        log.info("Click On Button : " + clickOnRegisterAndLogin.toString());
    }

    //Click 'Cart' button on header Button
    public void clickOnCart() {
        clickOnElement(clickOnCart);
        log.info("Click On Button : " + clickOnCart.toString());
    }

    //I Verify Address Details and Review Your Order
    public String verifyAddressDetails() {
        log.info("Getting text from : " + verifyAddressDetails.toString());
        return getTextFromElement(verifyAddressDetails);
    }

    public String verifyReviewYourOrder() {
        log.info("Getting text from : " + verifyReviewYourOrder.toString());
        return getTextFromElement(verifyReviewYourOrder);
    }

    //I Enter description in comment text area and click 'Place Order'
    public void enterDescriptionAndPlaceOrder(String message, String button) {
        sendTextToElement(addComment, message);
        javaExecutorScriptExecuteScriptToClick(clickOnPlaceOrder);
        log.info("Enter Descriptions");
    }

    //I Enter payment details: Name on Card,Card Number,CVC,Expiration Date Of Month and Year

    public void enterPaymentDetails(String name, String number, String cvc, String month, String year) {
        sendTextToElement(enterNameOnCard, name);
        sendTextToElement(enterCardNumber, number);
        sendTextToElement(enterCvcNumber, cvc);
        sendTextToElement(enterDateOfMonth, month);
        sendTextToElement(enterDateOfYear, year);
        log.info("Enter Payment Details");
    }

    //Click Pay and Confirm Order button
    public void clickOnPayAndConfirmOrder(){
        clickOnElement(clickOnPayAndConfirmOrder);
        log.info("Click On Button : " + clickOnPayAndConfirmOrder.toString());
    }

    //Verify success message 'Your order has been placed successfully!'

    public void verifyYourOrderHasBeenConfirmedText(String text) {
        log.info("Getting text from : " + verifyYourOrderHasBeenConfirmedText.toString());
       getTextFromElement(verifyYourOrderHasBeenConfirmedText);
    }
}
