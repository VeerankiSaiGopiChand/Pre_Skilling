package Day3;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		Properties props = new Properties();
		WebDriver driver = null;
		try {
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\gopic\\eclipse-workspace\\Selenium_auto\\src\\Day3\\FB.Properties");
			props.load(fis);
			String username = props.getProperty("facebook.username");
			String password = props.getProperty("facebook.password");
			// String chromeDriverPath = props.getProperty(
			// "C:\\Users\\91938\\OneDrive\\Desktop\\SeleniumDemo\\chromedriver-win64\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();

			driver.get("https://www.facebook.com/login.php/");
			Thread.sleep(3000);

			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(username);
			driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(password);
			driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
			Thread.sleep(5000);

			System.out.println("Login submitted successfully!");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			driver.quit();
		}

	}

}