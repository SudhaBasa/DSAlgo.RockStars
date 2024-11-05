package dsalgo_StepDefinition;

import static org.testng.Assert.assertEquals;


import static org.testng.Assert.assertTrue;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import dsalgo_DriverFactory.DriverFactory;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;

import dsalgo_Pageobjects.DataStructure_POM;
import dsalgo_Pageobjects.Login_POM;
import dsalgo_Utilities.ConfigReader;
import dsalgo_Utilities.ExcelReading;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import dsalgo_Utilities.Loggerload;
import dsalgo_Utilities.Utils;

public class DataStructure_SD {
WebDriver driver = DriverFactory.getDriver();
	
DataStructure_POM dspom = new DataStructure_POM();
	
	static String username;
	static String password;
	static String answer;
	static String result;		
	String Excelpath = ConfigReader.getExcelFilePath();
	
	@Given("The user is on Signin page of DS Algo portal")
	public void the_user_is_on_signin_page_of_ds_algo_portal() {
		Loggerload.info("The user is on Signin page of DS Algo porta");
		dspom.dsalgo_loginpage();  
	}

	@When("The user enter valid username and password {string} and {string}")
	public void the_user_enter_valid_username_and_password_and(String string, String string2) {
	  dspom.Login("Rockstars_Numpy", "Numpy@Rock123"); 
	}

	@When("The user click on login button")
	public void the_user_click_on_login_button() {
	dspom.login_button();
	Loggerload.info("The user is on loginpage DSAlgo home page"); 
	}

	@Then("The user redirected to homepage in DS")
	public void the_user_redirected_to_homepage_in_ds() {
		Loggerload.info("The user redircted to DSAlgo home page");
		String Title = dspom.getPageTitle();
		Loggerload.info("Title of the Page : \" " + Title + "\" ");
		assertEquals(Title,"NumpyNinja","Title do not match");
	}   
	
	@Given("The user is on the dsalgo_home page after logged in")
	public void the_user_is_on_the_dsalgo_home_page_after_logged_in() {
		Loggerload.info("The user is on the dsalgo_home page after logged in");
		String Title = dspom.getPageTitle();
		Loggerload.info("Title of the Page : \" " + Title + "\" ");
		assertEquals(Title,"NumpyNinja","Title do not match");   
	}

	@When("The user clicks the {string} button in Data Structure Page introduction Panel")
	public void the_user_clicks_the_button_in_data_structure_page_introduction_panel(String string) {
	   dspom.DS_getstarted(); 
	}

	@Then("The user be directed to {string} page")
	public void the_user_be_directed_to_page(String string) {
		Loggerload.info("The user be directed to {string} page");
		String Title = dspom.getPageTitle();
		Loggerload.info("Title of the Page : \" " + Title + "\" ");
		assertEquals(Title,"Data Structures-Introduction","Title do not match");    
	}

	@Given("The user is on the Data Structures Introduction after logged in")
	public void the_user_is_on_the_data_structures_introduction_after_logged_in() {
		dspom.navigatetotimecomplexity();  
	}

	@When("The user clicks Time Complexity link")
	public void the_user_clicks_time_complexity_link() 
	
	{
	   dspom.dsalgo_Timecomplexitylink();
	}

	@Then("The user should be redirected to Time Complexity page")
	public void the_user_should_be_redirected_to_time_complexity_page() {
		Loggerload.info("The user be directed to {string} page");
		String Title = dspom.getPageTitle();
		Loggerload.info("Title of the Page : \" " + Title + "\" ");
		assertEquals(Title,"Time Complexity","Title do not match");    
	}

	@Given("The user is on the Time Complexity after logged in")
	public void the_user_is_on_the_time_complexity_after_logged_in() {
		Loggerload.info("The user be directed to {string} page");
		String Title = dspom.getPageTitle();
		Loggerload.info("Title of the Page : \" " + Title + "\" ");
		assertEquals(Title,"NumpyNinja","Title do not match");       
	}

	@When("The user clicks Try Here button on Time Complexity page")
	public void the_user_clicks_try_here_button_on_time_complexity_page() {
	 dspom.ds_tryeditor();   
	}

	@Then("The user should be redirected to a page having an tryEditor with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
		Loggerload.info("The user be directed to {string} page");
		String Title = dspom.getPageTitle();
		Loggerload.info("Title of the Page : \" " + Title + "\" ");
		assertEquals(Title,"Assessment","Title do not match");          
	}

	@Given("The user is in a page having an tryEditor with a Run button to test")
	public void the_user_is_in_a_page_having_an_try_editor_with_a_run_button_to_test() {
		dspom.ds_tryeditor();
		dspom.ds_tryeditoranswer();  
	}

	@When("The user enter valid python code in tryEditor from sheet {string} and {int}")
	public void the_user_enter_valid_python_code_in_try_editor_from_sheet_and(String sheetname, Integer rownumber) 
		throws InvalidFormatException,IOException {
		Loggerload.info("The user enter valid python code in tryEditor from sheet :" + sheetname+ " and row number : " + rownumber);
			dspom.enterPythonCode(sheetname, rownumber);
			result = dspom.getExpectedResult(sheetname, rownumber);
		}		
			 
	@When("The user clicks on run button")
	public void the_user_clicks_on_run_button() {
	 dspom.ds_run();   
	}

	@Then("The user should be presented with Run result")
	public void the_user_should_be_presented_with_run_result() {
		String actualMsg = dspom.getActualResult();
		Loggerload.info("Actual result  : " + actualMsg);
		assertEquals(actualMsg, result, "Result matches");
	}
	
	@When("The user enter python code with invalid syntax in tryEditor from sheet {string} and {int}")
	public void the_user_enter_python_code_with_invalid_syntax_in_try_editor_from_sheet_and(String sheetname, Integer rownumber)
			throws InvalidFormatException,IOException {				
	Loggerload.info("The user enter python code with invalid syntax in tryEditor from sheet :" + sheetname+ " and row number : " + rownumber);
	dspom.enterPythonCode(sheetname, rownumber);
	result = dspom.getExpectedResult(sheetname, rownumber);
}		
	@When("The user clicks on run button again")
	public void the_user_clicks_on_run_button_again() {
	dspom.ds_run();    
	
	} 

	@Then("The user should be presented with error message")
	public void the_user_should_be_presented_with_error_message() {
		String actualMsg = dspom.getAlertbox();
		Loggerload.info("Actual Error result  : " + actualMsg);
		assertEquals(actualMsg, "NameError: name 'hello' is not defined on line 1", "Result do not matches");
	}

	@Given("The user directed to Timecomplexity page by giving url")
	public void the_user_directed_to_timecomplexity_page_by_giving_url() 
	throws InterruptedException {
		dspom.navigatetotimecomplexity();  
	}

	@When("The user clicks on the Practice question  on Timecomplexity page")
	public void the_user_clicks_on_the_practice_question_on_timecomplexity_page() 
		throws InterruptedException {
		
		dspom.ds_practicequestion();  
	}

	@Then("The user can see empty page")
	public void the_user_can_see_empty_page() {
		Loggerload.info("the_user_can_see_empty_page");
		String Title = dspom.getPageTitle();
		Loggerload.info("Title of the Page : \" " + Title + "\" ");
		assertEquals(Title,"Practice Questions","Title do not match");     
	}




}

	
	



