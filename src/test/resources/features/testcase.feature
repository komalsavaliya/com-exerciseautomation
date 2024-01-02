@regression
Feature:Test Cases Page
  As a User I want to check Test Cases Page

  Background:
    Given I Launch browser
    And I Navigate to url "http://automationexercise.com/"
    Then I Verify that home page is visible successfully

  @Test_7
  @sanity
  Scenario:Verify Test Cases Page
    When I Click on Test Cases button
    And I Verify user is navigated to test cases page successfully