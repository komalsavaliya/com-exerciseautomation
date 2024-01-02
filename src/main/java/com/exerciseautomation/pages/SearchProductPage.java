package com.exerciseautomation.pages;

import com.exerciseautomation.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class SearchProductPage extends Utility {
    private static final Logger log = LogManager.getLogger(SearchProductPage.class.getName());

    //Enter product name "Tops" in search input
    @CacheLookup
    @FindBy(xpath = "//input[@id='search_product']")
    WebElement sendElementToSearchProduct;

    //click search button
    @CacheLookup
    @FindBy(xpath = "//button[@id='submit_search']")
    WebElement clickOnSearch;

    //Verify that a "SEARCHED PRODUCTS" is visible
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Searched Products']")
    WebElement verifySearchedProductsText;

    @CacheLookup
    @FindBy(xpath = "//div[@class='features_items']")
    List<WebElement> searchedItemsList;

    //I Again, go to Cart page
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Cart']")
    WebElement clickOnCartTopMenu;

    //Verify that those products are visible in cart after login as well
    @CacheLookup
    @FindBy(xpath = "//tr[@id='product-1']")
    WebElement verifyProductIsVisible;


//=============================================================================================================//

    //Enter product name "Tops" in search input

    public void sendElementToSearchProduct(String product) {
        sendTextToElement(sendElementToSearchProduct, product);
        clickOnElement(clickOnSearch);

        log.info("Send Text In Search Option : " + sendElementToSearchProduct.toString());
    }

    //Verify that a "SEARCHED PRODUCTS" is visible
    public String verifySearchedProductsText() {
        String text = getTextFromElement(verifySearchedProductsText);
        log.info("Getting text from : " + verifySearchedProductsText.toString());
        return text;
    }

    public ArrayList<String> getSearchedItemsList() {
        log.info("Verify Searched productList is Displayed : " + searchedItemsList.toString());
        return getArrayListFromWebElements(searchedItemsList);

    }

    //I Again, go to Cart page
    public void clickOnCartTopMenu(){
        clickOnElement(clickOnCartTopMenu);
        log.info("Click On Button : " + clickOnCartTopMenu.toString());
    }

    //Verify that those products are visible in cart after login as well
    public void verifyProductIsVisible() {
        log.info("Verify the Products displayed Correctly: " + verifyProductIsVisible.toString());
        verifyProductIsVisible.isDisplayed();
    }
}
