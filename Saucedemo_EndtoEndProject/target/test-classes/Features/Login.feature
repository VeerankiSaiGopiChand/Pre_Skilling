Feature: login functionality

  Scenario Outline: login Successfully
    Given User opens the browser and navigates to Demo login page
    When User enters username "<username>"
    And  User enters password "<password>"
    And User clicks on login button

  Examples:
    | username      | password      |
    | performance_glitch_user | secret_sauce  |
  
    
    
