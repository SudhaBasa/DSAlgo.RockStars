package dsalgo_Pageobjects;

import org.openqa.selenium.By;

import dsalgo_Utilities.Utils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import venidriverfactory.VeniDriverFactory;
import dsalgo_DriverFactory.DriverFactory;
import dsalgo_Utilities.ConfigReader;
import dsalgo_Utilities.Loggerload;
import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Alert;



public class Graph_POM {

	public static WebDriver driver = DriverFactory.getDriver();
  Utils eleUtil = new Utils();
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	Actions actions = new Actions(driver);
	
	String script;
	
	@FindBy (xpath="//a[@href='graph']") WebElement Graph_Getstarted;
    @FindBy (xpath="/html/body/div[2]/ul[2]/a") WebElement Graph_link;
    @FindBy (xpath="//a[@class='btn btn-info']") WebElement Graph_Tryhere;
    @FindBy (xpath="//*[@id=\"answer_form\"]/div/div/div[6]/div[1]/div/div/div/div[5]/div/pre")WebElement editor_Input;
    @FindBy (xpath="//*[@id=\"answer_form\"]/button") WebElement Run_button;
    @FindBy (xpath = "//*[@id=\"content\"]/a") WebElement Graph_Practiceqn;
    @FindBy (xpath="//*[@id=\"content\"]/li[2]/a") WebElement Graph_representation;
    @FindBy (xpath="//*[@id=\"output\"]")WebElement Output;
    @FindBy(xpath = "//a[@href='/tryEditor']")WebElement tryhere_Graph;	
    
    public Graph_POM() {
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
	
	public String getExpectedResult(String sheetname, Integer rownumber) 
			throws InvalidFormatException, IOException 
	{
			String expectedResult = eleUtil.getOutputFromExcel(sheetname, rownumber);
			return expectedResult;
	}
	
	public String getActualResult() {
		eleUtil.waitForElement(Output);
		return Output.getText();
	}


	public void Graph_GetStartedbutton()
	
		throws InterruptedException
		{		
			
			try {
				jse.executeScript("window.scrollBy(0, 600)");
				Thread.sleep(3000);
				Graph_Getstarted.click();
			} catch (Exception e) {			
				e.printStackTrace();
			}
			}
		
			
    public void Graph_Graphlink() {
    	Graph_link.click();
    }
   
    public void Tryeditor_Graph() 
		    throws InterruptedException
			{		
				
				try {
					jse.executeScript("window.scrollBy(0, 500)");
					Thread.sleep(3000);
					tryhere_Graph.click();
				} catch (Exception e) {			
					e.printStackTrace();
				}
				}
    
    public void enterGraphPythonCode(String sheetname, int rownumber) 
    		throws InvalidFormatException, IOException {
    	driver.navigate().refresh();
		String code = eleUtil.getCodefromExcel(sheetname, rownumber);
		eleUtil.enterCode(code, editor_Input);
	}  
    
    public void GraphRun_Button() {
    	Run_button.click();
    	
    }
    public void navigatetobackbutton() {
		driver.navigate().back();
	}
    public void Graph_Representationlink() {
       Graph_representation.click();	
    }
    public void Graph_practiceqn() {
    	Graph_Practiceqn.click();
    }

}
