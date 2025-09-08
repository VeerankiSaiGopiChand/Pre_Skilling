Feature: Verify footer social media links on SauceDemo Inventory Page

  Background:
    Given User opens the browser and navigates to Demo login page
    When User logs in with "standard_user" and "secret_sauce"
  

  @FooterLinks
  Scenario: Verify Facebook footer link
    When User clicks on Facebook link in the footer
    Then A new tab should open with URL containing "facebook.com/saucelabs"

  @FooterLinks
  Scenario: Verify LinkedIn footer link
    When User clicks on LinkedIn link in the footer
    Then A new tab should open with URL containing "linkedin.com/company/sauce-labs"
    
  @FooterLinks
  Scenario: Verify Twitter footer link
    When User clicks on Twitter link in the footer
    Then A new tab should open with URL containing "x.com/saucelabs"
