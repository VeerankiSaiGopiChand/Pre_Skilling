package Day3;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResumeUpload {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gopic\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		try {

			driver.get("https://www.naukri.com/nlogin/login");

			driver.findElement(By.id("usernameField")).sendKeys("gopiexample@gmail.com");
			driver.findElement(By.id("passwordField")).sendKeys("Password");
			driver.findElement(By.xpath("//button[text()='Login']")).click();

			Thread.sleep(5000);

			driver.get("https://www.naukri.com/mnjuser/profile");

			Thread.sleep(3000);

			File uploadFile = new File("C:\\Users\\gopic\\Downloads\\Techademy_security_asssesment.pdf");

			WebElement fileInput = driver.findElement(By.id("attachCV"));
			fileInput.sendKeys(uploadFile.getAbsolutePath());

			Thread.sleep(5000);

			System.out.println("Resume uploaded succesfully");

		} finally {
			driver.quit();
		}
	}
}
