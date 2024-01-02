package com.exerciseautomation.steps;

import com.exerciseautomation.pages.PlaceOrderRegisterWhileCheckOutPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class PlaceOrderRegisterWhileCheckOutPageSteps {
    @Then("I Verify that cart page is displayed")
    public void iVerifyThatCartPageIsDisplayed() {
        new PlaceOrderRegisterWhileCheckOutPage().verifyThatCartPageISDisplayed();
    }

    @And("I Click Proceed To Checkout")
    public void iClickProceedToCheckout() {
        new PlaceOrderRegisterWhileCheckOutPage().clickOnProceedToCheckOut();
    }


    @And("I Click Register and Login button")
    public void iClickRegisterAndLoginButton() {
        new PlaceOrderRegisterWhileCheckOutPage().clickOnRegisterAndLogin();
    }

    @And("I Click {string} button on header Button")
    public void iClickCartButtonOnHeaderButton(String button) {
        new PlaceOrderRegisterWhileCheckOutPage().clickOnCart();
    }

    @Then("I Verify {string} and {string}")
    public void iVerifyAddressDetailsAndReviewYourOrder(String addressDetails, String reviewYourOrder) {
        Assert.assertEquals(new PlaceOrderRegisterWhileCheckOutPage().verifyAddressDetails(),
                addressDetails, "Incorrect text Displayed");
        Assert.assertEquals(new PlaceOrderRegisterWhileCheckOutPage().verifyReviewYourOrder(),
                reviewYourOrder, "Incorrect text Displayed");
    }

    @And("I Enter description in comment text area {string} and click {string}")
    public void iEnterDescriptionInCommentTextAreaPleaseDeliverSameProductAndClickPlaceOrder(String message, String button) {
        new PlaceOrderRegisterWhileCheckOutPage().enterDescriptionAndPlaceOrder(message, button);
    }

    @And("I Enter payment details: Name on Card {string} Card Number {string} CVC {string} Expiration Date Of Month {string} and Year {string}")
    public void iEnterPaymentDetailsNameOnCardCardNumberCVCExpirationDateOfMonthAndYear(String name, String number, String cvc, String month, String year) {
        new PlaceOrderRegisterWhileCheckOutPage().enterPaymentDetails(name, number, cvc, month, year);
    }

    @And("I Click Pay and Confirm Order button")
    public void iClickPayAndConfirmOrderButton() {
        new PlaceOrderRegisterWhileCheckOutPage().clickOnPayAndConfirmOrder();
    }

    @Then("I Verify success message {string}")
    public void iVerifySuccessMessageYourOrderHasBeenPlacedSuccessfully(String text) {
        new PlaceOrderRegisterWhileCheckOutPage().verifyYourOrderHasBeenConfirmedText(text);
    }

    @Then("Verify that product is removed from the cart")
    public void verifyThatProductIsRemovedFromTheCart() {
    }
}