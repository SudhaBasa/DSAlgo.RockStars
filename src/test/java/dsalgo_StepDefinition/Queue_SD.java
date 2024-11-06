package dsalgo_StepDefinition;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;

import dsalgo_DriverFactory.DriverFactory;
import dsalgo_Pageobjects.HomePage_POM;
import dsalgo_Pageobjects.Queue_POM;
import dsalgo_Pageobjects.Register_POM;
import dsalgo_Utilities.ConfigReader;
import dsalgo_Utilities.Loggerload;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Queue_SD {
	WebDriver driver = DriverFactory.getDriver();
	HomePage_POM homePage = new HomePage_POM();
	Register_POM register = new Register_POM();
	Queue_POM queuePage = new Queue_POM();
	String expectedMsg;

//
////Background
//	@Given("The user is on Sign In Page of DS Algo Portal")
//	public void the_user_is_on_sign_in_page_of_ds_algo_portal() {
//		Loggerload.info("The user is signing into the account on Home Page");
//		ConfigReader.getProperty("appHomeURL");
//		homePage.clickOnSignInLink();
//	}
//
//	@When("The user logins with valid {string} and {string}")
//	public void the_user_logins_with_valid_and(String username, String password) {
//		Loggerload.info("The user logins with valid Username and Password ");
//
//		register.enterUserName(username);
//		homePage.enterLoginPwd(password);
//		homePage.clickOnLoginBtn();
//	}
//
//	@Then("The user is navigated to homepage")
//	public void the_user_is_navigated_to_homepage() {
//		Loggerload.info("The user is validating Page Title on HomePage ");
//		assertEquals("NumpyNinja", homePage.getPageTitle());
//	}

//  @TS_Queue_01
	@Given("The user is on Home Page after logged in")
	public void the_user_is_on_home_page_after_logged_in() {
		queuePage.navigateToHomePage();
	}

	@When("The user selects Queue from the drop down menu")
	public void the_user_selects_queue_from_the_drop_down_menu() {
		queuePage.dropdown_queue();
		Loggerload.info("User clicks on queue page from dropdown");
	}

	@Then("The user should be navigated to Queue Page")
	public void the_user_should_be_navigated_to_queue_page() {
		String title = queuePage.getQueuePageTitle();
		System.out.println(title);
		Loggerload.info("Title of current page : " + title);
		assertEquals("Queue", title, "Title mis-match");
	}

//  @TS_Queue_02
	@Given("The user is on the Queue page")
	public void the_user_is_on_the_queue_page() {
		queuePage.navigateToQueuePage();
	}

	@When("The user clicks on Implementation of Queue in Python link")
	public void the_user_clicks_on_implementation_of_queue_in_python_link() {
		queuePage.clickOnImpQueuePythonLink();
	}

	@Then("The user should be navigated to Implementation of Queue in Python Page")
	public void the_user_should_be_navigated_to_implementation_of_queue_in_python_page() {
		String title = queuePage.getQueuePageTitle();
		assertEquals(title, "Implementation of Queue in Python", "Title mis-match");

	}

//  @TS_Queue_03
	@Given("The user is on the Implementation of Queue in Python  page")
	public void the_user_is_on_the_implementation_of_queue_in_python_page() {
		Loggerload.info("User is navigated to Queue in Python Page");
		queuePage.navigateToImpOfQueueInPythonLink();

	}

	// @TS_Queue_03 //07//11//15
	@When("The user clicks Try Here button")
	public void the_user_clicks_try_here_button() {
		Loggerload.info("User clicks on Try here button");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		queuePage.clickOnTryHereButton();

	}

	// @TS_Queue_03 //07//11//15
	@Then("The user should navigate to TryEditor page with Run button")
	public void the_user_should_navigate_to_try_editor_page_with_run_button() {
		Loggerload.info("Verifying Run button is displayed or not");
		assertTrue(queuePage.runBtnIsDisplayed());
	}

//  @TS_Queue_04// @TS_Queue_08 // @TS_Queue_12 //  @TS_Queue_16
	@Given("The user is on the tryEditor page with Run button to test")
	public void the_user_is_on_the_try_editor_page_with_run_button_to_test() {
		queuePage.navigateToTryEditor();

	}

	@When("The user writes Valid python code from sheet {string} and {int} and clicks Run button")
	public void the_user_writes_valid_python_code_from_sheet_and_and_clicks_run_button(String sheetName,
			Integer rowNumber) throws IOException, InvalidFormatException {
		queuePage.enterPythonCode(sheetName, rowNumber);
		expectedMsg = queuePage.getExpectedResult(sheetName, rowNumber);
	}

	@Then("The User is able to see the output in console")
	public void the_user_is_able_to_see_the_output_in_console() {
		queuePage.clickOnRunButton();

		String actualMsg = queuePage.getActualResult();
		assertEquals(actualMsg, expectedMsg);

	}

//TS_Queue_05 // @TS_Queue_09 // @TS_Queue_13 //  @TS_Queue_17
	@When("The user writes invalid python code from sheet {string} and {int} and clicks Run button")
	public void the_user_writes_invalid_python_code_from_sheet_and_and_clicks_run_button(String sheetname,
			Integer rowNumber) {

		try {
			queuePage.enterPythonCode(sheetname, rowNumber);
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			expectedMsg = queuePage.getExpectedResult(sheetname, rowNumber);
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		queuePage.clickOnRunButton();
	}

	@Then("The user gets the error message in pop up window")
	public void the_user_gets_the_error_message_in_pop_up_window() {
		driver.switchTo().alert().accept();

	}

//  @TS_Queue_06 //10//14//18
	@Given("The user is in tryEditor page and navigates to the Queue Page")
	public void the_user_is_in_try_editor_page_and_navigates_to_the_queue_page() {
		queuePage.navigateToQueueOperationsLink();
	}

	// @TS_Queue_06
	@When("The user clicks on Implementation using collections.deque link")
	public void the_user_clicks_on_implementation_using_collections_deque_link() {
		queuePage.clickOnImpUsingCollectionDequeLink();
	}

	// @TS_Queue_06
	@Then("The user should be navigated to Implementation using collections.deque page")
	public void the_user_should_be_navigated_to_implementation_using_collections_deque_page() {

		String title = queuePage.getQueuePageTitle();
		assertEquals(title, "Implementation using collections.deque", "Title not matched");

	}

//@TS_Queue_07
	@Given("The user is on  Implementation using collections.deque page")
	public void the_user_is_on_implementation_using_collections_deque_page() {
		queuePage.navigateToImpUsingCollecDequeLink();
	}
//
//@Then("The user is able to see the output in console")
//public void the_user_is_able_to_see_the_output_in_console() {
//}

//  @TS_Queue_10
	@When("The user clicks on Implementation using Array link")
	public void the_user_clicks_on_implementation_using_array_link() {
		queuePage.clickOnImpUsingArray();
	}

	@Then("The user should be navigated to Implementation using Array Page")
	public void the_user_should_be_navigated_to_implementation_using_array_page() {
		String title = queuePage.getQueuePageTitle();
		assertEquals(title, "Implementation using array", "Title mis matched");

	}

//  @TS_Queue_11
	@Given("The user is on  Implementation using Array page")
	public void the_user_is_on_implementation_using_array_page() {
		queuePage.navigateToImpUsingArrayLink();

	}

	// 14
	@When("The user clicks on Queue Operations link")
	public void the_user_clicks_on_queue_operations_link() {
		queuePage.clickOnQueueOperationsLink();

	}

	// 14
	@Then("The user should be navigated to Queue Operations Page")
	public void the_user_should_be_navigated_to_queue_operations_page() {
		String title = queuePage.getQueuePageTitle();
		assertEquals(title, "Queue Operations", "Title mis matched");
	}

//  @TS_Queue_15
	@Given("The user is on  Queue Operations page")
	public void the_user_is_on_queue_operations_page() {
		queuePage.navigateToQueueOperationsLink();

	}

	// 18
	@When("The user clicks Practice Questions link")
	public void the_user_clicks_practice_questions_link() {
		queuePage.clickOnPracticeQuestionLink();

	}

	// 18
	@Then("The user should be navigated to Practice page")
	public void the_user_should_be_navigated_to_practice_page() {
		String title = queuePage.getQueuePageTitle();
		System.out.println("The page title is :"+title);
		assertEquals(title, "Practice Questions", "Title mis matched");

	}

}
