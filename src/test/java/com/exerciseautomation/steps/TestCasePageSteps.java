package com.exerciseautomation.steps;

import com.exerciseautomation.pages.HomePage;
import com.exerciseautomation.pages.TestCasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class TestCasePageSteps {
    @When("I Click on Test Cases button")
    public void iClickOnTestCasesButton() {
        new HomePage().clickOnTestCases();
    }

    @And("I Verify user is navigated to test cases page successfully")
    public void iVerifyUserIsNavigatedToTestCasesPageSuccessfully() {
        String excepted = "TEST CASES";
        Assert.assertEquals(new TestCasePage().verifyNavigatedToTestCasesPageSuccessfully(),
                excepted, "Incorrect text Displayed");
    }

}

