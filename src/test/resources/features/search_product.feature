@search_product
  Feature: search_product

    @verify_product_search
    Scenario Outline: TC09_search_product
      Given launch browser
      And navigate to url
      Then Verify that home page is visible successfully
      And Click on Products button
      Then Verify user is navigated to ALL PRODUCTS page successfully
      And Enter product name as "<product_name>" in search input and click search button
      Then Verify SEARCHED PRODUCTS is visible
      Then Verify all the products as "<searched_product>" related to search are visible

      Examples: searched_product_list
      |product_name|searched_product|
      |Tshirt      |Tshirt          |
      |Jeans       |Jeans           |
      |Dress       |Dress           |
      |Top         |Top             |
      |Shirt       |Shirt           |
      |Short       |Short           |

