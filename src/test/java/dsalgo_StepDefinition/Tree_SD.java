package dsalgo_StepDefinition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import dsalgo_DriverFactory.DriverFactory;
import dsalgo_Pageobjects.HomePage_POM;
import dsalgo_Pageobjects.Tree_POM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Tree_SD {

	HomePage_POM homePage = new HomePage_POM();
	Tree_POM treePage = new Tree_POM();
	WebDriver driver=DriverFactory.getDriver();

	@Given("The User is on Home Page after logged in")
	public void the_user_is_on_home_page_after_logged_in() {
		treePage.navigateToHomePage();
	}

	@When("The user selects Tree Data Structure from drop down menu")
	public void the_user_selects_tree_data_structure_from_drop_down_menu() {
		treePage.dropDownTree();

	}

	@Then("The user should be navigated to Tree Page")
	public void the_user_should_be_navigated_to_tree_page() {

		String title = treePage.getTreePageTitle();
		System.out.println("The titile of page is : " + title);
		assertEquals(title, "Tree", "Title mis match");

	}

	@Given("The user is on the Tree Page")
	public void the_user_is_on_the_tree_page() {

		treePage.navigateToTreePage();
	}

	@When("The user clicks on the Overview of Trees Link")
	public void the_user_clicks_on_the_overview_of_trees_link() {
		treePage.clickOnOverviewOfTreesLink();

	}

	@Then("The user should be navigated to Overview of Trees Page")
	public void the_user_should_be_navigated_to_overview_of_trees_page() {

		String title = treePage.getTreePageTitle();
		assertEquals(title, "Overview of Trees", "Title mis match");

	}

	@Given("The user is in Overview of Trees page")
	public void the_user_is_in_overview_of_trees_page() {
		treePage.navigateToOverviewTreeLink();
	}

	@Given("The user is in tryEditor page and navigates to the Tree Page")
	public void the_user_is_in_try_editor_page_and_navigates_to_the_tree_page() {
		treePage.navigateToTreePage();
	}

	@When("The user clicks on Terminologies link")
	public void the_user_clicks_on_terminologies_link() {
		treePage.clickOnTerminaLink();
	}

	@Then("The user should be navigated to Terminologies Page")
	public void the_user_should_be_navigated_to_terminologies_page() {
		String title = treePage.getTreePageTitle();
		assertEquals(title, "Terminologies", "Title mis matched");
	}

	@Given("The user is on the Terminologies page")
	public void the_user_is_on_the_terminologies_page() {
		treePage.navigateToTerminaLink();
	}

	@When("The user clicks on Types of Trees link")
	public void the_user_clicks_on_types_of_trees_link() {
		treePage.clickOnTypsOfTreesLink();
	}

	@Then("The user should be navigated to Types of Trees page.")
	public void the_user_should_be_navigated_to_types_of_trees_page() {
		String title = treePage.getTreePageTitle();
		assertEquals(title, "Types of Trees", "Title mis matched");
	}

	@Given("The user is on the Types of Trees page")
	public void the_user_is_on_the_types_of_trees_page() {
		treePage.navigateToTypsOfTreesLink();
	}

	@When("The user clicks on Tree Traversals link")
	public void the_user_clicks_on_tree_traversals_link() {
		treePage.clickOnTreeTraversalsLink();
	}

	@Then("The user should be navigated to Tree Traversals page.")
	public void the_user_should_be_navigated_to_tree_traversals_page() {
		String title = treePage.getTreePageTitle();
		assertEquals(title, "Tree Traversals", "Title mis matched");
	}

	@Given("The user is on the Tree Traversals page")
	public void the_user_is_on_the_tree_traversals_page() {
		treePage.navigateToTreeTraversalsLink();
	}

	@When("The user clicks Traversals-Illustration link")
	public void the_user_clicks_traversals_illustration_link() {
		treePage.clickOnTraverIllusLink();
	}

	@Then("The user should be navigated to Traversals-Illustration page.")
	public void the_user_should_be_navigated_to_traversals_illustration_page() {
		String title = treePage.getTreePageTitle();
		assertEquals(title, "Traversals-Illustration", "Title mis matched");
	}

	@Given("The user is on the Traversals-Illustration page")
	public void the_user_is_on_the_traversals_illustration_page() {
		treePage.navigateToTraverIllusLink();
	}

	@When("The user clicks Binary Trees link")
	public void the_user_clicks_binary_trees_link() {
		treePage.clickOnBinaryTreesLink();
	}

	@Then("The user should be navigated to Binary Trees page.")
	public void the_user_should_be_navigated_to_binary_trees_page() {
		String title = treePage.getTreePageTitle();
		assertEquals(title, "Binary Trees", "Title mis matched");
	}

	@Given("The user is on the Binary Trees page")
	public void the_user_is_on_the_binary_trees_page() {
		treePage.navigateToBinaryTreesLink();
	}

	@When("The user clicks Types of Binary Trees link")
	public void the_user_clicks_types_of_binary_trees_link() {
		treePage.clickOnTypsOfBinaryTreesLink();
	}

	@Then("The user should be navigated to Types of Binary Trees page.")
	public void the_user_should_be_navigated_to_types_of_binary_trees_page() {
		String title = treePage.getTreePageTitle();
		assertEquals(title, "Types of Binary Trees", "Title mis matched");
	}

	@Given("The user is on the Types of Binary Trees page")
	public void the_user_is_on_the_types_of_binary_trees_page() {
		treePage.navigateToTypsOfBinaryTreesLink();
	}

	@When("The user clicks Implementation in Python Trees link")
	public void the_user_clicks_implementation_in_python_trees_link() {
		treePage.clickOnImpInPythonLink();
	}

	@Then("The user should be navigated to Implementation in Python page.")
	public void the_user_should_be_navigated_to_implementation_in_python_page() {
		String title = treePage.getTreePageTitle();
		assertEquals(title, "Implementation in Python", "Title mis matched");
	}

	@Given("The user is on the Implementation in Python page")
	public void the_user_is_on_the_implementation_in_python_page() {
		treePage.navigateToImpInPythonLink();
	}

	@When("The user clicks Binary Tree Traversals link")
	public void the_user_clicks_binary_tree_traversals_link() {
		treePage.clickOnBinaryTreeTravesLink();
	}

	@Then("The user should be navigated to Binary Tree Traversals page.")
	public void the_user_should_be_navigated_to_binary_tree_traversals_page() {
		String title = treePage.getTreePageTitle();
		assertEquals(title, "Binary Tree Traversals", "Title mis matched");
	}

	@Given("The user is on the Binary Tree Traversals page")
	public void the_user_is_on_the_binary_tree_traversals_page() {
		//treePage.navigateToBinaryTreeTravesLink();
		driver.get("https://dsportalapp.herokuapp.com/tree/binary-trees/");
	
	}

	@When("The user clicks Implementation of Binary Trees link")
	public void the_user_clicks_implementation_of_binary_trees_link() {
		treePage.clickOnImplOfBinaryTreesLink();
	}

	@Then("The user should be navigated to Implementation of Binary Treess page.")
	public void the_user_should_be_navigated_to_implementation_of_binary_treess_page() {
		String title = treePage.getTreePageTitle();
		assertEquals(title, "Implementation of Binary Trees", "Title mis matched");
	}

	@Given("The user is on the Implementation of Binary Trees page")
	public void the_user_is_on_the_implementation_of_binary_trees_page() {
		treePage.navigateToImplOfBinaryTreesLink();
	}

	@When("The user clicks Applications of Binary trees link")
	public void the_user_clicks_applications_of_binary_trees_link() {
		treePage.clickOnAppOfBinaryTreesLink();
	}

	@Then("The user should be navigated to Applications of Binary trees page.")
	public void the_user_should_be_navigated_to_applications_of_binary_trees_page() {
		String title = treePage.getTreePageTitle();
		assertEquals(title, "Applications of Binary trees", "Title mis matched");
	}

	@Given("The user is on the Applications of Binary trees page")
	public void the_user_is_on_the_applications_of_binary_trees_page() {
		treePage.navigateToAppOfBinaryTreesLink();

	}

	@When("The user clicks Binary Search Trees link")
	public void the_user_clicks_binary_search_trees_link() {
		treePage.clickOnBinarySearchTreesLink();
	}

	@Then("The user should be navigated to Binary Search Trees page.")
	public void the_user_should_be_navigated_to_binary_search_trees_page() {
		String title = treePage.getTreePageTitle();
		assertEquals(title, "Binary Search Trees", "Title mis matched");
	}

	@Given("The user is on the Binary Search Trees page")
	public void the_user_is_on_the_binary_search_trees_page() {
		treePage.navigateToBinarySearchTreesLink();
	}

	@When("The user clicks Implementation Of BST link")
	public void the_user_clicks_implementation_of_bst_link() {
		treePage.clickOnImplOfBSTLink();
	}

	@Then("The user should be navigated to Implementation Of BST page.")
	public void the_user_should_be_navigated_to_implementation_of_bst_page() {
		String title = treePage.getTreePageTitle();
		assertEquals(title, "Implementation Of BST", "Title mis match");
	}

	@Given("The user is on the Implementation Of BST page")
	public void the_user_is_on_the_implementation_of_bst_page() {
		treePage.navigateToImplOfBSTLink();
	}

	
}







