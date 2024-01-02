package com.exerciseautomation.pages;

import com.exerciseautomation.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BrandCategoryReviewProductPage extends Utility {
    private static final Logger log = LogManager.getLogger(BrandCategoryReviewProductPage.class.getName());

    //Verify that categories are visible on left side bar
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Category']")
    WebElement verifyCategoriesText;

    //Click on 'Women' category
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Women']")
    WebElement clickOnWomen;

    //Click on any category link under Women
    @CacheLookup
    @FindBy(xpath = "//div[@id='Women']//a[contains(text(),'Dress')]")
    WebElement clickOnDress;

    //Verify that category page is displayed and confirm text 'WOMEN - DRESS PRODUCTS'
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Women - Dress Products']")
    WebElement verifyWomenDressProducts;

    //On left side bar, click on any sub-category link of 'Men' category
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Men']")
    WebElement clickOnMen;

    //Verify that user is navigated to that category page
    @CacheLookup
    @FindBy(xpath = "//div[@id='Men']//ul")
    WebElement verifyNevigateToMenCategoryPage;

    //Verify that Brands are visible on left side bar
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Brands']")
    WebElement verifyBrandText;

    //Click on any brand name 'BIBA'
    @CacheLookup
    @FindBy(xpath = "//a[@href='/brand_products/Biba']")
    WebElement clickOnBiba;

    //Verify that user is navigated to brand page and brand products are displayed
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Brand - Biba Products']")
    WebElement verifyBrandBibaProductsText;

    @CacheLookup
    @FindBy(xpath = "//div[@class='features_items']")
    List<WebElement> verifyBrandProductsListDisplay;

    //On left side bar, click on any other brand "POLO" link
    @CacheLookup
    @FindBy(xpath = "//a[@href='/brand_products/Polo']")
    WebElement clickOnPolo;

    //Verify that user is navigated to that brand page and can see products
    @CacheLookup
    @FindBy(xpath = "//a[@href='/brand_products/Polo']")
    WebElement verifyBrandPoloProductsText;

    //Verify That 'Write Your Review' is visible
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Write Your Review']")
    WebElement verifyWriteYourReviewText;

    //Enter name email and review
    @CacheLookup
    @FindBy(id = "name")
    WebElement enterName;

    @CacheLookup
    @FindBy (id = "email")
    WebElement enterEmail;

    @CacheLookup
    @FindBy(id = "review")
    WebElement enterReview;

    //Click Submit button
    @CacheLookup
    @FindBy(id = "button-review")
    WebElement clickOnSubmit;

    // Verify that success message 'Thank you for your review.'
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Thank you for your review.']")
    WebElement verifyThankYouForYourReview;



    //================================================================================//


    //Verify that categories are visible on left side bar

    public String verifyCategoriesText() {
        log.info("Getting text from : " + verifyCategoriesText.toString());
        return getTextFromElement(verifyCategoriesText);
    }

    //Click on 'Women' category
    public void clickOnWomen() {
        clickOnElement(clickOnWomen);
        log.info("Click On Button : " + clickOnWomen.toString());
    }

    //Click on any category link under Women
    public void clickOnDress() {
        clickOnElement(clickOnDress);
        log.info("Click On Button : " + clickOnDress.toString());
    }

    //Verify that category page is displayed and confirm text 'WOMEN - DRESS PRODUCTS'
    public String verifyWomenDressProducts() {
        log.info("Getting text from : " + verifyWomenDressProducts.toString());
        return getTextFromElement(verifyWomenDressProducts);
    }

    //On left side bar, click on any sub-category link of 'Men' category

    public void clickOnMen() {
        clickOnElement(clickOnMen);
        log.info("Click On Button : " + clickOnMen.toString());
    }

    //Verify that user is navigated to that category page
    public void verifyNevigateToMenCategoryPage() {
        log.info("Verify Nevigate To Page : " + verifyNevigateToMenCategoryPage.toString());
        verifyNevigateToMenCategoryPage.isDisplayed();
    }

    //Verify that Brands are visible on left side bar
    public String verifyBrandText() {
        log.info("Getting text from : " + verifyBrandText.toString());
        return getTextFromElement(verifyBrandText);
    }

    //Click on any brand name 'BIBA'
    public void clickOnBIBA() {
        clickOnElement(clickOnBiba);
        log.info("Click On Button : " + clickOnBiba.toString());
    }

    //Verify that user is navigated to brand page and brand products are displayed
    public String verifyBrandBibaProductsText() {
        log.info("Getting text from : " + verifyBrandBibaProductsText.toString());
        return getTextFromElement(verifyBrandBibaProductsText);
    }

    public void verifyBrandProductsListDisplay() {
        log.info("Getting text from : " + verifyBrandProductsListDisplay.toString());
        getArrayListFromWebElements(verifyBrandProductsListDisplay);
    }

    // On left side bar, click on any other brand "BABYHUG" link
    public void clickOnPolo() {
        clickOnElement(clickOnPolo);
        log.info("Click On Button : " + clickOnPolo.toString());
    }
    //Verify that user is navigated to that brand page and can see products
    public String verifyBrandPoloProductsText() {
        log.info("Getting text from : " +verifyBrandPoloProductsText.toString());
        return getTextFromElement(verifyBrandPoloProductsText);
    }

    //Verify That 'Write Your Review' is visible
    public String verifyWriteYourReviewText(){
        log.info("Getting text from : " +verifyWriteYourReviewText.toString());
        return getTextFromElement(verifyWriteYourReviewText);
    }

    //Enter name email and review
    public void writeReview(String name, String email,String review){
        sendTextToElement(enterName,name);
        sendTextToElement(enterEmail,email);
        sendTextToElement(enterReview,review);
        log.info("Write Review : ");
    }

    //Click Submit button
    public void clickSubmit() {
        clickOnElement(clickOnSubmit);
        log.info("Click On Button : " + clickOnSubmit.toString());
    }

    // Verify that success message 'Thank you for your review.'
    public String verifyThankYouForYourReview(){
        log.info("Getting text from : " +verifyThankYouForYourReview.toString());
        return getTextFromElement(verifyThankYouForYourReview);
    }


}



