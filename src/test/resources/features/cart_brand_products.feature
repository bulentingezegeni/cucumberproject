@cart_brand_products
Feature: view_cart_brand_products

  Scenario: TC19_view_cart_brand_products
    Given launch browser
    And navigate to url
    And Click on Products button
    And Verify that Brands are visible on left side bar
    And Click on any brand name
    Then Verify that user is navigated to brand page and brand products are displayed
    And On left side bar, click on any other brand link
    Then Verify that user is navigated to that brand page and can see products
