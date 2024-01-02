package com.exerciseautomation.pages;

import com.exerciseautomation.propertyreader.PropertyReader;
import com.exerciseautomation.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.AssertJUnit;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    //I Verify that home page is visible successfully
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Home']")
    WebElement verifyNevigateToHomePage;

    //Click on 'Signup / Login' button
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Signup / Login']")
    WebElement clickOnSignUpButton;

    //Click on Test Cases button
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Test Cases']")
    WebElement clickOnTestCases;

    //Click on 'Products' button
    @CacheLookup
    @FindBy(xpath = "//a[@href='/products']")
    WebElement clickOnProducts;

    //Click On Cart Button
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Cart']")
    WebElement clickOnCart;

//==============================================================================================

    // I Verify that home page is visible successfully
    public void verifyNevigateToHomePage() throws InterruptedException {
        Thread.sleep(4000);
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = PropertyReader.getInstance().getProperty("baseUrl");
        log.info("verifying homepage url.");
        AssertJUnit.assertEquals(expectedUrl, actualUrl);
    }

    //Click on 'Signup / Login' button
    public void clickOnButton() {
        clickOnElement(clickOnSignUpButton);
        log.info("Click On Button " + clickOnSignUpButton.toString());
    }

    //Click on Test Cases button
    public void clickOnTestCases() {
        clickOnElement(clickOnTestCases);
        log.info("Click On Button " + clickOnTestCases.toString());
    }

    //Click on 'Products' button
    public void clickOnProducts() {
        clickOnElement(clickOnProducts);
        log.info("Click On Button " + clickOnProducts.toString());
    }
    //Click On Cart Button
    public void clickOnCart(){
        clickOnElement(clickOnCart);
        log.info("Click On Button " + clickOnCart.toString());
    }
}