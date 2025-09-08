package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BookAppointmentdemo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://360homedecor.uk/book-appointment");
		Thread.sleep(5000);

		WebElement brandDropdown = driver.findElement(By.id("choose_branch"));
		Select brand = new Select(brandDropdown);
		brand.selectByIndex(1);
		Thread.sleep(4000);

		WebElement styleDropdown = driver.findElement(By.id("choose_style"));
		Select style = new Select(styleDropdown);
		style.selectByIndex(3);
		Thread.sleep(4000);

		driver.findElement(By.id("first_name")).sendKeys("Gopi");
		Thread.sleep(2000);
		driver.findElement(By.id("last_name")).sendKeys("Chand");
		Thread.sleep(2000);
		driver.findElement(By.id("apt_city")).sendKeys("Vijayawada");
		Thread.sleep(2000);
		driver.findElement(By.id("phone_number")).sendKeys("9876543210");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("gopi@example.com");
		Thread.sleep(4000);

		WebElement fileUpload = driver.findElement(By.cssSelector("#layoutFiles"));
		fileUpload.sendKeys("C:\\Users\\gopic\\OneDrive\\Pictures\\Screenshots\\Screenshot 2025-08-16 155753.png");
		Thread.sleep(4000);

		WebElement privacyCheckbox = driver.findElement(By.cssSelector("#privacyPolicy"));
		if (!privacyCheckbox.isSelected()) {
			privacyCheckbox.click();
		}

		Thread.sleep(4000);

		driver.findElement(By.cssSelector("#appointment_form button[type='submit']")).click();

		System.out.println("Appointment form submitted successfully!");

		Thread.sleep(7000);
		driver.quit();
	}
}
