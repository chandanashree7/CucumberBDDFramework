package stepdefinations;

import org.openqa.selenium.WebDriver;
//import org.testng.Assert;
//import org.openqa.selenium.support.PageFactory;

import factory.DriverFactory;
import io.cucumber.java.en.*;
//import pages.QueuePage;
import pages.TreePage;
//import pages.LoginPage;
//import pages.QueuePage;

public class Tree {

	WebDriver driver;	
	 	   @When("user click on Get Started button on Trees")
	 	   public void user_click_on_get_started_button_on_trees()
	 	   throws InterruptedException{
				driver = DriverFactory.getDriver();
				TreePage Tp = new TreePage(driver); 
				Tp.TreeGetStarted();
				System.out.println("cliced on Get Started button on Tree");
				Thread.sleep(500);
	 		}
				
				 
			@And("user click on Overview of Trees")
			public void user_click_on_overview_of_trees() 
			throws InterruptedException {
					driver = DriverFactory.getDriver();
					TreePage Tp = new TreePage(driver); 
					Tp.OverviewOfTree();
					System.out.println("Cliced on Overview of Trees ");
					Thread.sleep(500);
			}
				
		@When("user click on Terminologies of Trees")
				public void user_click_on_terminologies_of_trees() 
				throws InterruptedException {
					driver = DriverFactory.getDriver();
					TreePage Tp = new TreePage(driver); 
					Tp.TerminologiesOfTree();
					System.out.println("cliced on Terminologies of Trees ");
					Thread.sleep(500);
				}
				
		@Then("^User navigate back to Tree$")
			  public void user_navigate_back_to_tree() 
			  throws InterruptedException {
					driver = DriverFactory.getDriver();
					TreePage Tp = new TreePage(driver); 
					Tp.backToTree();
					Thread.sleep(500);
			    	System.out.println("User navigate back to Queue - https://dsportalapp.herokuapp.com/Tree");
				}
				
				
		@When("user click on Types of Trees")
			public void user_click_on_types_of_trees() 
			throws InterruptedException {
					driver = DriverFactory.getDriver();
					TreePage Tp = new TreePage(driver); 
					Tp.typesoftree();
					Thread.sleep(500);
					System.out.println("cliced on Types of Trees ");
					
				}
			
				
		@When("user click on Tree Traversals")
				public void user_click_on_tree_traversals() 
				throws InterruptedException {
					driver = DriverFactory.getDriver();
					TreePage Tp = new TreePage(driver); 
					Tp.treeTraversals();
					Thread.sleep(500);
					System.out.println("cliced on Tree Traversals ");
					
				}
				
				@When("user click on Traversals-Illustration")
				public void user_click_on_traversals_illustration() {
					driver = DriverFactory.getDriver();
					TreePage Tp = new TreePage(driver); 
					Tp.illustration();
					System.out.println("cliced on Traversals-Illustration ");
				}
				
				@When("user click on Binary Trees")
				public void user_click_on_binary_trees() {
					driver = DriverFactory.getDriver();
					TreePage Tp = new TreePage(driver); 
					Tp.binaryTree();
					System.out.println("cliced on on Binary Trees ");
				}
				
				@When("user click on Types of Binary Trees")
				public void user_click_on_types_of_binary_trees() {
					driver = DriverFactory.getDriver();
					TreePage Tp = new TreePage(driver); 
					Tp.typesofBT();
					System.out.println("cliced on Types of Binary Trees ");
				}
				
				
				@When("user click on Implementation in Python")
				public void user_click_on_implementation_in_python() {
					driver = DriverFactory.getDriver();
					TreePage Tp = new TreePage(driver); 
					Tp.implemeentationofPython();
					System.out.println("cliced on Implementation in Python ");
					
				}
				
				@When("user click on Binary Tree Traversals")
				public void user_click_on_binary_tree_traversals() {
					driver = DriverFactory.getDriver();
					TreePage Tp = new TreePage(driver); 
					Tp.binarytreeTraversals();
					System.out.println("cliced on Binary Tree Traversals");
				}
				
				@When("user click on Implementation of Binary Trees")
				public void user_click_on_implementation_of_binary_trees() {
					driver = DriverFactory.getDriver();
					TreePage Tp = new TreePage(driver); 
					Tp.implementaionofBtree();
					System.out.println("cliced on Implementation of Binary Trees");
				}
				
				@When("user click on Applications of Binary trees")
				public void user_click_on_applications_of_binary_trees() {
					driver = DriverFactory.getDriver();
					TreePage Tp = new TreePage(driver); 
					Tp.applicationofBtree();
					System.out.println("click on Applications of Binary trees");
				}
				
				@When("user click on Implementation Of BST")
				public void user_click_on_implementation_of_bst() {
					driver = DriverFactory.getDriver();
					TreePage Tp = new TreePage(driver); 
					Tp.ImpOfBST();
					System.out.println("click on Implementation Of BST");
				}
				

	
}

