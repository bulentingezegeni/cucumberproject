@user_logout
Feature: logout_user

  @logout_user
  Scenario: TC04_login_and_logout
    Given launch browser
    And navigate to url
    Then Verify that home page is visible successfully
    Then Click on signup login button
    Then Verify login to your account is visible
    And Enter correct email_address and password via excel
    And Click login button
    And user verifies that logged in
    And Click Logout button
    Then Verify login to your account is visible
