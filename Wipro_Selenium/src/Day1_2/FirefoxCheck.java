package Day1_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxCheck {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\gopic\\Downloads\\geckodriver-v0.36.0-win64\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.google.com");
		System.out.println("First Tab Title: " + driver.getTitle());
		Thread.sleep(2000);

		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.bing.com");
		System.out.println("Second Tab Title: " + driver.getTitle());
		Thread.sleep(2000);

		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.youtube.com");
		System.out.println("Third Tab Title: " + driver.getTitle());
		Thread.sleep(2000);

		driver.quit();
	}
}
