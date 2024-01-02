package com.exerciseautomation.pages;

import com.exerciseautomation.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ProductPage extends Utility {
    private static final Logger log = LogManager.getLogger(ProductPage.class.getName());

    //Verify user is navigated to ALL PRODUCTS page successfully
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='All Products']")
    WebElement verifyUserIsNavigatedToALLPRODUCTSPageSuccessfully;

    //Click on View Product of first product
    @CacheLookup
    @FindBy(xpath = "(//a[contains(text(),'View Product')])[1]")
    WebElement clickOnViewProductOfFirstProduct;

    //Verify that detail is visible: product name, category, price, availability, condition, brand
    @CacheLookup
    @FindBy(xpath = "//div[@class='product-information']")
    WebElement productInformation;



    //========================================================================//


    //Verify user is navigated to ALL PRODUCTS page successfully
    public String verifyUserIsNavigatedToALLPRODUCTSPageSuccessfully() {
        String text = getTextFromElement(verifyUserIsNavigatedToALLPRODUCTSPageSuccessfully);
        log.info("Getting text from : " + verifyUserIsNavigatedToALLPRODUCTSPageSuccessfully.toString());
        return text;
    }

    public void clickOnViewProductOfFirstProduct() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", clickOnViewProductOfFirstProduct);
        clickOnElement(clickOnViewProductOfFirstProduct);
        log.info("Click On Button : " + clickOnViewProductOfFirstProduct.toString());
    }
    public String getTextFromProductInformation(){
        Assert.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/product_details/1");
        log.info("Verify product information is displayed : " + productInformation.toString());
        return getTextFromElement(productInformation);
    }


}
