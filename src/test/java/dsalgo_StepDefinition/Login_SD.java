package dsalgo_StepDefinition;

import static org.testng.Assert.assertEquals;

import static org.testng.Assert.assertTrue;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;

import dsalgo_DriverFactory.DriverFactory;
import dsalgo_Pageobjects.Login_POM;
import dsalgo_Utilities.ConfigReader;
import dsalgo_Utilities.Loggerload;
import dsalgo_Utilities.ExcelReading;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_SD {
	
	private ConfigReader reader = new ConfigReader();
	WebDriver driver = DriverFactory.getDriver();
	static String username;
	static String password;
	static String message;
	Boolean isRequired;
	String Excelpath = ConfigReader.getExcelFilePath();
	
	Login_POM sign = new Login_POM();
	
	
	@Given("The user is on DSAlgo getstarted page")
	public void the_user_is_on_DSAlgo_getstarted_page() {
		Loggerload.info("User is on DSAlgo getstarted page");
		//sign.dsalgo_page();
		driver.get(ConfigReader.getProperty("appURL"));
	}
	
	@When("The user clicks on Getstarted button on DSAlgo page")
	public void the_user_clicks_on_getstarted_button_on_DSAlgo_page() {
		Loggerload.info("User clicks on Getstarted button on DSAlgo page ");
		sign.getstarted_button_link();
	}
	@Then("The user directed DSAlgo home page with Sign in option")
	public void the_user_directed_ds_algo_home_page_with_sign_in_option() {	    
		Loggerload.info("The user redircted to DSAlgo home page");
		String Title = sign.home_page();
		Loggerload.info("Title of the Page : \" " + Title + "\" ");
		assertEquals(Title, "NumpyNinja", "Title do not match");
	}

	@Given("The user is on DSAlgo page")
	public void the_user_is_on_ds_algo_page() {
		Loggerload.info("User is on DSAlgo home page");
		sign.signin_page();    
	}

	@When("The user clicks on sigin link on signin page")
	public void the_user_clicks_on_sigin_link_on_signin_page() {
		Loggerload.info("User clicks on sigin link on signin page ");
		sign.signin_button_link();
	}

	@Then("The user redirected to login page from DSAlgo page")
	public void the_user_redirected_to_login_page_from_ds_algo_page() {
		Loggerload.info("The user redirected to signin page");
		String Title = sign.signin_page();
		Loggerload.info("Title of the Page : \" " + Title + "\" ");
		assertEquals(Title, "Login", "Title do not match");
	}
	
	
	// invalid data from scenario outline
	@When("The user enter invalid {string} and {string}")
	public void the_user_enter_invalid_and(String username, String password) {
		Loggerload.info("User Enter username as \" " + username + " \" and Password as \" " + password + "\" ");
		isRequired = sign.doLogin(username, password);
		assertTrue(isRequired);
		Loggerload.info("Empty field value is validated");
	}

	@Then("click login button to verify")
	public void click_login_button_to_verify() {

		Loggerload.info("User clicks on login button");
		sign.login_button();
	}
	@Given("The user is on signin page")
	public void the_user_is_on_signin_page() {
		
	}
	// user read both invalid and valid data from excel
	@When("The user enter sheet {string} and {int}")
	public void the_user_enter_sheet_and(String sheetname, Integer rownumber)
			throws InvalidFormatException, IOException {
		ExcelReading reader = new ExcelReading();

		List<Map<String, String>> testdata = reader.getData(Excelpath, sheetname);
		username = testdata.get(rownumber).get("UserName");
		password = testdata.get(rownumber).get("Password");
		message = testdata.get(rownumber).get("Expected Message");

		Loggerload.info("User Enter UserName as \" " + username + " \"and Password as \" " + password + "\" ");
		Loggerload.info("Expected Message is "+ message);
		if (username != "" || password != "" )
			sign.doLogin(username, password);
		

	}

	// user get an alert message when login with invalid data and login successfully
	// for valid data
	@Then("click login button")
	public void click_login_button() {

		Loggerload.info("User clicks on login button");
		Loggerload.info("Expected Message - Excel Sheet :  " + message);
		String msg = sign.click_login();
		Loggerload.info("Actual Message :  " + msg);
		assertEquals(msg, message);
	}

	// User clicks on signout
	@Given("The user is on signin page with valid username {string} and password {string}")
	public void the_user_is_on_signin_page_with_valid_username_and_password(String string, String string2) {
		sign.doLogin(username, password);
		sign.click_login();
	}

	@When("The user click signout button")
	public void the_user_click_signout_button() {
		sign.signout();
	}
 @Then("The user redirected to homepage")
 public void the_user_rediredcted_to_homepage() {
	 sign.signout();
 }
 

}
