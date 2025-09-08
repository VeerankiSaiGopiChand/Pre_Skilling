package StepsDefinition;

import Pages.AddToCartPage;
import Pages.LoginPage;
import Utils.Base;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AddToCartSteps {
	WebDriver driver = Base.getBrowser();
	LoginPage loginPage = new LoginPage(driver);
	AddToCartPage homePage = new AddToCartPage(driver);

	@When("User logs in with {string} and {string}")
	public void user_logs_in_with(String username, String password) {
//		loginPage.enterUsername(username);
//		loginPage.enterPassword(password);
		loginPage.login(username, password);
	}

	@When("User selects the product {string}")
	public void user_selects_product(String productName) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		homePage.selectProduct(productName);
	}

	@When("User clicks on Add to Cart button")
	public void user_clicks_add_to_cart() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		homePage.clickAddToCart();
	}

	@Then("Cart icon should show {string}")
	public void cart_icon_should_show(String count) {
		String badgeicon = driver.findElement(By.className("shopping_cart_badge")).getText();
		Assert.assertEquals(badgeicon, count, "Cart count mismatch!");
	}
}
