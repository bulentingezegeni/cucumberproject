@remove_from_cart
Feature: remove_products_from_cart

  Scenario: TC17_remove_products_from_cart
    Given launch browser
    And navigate to url
    And Verify that home page is visible successfully
    And Add products to cart
    And Click Cart button
    Then Verify that cart page is displayed
    And Click X button corresponding to particular product
    And Verify that product is removed from the cart
