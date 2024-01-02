@regression
Feature: Scroll Up & Down Functionality
  As a User I want to verify Scroll Up & Down Functionality

  Background:
    Given I Launch browser
    And I Navigate to url "http://automationexercise.com/"
    Then I Verify that home page is visible successfully

  @Test_25
 @smoke
  Scenario: User Verify Scroll Up & Down Functionality
    When I Scroll down to footer
    Then  I Verify text 'SUBSCRIPTION'
    And I click on arrow up button at bottom right corner
    And I Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen

  @Test_26
  @sanity
  Scenario: User Verify Scroll Up Without Arrow button and Scroll Down Functionality
    When I Scroll down to footer
    Then  I Verify text 'SUBSCRIPTION'
    And I Scroll up page to top
    And I Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen