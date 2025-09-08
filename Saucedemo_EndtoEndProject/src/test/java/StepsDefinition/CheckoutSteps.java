package StepsDefinition;

import Pages.CheckoutPage;
import Utils.Base;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CheckoutSteps {

    WebDriver driver = Base.getBrowser();
    CheckoutPage checkoutPage = new CheckoutPage(driver);

    @When("User enters on checkout button")
    public void user_enters_on_checkout_button() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        checkoutPage.clickCheckout();
    }

    @When("User enters FirstName {string} LastName {string} PostalCode {string}")
    public void user_enters_checkout_details(String firstName, String lastName, String postalCode) {
        checkoutPage.enterCheckoutDetails(firstName, lastName, postalCode);
    }

    @When("User clicks on continue button")
    public void user_clicks_on_continue_button() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        checkoutPage.clickContinue();
    }

    @When("User clicks on finish button")
    public void user_clicks_on_finish_button() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        checkoutPage.clickFinish();
    }

    @Then("User should see {string} message")
    public void user_should_see_message(String expectedMessage) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String actualMessage = checkoutPage.getSuccessMessage();
        Assert.assertEquals(actualMessage, expectedMessage, "Checkout success message mismatch!");
        driver.quit();
    }
}
