package TestRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/Features/AddToCart.feature", glue = { "StepsDefinition",
		"Hooks" }, plugin = { "pretty", "html:target/cucumber-report.html",
				"json:target/cucumber-report.json" }, monochrome = false)
public class RunCucumberTests extends AbstractTestNGCucumberTests {

}
