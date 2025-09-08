package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BurgerMenuPage {
	WebDriver driver;

	// Locators
	By menuIcon = By.xpath("//*[@id='react-burger-menu-btn']");
	By sidebarMenu = By.xpath("//*[@class='bm-menu']");
	By aboutLink = By.xpath("//*[@id='about_sidebar_link']");
	By closeMenuIcon = By.xpath("//*[@id='react-burger-cross-btn']");
	By logoutBtn = By.id("logout_sidebar_link");

	// Constructor
	public BurgerMenuPage(WebDriver driver) {
		this.driver = driver;
	}

	// Methods
	public void clickMenuIcon() {
		driver.findElement(menuIcon).click();
	}

	public boolean isSidebarMenuDisplayed() {
		return driver.findElement(sidebarMenu).isDisplayed();
	}

	public void clickCloseMenuIcon() {
		driver.findElement(closeMenuIcon).click();
	}

	public void clickAboutLink() {
		driver.findElement(aboutLink).click();
	}

	public void clickLogout() {
		driver.findElement(logoutBtn).click();
	}
}
