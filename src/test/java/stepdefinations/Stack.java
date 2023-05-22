package stepdefinations;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
//import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import pages.StackPage;

public class Stack {
		
	   	WebDriver driver;

				@When("user click on Get Started button on Stack")
				public void user_click_on_get_started_button_on_stack() throws InterruptedException {
					driver = DriverFactory.getDriver();
					StackPage Sp = new StackPage(driver);
					Sp.StackGetStarted(); 
					 Thread.sleep(1000);
					 
				  }
			
				@When("It should navigate to Stack page with title {string}")
				public void it_should_navigate_to_stack_page_with_title(String strArg1) {
					driver = DriverFactory.getDriver();
					String ExpectedTitle = "Stack";
					String ActualTitle = driver.getTitle();
					System.out.println(ActualTitle);
				  	System.out.println(ExpectedTitle);
					Assert.assertEquals(ActualTitle, ExpectedTitle);
				}

				
				@When("user click on Operations in Stack")
				public void user_click_on_operations_in_stack()throws InterruptedException {
					driver = DriverFactory.getDriver();
					StackPage Sp = new StackPage(driver);
					Sp.OperationsINStack();
					System.out.println("cliced on link -  Operations in Stack");
					 Thread.sleep(500);
				}
				
				@Then("User navigate back to Stack")
				public void user_navigate_back() throws InterruptedException {
					driver = DriverFactory.getDriver();
					StackPage Sp = new StackPage(driver);
					Sp.backToStack();
			    	Thread.sleep(500);
			    	System.out.println("User navigate back to Stack - https://dsportalapp.herokuapp.com/stack");
			    	
			    }
				
				@When("user click on Implementation of Stack")
				public void user_click_on_implementation_of_stack() throws InterruptedException {
					driver = DriverFactory.getDriver();
					StackPage Sp = new StackPage(driver);
					Sp.ImplementationINStack();
					Thread.sleep(500);
					System.out.println("cliced on link -  Implementation in Stack");
				}

				@When("user click on Applications of Stack")
				public void user_click_on_applications_of_stack()throws InterruptedException {
					driver = DriverFactory.getDriver();
					StackPage Sp = new StackPage(driver);
					Sp.ApplicationsINStack();
					Thread.sleep(500);
					System.out.println("cliced on link -  Applications in Stack");
					
				}
				
	
}
