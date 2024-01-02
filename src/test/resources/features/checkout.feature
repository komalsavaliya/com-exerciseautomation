@regression
Feature: Check out Page
  As a User I want to verify Check Out Page Page

  Background:
    Given I Launch browser
    And I Navigate to url "http://automationexercise.com/"
    Then I Verify that home page is visible successfully

  @Test_23
  @smoke
  Scenario: User Verify Address details in checkOut page
    When Click on 'Signup /Login' button
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
    And I click on LogOut Button
    When Click on 'Signup /Login' button
    Then I Verify 'Login to your account' is visible
    And I Enter correct email address"johnmary@gmail.com" and password "123456"
    And I Click login button
    And I Verify that Logged in as username is visible
    When I Hover over first product and click 'Add to cart'
    And I Click View Cart button
    Then I Verify that cart page is displayed
    And I Click Proceed To Checkout
    Then I Verify that the delivery address is same address filled at the time registration of account
    And I Verify that the billing address is same address filled at the time registration of account
    And I click  'Delete Account' button
    Then I Verify that ACCOUNT DELETED! is visible
