package dsalgo_StepDefinition;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import dsalgo_DriverFactory.DriverFactory;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;

import dsalgo_Pageobjects.Stack_POM;
import dsalgo_Utilities.ConfigReader;
import dsalgo_Utilities.ExcelReading;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.reactivex.rxjava3.exceptions.Exceptions;
import dsalgo_Utilities.Loggerload;
import dsalgo_Utilities.Utils;

public class Stack_SD {
	WebDriver driver = DriverFactory.getDriver();
	Stack_POM stackpom = new Stack_POM();	
	String Excelpath = ConfigReader.getExcelFilePath();
	String result;
	String expectedMsg;		
			
		@Given("The user is on the {string} after logged in")
		public void the_user_is_on_the_after_logged_in(String string) {
		Loggerload.info("The user is on NumpyNinja page after logged in");
		String Title = stackpom.getStackPageTitle();
		Loggerload.info("Title of current page is :" + Title);
		assertEquals(Title, "NumpyNinja", "Title do not match");
		}

		@When("The user clicks the {string} button in Stack Panel")
		public void the_user_clicks_the_button_in_stack_panel(String string) {
			Loggerload.info("The user clicks on  Getstartedbutton in stack panel");  
			stackpom.getstarted_stack();
		}

		@Then("The user be directed to {string} page in DSAlgo portal")
		public void the_user_be_directed_to_page_in_ds_algo_portal(String string) {
		Loggerload.info("The user be directed to Stack page in DSAlgo portal");  
		String Title = stackpom.getStackPageTitle();
		Loggerload.info("Title of current page is :" + Title);
		assertEquals(Title, "Stack", "Title do not match");
		}

		@Given("The user is on {string} page in DSalgo portal")
		public void the_user_is_on_page_in_d_salgo_portal(String string) {		
		Loggerload.info("The user is on Stack page in DSalgo portal");
		stackpom.navigatetoStackpage();
		}

		@When("The is clicks on \"Operations in Stack")
		public void the_is_clicks_on_operations_in_stack() {
		 stackpom.Operation_stack();   
		}

		@Then("The user should be redirected to {string} page")
		public void the_user_should_be_redirected_to_page(String string) {
			Loggerload.info("The user should be redirected to Operations in Stack page");
			String Title = stackpom.getStackPageTitle();
			Loggerload.info("Title of current page is :" + Title);
			assertEquals(Title,"Operations in Stack", "Title do not match");   
		}

		@Given("The user is on Operations in Stack page")
		public void the_user_is_on_operations_in_stack_page() {
			stackpom.navigatetooperationStack();
			}   	

		@When("The user clicks on Try here button in Operations in Stack page")
		public void the_user_clicks_on_try_here_button_in_operations_in_stack_page() {
		    stackpom.Tryeditor_stack();
		}

		@Then("The user should be redirected tryEditor page with a Run button in stack module")
		public void the_user_should_be_redirected_try_editor_page_with_a_run_button_in_stack_module() {
			Loggerload.info("The user should be redirected tryEditor page with a Run button in stack module");		
			String Title = stackpom.getStackPageTitle();
			Loggerload.info("Title of current page is :" + Title);
			assertEquals(Title, "Assessment", "Title do not match");   
		}

		@Given("The user is in stack page having an tryEditor with a Run button to test")
		public void the_user_is_in_stack_page_having_an_try_editor_with_a_run_button_to_test() {
			Loggerload.info("The user is in stack page having an tryEditor with a Run button to test");			
			stackpom.navigatetoTryeditor();    
		}

		@When("The user gets input from sheet {string} and {int}")
		public void the_user_gets_input_from_sheet_and(String sheetname, Integer rownumber) 
			throws InvalidFormatException,IOException {
			Loggerload.info("The user enter valid python code in tryEditor from sheet :" + sheetname+ " and row number : " + rownumber);
			stackpom.enterStackPythoncode(sheetname, rownumber);
			result = stackpom.getExpectedResult(sheetname, rownumber);
		}

