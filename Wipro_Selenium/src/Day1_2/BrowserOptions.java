package Day1_2;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserOptions {

	public static void main(String[] args) {

		// Create ChromeOptions object
		ChromeOptions options = new ChromeOptions();

		// Add arguments (example: maximize window)
		options.addArguments("--start-maximized");

		// Launch Chrome with options
		WebDriver driver = new ChromeDriver(options);

		// Get capabilities to fetch browser name and version
		Capabilities caps = ((RemoteWebDriver) driver).getCapabilities();
		String browserName = caps.getBrowserName();
		String browserVersion = caps.getBrowserVersion();

		System.out.println("Browser Name: " + browserName);
		System.out.println("Browser Version: " + browserVersion);

		driver.get("https://www.google.com");
		System.out.println("Page Title: " + driver.getTitle());

		driver.quit();
	}
}
