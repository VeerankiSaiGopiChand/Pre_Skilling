package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCartPage {
	WebDriver driver;

	// Locators
//	By jacketTitle = By.id("item_5_title_link");
	By addToCartBtn = By.id("add-to-cart");

	// constructor
	public AddToCartPage(WebDriver driver) {
		this.driver = driver;
	}

	// methods
	public void clickAddToCart() {
		driver.findElement(addToCartBtn).click();
	}

	public void selectProduct(String productName) {
		driver.findElement(By.xpath("//div[text()='" + productName + "']")).click();
	}
}
