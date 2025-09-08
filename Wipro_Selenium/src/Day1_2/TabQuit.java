package Day1_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabQuit {

    public static void main(String[] args) throws InterruptedException {
        // Create ChromeDriver instance
        WebDriver driver = new ChromeDriver();

        // Open first website in first tab
        driver.get("https://www.google.com");
        System.out.println("First Tab Title: " + driver.getTitle());
        Thread.sleep(2000);

        // Open second website in new tab
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.bing.com");
        System.out.println("Second Tab Title: " + driver.getTitle());
        Thread.sleep(2000);

        // Open third website (YouTube) in new tab
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.youtube.com");
        System.out.println("Third Tab Title: " + driver.getTitle());
        Thread.sleep(2000);

        // Close all tabs
        driver.quit();
    }
}
