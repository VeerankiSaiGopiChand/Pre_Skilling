package BasicTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooogleSearch {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		try {
			driver.get("https://www.google.com");
			driver.findElement(By.name("q")).sendKeys("Selenium dev");
			driver.findElement(By.name("q")).submit();

			System.out.println("Results Page Title: " + driver.getTitle());

			Thread.sleep(50000);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			driver.quit();
		}
	}
}
