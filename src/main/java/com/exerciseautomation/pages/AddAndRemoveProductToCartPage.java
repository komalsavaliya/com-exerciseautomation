package com.exerciseautomation.pages;

import com.exerciseautomation.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class AddAndRemoveProductToCartPage extends Utility {
    private static final Logger log = LogManager.getLogger(AddAndRemoveProductToCartPage.class.getName());

    //Hover over first product and click 'Add to cart'
    @CacheLookup
    @FindBy(xpath = "(//a[contains(text(),'Add to cart')])[2]")
    WebElement addToCartButton1;

    //Click Continue Shopping button
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue Shopping']")
    WebElement clickToContinueShopping;

    //Hover over second product and click 'Add to cart'
    @CacheLookup
    @FindBy(xpath = "(//a[contains(text(),'Add to cart')])[4]")
    WebElement addToCartButton2;

    //Click View Cart button
    @CacheLookup
    @FindBy(xpath = "//u[normalize-space()='View Cart']")
    WebElement clickToViewCart;

    //Verify both products are added to Cart
    @CacheLookup
    @FindBy(xpath = "//tbody")
    WebElement verifyBothProductsAreAddedToCart;

    //Verify their prices, quantity and total price
    @CacheLookup
    @FindBy(xpath = "//table[@id='cart_info_table']//thead")
    WebElement verifyPricesQuantityAndTotalPrice;


    //Verify their prices, quantity and total price

    @CacheLookup
    @FindBy(xpath = "(//td[@class='cart_price'])")
    List<WebElement> verifyPrices;

    @CacheLookup
    @FindBy(xpath = "(//td[@class='cart_quantity'])")
    List<WebElement> verifyQuantity;

    @CacheLookup
    @FindBy(xpath = "(//td[@class='cart_total'])")
    List<WebElement> verifyTotal;

    //Verify product detail is opened
    @CacheLookup
    @FindBy(xpath = "//div[@class='product-information']")
    WebElement productInformation;

    //Increase quantity to 4
    @CacheLookup
    @FindBy(xpath = "//input[@id='quantity']")
    WebElement changeTheQuantityOfProducts;

    //Click Add to cart button
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Add to cart']")
    WebElement clickToAddToCart;

    //Verify that product is displayed in cart page with exact quantity
    @CacheLookup
    @FindBy(xpath = "(//td[@class='cart_quantity'])")
    WebElement verifyQuantityIntoCart;

    //'X' button corresponding to particular product
    @CacheLookup
    @FindBy(xpath = "//i[@class='fa fa-times']")
    WebElement clickOnXButton;

    //Verify that product is removed from the cart
    @CacheLookup
    @FindBy(xpath = "//span[@id='empty_cart']")
    WebElement verifyCartIsEmpty;

    //Verify 'RECOMMENDED ITEMS' are visible
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='recommended items']")
    WebElement verifyRecommendedItemsText;

    //Verify that product is displayed in cart page
    @CacheLookup
    @FindBy(xpath = "//td[@class='cart_description']")
    WebElement verifyProductIsDisplayed;



    ///==============================================================================///

    //Hover over first product and click 'Add to cart'
    public void mouseHoverAndClickOnFirstProduct() throws InterruptedException {
        Thread.sleep(4000);
        javaExecutorScriptExecuteScriptToClick(addToCartButton1);

        // mouseHoverToElementAndClick(addToCartButton1);
        log.info("Click on add to cart button1 for first product : " + addToCartButton1.toString());
    }

    //Click Continue Shopping button
    public void clickToContinueShopping() {
        clickOnElement(clickToContinueShopping);
        log.info("Click On Button : " + clickToContinueShopping.toString());
    }

    //Hover over second product and click 'Add to cart'
    public void mouseHoverAndClickOnSecondProduct() throws InterruptedException {
        Thread.sleep(4000);
        javaExecutorScriptExecuteScriptToClick(addToCartButton2);

        // mouseHoverToElementAndClick(addToCartButton1);
        log.info("Click on add to cart button1 for first product : " + addToCartButton2.toString());
    }

    //Click View Cart button
    public void clickToViewCart() {
        clickOnElement(clickToViewCart);
        log.info("Click On Button : " + clickToViewCart.toString());
    }

    //Verify both products are added to Cart
    public void verifyBothProductsAreAddedToCart() {
        log.info("Verify the Products are Added correctly : " + verifyBothProductsAreAddedToCart.toString());
        verifyBothProductsAreAddedToCart.isDisplayed();
    }


    //Verify their prices, quantity and total price
    public void verifyTheListOfProductsPriceQuantityAndTotal() {
        getArrayListFromWebElements(verifyPrices);
        getArrayListFromWebElements(verifyQuantity);
        getArrayListFromWebElements(verifyTotal);
        log.info("The List Of Products");
    }

    //Verify product detail is opened

    public String getProductDetails() {
        Assert.assertEquals(driver.getCurrentUrl(), "https://automationexercise.com/product_details/1");
        log.info("Verify product information is displayed : " + productInformation.toString());
        return getTextFromElement(productInformation);
    }

    //Increase quantity to 4
    public void changeTheQuantityOfProducts(String quantity) throws InterruptedException {
        Thread.sleep(2000);
        clearTextField(changeTheQuantityOfProducts);
        sendTextToElement(changeTheQuantityOfProducts, quantity);
        log.info("Change The Quantity : " + changeTheQuantityOfProducts.toString());
    }

    //Click Add to cart button
    public void clickToAddToCart() {
        clickOnElement(clickToAddToCart);
        log.info("Click On Button : " + clickToAddToCart.toString());
    }

    //Verify that product is displayed in cart page with exact quantity
    public void getCorrectQuantityDisplayedInCart() {
        log.info("Verify the Products Quantity displayed Correctly: " + verifyQuantityIntoCart.toString());
        verifyQuantityIntoCart.isDisplayed();
    }

    //'X' button corresponding to particular product
    public void clickOnXButton() {
        clickOnElement(clickOnXButton);
        log.info("Click On Button : " + clickOnXButton.toString());
    }

    public String verifyCartIsEmpty() {
        log.info("Getting text from : " + verifyCartIsEmpty.toString());
        return getTextFromElement(verifyCartIsEmpty);
    }

    //Verify 'RECOMMENDED ITEMS' are visible
    public String verifyRecommendedItemsText() {
        log.info("Getting text from : " + verifyRecommendedItemsText.toString());
        return getTextFromElement(verifyRecommendedItemsText);
    }

    //Verify that product is displayed in cart page
    public void verifyProductIsDisplayed(){
        log.info("Verify the Products displayed Correctly: " + verifyProductIsDisplayed.toString());
        verifyProductIsDisplayed.isDisplayed();

    }
}

