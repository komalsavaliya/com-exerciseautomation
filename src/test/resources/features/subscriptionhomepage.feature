@regression
Feature: Subscription Home Page
  As a User I want to check Subscription Home Page

  Background:
    Given I Launch browser
    And I Navigate to url "http://automationexercise.com/"
    Then I Verify that home page is visible successfully

  @Test_10
   @sanity
  Scenario: User Check Subscription Home Page
    When I Scroll down to footer
    Then I Verify text 'SUBSCRIPTION'
    And I Enter email address "mairajenny@gmail.com"in input and click arrow button
    Then I Verify success message You have been successfully subscribed! is visible

  @Test_11
   @smoke
  Scenario: User Check Subscription Cart Page
    When I Click Cart button
    And I Scroll down to footer
    Then I Verify text 'SUBSCRIPTION'
    And I Enter email address "mairajenny@gmail.com"in input and click arrow button
    Then I Verify success message You have been successfully subscribed! is visible