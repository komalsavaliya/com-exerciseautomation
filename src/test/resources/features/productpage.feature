@regression
Feature:Product Page
  As a User I want to check Product Page

  Background:
    Given I Launch browser
    And I Navigate to url "http://automationexercise.com/"
    Then I Verify that home page is visible successfully

  @Test_8
  @sanity
  Scenario:Verify search Product Page
    When I Click on Products button
    Then I Verify user is navigated to ALL PRODUCTS page successfully
    And I The products list is visible
    And I Click on View Product
    And I User is landed to product detail page
    And I Verify that detail detail is visible: product name, category, price, availability, condition, brand
