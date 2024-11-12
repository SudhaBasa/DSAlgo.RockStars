package dsalgo_TestRunner;

import org.junit.runner.RunWith;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import dsalgo_Hooks.Hooks;
import io.cucumber.junit.Cucumber;
import dsalgo_Utilities.ConfigReader;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/Features",
		//features= {"@target/rerun.txt"
		},
tags = "@Homepage_01",
publish=true,
glue= {"dsalgo_StepDefinition","dsalgo_Hooks"},
plugin={"pretty","html:target/CucumberReports/CucumberReport.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
"rerun:target/rerun.txt"

})



public class TestRunnerTestng extends AbstractTestNGCucumberTests{
	@Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
				
		return super.scenarios();
    }
	
	@BeforeTest
	@Parameters("browser")
	public void defineBrowser(String browser) throws Throwable {
		ConfigReader.setBrowserType(browser);
	}}
