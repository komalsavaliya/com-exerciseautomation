package com.exerciseautomation.steps;

import com.exerciseautomation.pages.HomePage;
import com.exerciseautomation.pages.SubscriptionHomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class SubscriptionHomePageSteps {
    @When("I Scroll down to footer")
    public void iScrollDownToFooter() {
        new SubscriptionHomePage().scrollDownToThePage();
    }


    @Then("I Verify text {string}")
    public void iVerifyTextSUBSCRIPTION(String subscription) {
        Assert.assertEquals(new SubscriptionHomePage().verifySubscriptionText(),
                subscription,"Incorrect Message Displayed");
    }


    @And("I Enter email address {string}in input and click arrow button")
    public void iEnterEmailAddressInInputAndClickArrowButton(String email) {
        new SubscriptionHomePage().subscriptionEmail(email);


    }
    @Then("I Verify success message You have been successfully subscribed! is visible")
    public void iVerifySuccessMessageYouHaveBeenSuccessfullySubscribedIsVisible() {
        Assert.assertEquals(new SubscriptionHomePage().VerifySuccessMessageYouHaveBeenSuccessfullySubscribed(),
                "You have been successfully subscribed!");

    }

    @When("I Click Cart button")
    public void iClickCartButton() {
        new HomePage().clickOnCart();
    }
}
