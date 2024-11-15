package dsalgo_StepDefinition;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertSame;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.List;
import java.util.Map;

//import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.fasterxml.jackson.databind.annotation.JsonAppend.Prop;

import dsalgo_DriverFactory.DriverFactory;
import dsalgo_Pageobjects.HomePage_POM;
import dsalgo_Pageobjects.Register_POM;
import dsalgo_Utilities.ConfigReader;
import dsalgo_Utilities.Loggerload;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register_SD {
	Register_POM register = new Register_POM();
	HomePage_POM homepage = new HomePage_POM();
	String userValue;
	
	// WebDriver driver = DriverFactory.getDriver();
//	String registerUsername;

	// @TS_Register_01 is in Home_SD

	@Given("The user opens Register Page")
	public void the_user_opens_register_page() {
		Loggerload.info("The user opens Register Page");
		register.navigateToRegisterPage();
	}

	// @TS_Register_02
	@When("The user clicks Register button with all fields empty")
	public void the_user_clicks_button_with_all_fields_empty() {
		Loggerload.info("The user do not enter any values in fields");
		register.clickOnRegisterButton();
	}

	@Then("The error {string} appears below Username textbox")
	public void the_error_appears_below_username_textbox(String expErrorMsg) {
		Loggerload.info("Error message is displayed" + register.emptyUserErrorMsg() + " below Username textbox");
		assertEquals(register.emptyUserErrorMsg(), expErrorMsg);
	}

	// @TS_Register_03
	@When("The user clicks Register button after entering Username with other fields empty")
	public void the_user_clicks_button_after_entering_username_with_other_fields_empty(DataTable dataTable) {
		Loggerload.info("The user enters valid username and other fields empty");
		register.enterValidUserName(dataTable);
		register.clickOnRegisterButton();
	}

	@Then("The error message {string} appears below Password textbox")
	public void the_error_message_appears_below_password_textbox(String expErrorMsg) {
		Loggerload.info("Error message is displaed " + register.emptyPwdErrorMsg() + " below Password textbox");
		assertEquals(register.emptyPwdErrorMsg(), expErrorMsg);
	}

	// @TS_Register_04
	@When("The user clicks Register button after entering Username and password with Password Confirmation field empty")
	public void the_user_clicks_button_after_entering_username_and_password_with_password_confirmation_field_empty(
			DataTable dataTable) {
		Loggerload.info("The user enters Username, Password and Password Confirmation empty");
		register.enterValidUserName(dataTable);
		register.enterValidPwd(dataTable);
		register.clickOnRegisterButton();
	}

	@Then("The error message {string} appears below Password Confirmation textbox")
	public void the_error_message_appears_below_password_confirmation_textbox(String expErrorMsg) {
		Loggerload.info("Error message is displayed " + register.emptyPwdConfirmErrorMsg()
				+ " below Password confirmation textbox");
		assertEquals(register.emptyPwdConfirmErrorMsg(), expErrorMsg);
	}

	// @TS_Register_05
	@When("The user enters  {string} and {string} and {string}")
	public void the_user_enters_and_and(String username, String password, String passwordconfirmation) {
		Loggerload.info("The user is validating with different sets of data ");
		register.enterUserName(username);
		register.enterPwd(password);
		register.enterPwdConfirm(passwordconfirmation);
		register.clickOnRegisterButton();

	}

	@Then("The user should be able to see the error msg {string}")
	public void the_user_should_be_able_to_see_the_error_msg(String errormsg) {
		Loggerload.error("Expected error message is :" + errormsg);
		Loggerload.info("Actual error message : " + register.getErrorMsg());
		assertEquals(register.getErrorMsg(), errormsg, "Error Message is incorrect");
	}

//@TS_Register_06   -  with scenario outline
	@When("The user enters a valid {string} and {string} and {string}")
	public void the_user_enters_a_valid_and_and(String username, String password, String passwordconfirmation) {
		Loggerload.info("The user is entering valid Username and Password");
		register.enterUserName(ConfigReader.randomAlphaNumeric());
		userValue=register.getUserText();
		//register.enterUserName(username);
		register.enterPwd(password);
		register.enterPwdConfirm(passwordconfirmation);
		register.clickOnRegisterButton();
	}

	@Then("The user should be navigated to Home Page with message {string} {string}")
	public void the_user_should_be_navigated_to_home_page_with_message(String string, String strin) {
		String user=string+userValue;
		System.out.println(user);
		assertEquals(user, homepage.accountCreationMsg(), "Message did not match");

	}

//	@Then("The user should be navigated to Home Page with message {string}")
//	public void the_user_should_be_navigated_to_home_page_with_message(String username) {
//		// String actualMsg = username;
//		Loggerload.info("The new account is created ");
//		assertEquals(username, homepage.accountCreationMsg(), "Message did not match");
//
//	}

	// @TS_Register_07
//	@Given("The user is on signin page")
//	public void the_user_is_on_signin_page() {
//		Loggerload.info("The user is signing into the account on Home Page");
//		ConfigReader.getProperty("appHomeURL");
//		homePage.clickOnSignInLink();
//	}
//
//	@When("The user enter valid {string} and {string}")
//	public void the_user_enter_valid_and(String username, String password) {
//		Loggerload.info("The user logins with valid Username and Password ");
//		// register.enterUserName(username);
//		homePage.enterUsername(username);
//		homePage.enterLoginPwd(password);
//		homePage.clickOnLoginBtn();
//	}
//
//	@Then("click login button to verify")
//	public void click_login_button_to_verify() {
//		Loggerload.info("The user is validating Page Title on HomePage ");
//		assertEquals("NumpyNinja", homePage.getPageTitle());
//	}
//
}