		@When("The user clicks on Run button after Entering valid python code in stack tryEditor")
		public void the_user_clicks_on_run_button_after_entering_valid_python_code_in_stack_try_editor() {
		    stackpom.Run_stack();
		}

		@Then("The user should be presented with Run output")
		public void the_user_should_be_presented_with_run_output() {
			String actualMsg = stackpom.getActualResult();
			Loggerload.info("Actual result  : " + actualMsg);
			assertEquals(actualMsg, result, "Result matches");
		}

		@When("The user clicks on Run button after Entering invalid python code in stack tryEditor")
		public void the_user_clicks_on_run_button_after_entering_invalid_python_code_in_stack_try_editor() {
			stackpom.Run_stack();  
		}

		@Then("The user should be presented with error message in operation in stack")
		public void the_user_should_be_presented_with_error_message_in_operation_in_stack() {
			String actualMsg = stackpom.getAlertbox();
			Loggerload.info("Actual result  : " + actualMsg);
			assertEquals(actualMsg, "NameError: name 'hello' is not defined on line 1", "Result matches"); 
		}

		@Given("The user is on {string} page in DSalgo portals")
		public void the_user_is_on_page_in_d_salgo_portals(String string)  {
			stackpom.navigatetoStackpage();
		}

		@When("The user clicks on Implementation button")
		public void the_user_clicks_on_implementation_button() 
			throws InterruptedException {
		    stackpom.Implementation_Stack();
		}

		@Then("The user should be redirected to {string} page on Dsalso portal")
		public void the_user_should_be_redirected_to_page_on_dsalso_portal(String string)  {
			Loggerload.info("The user should be redirected to Operations in Stack page");
			String Title = stackpom.getStackPageTitle();
			Loggerload.info("Title of current page is :" + Title);
			assertEquals(Title,"Implementation", "Title do not match");  
		}
		
		@Given("The user is on Implementation page")
		public void the_user_is_on_implementation_page() {
			stackpom.navigatetoimplementation();
		}
		
		@When("The user clicks on {string} button in {string} page")
		public void the_user_clicks_on_button_in_page(String string, String string2) 
			throws InterruptedException {
			stackpom.Tryeditor_Stack();
			String Title = stackpom.getStackPageTitle();
			Loggerload.info("Title of current page is :" + Title);
			assertEquals(Title, "Assessment", "Title do not match");     
		}


		@Then("The user should be redirected tryEditor page with a Run button in implementation module")
		public void the_user_should_be_redirected_try_editor_page_with_a_run_button_in_implementation_module() {
			Loggerload.info("The user should be redirected tryEditor page with a Run button in implementation module");		
			String Title = stackpom.getStackPageTitle();
			Loggerload.info("Title of current page is :" + Title);
			assertEquals(Title, "Assessment", "Title do not match");   
		}

		@Given("The user is in implementation page having an tryEditor with a Run button to test")
		public void the_user_is_in_implementation_page_having_an_try_editor_with_a_run_button_to_test() {
			stackpom.navigatetoimplementation(); 
			stackpom.navigatetoTryeditor();
		}

		@When("The user clicks on Run button after Entering valid python code in implementation tryEditor")
		public void the_user_clicks_on_run_button_after_entering_valid_python_code_in_implementation_try_editor() {
			stackpom.Run_stack();  
		}

		@When("The user clicks on Run button after Entering invalid python code in implementation tryEditor")
		public void the_user_clicks_on_run_button_after_entering_invalid_python_code_in_implementation_try_editor() {	    
		    stackpom.Run_stack(); 
		}

		@Then("The user should be presented with error message in implementation in stack")
		public void the_user_should_be_presented_with_error_message_in_implementation_in_stack() {
			String actualMsg = stackpom.getAlertbox();
			Loggerload.info("Actual result  : " + actualMsg);
			assertEquals(actualMsg, "NameError: name 'hello' is not defined on line 1", "Result matches");   
		}
		
