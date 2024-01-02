@regression
Feature: Search Product Page
  As a User I want to check Search Product Page

  Background:
    Given I Launch browser
    And I Navigate to url "http://automationexercise.com/"
    Then I Verify that home page is visible successfully

  @Test_9
  @smoke
  Scenario: User Check Search Product Page
    When I Click on Products button
    Then I Verify user is navigated to ALL PRODUCTS page successfully
    And I Enter product name "Tops" in search input and click search button
    Then I Verify that a "SEARCHED PRODUCTS" is visible
    Then I Verify all the products related to search are visible

  @Test_20
  @sanity
  Scenario: User Search Products And Verify cart After Login
    When I Click on Products button
    Then I Verify user is navigated to ALL PRODUCTS page successfully
    And I Enter product name "Tops" in search input and click search button
    Then I Verify that a "SEARCHED PRODUCTS" is visible
    Then I Verify all the products related to search are visible
    And  I Hover over first product and click 'Add to cart'
    And I Click View Cart button
    Then I Verify that cart page is displayed
    And I Click Proceed To Checkout
    And I Click Register and Login button
    And I Enter name "John" and email address "johnjenny@gmail.com"
    And I Click 'Signup' button
    And I Verify that 'ENTER ACCOUNT INFORMATION' is visible
    And I Fill details: Title "Mr." Password "123456" Day "6" Month "June" Year "1966"
    And I Select checkbox 'Sign up for our newsletter!'
    And I Select a checkbox 'Receive special offers from our partners!'
    And I Fill details: First name "John" Last name "Jenny" Company "Johnzink" Address "1450 E.21st Street" AddressTwo "Broken arrow" Country "United States" State "Oklahoma" City "Tulsa" Zipcode "74008" Mobile Number"918-456-1234"
    And I Click 'Create Account button'
    Then I Verify a that 'ACCOUNT CREATED!' is visible
    And I Click a 'Continue' button
    And I click on LogOut Button
    When Click on 'Signup /Login' button
    Then I Verify 'Login to your account' is visible
    And I Enter correct email address"johnjenny@gmail.com" and password "123456"
    And I Click login button
    And I Verify that Logged in as username is visible
    And I Again, go to Cart page
   Then I Verify that those products are visible in cart after login as well


