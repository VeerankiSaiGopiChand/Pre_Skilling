package BasicTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {

	public static void main(String[] args) {

		// Set ChromeDriver path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gopic\\chromedriver-win64\\chromedriver.exe");

		// Create ChromeDriver instance
		WebDriver driver = new ChromeDriver();

		// Open Google
		driver.get("https://www.google.com");

		// Print title
		System.out.println("Page Title: " + driver.getTitle());

		// Close browser
		driver.quit();
	}
}
