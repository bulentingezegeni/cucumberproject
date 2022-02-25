@verify_cart_after_login
Feature: verify_cart_after_login

  Scenario: TC20_search_products_and_verify_cart_after_login
    Given launch browser
    And navigate to url
    And Click on Products button
    Then Verify user is navigated to ALL PRODUCTS page successfully
    And Enter product name in search input and click search button
    Then Verify SEARCHED PRODUCTS is visible
    Then Verify all the products related to search are visible
    And Add products to cart
    And Click Cart button and verify that products are visible in cart
    And Click Signup Login button and submit login details
    And Again, go to Cart page
    Then Verify that those products are visible in cart after login as well




