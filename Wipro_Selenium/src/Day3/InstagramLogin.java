package Day3;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin {

	public static void main(String[] args) {
		Properties props = new Properties();
		WebDriver driver = null;
		try {
			// Load properties file
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\gopic\\eclipse-workspace\\Selenium_auto\\src\\Day3\\Instagram.Properties");
			props.load(fis);

			String username = props.getProperty("instagram.username");
			String password = props.getProperty("instagram.password");

	
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();

	
			driver.get("https://www.instagram.com/accounts/login/");
			Thread.sleep(4000);

			
			driver.findElement(By.name("username")).sendKeys(username);

			
			driver.findElement(By.name("password")).sendKeys(password);

		
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(5000);

			System.out.println("Instagram login submitted successfully!");
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
