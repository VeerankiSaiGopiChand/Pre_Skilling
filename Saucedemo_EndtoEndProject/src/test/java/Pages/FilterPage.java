package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FilterPage {
	
     WebDriver driver;

    // Locators
     By sortDropdown = By.xpath("//*[@id='header_container']/div[2]/div/span/select");
     By optionNameZToA = By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[2]");
     
     public FilterPage(WebDriver driver) {
         this.driver = driver;
     }

     public void clickSortDropdown() {
         driver.findElement(sortDropdown).click();
     }

     public void selectSortAToZ() {
         driver.findElement(optionNameZToA).click();
     }
}
