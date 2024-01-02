@regression
Feature: Download Invoice After Purchase Order page
  As a User I want to Download Invoice After Purchase Order page

  Background:
    Given I Launch browser
    And I Navigate to url "http://automationexercise.com/"
    Then I Verify that home page is visible successfully

  @Test_24
  @sanity
  Scenario: User should Download Invoice After Purchase Order page
    And I Hover over first product and click 'Add to cart'
    And I Click View Cart button
    Then I Verify that cart page is displayed
    And I Click Proceed To Checkout
    And I Click Register and Login button
    And I Enter name "John" and email address "johnmary@gmail.com"
    And I Click 'Signup' button
    And I Verify that 'ENTER ACCOUNT INFORMATION' is visible
    And I Fill details: Title "Mr." Password "123456" Day "6" Month "June" Year "1966"
    And I Select checkbox 'Sign up for our newsletter!'
    And I Select a checkbox 'Receive special offers from our partners!'
    And I Fill details: First name "John" Last name "Mary" Company "Johnzink" Address "1450 E.21st Street" AddressTwo "Broken arrow" Country "United States" State "Oklahoma" City "Tulsa" Zipcode "74008" Mobile Number"918-456-1234"
    And I Click 'Create Account button'
    Then I Verify a that 'ACCOUNT CREATED!' is visible
    And I Click a 'Continue' button
    And I Verify that Logged in as username is visible
    And I Click 'Cart' button on header Button
    And I Click Proceed To Checkout
    Then I Verify 'Address Details' and 'Review Your Order'
    And I Enter description in comment text area 'Please Deliver Same Product' and click 'Place Order'
    And I Enter payment details: Name on Card "John Mary" Card Number "9123456789012345" CVC "123" Expiration Date Of Month "2" and Year "2025"
    And I Click Pay and Confirm Order button
    Then I Verify success message 'Congratulations! Your order has been confirmed!'
    And I Click 'Download Invoice' button and verify invoice is downloaded successfully.
    And I Click Continue button
    And I click  'Delete Account' button
    Then I Verify that ACCOUNT DELETED! is visible
