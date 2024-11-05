package dsalgo_Hooks;

import java.time.Duration;

import java.util.Properties;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import dsalgo_DriverFactory.DriverFactory;
import dsalgo_Utilities.Loggerload;
import dsalgo_Utilities.ConfigReader;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;


public class Hooks {
	public static WebDriver driver;

	@Before
	public void setup() {
		DriverFactory.initializeBrowser(ConfigReader.getProperty("browser"));
		driver = DriverFactory.getDriver();

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@Before
	public void scenario(Scenario scenario) {
		Loggerload.info("===============================================================================================");
		Loggerload.info(scenario.getSourceTagNames() +" : "+scenario.getName());
		Loggerload.info("-----------------------------------------------------------------------------------------------");
		
	}
	


	@After
	public void tearDown(Scenario scenario) throws InterruptedException {
		Loggerload.error("Scenario is Failed and taking Screenshot");
		String scenarioName=scenario.getName().replaceAll(" ", "_");
		
		if(scenario.isFailed()) {
			byte[] screenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenShot, "image/png", scenarioName);
		}
		
		
		
		
		Thread.sleep(3000);
		driver.quit();

	}

}
