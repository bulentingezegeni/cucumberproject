@register_before_checkout
Feature: place_order_register_before_checkout

  Scenario: TC15_place_order_register_before_checkout
    Given launch browser
    And navigate to url
    Then Verify that home page is visible successfully
    And Click on signup login button

  Scenario: Fill_all_details_in_Signup_and_create_account
    Given Enter name and email address
    And Click Signup button
    Then Verify that ENTER ACCOUNT INFORMATION is visible
    And Fill details: Title, Name, Email, Password, Date of birth
    And Select checkbox Sign up for our newsletter!
    And Select checkbox Receive special offers from our partners!
    And Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
    And Click Create Account button

  Scenario: register_before_checkout_test_continues
    Given user verifies that acount is created
    And user clicks continue button
    And user verifies that logged in
    And Add products to cart
    And Click Cart button
    Then Verify that cart page is displayed
    And Click Proceed To Checkout
    And Verify Address Details and Review Your Order
    And Enter description in comment text area and click Place Order
    And Enter payment details: Name on Card, Card Number, CVC, Expiration date
    And Click Pay and Confirm Order button
    Then Verify success message Your order has been placed successfully!
    And user clicks delete account button
    Then user verifies that acount deleted






