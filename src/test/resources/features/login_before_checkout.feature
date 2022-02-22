@login_before_checkout
Feature: place_order_and_login_before_checkout

  Scenario: TC16_place_order_and_login_before_checkout
    Given launch browser
    And navigate to url
    And Verify that home page is visible successfully
    And Click on signup login button
    And Enter correct email_address and password
      |email_address          |password |
      |bulentsplanet@gmail.com|bt12345! |
    And Click login button
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


