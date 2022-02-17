@test_cases_page
Feature: test_cases_page

  @verify_test_cases_page
  Scenario: TC07_verify_test_cases_page
    Given launch browser
    And navigate to url
    Then Verify that home page is visible successfully
    And Click on Test Cases button
    Then Verify user is navigated to test cases page successfully
