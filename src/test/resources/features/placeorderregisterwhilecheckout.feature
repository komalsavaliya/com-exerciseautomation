@regression
Feature: Place Order Register While CheckOut Page
  As a User I want to Place Order Register While CheckOut Page

  Background:
    Given I Launch browser
    And I Navigate to url "http://automationexercise.com/"
    Then I Verify that home page is visible successfully

  @Test_14
  @smoke
  Scenario: User want to Place Order Register While CheckOut Page
    When I Hover over first product and click 'Add to cart'
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
    And I click  'Delete Account' button
    Then I Verify that ACCOUNT DELETED! is visible

  @Test_15
  @sanity
  Scenario: User want to Place Order Login Before Page
    When Click on 'Signup /Login' button
    Then Verify 'New User Signup!' is visible
    And I Enter name "John" and email address "johnmary@gmail.com"
    And I Click 'Signup' button
    Then I Verify that 'ENTER ACCOUNT INFORMATION' is visible
    And I Fill details: Title "Mr." Password "123456" Day "6" Month "June" Year "1966"
    And I Select checkbox 'Sign up for our newsletter!'
    And I Select a checkbox 'Receive special offers from our partners!'
    And I Fill details: First name "John" Last name "Mary" Company "Johnzink" Address "1450 E.21st Street" AddressTwo "Broken arrow" Country "United States" State "Oklahoma" City "Tulsa" Zipcode "74008" Mobile Number"918-456-1234"
    And I Click 'Create Account button'
    Then I Verify a that 'ACCOUNT CREATED!' is visible
    And I Click a 'Continue' button
    And I Verify that Logged in as username is visible
    When I Hover over first product and click 'Add to cart'
    And I Click View Cart button
    Then I Verify that cart page is displayed
    And I Click Proceed To Checkout
    Then I Verify 'Address Details' and 'Review Your Order'
    And I Enter description in comment text area 'Please Deliver Same Product' and click 'Place Order'
    And I Enter payment details: Name on Card "John Mary" Card Number "9123456789012345" CVC "123" Expiration Date Of Month "2" and Year "2025"
    And I Click Pay and Confirm Order button
    Then I Verify success message 'Congratulations! Your order has been confirmed!'
    And I click  'Delete Account' button
    Then I Verify that ACCOUNT DELETED! is visible

  @Test_16
  @smoke
  Scenario: User want to Place Order Login Before CheckOut Page
    When Click on 'Signup /Login' button
    Then Verify 'New User Signup!' is visible
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
    Then I Verify 'Address Details' and 'Review Your Order'
    And I Enter description in comment text area 'Please Deliver Same Product' and click 'Place Order'
    And I Enter payment details: Name on Card "John Mary" Card Number "9123456789012345" CVC "123" Expiration Date Of Month "2" and Year "2025"
    And I Click Pay and Confirm Order button
    Then I Verify success message 'Congratulations! Your order has been confirmed!'
    And I click  'Delete Account' button
    Then I Verify that ACCOUNT DELETED! is visible



