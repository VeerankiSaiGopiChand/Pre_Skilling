Feature: Sidebar functionality in Swag Labs

  Background:
    Given User opens the browser and navigates to Demo login page
      When User logs in with "performance_glitch_user" and "secret_sauce"
    

  Scenario: Verify menu opens correctly
    When User clicks on the menu icon
    Then Sidebar menu should be displayed
    And User clicks on the close menu icon

  Scenario: Verify About link in sidebar
    When User clicks on the menu icon
    And User clicks on the About link
    Then User should be redirected to the Sauce Labs site
