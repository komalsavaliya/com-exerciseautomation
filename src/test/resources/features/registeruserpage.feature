@regression
Feature: Register User Page
  As a User I want to check Register User Page

  Background:
    Given I Launch browser
    And I Navigate to url "http://automationexercise.com/"
    Then I Verify that home page is visible successfully


  @Test_1
  @sanity
  Scenario: Verify That a User Should register Successfully
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
    And I Verify that Logged in as username is visible
    And I click  'Delete Account' button
    Then I Verify that ACCOUNT DELETED! is visible
    And I Click On 'Continue' button

  @Test_5
  @smoke
  Scenario: Verify that User Register with existing email
    When Click on 'Signup /Login' button
    Then Verify 'New User Signup!' is visible
    And I Enter name "John" and email address "jjm@gmail.com"
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
    And I click on LogOut Button
    And Verify 'New User Signup!' is visible
    And I Enter name "John" and email address "jjm@gmail.com"
    And I Click 'Signup' button
    Then I Verify error 'Email Address already exist!' is visible

