Feature: End-to-End Flow for Swag Labs

Background:
  Given User opens the browser and navigates to Demo login page
  When User logs in with "performance_glitch_user" and "secret_sauce"

Scenario: Place an order successfully from login to checkout
  And User selects the product "Sauce Labs Fleece Jacket"
  And User clicks on Add to Cart button
  And User clicks on the cart icon
  Then Product "Sauce Labs Fleece Jacket" should be displayed on the cart screen
  When User enters on checkout button
  And User enters FirstName "Gopi" LastName "Chand" PostalCode "520010"
  And User clicks on continue button
  And User clicks on finish button
  Then User should see "Thank you for your order!" message
