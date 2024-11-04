package dsalgo_StepDefinition;

import static org.testng.Assert.assertEquals;


import static org.testng.Assert.assertTrue;
import java.io.IOException;
import java.util.List;
import java.util.Map;
//import venidriverfactory.VeniDriverFactory;
import dsalgo_DriverFactory.DriverFactory;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import dsalgo_Pageobjects.Graph_POM;
import dsalgo_Pageobjects.Stack_POM;
import dsalgo_Utilities.ConfigReader;
import dsalgo_Utilities.ExcelReading;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import dsalgo_Utilities.Loggerload;
import dsalgo_Utilities.Utils;


public class Graph_SD {

	Graph_POM graphpom = new Graph_POM();
	public static WebDriver driver = DriverFactory.getDriver();
	
	String Excelpath = ConfigReader.getExcelFilePath();
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	String result;
	String expectedMsg;	
	
	
	@When("The user clicks the {string} button in Graph Panel")
	public void the_user_clicks_the_button_in_graph_panel(String string) 
		throws InterruptedException {
		Loggerload.info("The user clicks on  Getstartedbutton in Graph panel");  
		graphpom.Graph_GetStartedbutton();
	}

	@Then("The user be directed to {string} page in DSAlgo homepage")
	public void the_user_be_directed_to_page_in_ds_algo_homepage(String string) {
		Loggerload.info("The user be directed to Graph page in DSAlgo portal");  
		String Title = graphpom.getStackPageTitle();
		Loggerload.info("Title of current page is :" + Title);
		assertEquals(Title, "Graph", "Title do not match");
	}

	@Given("The user is on {string} page")
	public void the_user_is_on_page(String string) {
		Loggerload.info("The user is on Graph page in DSalgo portal");
		String Title = graphpom.getStackPageTitle();
		Loggerload.info("Title of current page is :" + Title);
		assertEquals(Title, "Graph", "Title do not match");
	}

	@When("The user click on Graph button on {string} page")
	public void the_user_click_on_graph_button_on_page(String string) 
			throws InvalidFormatException, IOException
	{
			
		graphpom.Graph_Graphlink();
	}

	@Then("The user should be redirected to Graph Graph page")
	public void the_user_should_be_redirected_to_graph_graph_page() {
		Loggerload.info("The user should be redirected to Graph Graph page");
		String Title = graphpom.getStackPageTitle();
		Loggerload.info("Title of current page is :" + Title);
		assertEquals(Title,"Graph", "Title do not match");  
	}

	@Given("The user is on Graph Graph page")
	public void the_user_is_on_graph_graph_page() {
		Loggerload.info("The user should be redirected to Graph Graph page");
		String Title = graphpom.getStackPageTitle();
		Loggerload.info("Title of current page is :" + Title);
		assertEquals(Title,"Graph", "Title do not match"); 
	}

	@When("The user clicks on Try here button on Graph Graph page")
	public void the_user_clicks_on_try_here_button_on_graph_graph_page() 
		throws InterruptedException {
	    graphpom.Tryeditor_Graph();
	}

	@Then("The user should be redirected tryEditor page with a Run button in Graph Graph module")
	public void the_user_should_be_redirected_try_editor_page_with_a_run_button_in_graph_graph_module() {
		Loggerload.info("The user should be redirected tryEditor page with a Run button in Graph Graph module");
		String Title = graphpom.getStackPageTitle();
		Loggerload.info("Title of current page is :" + Title);
		assertEquals(Title,"Assessment", "Title do not match");  
	}

	@Given("The user is in Graph Graph page having an tryEditor with a Run button to test valid code")
	public void the_user_is_in_graph_graph_page_having_an_try_editor_with_a_run_button_to_test_valid_code() {
		Loggerload.info("The user should be redirected tryEditor page with a Run button in Graph Graph module");
		String Title = graphpom.getStackPageTitle();
		Loggerload.info("Title of current page is :" + Title);
		assertEquals(Title,"Assessment", "Title do not match");   
	}

	@When("The user gets input from sheet {string} and {int} for GraphEditor")
	public void the_user_gets_input_from_sheet_and_for_graph_editor(String sheetname, Integer rownumber) 
		throws InvalidFormatException,IOException {
		Loggerload.info("The user enter valid python code in tryEditor from sheet :" + sheetname+ " and row number : " + rownumber);
			graphpom.enterGraphPythonCode(sheetname, rownumber);
			result = graphpom.getExpectedResult(sheetname, rownumber);
	}

	@When("The user clicks on Run button after Entering valid python code in Graph Graph tryEditor")
	public void the_user_clicks_on_run_button_after_entering_valid_python_code_in_graph_graph_try_editor() {
	    graphpom.GraphRun_Button();
	}

	@Then("The user should be presented with Run output in GraphtryEditor")
	public void the_user_should_be_presented_with_run_output_in_graphtry_editor() {
		String actualMsg = graphpom.getActualResult();
		Loggerload.info("Actual result  : " + actualMsg);
		assertEquals(actualMsg, result, "Result matches");
	}

	@Given("The user is in Graph Graph page having an tryEditor with a Run button to test invalid code")
	public void the_user_is_in_graph_graph_page_having_an_try_editor_with_a_run_button_to_test_invalid_code() {
		Loggerload.info("The user is in Graph Graph page having an tryEditor with a Run button to test invalid code");
		String Title = graphpom.getStackPageTitle();
		Loggerload.info("Title of current page is :" + Title);
		assertEquals(Title,"Assessment", "Title do not match");  
	}

