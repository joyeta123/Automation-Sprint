package MbTestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resource\\MbFeatures\\PropertyServices.feature",
glue = "MbStepDefinition",
tags="@RentReceipt",
monochrome=true,
plugin={"pretty","html:target/HTMLReports/RentReports.html",
		"json:target/JSONReports/RentReports.json",
		"junit:target/JUNITReports/RentReports.xml",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class TestRunner extends AbstractTestNGCucumberTests {
	
}