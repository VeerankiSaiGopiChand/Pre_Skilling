Feature: Filter and Sort Products in Swag Labs

  Background:
    Given User opens the browser and navigates to Demo login page
    When User logs in with "performance_glitch_user" and "secret_sauce"
    
Scenario: Verify sorting A-Z
  When User clicks on the sort dropdown
  And User selects "Name (Z to A)" option
