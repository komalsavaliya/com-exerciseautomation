package com.exerciseautomation.steps;

import com.exerciseautomation.pages.HomePage;
import com.exerciseautomation.pages.ProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ProductPageSteps {
    @When("I Click on Products button")
    public void iClickOnProductsButton() {
        new HomePage().clickOnProducts();
    }

    @Then("I Verify user is navigated to ALL PRODUCTS page successfully")
    public void iVerifyUserIsNavigatedToALLPRODUCTSPageSuccessfully() {
        String excepted = "ALL PRODUCTS";
        Assert.assertEquals(new ProductPage().verifyUserIsNavigatedToALLPRODUCTSPageSuccessfully(),
                excepted, "Incorrect text Displayed");
    }

    @And("I The products list is visible")
    public void iTheProductsListIsVisible() {
    }

    @And("I Click on View Product")
    public void iClickOnViewProduct() {
        new ProductPage().clickOnViewProductOfFirstProduct();

    }
    @And("I User is landed to product detail page")
    public void iUserIsLandedToProductDetailPage() {
    }

    @And("I Verify that detail detail is visible: product name, category, price, availability, condition, brand")
    public void iVerifyThatDetailDetailIsVisibleProductNameCategoryPriceAvailabilityConditionBrand() {
      new ProductPage().getTextFromProductInformation();
    }


}