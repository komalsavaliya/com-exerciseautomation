package com.exerciseautomation.pages;

import com.exerciseautomation.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class DownloadingInVoicePurchasePage extends Utility {
    private static final Logger log = LogManager.getLogger(DownloadingInVoicePurchasePage.class.getName());

    By downloadInvoiceButton = By.xpath("//a[normalize-space()='Download Invoice']");
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Continue']")
    WebElement downloadContinueButton3;

    //Folder location
    public void clickOnDownloadInvoiceButton() throws IOException, InterruptedException {
        log.info("Click on download invoice : " + downloadInvoiceButton.toString());
        seleniumDownloadFile(downloadInvoiceButton);

    }
    public void clickOnDownloadContinueButton3() {
        clickOnElement(downloadContinueButton3);
    }
}
