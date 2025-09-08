Feature:  Logout functionality in Swag Labs
  Background:
    Given User opens the browser and navigates to Demo login page
    

  Scenario: Verify logout using menu option
  When User logs in with "performance_glitch_user" and "secret_sauce"
    When User clicks on the menu icon
    And User clicks on logout button