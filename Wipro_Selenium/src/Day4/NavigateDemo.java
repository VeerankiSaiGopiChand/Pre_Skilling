package Day4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateDemo {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.navigate().to("https://www.google.com");
		Thread.sleep(3000);

		driver.navigate().to("https://360homedecor.uk/");
		Thread.sleep(3000);

		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(5000);

		String title = driver.getTitle();
		System.out.println("Page Title: " + title);

		String url = driver.getCurrentUrl();
		System.out.println("Current URL: " + url);

		// String pageSource = driver.getPageSource();
		// System.out.println("Page Source: " + pageSource);

		// Close browser
		driver.quit();
	}
}