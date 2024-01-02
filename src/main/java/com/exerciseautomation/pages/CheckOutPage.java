package com.exerciseautomation.pages;

import com.exerciseautomation.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage extends Utility {
    private static final Logger log = LogManager.getLogger(CheckOutPage.class.getName());

    // I Verify that the delivery address is same address filled at the time registration of account
    @CacheLookup
    @FindBy(xpath = "//ul[@id='address_delivery']")
    WebElement deliveryAddress;

    // I Verify that the billing address is same address filled at the time registration of account
    @CacheLookup
    @FindBy (xpath = "//ul[@id='address_invoice']")
    WebElement billingAddress;


///============================================================================================//

    // I Verify that the delivery address is same address filled at the time registration of account
    public String getDeliveryAddress(){
        log.info("Getting delivery address : " + deliveryAddress.toString());
        return getTextFromElement(deliveryAddress);
    }

    // I Verify that the billing address is same address filled at the time registration of account
    public String getBillingAddress(){
        log.info("Getting billing address : " + deliveryAddress.toString());
        return getTextFromElement(billingAddress);
    }
}



