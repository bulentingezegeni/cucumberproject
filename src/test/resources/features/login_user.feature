@login_user_correct
Feature: login_user

  @correct_credentials
  Scenario: TC02_login_user_with_correct_email_and_password
    Given launch browser
    And navigate to url
    Then Verify that home page is visible successfully
    Then Click on signup login button
    Then Verify login to your account is visible
    And Enter correct email_address and password
    |email_address          |password |
    |bulentsplanet@gmail.com|bt12345! |
    And Click login button
    And user verifies that logged in
    And user clicks delete account button
    Then user verifies that acount deleted

