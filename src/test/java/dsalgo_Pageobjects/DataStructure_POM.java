package dsalgo_Pageobjects;

import org.openqa.selenium.By;


import dsalgo_Utilities.Utils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsalgo_Pageobjects.Login_POM;
//import venidriverfactory.VeniDriverFactory;
import dsalgo_DriverFactory.DriverFactory;
import dsalgo_Utilities.ConfigReader;
import dsalgo_Utilities.Loggerload;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Alert;


public class DataStructure_POM {
	
	public static WebDriver driver = DriverFactory.getDriver();
	Utils eleUtil = new Utils();
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	Actions actions = new Actions(driver);
	
	
	@FindBy(xpath = "/html/body/div[3]/div[1]/div/div/a")WebElement dsIntrolink;
	@FindBy(xpath = "/html/body/div[2]/ul/a")WebElement dstimecomplexity;
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/a")WebElement dstryeditor;
	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/a")WebElement dspracticequestion;
	@FindBy(xpath = "//*[@id=\"answer_form\"]/button")WebElement dsrunbutton;
	@FindBy(xpath = "//*[@id=\"answer_form\"]/div/div/div[6]/div[1]/div/div/div/div[5]/div/pre")WebElement dstryEditoranswer;
	@FindBy(xpath = "//*[@id='id_username']")static WebElement user;
	@FindBy(xpath = "//*[@id='id_password']")static WebElement pwd;
	@FindBy(xpath = "//*[@value='Login']")WebElement login_button;
	@FindBy(xpath = "/html/body/div[1]/div/div/a/button")WebElement getstarted;
    @FindBy (xpath="//*[@id=\"answer_form\"]/div/div/div[1]/textarea")WebElement pythoninput;
    @FindBy (xpath= "//*[@id=\"output\"]")WebElement output;
    
	public DataStructure_POM() {

		PageFactory.initElements(driver, this);
	}

	public void dsalgo_loginpage() {

		driver.get("https://dsportalapp.herokuapp.com/login");
	}

	public void Login(String username, String password) {

		user.clear();
		user.sendKeys("Rockstars_Numpy");
		pwd.clear();
		pwd.sendKeys("Numpy@Rock123");
	}
	
	public String getPageTitle() {
		String title = driver.getTitle();
		return title;
	}

	public void login_button() {

		login_button.click();
	}

	public void DS_getstarted() {

		dsIntrolink.click();
	}

	public void ds_timecomplexity() {

		dstimecomplexity.click();
	}

	public void ds_tryeditor() {

		dstryeditor.click();
	}


	public void ds_tryeditoranswer() {

		dstryEditoranswer.click();
		
	}	
	public void enterPythonCode(String sheetname, int rownumber) 
			throws InvalidFormatException, IOException {
		driver.navigate().refresh();
		String code = eleUtil.getCodefromExcel(sheetname, rownumber);
		eleUtil.enterCode(code, pythoninput);

	}
	public void ds_run() {

		dsrunbutton.click();
	}
	
	public String getExpectedResult(String sheetname, Integer rownumber) 
		throws InvalidFormatException, IOException {
		String expectedResult = eleUtil.getOutputFromExcel(sheetname, rownumber);
		return expectedResult;
	}
	public String getActualResult() {
		eleUtil.waitForElement(output);
		return output.getText();
	}
	public String getAlertbox() {
		String errorMsg = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		return errorMsg;
	}
	public void dsalgo_Timecomplexitypage() 
	
		
		throws InterruptedException
		{		
			
			try {
				jse.executeScript("window.scrollBy(0, 600)");
				Thread.sleep(3000);
				dstimecomplexity.click();
			} catch (Exception e) {			
				e.printStackTrace();
			}
			}
	
	public void navigatetobackbutton() {
		driver.navigate().back();
	}
	
	public void ds_practicequestion() 
			throws InterruptedException
	{		
		
		try {
			jse.executeScript("window.scrollBy(0, -600)");
			Thread.sleep(3000);
			dspracticequestion.click();
		} catch (Exception e) {			
			e.printStackTrace();
		}
		

		
	}

}




