package Day3;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonCart {
	public static void main(String[] args) throws IOException, InterruptedException {
		Properties props = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\gopic\\eclipse-workspace\\Selenium_auto\\src\\Day3\\Amazon.properties");
		props.load(fis);
		String email = props.getProperty("amazon.email");
		String password = props.getProperty("amazon.password");
		String searchItem = props.getProperty("searchItem");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in");
		driver.findElement(By.id("nav-link-accountList")).click();
		driver.findElement(By.id("ap_email_login")).sendKeys(email);
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys(password);
		driver.findElement(By.id("signInSubmit")).click();

		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys(searchItem);
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.cssSelector("#a-autoid-3-announce")).click();

		driver.findElement(By.cssSelector("#s-search-add-to-cart-action")).click();

		driver.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(5000);

		driver.quit();
	}

}
