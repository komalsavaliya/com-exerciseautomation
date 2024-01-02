package com.exerciseautomation.steps;

import com.exerciseautomation.pages.BrandCategoryReviewProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class BrandCategoryReviewProductPageSteps {
    @When("I Verify that {string} are visible on left side bar")
    public void iVerifyThatCategoriesAreVisibleOnLeftSideBar(String text) {
        Assert.assertEquals(new BrandCategoryReviewProductPage().verifyCategoriesText(),
                text, "Incorrect text Displayed");
    }

    @And("I Click on {string} category")
    public void iClickOnWomenCategory(String women) {
        new BrandCategoryReviewProductPage().clickOnWomen();

    }

    @And("I Click on any category link under {string} category, for example: Dress")
    public void iClickOnAnyCategoryLinkUnderWomenCategoryForExampleDress(String women) {
        new BrandCategoryReviewProductPage().clickOnDress();

    }

    @Then("I Verify that category page is displayed and confirm text {string}")
    public void iVerifyThatCategoryPageIsDisplayedAndConfirmTextWOMENTOPSPRODUCTS(String text) {
        Assert.assertEquals(new BrandCategoryReviewProductPage().verifyWomenDressProducts(),
                text, "Incorrect text Displayed");

    }

    @And("I On left side bar, click on any sub-category link of {string} category")
    public void iOnLeftSideBarClickOnAnySubCategoryLinkOfMenCategory(String men) {
        new BrandCategoryReviewProductPage().clickOnMen();

    }

    @Then("I Verify that user is navigated to that category page")
    public void iVerifyThatUserIsNavigatedToThatCategoryPage() {
        new BrandCategoryReviewProductPage().verifyNevigateToMenCategoryPage();
    }


    @Then("I Verify that the {string} are visible on left side bar")
    public void iVerifyThatTheBrandsAreVisibleOnLeftSideBar(String text) {
        Assert.assertEquals(new BrandCategoryReviewProductPage().verifyBrandText(),
                text, "Incorrect text Displayed");
    }

    @And("I Click on any brand name {string}")
    public void iClickOnAnyBrandNameHM(String brand) {
        new BrandCategoryReviewProductPage().clickOnBIBA();

    }

    @Then("I Verify that user is navigated to brand page and brand products are displayed")
    public void iVerifyThatUserIsNavigatedToBrandPageAndBrandProductsAreDisplayed() {
        new BrandCategoryReviewProductPage().verifyBrandBibaProductsText();
        new BrandCategoryReviewProductPage().verifyBrandProductsListDisplay();
    }

    @And("I On left side bar, click on any other brand {string} link")
    public void iOnLeftSideBarClickOnAnyOtherBrandLink(String brand) {
        new BrandCategoryReviewProductPage().clickOnPolo();
    }

    @Then("I Verify that user is navigated to that brand page and can see products")
    public void iVerifyThatUserIsNavigatedToThatBrandPageAndCanSeeProducts() {
        new BrandCategoryReviewProductPage().verifyBrandPoloProductsText();
        new BrandCategoryReviewProductPage().verifyBrandProductsListDisplay();
    }

    @Then("I Verify That {string} is visible")
    public void iVerifyThatWriteYourReviewIsVisible(String text) {
        Assert.assertEquals(new BrandCategoryReviewProductPage().verifyWriteYourReviewText(),
                text, "Incorrect text Displayed");
    }

    @And("I Enter name {string} email {string} and review {string}")
    public void iEnterNameEmailAndReview(String name, String email, String review) {
        new BrandCategoryReviewProductPage().writeReview(name,email,review);
    }

    @And("I Click Submit button")
    public void iClickSubmitButton() {
        new BrandCategoryReviewProductPage().clickSubmit();
    }

    @Then("I Verify that success message {string}")
    public void iVerifyThatSuccessMessageThankYouForYourReview(String text) {
        Assert.assertEquals(new BrandCategoryReviewProductPage().verifyThankYouForYourReview(),
                text, "Incorrect text Displayed");
    }

    }



