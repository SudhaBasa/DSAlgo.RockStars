package dsalgo_TestRunner;

import org.junit.runner.RunWith;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import dsalgo_Hooks.Hooks;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/Features"},
//tags = "@TS_Queue_03",
publish=true,
glue= {"dsalgo_StepDefinition","dsalgo_Hooks"},
plugin={"pretty","html:target/CucumberReports/CucumberReport.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"})



public class TestRunnerTestng extends AbstractTestNGCucumberTests{
	@Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
				
		return super.scenarios();
    }
//	@Parameters("browser")
//	@BeforeTest
//	public void beforeTest(String browser) {
//		Hooks.setBrowser(browser);
//	}

}
