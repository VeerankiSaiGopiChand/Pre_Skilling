Feature: Cart functionality - Add products

  Background:
    Given User opens the browser and navigates to Demo login page
    When User logs in with "performance_glitch_user" and "secret_sauce"

  Scenario: Add a jacket to the cart and verify cart count
    When User selects the product "Sauce Labs Fleece Jacket"
    And User clicks on Add to Cart button
    Then Cart icon should show "1"


