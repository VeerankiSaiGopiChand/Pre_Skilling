package StepsDefinition;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Pages.FooterLinksPage;
import Utils.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FooterLinksSteps {
	

   WebDriver driver = Base.getBrowser();
    FooterLinksPage footerLinksPage = new FooterLinksPage(driver);
    
    

    @Then("A new tab should open with URL containing {string}")
    public void a_new_tab_should_open_with_url_containing(String expectedUrlPart) {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1)); // Switch to new tab
        String actualUrl = driver.getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrlPart), "URL does not contain expected value");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.close(); // Close new tab
        driver.switchTo().window(tabs.get(0)); // Switch back to main tab
    }
    
    
    @When("User clicks on Facebook link in the footer")
    public void user_clicks_on_facebook_link_in_the_footer() {
    	try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        footerLinksPage.clickFacebook();
    }

    @When("User clicks on LinkedIn link in the footer")
    public void user_clicks_on_linkedin_link_in_the_footer() {
    	try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        footerLinksPage.clickLinkedIn();
    }
    @When("User clicks on Twitter link in the footer")
    public void user_clicks_on_twitter_link_in_the_footer() {
    	try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        footerLinksPage.clickTwitter();
    }

}
