package com.exerciseautomation.pages;

import com.exerciseautomation.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ScrollUpDownArrowPage extends Utility {
    private static final Logger log = LogManager.getLogger(ScrollUpDownArrowPage.class.getName());

    //click on arrow up button at bottom right corner
    @CacheLookup
    @FindBy(id = "scrollUp")
    WebElement clickBottomRightArrowButton;


    //should see the message "Full-Fledged practice website for Automation Engineers"
    @CacheLookup
    @FindBy(xpath = "//div[@class='item active']//h2[contains(text(),'Full-Fledged practice website for Automation Engin')]")
    WebElement getFullFledgedText;

    //Scroll up page to top
    @CacheLookup
    @FindBy(id = "slider")
    WebElement scrollUp;

    //Close Advertise
    @CacheLookup
    @FindBy(id = "aswift_5_host")
    WebElement closeAdvertise;


    ///=============================================================================//

    //click on arrow up button at bottom right corner
    public void clickBottomRightArrowButton() {
        clickOnElement(clickBottomRightArrowButton);
        log.info("Click On Button : " + clickBottomRightArrowButton);
    }

    //should see the message "Full-Fledged practice website for Automation Engineers"
    public String getFullFledgedText() {
        log.info("Getting text : " + getFullFledgedText.toString());
        return getTextFromElement(getFullFledgedText);
    }

    //Scroll up page to top
    public void scrollUp() {
        javaExecutorScriptExecuteScriptToScrollThePageTillElementFound(scrollUp);
    }

}


