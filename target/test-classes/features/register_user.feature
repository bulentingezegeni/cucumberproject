@register_user
Feature: register_user

  @first_scenario
  Scenario: TC01_register_user
    Given launch browser
    And navigate to url
    Then Verify that home page is visible successfully
    Then Click on signup login button
    Then Verify new user signup is visible

  @second_scenario
  Scenario: TC01_register_user
    When Enter name and email address
    And Click Signup button
    And Verify that ENTER ACCOUNT INFORMATION is visible
    And Fill details: Title, Name, Email, Password, Date of birth
    And Select checkbox Sign up for our newsletter!
    And Select checkbox Receive special offers from our partners!
    And Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
    And Click Create Account button
    Then user verifies that acount is created
    When user clicks continue button
    And user verifies that logged in
    And user clicks delete account button
    Then user verifies that acount deleted










