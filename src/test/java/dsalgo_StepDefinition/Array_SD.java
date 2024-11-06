package dsalgo_StepDefinition;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import dsalgo_DriverFactory.DriverFactory;
import dsalgo_Utilities.ConfigReader;
import dsalgo_Pageobjects.Arrays_POM;
import dsalgo_Pageobjects.HomePage_POM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Array_SD {
	
	private ConfigReader reader = new ConfigReader();
	private WebDriver driver = DriverFactory.getDriver();
	private Arrays_POM Array = new Arrays_POM(driver);
	private HomePage_POM homePage = new HomePage_POM();
	

	@Given("The user is on the Home Page after logged in")
	public void the_user_is_on_the_home_page_after_logged_in() {
	    
		Assert.assertEquals(homePage.hometitle(),"NumpyNinja");
	}

	@When("The user select Arrays from the dropdown or clicks Get Started button below the array")
	public void the_user_select_arrays_from_the_dropdown_or_clicks_get_started_button_below_the_array() {
	    
		Array.click_getstarted_array();
	}

	@Then("The user should be navigated to the {string} Page")
	public void the_user_should_be_navigated_to_the_page(String string) {
	  
		Assert.assertEquals(Array.arraytitle(),string );
	}


	@Given("The user is on the Array page")
	public void the_user_is_on_the_array_page() {
	    
	    DriverFactory.getDriver().get(reader.getProperty("Arrays_URL"));
	}

	@When("The user clicks link from the topics covered list {string}.")
	public void the_user_clicks_link_from_the_topics_covered_list(String string) {
	    
	   Array.click_arrayOptions(string);
	}

	@Then("The user should be navigated to related Page of {string}")
	public void the_user_should_be_navigated_to_related_page_of(String destinationUrl) {
	    
	    Assert.assertEquals(driver.getCurrentUrl(), destinationUrl);
	}

	 @Given("The user is on the specific Page {string}")
	  public void the_user_is_on_the_specific_page(String arrayOptions) {
	    
		 switch(arrayOptions) {
			case "Arrays in python":
				DriverFactory.getDriver().get(reader.getProperty("ArrayInPython_URL"));break;
			case "Arrays Using List":
				DriverFactory.getDriver().get(reader.getProperty("ArraysUsingList_URL"));break;
			case "Basic Operations in Lists":
				DriverFactory.getDriver().get(reader.getProperty("BasicOperatnsInLists_URL"));break;
			case "Applications of Array":
				DriverFactory.getDriver().get(reader.getProperty("ApplicationsOfArray_URL"));break;
			default:
				break;
				}
	}

	 @When("The user clicks Try Here button of Page {string}")
	  public void the_user_clicks_try_here_button_of_page(String option) {

	    Array.click_try_here();
	    
	}

	@Then("The user should be navigated to a TryEditor page with Run button")
	public void the_user_should_be_navigated_to_a_try_editor_page_with_run_button() {
	    
	    Assert.assertEquals(driver.getCurrentUrl(),reader.getProperty("tryEditorUrl"));
	    Array.click_Run();
	}
	@Given("The user is on the Array tryEditor page with Run button to test")
	public void the_user_is_on_the_array_try_editor_page_with_run_button_to_test() {
	    
		DriverFactory.getDriver().get(reader.getProperty("tryEditorUrl"));
	}

	@When("The user clicks the Run Button without entring the code in the Editor")
	public void the_user_clicks_the_run_button_without_entring_the_code_in_the_editor() {
	    
	    Array.arraytitle();
	}

	@Then("Nothing happens to the page and no error message is displayed")
	public void nothing_happens_to_the_page_and_no_error_message_is_displayed() {
	    
	    Assert.assertEquals(Array.getEditorOutput(),"");
	}

	@When("The user writes the valid code in Editor from {string} and {int} and clicks the Run button")
	public void the_user_writes_the_valid_code_in_editor_from_and_and_clicks_the_run_button(String Sheetname, Integer RowNumber) throws InvalidFormatException, IOException {
	    
		Array.enterPythonCode(Sheetname, RowNumber);
		Array.click_Run();
	}

	@Then("The user should able to see output in the console")
	public void the_user_should_able_to_see_output_in_the_console() throws InvalidFormatException, IOException {
	    
	   Assert.assertEquals(Array.getCodeoutput("dsalgocode", 0), Array.getEditorOutput());
	}

	@When("The user writes the invalid code from {string} and {int} in Editor and clicks the Run button")
	public void the_user_writes_the_invalid_code_from_and_in_editor_and_clicks_the_run_button(String string, Integer int1) throws InvalidFormatException, IOException {
	    
		Array.enterPythonCode(string, int1);
		Array.click_Run();
	}


	@Then("The user should able to see an error message in alert window")
	public void the_user_should_able_to_see_an_error_message_in_alert_window() {
	    
		driver.switchTo().alert().accept();
	}

	@Given("The user is on the Applications of Array page")
	public void the_user_is_on_the_applications_of_array_page() {
	    
		driver.get(reader.getProperty("ApplicationsOfArray_URL"));
	    
	}
	@When("The user clicks Array Practice Questions link")
	public void the_user_clicks_array_practice_questions_link() {
	    
	    Array.click_Practise_Qtns();
	}

	@Then("The user should be navigated to practice page having {int} links")
	public void the_user_should_be_navigated_to_practice_page_having_links(Integer int1) {
	    
		Assert.assertEquals(driver.getCurrentUrl(),reader.getProperty("ArrayPracticeQtns_URL"));
	    
	}

    @Given("The user is on Array Practice Questions page")
	public void the_user_is_on_array_practice_questions_page() {
	    
	    DriverFactory.getDriver().get(reader.getProperty("ArrayPracticeQtns_URL"));
	}

	@When("The user clicks link from the list {string}")
    public void the_user_clicks_link_from_the_list(String questions) {
	    
	    Array.click_PractiseQtnsOptions(questions);
	}

	@Then("The user should be navigated to {string} page contains a question,an tryEditor with Run and Submit buttons")
	public void the_user_should_be_navigated_to_page_contains_a_question_an_try_editor_with_run_and_submit_buttons(String destinationUrl) {
	    
		Assert.assertEquals(driver.getCurrentUrl(), destinationUrl);
	}

	@Given("The user is on the {string} practise Editor page")
	public void the_user_is_on_the_practise_editor_page(String string) {
	    
	    driver.get(reader.getProperty("SearchTheArray_URL"));
	}

	@When("The user clicks the Run Button without entring the code in the practise questions Editor")
	public void the_user_clicks_the_run_button_without_entring_the_code_in_the_practise_questions_editor() {
	    
	    Array.practiceqtnstitle();
	}

	@Then("Nothing happens to the practise questions Editor page and no error message is displayed")
	public void nothing_happens_to_the_practise_questions_editor_page_and_no_error_message_is_displayed() {
	    
		 Assert.assertEquals(Array.getQtnOutPut(),"");
	}

	@When("The user writes the valid code in practise questions Editor from {string} and {int} and clicks the Run button")
	public void the_user_writes_the_valid_code_in_practise_questions_editor_from_and_and_clicks_the_run_button(String Sheetname, Integer RowNumber) throws InvalidFormatException, IOException, InterruptedException {
	   
		Array.enterPythonCodePractice(Sheetname, RowNumber);
		Thread.sleep(2000);
		Array.click_Run();
	}

	@Then("The user should able to see output in the practise questions console")
	public void the_user_should_able_to_see_output_in_the_practise_questions_console() throws InvalidFormatException, IOException {
	    
		
		Array.getActualResult();
		//Assert.assertEquals(Array.getQtnOutPut("dsalgocode", 2), Array.getQtnOutPut());
	}

	@When("The user writes the valid code in practise questions Editor from {string} and {int} clicks the Submit button")
	public void the_user_writes_the_valid_code_in_practise_questions_editor_from_and_clicks_the_submit_button(String Sheetname, Integer RowNumber) throws InvalidFormatException, IOException, InterruptedException {
	    Array.enterPythonCodePractice(Sheetname, RowNumber);
	    Array.click_Submit();
	}

	@Then("The user see an output as submission succes")
	public void the_user_see_an_output_as_submission_succes() {
	   Array.getQtnOutPut();
	}

	@When("The user writes the invalid code in practise questions Editor from {string} and {int} clicks the Run button")
	public void the_user_writes_the_invalid_code_in_practise_questions_editor_from_and_clicks_the_run_button(String Sheetname, Integer RowNumber) throws InvalidFormatException, IOException, InterruptedException {
//		new Actions(driver).sendKeys("hello", Keys.BACK_SPACE).perform();
//		Array.enterPythonCode(Sheetname, RowNumber);
//		Array.click_Run();
		Array.enterPythonCodePractice(Sheetname, RowNumber);
	    Array.click_Run();
	}

	@Then("The user should able to see an error message in alert window of practise questions")
	public void the_user_should_able_to_see_an_error_message_in_alert_window_of_practise_questions() {
	    
		driver.switchTo().alert().accept();
	}


	@When("The user writes the valid code in practise questions Editor from {string} and {int} click the Run buttom")
	public void the_user_writes_the_valid_code_in_practise_questions_editor_from_and_click_the_run_buttom(String Sheetname, Integer RowNumber) throws InvalidFormatException, IOException, InterruptedException {
	    
		Array.enterPythonCodePractice(Sheetname, RowNumber);
		Array.click_Run();
	}
	
	

}