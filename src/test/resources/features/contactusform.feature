@regression
Feature: Contact Us Form Page
  As a User I want to check Contact Us Form Page

  Background:
    Given I Launch browser
    And I Navigate to url "http://automationexercise.com/"
    Then I Verify that home page is visible successfully

  @Test_6
  @sanity
  Scenario: User Check Contact Us Form Page
    When I Click on 'Contact Us' button
    Then I Verify GET IN TOUCH is visible
    And I Enter name "John" email "johnmary@gmail.com" subject "General" and message "So Many Advertise"
    And I  Upload file "C:\Users\komal\IdeaProjects\com-exerciseautomation\src\info.txt"
    And I  Click 'Submit' button
    And I  Click OK button
    Then I Verify success message 'Success! Your details have been submitted successfully.' is visible
    And I Click Home button
    Then I verify that landed to home page successfully