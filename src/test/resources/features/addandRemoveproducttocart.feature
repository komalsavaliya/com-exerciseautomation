@regression
Feature: Add Product In Cart Page
  As a User I want to Add Product In Cart Page

  Background:
    Given I Launch browser
    And I Navigate to url "http://automationexercise.com/"
    Then I Verify that home page is visible successfully

  @Test_12
  @sanity
  Scenario: User Check  Add Product In Cart Page
    When I Click on Products button
    And I Hover over first product and click 'Add to cart'
    And I Click Continue Shopping button
    And I Hover over second product and click 'Add to cart'
    And I Click View Cart button
    Then Verify both products are added to Cart
    And I Verify their prices, quantity and total price

  @Test_13
  @smoke
  Scenario: User VerifyProduct quantity in cart
    When I Click on View Product
    Then I Verify product detail is opened
    And I Increase quantity to '4'
    And I Click Add to cart button
    And I Click View Cart button
    Then I Verify that product is displayed in cart page with exact quantity

  @Test_17
  @sanity
  Scenario: User Remove Product From cart
    When I Hover over first product and click 'Add to cart'
    And I Click View Cart button
    Then I Verify that cart page is displayed
    And I 'X' button corresponding to particular product
    Then Verify that product is removed from the cart

  @Test_22
  @smoke
  Scenario: User Add to Cart from Recommended items
    When I Scroll down to footer
    Then I Verify 'RECOMMENDED ITEMS' are visible
    And I Hover over first product and click 'Add to cart'
    And I Click View Cart button
    Then I Verify that product is displayed in cart page


