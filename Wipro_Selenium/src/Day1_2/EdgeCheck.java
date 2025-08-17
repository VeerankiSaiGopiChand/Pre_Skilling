package Day1_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeCheck {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver", "C:\\Users\\gopic\\Downloads\\edgedriver_win64\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();

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
