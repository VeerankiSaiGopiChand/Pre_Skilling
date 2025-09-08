package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Utils.ExtentReportManager;
import Utils.Base;

import org.openqa.selenium.WebDriver;

public class Hooks {

    private static ExtentReports extent = ExtentReportManager.getReporter();
    private static ExtentTest test;
    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    @Before
    public void beforeScenario(Scenario scenario) {
        test = extent.createTest(scenario.getName());
        driver = Base.getBrowser();
        test.log(Status.INFO, "Browser launched for scenario: " + scenario.getName());
    }

    @After
    public void afterScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            test.log(Status.FAIL, "Scenario Failed: " + scenario.getName());
        } else {
            test.log(Status.PASS, "Scenario Passed: " + scenario.getName());
        }

        Base.quitDriver();
        extent.flush();
    }

    public static ExtentTest getScenarioTest() {
        return test;
    }
}
