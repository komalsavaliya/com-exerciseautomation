package com.exerciseautomation.steps;

import com.exerciseautomation.pages.ScrollUpDownArrowPage;
import io.cucumber.java.en.And;
import org.testng.Assert;

public class ScrollUpDownArrowPageSteps {
    @And("I click on arrow up button at bottom right corner")
    public void iClickOnArrowUpButtonAtBottomRightCorner() {
        new ScrollUpDownArrowPage().clickBottomRightArrowButton();
    }

    @And("I Verify that page is scrolled up and {string} text is visible on screen")
    public void iVerifyThatPageIsScrolledUpAndFullFledgedPracticeWebsiteForAutomationEngineersTextIsVisibleOnScreen(String text) {
        Assert.assertEquals(new ScrollUpDownArrowPage().getFullFledgedText(),text);
    }

    @And("I Scroll up page to top")
    public void iScrollUpPageToTop() {
        new ScrollUpDownArrowPage().scrollUp();
    }
}
