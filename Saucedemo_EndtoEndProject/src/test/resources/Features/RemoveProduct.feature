  
  Feature: Cart functionality - Remove products

  Background:
    Given User opens the browser and navigates to Demo login page
    When User logs in with "performance_glitch_user" and "secret_sauce"
    
    Scenario: Remove product from cart (cart page)
    When User selects the product "Sauce Labs Fleece Jacket"
    And User clicks on Add to Cart button
    And User clicks on the cart icon
    And User clicks on Remove button for "Sauce Labs Fleece Jacket"
    