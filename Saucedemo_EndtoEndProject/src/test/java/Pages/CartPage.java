package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    WebDriver driver;

    // Locators
    By cartIcon = By.className("shopping_cart_link");
    By cartItemName = By.className("inventory_item_name");
    By removeBtn = By.xpath("//button[contains(text(),'Remove')]");

    // Constructor
    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    // Methods
    public void removeProduct() {
        driver.findElement(removeBtn).click();
    }
    
    public void clickCartIcon() {
        driver.findElement(cartIcon).click();
    }

    public String getCartItemName() {
        return driver.findElement(cartItemName).getText();
    }
}
