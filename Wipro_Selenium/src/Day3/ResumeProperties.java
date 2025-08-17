package Day3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResumeProperties {
	public static void main(String[] args) throws IOException, InterruptedException {

		Properties props = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\gopic\\eclipse-workspace\\Selenium_auto\\src\\Day3\\config7.properties");
		props.load(fis);

		String email = props.getProperty("naukri.email");
		String password = props.getProperty("naukri.password");
		String resumePath = props.getProperty("resume.path");
		String chromeDriverPath = props.getProperty("chromedriver.path");

		System.setProperty("webdriver.chrome.driver", chromeDriverPath);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		try {

			driver.get("https://www.naukri.com/nlogin/login");

			driver.findElement(By.id("usernameField")).sendKeys(email);
			driver.findElement(By.id("passwordField")).sendKeys(password);
			driver.findElement(By.xpath("//button[text()='Login']")).click();

			Thread.sleep(5000);

			driver.get("https://www.naukri.com/mnjuser/profile");

			Thread.sleep(5000);

			File uploadFile = new File(resumePath);
			WebElement fileInput = driver.findElement(By.id("attachCV"));
			fileInput.sendKeys(uploadFile.getAbsolutePath());

			Thread.sleep(5000);

			System.out.println("Resume uploaded successfully");

		} finally {
			driver.quit();
		}
	}
}
