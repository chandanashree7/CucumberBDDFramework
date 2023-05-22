package stepdefinations;

import org.openqa.selenium.WebDriver;

//import io.cucumber.datatable.DataTable;

//import java.util.List;

//import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import factory.DriverFactory;
//import io.cucumber.java.PendingException;
import io.cucumber.java.en.*;
//import pages.LoginPage;
import pages.QueuePage;

public class Queue  {
//extends BaseClass {
	   
	WebDriver driver;
	
				@When("^user click on Get Started button on Queue$")
			    public void user_click_on_get_started_button_on_queue() throws InterruptedException {
		    	   driver = DriverFactory.getDriver();
		    	   QueuePage Qp = new QueuePage(driver); 
			    	Qp.QueueGetStarted();
			    	Thread.sleep(500);
			    }

			    @When("^user click on Implementation of Queue in Python$")
			    public void user_click_on_implementation_of_queue_in_python()  throws InterruptedException  {
			    	QueuePage Qp = new QueuePage(driver);
			    	Qp.ImpQPython();
			    	Thread.sleep(500);
			    	System.out.println("cliced on link - implementation_of_queue_in_python" );
			    	//CLICK
			    }
			
			    
			    @Then("User navigate back Queue")
			    public void user_navigate_back_queue() throws InterruptedException {
			    	driver = DriverFactory.getDriver();
			    	QueuePage Qp = new QueuePage(driver);
			    	Qp.backToQueue();
			    	Thread.sleep(500);
			    	System.out.println("User navigate back to Queue - https://dsportalapp.herokuapp.com/queue");
			    }

	    
			    @When("user click on Implementation using collections_deque")
			    public void user_click_on_implementation_using_collections_deque() throws InterruptedException {
			    	driver = DriverFactory.getDriver();
			    	QueuePage Qp = new QueuePage(driver);
			    	System.out.println("cliced on link - implementation_using_collections_deque Befor " );
			    	Qp.impQCollectionLink();
			      	System.out.println("cliced on link - implementation_using_collections_deque " );
			    	//CLICK on link
			    }
			  
			    @When("user click on Implementation using array")
			    public void user_click_on_implementation_using_array() throws InterruptedException {
			    	driver = DriverFactory.getDriver();
			    	QueuePage Qp = new QueuePage(driver);
			         Qp.impArrayLink();
			         System.out.println("cliced on link - on Implementation using Array ");
			         Thread.sleep(500);
			    }
	    
			    @When("user click on Queue Operations")
			    public void user_click_on_queue_operations() throws InterruptedException {
			    	driver = DriverFactory.getDriver();
			    	QueuePage Qp = new QueuePage(driver);
			         Qp.queueOperationsLink();
			         System.out.println("cliced on link - on Queue Operations ");
			         Thread.sleep(500);
			    }
}
			
			    

