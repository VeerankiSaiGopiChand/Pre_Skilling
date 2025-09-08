package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FooterLinksPage {

   WebDriver driver;

    // Locators for footer social icons
     By twitterLink = By.cssSelector("a[href='https://twitter.com/saucelabs']");
     By facebookLink = By.cssSelector("a[href='https://www.facebook.com/saucelabs']");
     By linkedInLink = By.cssSelector("a[href='https://www.linkedin.com/company/sauce-labs/']");

    public FooterLinksPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickTwitter() {
        driver.findElement(twitterLink).click();
    }

    public void clickFacebook() {
        driver.findElement(facebookLink).click();
    }

    public void clickLinkedIn() {
        driver.findElement(linkedInLink).click();
    }
}
