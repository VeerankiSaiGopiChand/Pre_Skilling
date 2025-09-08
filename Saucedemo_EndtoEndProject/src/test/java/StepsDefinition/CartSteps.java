package StepsDefinition;

import Pages.CartPage;
//import Pages.LoginPage;
import Utils.Base;
import io.cucumber.java.en.*;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CartSteps {

	WebDriver driver = Base.getBrowser();
	//LoginPage loginPage = new LoginPage(driver);
	CartPage cartPage = new CartPage(driver);

	@And("User clicks on Remove button for {string}")
	public void userClicksOnRemoveButton(String productName) {
		//check if product matches
//		String nameInCart = cartPage.getCartItemName();
//		Assert.assertEquals(nameInCart, productName, "Product in cart does not match expected");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		cartPage.removeProduct();
	}

	@When("User clicks on the cart icon")
	public void user_clicks_on_cart_icon() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		cartPage = new CartPage(driver);
		cartPage.clickCartIcon();
	}

	@Then("Product {string} should be displayed on the cart screen")
	public void product_should_be_displayed_in_cart(String expectedProduct) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String actualProduct = cartPage.getCartItemName();
		Assert.assertEquals(actualProduct, expectedProduct, "Product mismatch in cart!");
	}

}
