@product_details
Feature: product_details

  @verify_product_details
  Scenario: TC08_verify_all_products_and_product_detail_page
    Given launch browser
    And navigate to url
    Then Verify that home page is visible successfully
    And Click on Products button
    Then Verify user is navigated to ALL PRODUCTS page successfully
    And The products list is visible
    And Click on View Product of first product
    Then User is landed to product detail page
    Then Verify that detail is visible: product name, category, price, availability, condition, brand