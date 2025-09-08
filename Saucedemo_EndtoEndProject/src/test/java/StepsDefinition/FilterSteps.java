package StepsDefinition;

import org.openqa.selenium.WebDriver;

import Pages.FilterPage;
import Utils.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class FilterSteps {

	WebDriver driver = Base.getBrowser();
	FilterPage filterPage = new FilterPage(driver);

	@When("User clicks on the sort dropdown")
	public void userClicksOnTheSortDropdown() {
		  try {
	            Thread.sleep(4000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		filterPage.clickSortDropdown();
	}

	@And("User selects {string} option")
	public void userSelectsOption(String option) {
		if (option.equalsIgnoreCase("Name (Z to A)")) {
			  try {
		            Thread.sleep(5000);
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
			filterPage.selectSortAToZ();
		}

	}
}
