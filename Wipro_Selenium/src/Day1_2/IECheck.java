package Day1_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IECheck {
    public static void main(String[] args) {
        
        
        // Create IE driver instance
        WebDriver driver = new InternetExplorerDriver();
        
        
        driver.manage().window().maximize();
        
        
        driver.get("https://www.google.com");
        
        
        System.out.println("Page Title: " + driver.getTitle());
        
        
        driver.quit();
    }
}
