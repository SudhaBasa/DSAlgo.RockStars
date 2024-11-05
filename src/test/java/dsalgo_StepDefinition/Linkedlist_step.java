package dsalgo_StepDefinition;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import dsalgo_DriverFactory.DriverFactory;
import dsalgo_Utilities.ConfigReader;
import dsalgo_Pageobjects.Home_page;
import dsalgo_Pageobjects.Linkedlist_page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Linkedlist_step {
	
	private ConfigReader reader = new ConfigReader();
	private WebDriver driver = DriverFactory.getDriver();
	private Linkedlist_page linkedList = new Linkedlist_page(driver);
	private Home_page homePage = new Home_page();
	
//	@Given("The user is on Sign In Page of DS Algo Portal")
//	public void the_user_is_on_sign_in_page_of_ds_algo_portal() {
//	   
//		DriverFactory.getDriver().get(reader.getProperty("loginurl"));
//	}

//	@When("The user enter valid {string} and {string}")
//	public void the_user_enter_valid_and(String username, String password) {
//	    
//		linkedList.login(username, password);
//		linkedList.click_Login();
//	}

	@Then("The user is navigated to homepage")
	public void the_user_is_navigated_to_homepage() {
	   
		DriverFactory.getDriver().get(reader.getProperty("appHomeURL"));
	}

	
	@Given("The user comes back to the DS_algo home page to select or start DS Linked List.")
	public void the_user_comes_back_to_the_ds_algo_home_page_to_select_or_start_ds_linked_list() {
	    
		Assert.assertEquals(homePage.hometitle(),"NumpyNinja");
			   
	}

	@When("The user select Linked List from the Data Structure dropdown menu or clicks the Get Started button in Linked List Panel")
	public void the_user_select_linked_list_from_the_data_structure_dropdown_menu_or_clicks_the_get_started_button_in_linked_list_panel() {
	    
		linkedList.click_getstarted_linkedlist();
	}

	@Then("The user should be navigated to {string} page.")
	public void the_user_should_be_navigated_to_page(String string) {
	    
	   Assert.assertEquals(linkedList.Linkedlisttitle(),string );
	}

	@Given("The user is on the Linked List page")
	public void the_user_is_on_the_linked_list_page() {
	    
		DriverFactory.getDriver().get(reader.getProperty("Linkedlist_URL"));
	}

	@When("The user clicks link from the linked list topics covered list having {string}")
    public void the_user_clicks_link_from_the_linked_list_topics_covered_list(String linkText) {
	    
		linkedList.click_linkedListOptions(linkText);
	}
	
	@Then("The user should be navigated to page of {string}")
    public void the_user_should_be_navigated_to_page_of(String destinationUrl) {
		
		Assert.assertEquals(driver.getCurrentUrl(), destinationUrl);
	}
	

	@Given("The user is on the Linked list page with {string}")
    public void the_user_is_on_the_linked_list_page_with_links(String linkedListOptions) {
	    
		switch(linkedListOptions) {
		case "Introduction":
			DriverFactory.getDriver().get(reader.getProperty("Introduction_URL"));break;
		case "Creating Linked LIst":
			DriverFactory.getDriver().get(reader.getProperty("Creating_LL_URL"));break;
		case "Types of Linked List":
			DriverFactory.getDriver().get(reader.getProperty("Types_of_LL_URL"));break;
		case "Implement Linked List in Python":
			DriverFactory.getDriver().get(reader.getProperty("Implement_LL_in_Python"));break;
		case "Traversal":
			DriverFactory.getDriver().get(reader.getProperty("Traversal_URL"));break;
		case "Insertion":
			DriverFactory.getDriver().get(reader.getProperty("Insertion_URL"));break;
		case "Deletion":
			DriverFactory.getDriver().get(reader.getProperty("Deletion_URL"));break;
		default:
			break;
			
		}
	}

	@When("The user clicks try here button in {string} page")
	public void the_user_clicks_try_here_button_in_page(String string) {

		linkedList.click_Try_here();
	}

	@Then("The user should be navigated to a page having tryEditor and run button")
	public void the_user_should_be_navigated_to_a_page_having_try_editor_and_run_button() {
	    
		Assert.assertEquals(driver.getCurrentUrl(), reader.getProperty("tryEditorUrl"));
	}

	@Given("The user is on the Linked list tryEditor page")
	public void the_user_is_on_the_linked_list_try_editor_page() {
	    
		DriverFactory.getDriver().get(reader.getProperty("tryEditorUrl"));
	}

	@When("The user clicks the Run Button without entring the code in the Editor of linked list")
	public void the_user_clicks_the_run_button_without_entring_the_code_in_the_editor_of_linked_list() {
	    
		linkedList.click_run();
	}

	@Then("Nothing happens to the page and no error message is displayed for Linked list")
	public void nothing_happens_to_the_page_and_no_error_message_is_displayed_for_linked_list() {
	  
		Assert.assertEquals(linkedList.getScriptOutput(), "");
	}

	@When("The user writes the valid python code from {string} and {int} and clicks the Run button")
	public void the_user_writes_the_valid_python_code_from_and_and_clicks_the_run_button(String Sheetname, Integer RowNumber) throws InvalidFormatException, IOException {
		
		linkedList.enterPythonCode(Sheetname, RowNumber);
		linkedList.click_run();
	}

	@Then("The user is able to see the output inside the console.")
	public void the_user_is_able_to_see_the_output_inside_the_console() throws InvalidFormatException, IOException {
	    
		Assert.assertEquals(linkedList.getOutput("dsalgocode", 0),linkedList.getScriptOutput() );
	   
	}
	@When("The user writes the invalid python code from {string} and {int} and clicks the Run button")
	public void the_user_writes_the_invalid_python_code_from_and_and_clicks_the_run_button(String Sheetname, Integer RowNumber) throws InvalidFormatException, IOException {
	    
		linkedList.enterPythonCode(Sheetname, RowNumber);
		linkedList.click_run();
	   
	}

	@Then("The user should see an error message in alert window")
	public void the_user_should_see_an_error_message_in_alert_window() {
	    
		driver.switchTo().alert().accept();
	}


	@Given("The user is on the Deletion page")
	public void the_user_is_on_the_deletion_page() {
	    
		DriverFactory.getDriver().get(reader.getProperty("Deletion_URL"));
	}

	@When("The user clicks {string} link of linked list")
	public void the_user_clicks_link_of_linked_list(String string) {
	   
		linkedList.click_Practise_Qtns();
	}

	@Then("The user should be redirected to {string} page of linked list")
	public void the_user_should_be_redirected_to_page_of_linked_list(String string) {
	    
		Assert.assertEquals(driver.getCurrentUrl(), reader.getProperty("PracticeQtns_URL"));
	}

}