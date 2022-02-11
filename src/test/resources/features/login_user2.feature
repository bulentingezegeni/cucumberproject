@login_user2_correct
Feature: Login user

  @correct2_credentials
  Scenario Outline: TC02_login_user_with_correct_email_and_password
    Given launch browser
    And navigate to url
    Then Verify that home page is visible successfully
    Then Click on signup login button
    Then Verify login to your account is visible
    And Enter correct "<email_address>" and "<password>"
    And Click login button
    And user verifies that logged in
    And user clicks delete account button
    Then user verifies that acount deleted

    Examples:
      |email_address          |password |
      |bulentsplanet@gmail.com|bt12345! |