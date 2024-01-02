package com.exerciseautomation.steps;

import com.exerciseautomation.pages.AddAndRemoveProductToCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class AddAndRemoveProductToCartPageSteps {
    @And("I Hover over first product and click {string}")
    public void iHoverOverFirstProductAndClickAddToCart(String product) throws InterruptedException {
        new AddAndRemoveProductToCartPage().mouseHoverAndClickOnFirstProduct();
    }

    @And("I Click Continue Shopping button")
    public void iClickContinueShoppingButton() {
        new AddAndRemoveProductToCartPage().clickToContinueShopping();
    }

    @And("I Hover over second product and click {string}")
    public void iHoverOverSecondProductAndClickAddToCart(String product) throws InterruptedException {
        new AddAndRemoveProductToCartPage().mouseHoverAndClickOnSecondProduct();
    }

    @And("I Click View Cart button")
    public void iClickViewCartButton() {
        new AddAndRemoveProductToCartPage().clickToViewCart();
    }

    @Then("Verify both products are added to Cart")
    public void verifyBothProductsAreAddedToCart() {
        new AddAndRemoveProductToCartPage().verifyBothProductsAreAddedToCart();
    }

    @And("I Verify their prices, quantity and total price")
    public void iVerifyTheirPricesQuantityAndTotalPrice() {
        new AddAndRemoveProductToCartPage().verifyTheListOfProductsPriceQuantityAndTotal();
    }

    @Then("I Verify product detail is opened")
    public void iVerifyProductDetailIsOpened() {
        new AddAndRemoveProductToCartPage().getProductDetails();
    }

    @And("I Increase quantity to {string}")
    public void iIncreaseQuantityTo(String quantity) throws InterruptedException {
        new AddAndRemoveProductToCartPage().changeTheQuantityOfProducts(quantity);
    }

    @And("I Click Add to cart button")
    public void iClickAddToCartButton() {
        new AddAndRemoveProductToCartPage().clickToAddToCart();
    }

    @Then("I Verify that product is displayed in cart page with exact quantity")
    public void iVerifyThatProductIsDisplayedInCartPageWithExactQuantity() {
        new AddAndRemoveProductToCartPage().getCorrectQuantityDisplayedInCart();
    }

    @And("I {string} button corresponding to particular product")
    public void iXButtonCorrespondingToParticularProduct(String button) {
        new AddAndRemoveProductToCartPage().clickOnXButton();
    }

    @Then("I Verify that {string}")
    public void iVerifyThatCartIsEmpty(String errorMessage) {

    }

    @Then("I Verify {string} are visible")
    public void iVerifyRECOMMENDEDITEMSAreVisible(String text) {
        Assert.assertEquals(new AddAndRemoveProductToCartPage().verifyRecommendedItemsText(),
                text, "Incorrect text Displayed");
    }

    @Then("I Verify that product is displayed in cart page")
    public void iVerifyThatProductIsDisplayedInCartPage() {
        new AddAndRemoveProductToCartPage().verifyProductIsDisplayed();

    }
}





