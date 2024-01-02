package com.exerciseautomation.steps;

import com.exerciseautomation.pages.CheckOutPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class CheckOutPageSteps {
    @Then("I Verify that the delivery address is same address filled at the time registration of account")
    public void iVerifyThatTheDeliveryAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount() {
        String excepted = "YOUR DELIVERY ADDRESS\n" +
                "Mr. John Mary\n" +
                "Johnzink\n" +
                "1450 E.21st Street\n" +
                "Broken arrow\n" +
                "Tulsa Oklahoma 74008\n" +
                "United States\n" +
                "918-456-1234";
        Assert.assertEquals(new CheckOutPage().getDeliveryAddress(),
                excepted, "Incorrect Address Displayed");
    }

    @And("I Verify that the billing address is same address filled at the time registration of account")
    public void iVerifyThatTheBillingAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount() {
        String excepted = "YOUR BILLING ADDRESS\n" +
                "Mr. John Mary\n" +
                "Johnzink\n" +
                "1450 E.21st Street\n" +
                "Broken arrow\n" +
                "Tulsa Oklahoma 74008\n" +
                "United States\n" +
                "918-456-1234";
        Assert.assertEquals(new CheckOutPage().getBillingAddress(),
                excepted, "Incorrect Address Displayed");

    }
}

