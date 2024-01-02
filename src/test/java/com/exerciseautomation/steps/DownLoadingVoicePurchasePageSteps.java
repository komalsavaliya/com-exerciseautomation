package com.exerciseautomation.steps;

import com.exerciseautomation.pages.DownloadingInVoicePurchasePage;
import io.cucumber.java.en.And;

import java.io.IOException;

public class DownLoadingVoicePurchasePageSteps {
    @And("I Click {string} button and verify invoice is downloaded successfully.")
    public void iClickDownloadInvoiceButtonAndVerifyInvoiceIsDownloadedSuccessfully(String downloadInvoice) throws IOException, InterruptedException {
        new DownloadingInVoicePurchasePage().clickOnDownloadInvoiceButton();
    }

    @And("I Click Continue button")
    public void iClickContinueButton() {
        new DownloadingInVoicePurchasePage().clickOnDownloadContinueButton3();
    }
}
