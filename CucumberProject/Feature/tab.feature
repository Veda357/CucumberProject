@tag
Feature: Search for functionality test

  @tag1
  Scenario: The one where user picks different product through search functionality
    When Larry seraches below products in the search box:
    |Head  |
    |Travel|
    |Laptop|
    Then product should be added in the cart if available