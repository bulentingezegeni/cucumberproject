@excel_negative
  Feature: excel_login_negative

    @login_user_excel_negative
    Scenario: TC03_login_user_with_correct_email_and_password
      Given launch browser
      And navigate to url
      Then Verify that home page is visible successfully
      Then Click on signup login button
      Then Verify login to your account is visible
      And Enter wrong email_address and password via excel
      And Click login button
      Then user verifies that invalid Login Text is visible
