package stepdefinations;
			
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
			
import factory.DriverFactory;
import io.cucumber.java.en.*;
import pages.LinkedListPage;
			
			
public class LinkedList {
					
		     WebDriver driver;
			
			@When("user click on Get Started button on Linkedlist")
			public void user_click_on_get_started_button_on_linkedlist() 
			throws InterruptedException {
				driver = DriverFactory.getDriver();
				LinkedListPage lp= new LinkedListPage(driver);
				//lp.getStarted(); minal
				lp.getStarted();
				 Thread.sleep(500);
				 System.out.println(" **---clickd on Get Started button on Linkedlist");
			}
			
			@When("user click on Introduction")
			public void click_introduction() 
			throws InterruptedException {
				driver = DriverFactory.getDriver();
				LinkedListPage lp= new LinkedListPage(driver);
				lp.introductionLink();
				Thread.sleep(500);
				 System.out.println(" **---clickd on Linkedlist -Introduction");
				}
			
			
			@When("user click on Creating Linked LIst")
			public void user_click_on_creating_linked_l_ist() 
			throws InterruptedException {
				driver = DriverFactory.getDriver();
				LinkedListPage lp= new LinkedListPage(driver);
				lp.click_creatingLinkedListLink();
				Thread.sleep(500);
				System.out.println(" **---clickd on Linkedlist -Creating Linked LIst");
			}
			
			@When("user click on Types of Linked List")
			public void user_click_on_types_of_linked_list() 
			throws InterruptedException {
				driver = DriverFactory.getDriver();
				LinkedListPage lp= new LinkedListPage(driver);
				lp.click_typesOfLLList();
				Thread.sleep(500);
				System.out.println(" **---clickd on Linkedlist -Types of Linked List");
			}
			
			@When("user click on Implement Linked List in Python")
			public void user_click_on_implement_linked_list_in_python()
			throws InterruptedException {
				driver = DriverFactory.getDriver();
				LinkedListPage lp= new LinkedListPage(driver);
				lp.click_implementLLInPythonLink();
				Thread.sleep(500);
				System.out.println(" **---clickd on Linkedlist - Implement Linked List in Python");
			}
			
			@When("user click on Traversal")
			public void user_click_on_traversal() 
			throws InterruptedException {
				driver = DriverFactory.getDriver();
				LinkedListPage lp= new LinkedListPage(driver);
				lp.traversalLink();
				Thread.sleep(500);
				System.out.println(" **---clickd on Linkedlist -Traversal");
				}
			
			@When("user click on Insertion")
			public void user_click_on_insertion() 
			throws InterruptedException {
				driver = DriverFactory.getDriver();
				LinkedListPage lp= new LinkedListPage(driver);
				lp.insertionLink();
				Thread.sleep(500);
				System.out.println(" **---clickd on Linkedlist -Insertion");
			}
			
			@When("user click on Deletion")
			public void user_click_on_deletion() 
			throws InterruptedException {
				driver = DriverFactory.getDriver();
				LinkedListPage lp= new LinkedListPage(driver);
				lp.deletionLink();
				Thread.sleep(500);
				System.out.println(" **---clickd on Linkedlist -Deletion");
			}
			
			@Then("User navigate back to Linklist")
			public void user_navigate_back_to_linklist() 
			throws InterruptedException {
				driver = DriverFactory.getDriver();
				LinkedListPage lp= new LinkedListPage(driver);
				lp.backToLinkList();
				Thread.sleep(500);
			}
	}
