package Day4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleUrl {

	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\gopic\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.selenium.dev//documentation/webdriver/interactions/print_page");

		String title = driver.getTitle();
		System.out.println("Page Title: " + title);

		String url = driver.getCurrentUrl();
		System.out.println("Current URL: " + url);

		driver.quit();

	}

}
