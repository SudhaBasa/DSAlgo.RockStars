package dsalgo_Pageobjects;

import org.openqa.selenium.By;
import dsalgo_Utilities.Utils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import dsalgo_DriverFactory.DriverFactory;
import dsalgo_Utilities.ConfigReader;
import dsalgo_Utilities.Loggerload;
import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Alert;

public class Stack_POM {
	
	public static WebDriver driver = DriverFactory.getDriver();
	Utils eleUtil = new Utils();
		
	JavascriptExecutor jse = (JavascriptExecutor) driver;
		
	@FindBy(xpath = "//a[@href='stack']")
	WebElement stack_getstarted;
	@FindBy(xpath = "/html/body/div[2]/ul[1]/a")
	WebElement operationinstack;
	@FindBy(xpath = "//a[@href='/tryEditor']")
	WebElement tryhere_operationinstack;	
	@FindBy(xpath = "//*[@id=\"answer_form\"]/div/div/div[6]/div[1]/div/div/div/div[5]/div/pre")
	WebElement answer;
	@FindBy(xpath = "//*[@id=\"output\"]")
	WebElement output;
	@FindBy(xpath = "//*[@id=\"answer_form\"]/button")
	WebElement runbutton;
	@FindBy(xpath = "//*[@id=\"content\"]/li[2]/a")
	WebElement implemenation_stack;	
	@FindBy(xpath = "//*[@id=\"content\"]/li[3]/a")
	WebElement application_stack;	
	@FindBy (xpath="//*[@id=\"content\"]/a") WebElement Question_Stack;
    @FindBy(xpath="//textarea[@tabindex='0']") WebElement Stack_pythoninput;
	
    public Stack_POM() {

		PageFactory.initElements(driver, this);
	}

	public String getStackPageTitle() {
		String title = driver.getTitle();
		return title;
	}

	public String getAlertbox() {
		String errorMsg = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		return errorMsg;
	}
	
	public void navigatetobackbutton() {
		driver.navigate().back();
	}
	
	public void navigatetorefresh() {
		driver.navigate().refresh();
	}

	public void enterStackPythoncode (String sheetname, int rownumber) 
		throws InvalidFormatException, IOException {
		driver.navigate().refresh();
		String code = eleUtil.getCodefromExcel(sheetname, rownumber);
		eleUtil.enterCode(code,Stack_pythoninput );
	}

	public String getExpectedResult(String sheetname, Integer rownumber) 
		throws InvalidFormatException, IOException {        
		String expectedResult = eleUtil.getOutputFromExcel(sheetname, rownumber);
		return expectedResult;
	}

	public String getActualResult() {
	
		return output.getText();
	}

	public void getstarted_stack() {

		stack_getstarted.click();
	}

	public void Operation_stack() {

		operationinstack.click();
	}

	public void Tryeditor_stack() {

		tryhere_operationinstack.click();
	}
	
	public void answer_stack() {
		answer.click();
	}
			
	public void Run_stack() {
		runbutton.click();
	}

	public void Implementation_Stack() 
		
		throws InterruptedException
		{		
			
			try {
				jse.executeScript("window.scrollBy(0, -600)");
				Thread.sleep(3000);
				implemenation_stack.click();
			} catch (Exception e) {			
				e.printStackTrace();
			}
			
		
	}

	
	public void Applications_Stack() 
		    throws InterruptedException
			{		
				
				try {
					jse.executeScript("window.scrollBy(0, 500)");
					Thread.sleep(3000);
					application_stack.click();
				} catch (Exception e) {			
					e.printStackTrace();
				}
				}
	
	public void Tryeditor_Stack() 
		    throws InterruptedException
			{		
				
				try {
					jse.executeScript("window.scrollBy(0, 500)");
					Thread.sleep(3000);
					tryhere_operationinstack.click();
				} catch (Exception e) {			
					e.printStackTrace();
				}
				}
	
	
	public void practicequestion_Stack() {
		Question_Stack.click();	
	}

}