		@Given("The user is on {string} page in DSalgo portal for application")
		public void the_user_is_on_page_in_d_salgo_portal_for_application(String string) {
			stackpom.navigatetoStackpage();
			   	
		}
		
		@When("The user clicks on Applications button")
		public void the_user_clicks_on_applications_button() 
		throws InterruptedException
		{		
			stackpom.Applications_Stack(); 
		}
		
		@Then("The user should be redirected to {string} pages")
		public void the_user_should_be_redirected_to_pages(String string) {
			String Title = stackpom.getStackPageTitle();
			Loggerload.info("Title of current page is :" + Title);
			assertEquals(Title, "Applications", "Title do not match");    	
		}
		
		@Given("The user is on {string} page on Dsalgo portal")
		public void the_user_is_on_page_on_dsalgo_portal(String string) {
			stackpom.navigatetoapplication();   	
		}

		@When("The user clicks on Try here button in {string}")
		public void the_user_clicks_on_try_here_button_in(String string) 
			throws InterruptedException {
			stackpom.Tryeditor_Stack();
			String Title = stackpom.getStackPageTitle();
			Loggerload.info("Title of current page is :" + Title);
			assertEquals(Title, "Assessment", "Title do not match");     
		}

		@Then("The user should be redirected tryEditor page with a Run button in Application module")
		public void the_user_should_be_redirected_try_editor_page_with_a_run_button_in_application_module() {
			Loggerload.info("The user should be redirected tryEditor page with a Run button in implementation module");		
			String Title = stackpom.getStackPageTitle();
			Loggerload.info("Title of current page is :" + Title);
			assertEquals(Title, "Assessment", "Title do not match");   
		}

		@Given("The user is in Applications page having an tryEditor with a Run button to test")
		public void the_user_is_in_applications_page_having_an_try_editor_with_a_run_button_to_test() {
			stackpom.navigatetoapplication();
			stackpom.navigatetoTryeditor();
		}

		@When("The user clicks on Run button after Entering valid python code in Applications tryEditor")
		public void the_user_clicks_on_run_button_after_entering_valid_python_code_in_applications_try_editor() {
			stackpom.Run_stack();
		}

		@Then("The user should be presented with Run output in Applications")
		public void the_user_should_be_presented_with_run_output_in_applications() {
			String actualMsg = stackpom.getActualResult();
			Loggerload.info("Actual result  : " + actualMsg);
			assertEquals(actualMsg, result, "Result matches");
			
		}

		@When("The user clicks on Run button after Entering invalid python code in Applications tryEditor")
		public void the_user_clicks_on_run_button_after_entering_invalid_python_code_in_applications_try_editor() {
		    stackpom.navigatetorefresh();
			stackpom.Run_stack();
		}

		@Then("The user should be presented with error message in Applications in stack")
		public void the_user_should_be_presented_with_error_message_in_applications_in_stack() 
		{	
			String actualMsg = stackpom.getActualResult();	
			Loggerload.info("Actual result  : " + actualMsg);
			assertEquals(actualMsg, "");
		}
		
		@Given("The user is on {string} page in DSalgo portal pracitce question")
		public void the_user_is_on_page_in_d_salgo_portal_pracitce_question(String string) 
		
		{
			stackpom.navigatetooperationStack();
			
		}

		@When("The user clicks on the Practice Questions button in")
		public void the_user_clicks_on_the_practice_questions_button_in() {
		    stackpom.practicequestion_Stack();
		}

		@Then("The user should be directed to Practice Questions  Page")
		public void the_user_should_be_directed_to_practice_questions_page() {
			String Title = stackpom.getStackPageTitle();
			Loggerload.info("Title of current page is :" + Title);
			assertEquals(Title, "Practice Questions", "Title do not match");   
		}




	}

