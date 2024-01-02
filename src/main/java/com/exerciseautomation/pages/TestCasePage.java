package com.exerciseautomation.pages;

import com.exerciseautomation.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class TestCasePage extends Utility {
    private static final Logger log = LogManager.getLogger(TestCasePage.class.getName());
    // Verify user is navigated to test cases page successfully
    @CacheLookup
    @FindBy(xpath = "//b[normalize-space()='Test Cases']")
    WebElement verifyNavigatedToTestCasesPageSuccessfully;


//====================================================================//

    // Verify user is navigated to test cases page successfully
    public String verifyNavigatedToTestCasesPageSuccessfully() {
        String text = getTextFromElement(verifyNavigatedToTestCasesPageSuccessfully);
        log.info("Getting text from : " + verifyNavigatedToTestCasesPageSuccessfully.toString());
        return text;

    }
}