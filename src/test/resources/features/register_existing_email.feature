@register_existing
  Feature: register_existing_email

    @register_existing
    Scenario Outline: TC05_register_with_same_email
      Given launch browser
      And navigate to url
      Then Verify that home page is visible successfully
      And Click on signup login button
      Then Verify new user signup is visible
      And Enter name and existing email address as "<email_address>"
      And Click Signup button
      Then Verify error Email Address already exist! is visible

      Examples: existing_email_adress
      |email_address          |
      |bulentsplanet@gmail.com|
