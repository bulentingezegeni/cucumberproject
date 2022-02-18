Feature: verify_quantity

  @verify_quantity
  Scenario: TC13_verify_product_quantity_in_chart
    Given launch browser
    And navigate to url
    Then Verify that home page is visible successfully
    And Click on View Product of first product
    Then User is landed to product detail page
    And Increase quantity to "4"
    And Click Add to cart button
    And Click View Cart button
    Then Verify that product is displayed in cart page with "4" exact quantity