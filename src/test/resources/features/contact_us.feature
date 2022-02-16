@contact_us
Feature: contact_us

  @contact_us_scenario
  Scenario: TC06_contact_us_form
    Given launch browser
    And navigate to url
    And Verify that home page is visible successfully
    And Click on Contact Us button
    Then Verify GET IN TOUCH is visible
    And Enter name, email, subject and message
    And Upload file
    And Click Submit button
    And Click OK button
    Then Verify success message Success! Your details have been submitted successfully. is visible
    And Click Home button and verify that landed to home page successfully

