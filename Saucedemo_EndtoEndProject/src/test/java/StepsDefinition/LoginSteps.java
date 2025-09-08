package StepsDefinition;

import Pages.LoginPage;
import Utils.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class LoginSteps {

	WebDriver driver = Base.getBrowser();
	LoginPage loginPage = new LoginPage(driver);

	@Given("User opens the browser and navigates to Demo login page")
	public void user_opens_the_browser_and_navigates_to_Demo_login_page() {
		driver = Base.getBrowser();
//		loginPage = new LoginPage(driver);
	}

	@When("User enters username {string}")
	public void user_enters_username(String username) {
		loginPage.enterUsername(username);
	}

	@When("User enters password {string}")
	public void user_enters_password(String password) {
		loginPage.enterPassword(password);
	}

	@Then("User clicks on login button")
	public void user_clicks_on_login_button() {
		loginPage.clickLogin();
	}
}





















