@regression
Feature: Login User Page
  As a User I want to check Login User Page

  Background:
    Given I Launch browser
    And I Navigate to url "http://automationexercise.com/"
    Then I Verify that home page is visible successfully


  @Test_2
  @smoke
  Scenario: User Login with correct email password
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
    And I click  'Delete Account' button
    Then I Verify that ACCOUNT DELETED! is visible

  @Test_3
  @sanity
  Scenario: User Login with incorrect email and password
    When Click on 'Signup /Login' button
    Then I Verify 'Login to your account' is visible
    And I Enter incorrect email address "mariajerry@gmail.com" and password "123456"
    And I Click login button
    Then I Verify error Your email or password is incorrect! is visible

  @Test_4
  @smoke
    Scenario: User is LogOut
    When Click on 'Signup /Login' button
    Then Verify 'New User Signup!' is visible
    And I Enter name "John" and email address "maryjohn@gmail.com"
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
    And I Enter correct email address"maryjohn@gmail.com" and password "123456"
    And I Click login button
    And I Verify that Logged in as username is visible
    And I click on LogOut Button
    Then I Verify that user is navigated to login page






