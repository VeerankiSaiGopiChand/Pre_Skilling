package StepsDefinition;

import org.testng.Assert;

import com.aventstack.extentreports.Status;

import Hooks.Hooks;
import Pages.BurgerMenuPage;
import Utils.Base;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BurgerMenuSteps {

	WebDriver driver = Base.getBrowser();
	BurgerMenuPage burgerMenuPage = new BurgerMenuPage(driver);

	@When("User clicks on the menu icon")
	public void userClicksOnTheMenuIcon() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		burgerMenuPage.clickMenuIcon();
	}

	@Then("Sidebar menu should be displayed")
	public void sidebarMenuShouldBeDisplayed() {
		Assert.assertTrue(burgerMenuPage.isSidebarMenuDisplayed(), "Sidebar menu is not displayed");
	}

	@And("User clicks on the close menu icon")
	public void userClicksOnTheCloseMenuIcon() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		burgerMenuPage.clickCloseMenuIcon();
	}

	@And("User clicks on the About link")
	public void userClicksOnTheAboutLink() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		burgerMenuPage.clickAboutLink();
	}

	@And("User clicks on logout button")
	public void userClicksOnLogoutButton() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Hooks.getScenarioTest().log(Status.INFO, "User clicked on logout button");
		burgerMenuPage.clickLogout();
		// Hooks.log(Status.INFO, "User clicked on logout button");

	}

	@Then("User should be redirected to the Sauce Labs site")
	public void userShouldBeRedirectedToSauceLabsSite() {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue(currentUrl.contains("saucelabs.com"), "User is not redirected to Sauce Labs site");
	}

}
