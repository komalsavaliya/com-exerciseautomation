@regression
Feature: Add View Category Products page
  As a User I want to Add View Category Products page

  Background:
    Given I Launch browser
    And I Navigate to url "http://automationexercise.com/"
    Then I Verify that home page is visible successfully

  @Test_18
  @smoke
  Scenario: User Check View Category Products page
    When I Verify that 'CATEGORY' are visible on left side bar
    And I Click on 'Women' category
    And I Click on any category link under 'Women' category, for example: Dress
    Then I Verify that category page is displayed and confirm text 'WOMEN - DRESS PRODUCTS'
    And I On left side bar, click on any sub-category link of 'Men' category
    Then I Verify that user is navigated to that category page


  @Test_19
  @sanity
  Scenario: User Check View and Cart Brand Products
    When I Click on Products button
    Then I Verify that the 'BRANDS' are visible on left side bar
    And I Click on any brand name 'BIBA'
    Then I Verify that user is navigated to brand page and brand products are displayed
    And I On left side bar, click on any other brand "POLO" link
    Then I Verify that user is navigated to that brand page and can see products

  @Test_21
  @smoke
  Scenario: User Check Add review on Product
    When I Click on Products button
    Then I Verify user is navigated to ALL PRODUCTS page successfully
    And I Click on View Product
    Then I Verify That 'WRITE YOUR REVIEW' is visible
    And I Enter name "John" email "johnmary@gmail.com" and review "I like it. The fabric is super soft but a little thin"
    And I Click Submit button
    Then I Verify that success message 'Thank you for your review.'
