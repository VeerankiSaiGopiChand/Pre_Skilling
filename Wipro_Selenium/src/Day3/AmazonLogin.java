package Day3;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLogin {
    public static void main(String[] args) throws IOException, InterruptedException {

        
        Properties props = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\gopic\\eclipse-workspace\\Selenium_auto\\src\\Day3\\Amazon.properties");
        props.load(fis);

        String email = props.getProperty("amazon.email");
        String password = props.getProperty("amazon.password");
        String chromeDriverPath = props.getProperty("chromedriver.path");

        
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);

   
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        try {
            
            driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");

            
            driver.findElement(By.id("ap_email")).sendKeys(email);
            driver.findElement(By.id("continue")).click();

            Thread.sleep(5000); 

            
            driver.findElement(By.id("ap_password")).sendKeys(password);
            driver.findElement(By.id("signInSubmit")).click();

            Thread.sleep(5000);

            System.out.println("Amazon login completed");

        } finally {
            driver.quit();
        }
    }
}