	@When("The user gets input from sheet {string} and {int} for GraphEditor invalid")
	public void the_user_gets_input_from_sheet_and_for_graph_editor_invalid(String sheetname, Integer rownumber) 
		throws InvalidFormatException,IOException {
		Loggerload.info("The user enter invalid python code in tryEditor from sheet :" + sheetname+ " and row number : " + rownumber);
			graphpom.enterGraphPythonCode(sheetname, rownumber);
			result = graphpom.getExpectedResult(sheetname, rownumber); 
	}

	@When("The user clicks on Run button after Entering invalid python code in Graph Graph tryEditor")
	public void the_user_clicks_on_run_button_after_entering_invalid_python_code_in_graph_graph_try_editor() {
	    graphpom.GraphRun_Button();
	}

	@Then("The user should be presented with error message in Graph Graph")
	public void the_user_should_be_presented_with_error_message_in_graph_graph() {
		String actualMsg = graphpom.getAlertbox();
		Loggerload.info("Actual result  : " + actualMsg);
		assertEquals(actualMsg, "NameError: name 'hello' is not defined on line 1", "Result matches"); 
	}

	@Given("The user is in Editor page and navigates to graph representations page")
	public void the_user_is_in_editor_page_and_navigates_to_graph_representations_page() {
	    graphpom.navigatetobackbutton();
	    String Title = graphpom.getStackPageTitle();
	    
	}

	@When("The user clicks on Graph Representation button")
	public void the_user_clicks_on_graph_representation_button() {
	   graphpom.Graph_Representationlink(); 
	}

	@Then("The user should be redirected to Graph Representatio page")
	public void the_user_should_be_redirected_to_graph_representatio_page() {
		Loggerload.info("The user should be redirected to Graph Representatio page");
		String Title = graphpom.getStackPageTitle();
		Loggerload.info("Title of current page is :" + Title);
		assertEquals(Title,"Graph Representations", "Title do not match");  
	}

	@Given("The user is in Graph Representations page")
	public void the_user_is_in_graph_representations_page() {
		
		Loggerload.info("The user is in Graph Representations page");
		String Title = graphpom.getStackPageTitle();
		Loggerload.info("Title of current page is :" + Title);
		assertEquals(Title,"Graph Representations", "Title do not match");  
	}

	@When("The user clicks on Tryhere link on graph representations page")
	public void the_user_clicks_on_tryhere_link_on_graph_representations_page() 
		throws InterruptedException {
		graphpom.Tryeditor_Graph();
	}

	@Then("The user should be redirector to a tryEditor from Graph Reptresentation page")
	public void the_user_should_be_redirector_to_a_try_editor_from_graph_reptresentation_page() {
		Loggerload.info("The user should be redirector to a tryEditor from Graph Reptresentation page");
		String Title = graphpom.getStackPageTitle();
		Loggerload.info("Title of current page is :" + Title);
		assertEquals(Title,"Assessment", "Title do not match"); 
	}

	@Given("The user is in a page having an Editor with a Run button to test")
	public void the_user_is_in_a_page_having_an_editor_with_a_run_button_to_test() {
		Loggerload.info("The user is in a page having an Editor with a Run button to test");
		String Title = graphpom.getStackPageTitle();
		Loggerload.info("Title of current page is :" + Title);
		assertEquals(Title,"Assessment", "Title do not match"); 
	}

	@When("The user enters valid python code in Editor from sheet {string} and {int}")
	public void the_user_enters_valid_python_code_in_editor_from_sheet_and(String sheetname, Integer rownumber) 
		throws InvalidFormatException,IOException {
		Loggerload.info("The user enter valid python code in tryEditor from sheet :" + sheetname+ " and row number : " + rownumber);
			graphpom.enterGraphPythonCode(sheetname, rownumber);
			result = graphpom.getExpectedResult(sheetname, rownumber);
	}

	@When("clicks run button")
	public void clicks_run_button() {
	    graphpom.GraphRun_Button();
	}

	@Then("The user is presented with the result after run button is clicked")
	public void the_user_is_presented_with_the_result_after_run_button_is_clicked() {
		String actualMsg = graphpom.getActualResult();
		Loggerload.info("Actual result  : " + actualMsg);
		assertEquals(actualMsg, result, "Result matches"); 
	}

	@When("The user enters invalid python code in Editor from sheet {string} and {int}")
	public void the_user_enters_invalid_python_code_in_editor_from_sheet_and(String sheetname, Integer rownumber) 
		throws InvalidFormatException,IOException {
		Loggerload.info("The user enter valid python code in tryEditor from sheet :" + sheetname+ " and row number : " + rownumber);
		graphpom.enterGraphPythonCode(sheetname, rownumber);
		result = graphpom.getExpectedResult(sheetname, rownumber);
	}

	@Then("The user gets an error message")
	public void the_user_gets_an_error_message() {
		String actualMsg = graphpom.getAlertbox();
		Loggerload.info("Actual result  : " + actualMsg);
		assertEquals(actualMsg, "NameError: name 'hello' is not defined on line 1", "Result matches"); 
	}

	@When("the user clicks on Practice Questions in graph representations page")
	public void the_user_clicks_on_practice_questions_in_graph_representations_page() {
	  graphpom.Graph_Representationlink();  
	}

	@Then("The user is directed to graph Practice page")
	public void the_user_is_directed_to_graph_practice_page() {
	    graphpom.Graph_practiceqn();
	}


}

