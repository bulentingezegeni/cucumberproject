@category_products
Feature: view_category_products

  Scenario: TC18_view_category_products
    Given launch browser
    And navigate to url
    Then Verify that categories are visible on left side bar
    And Click on Women category
    And Click on any category link under Women category, for example: Dress
    Then Verify that category page is displayed and confirm text WOMEN - DRESS PRODUCTS
    And On left side bar, click on any sub-category link of Men category
    Then Verify that user is navigated to that category page

