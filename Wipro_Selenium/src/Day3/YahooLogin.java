package Day3;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooLogin {

	public static void main(String[] args) {
		Properties props = new Properties();
		WebDriver driver = null;
		try {
			// Load properties file
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\gopic\\eclipse-workspace\\Selenium_auto\\src\\Day3\\Yahoo.Properties");
			props.load(fis);

			String username = props.getProperty("yahoo.username");
			String password = props.getProperty("yahoo.password");

			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();

			driver.get("https://login.yahoo.com/");
			Thread.sleep(3000);

			driver.findElement(By.id("login-username")).sendKeys(username);
			driver.findElement(By.id("login-signin")).click();
			Thread.sleep(3000);

			driver.findElement(By.id("login-passwd")).sendKeys(password);
			driver.findElement(By.id("login-signin")).click();
			Thread.sleep(5000);

			System.out.println("Yahoo login submitted successfully!");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			if (driver != null) {
				driver.quit();
			}
		}
	}
}
