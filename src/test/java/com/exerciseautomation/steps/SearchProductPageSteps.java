package com.exerciseautomation.steps;

import com.exerciseautomation.pages.SearchProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class SearchProductPageSteps {

    @And("I Enter product name {string} in search input and click search button")
    public void iEnterProductNameInSearchInputAndClickSearchButton(String text) {
        new SearchProductPage().sendElementToSearchProduct(text);
    }

    @Then("I Verify that a {string} is visible")
    public void iVerifyThatAIsVisible(String errorMessage) {
        Assert.assertEquals(new SearchProductPage().verifySearchedProductsText(),
                errorMessage, "Incorrect text Displayed");
    }

    @Then("I Verify all the products related to search are visible")
    public void iVerifyAllTheProductsRelatedToSearchAreVisible() {
        new SearchProductPage().getSearchedItemsList();
    }


    @And("I Again, go to Cart page")
    public void iAgainGoToCartPage() {
        new SearchProductPage().clickOnCartTopMenu();
    }

    @Then("I Verify that those products are visible in cart after login as well")
    public void iVerifyThatThoseProductsAreVisibleInCartAfterLoginAsWell() {
        new SearchProductPage().verifyProductIsVisible();

    }
}

