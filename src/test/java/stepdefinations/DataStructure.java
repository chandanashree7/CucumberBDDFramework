package stepdefinations;

import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DataStructurePage;


public class DataStructure {
					
	WebDriver driver;
	
					@When("user click on Get Started button on Data Structure Page")
					public void user_click_on_get_started_button_on_data_structure_page() throws InterruptedException {
						driver = DriverFactory.getDriver();
						DataStructurePage Dp = new DataStructurePage(driver); 
					    	Dp.DataStructure();
					    	Thread.sleep(500);
					    	System.out.println("User clicked on Data Structure Get Started button  ");
					}
					
					@When("user click on Time Complexity")
					public void user_click_on_time_complexity() throws InterruptedException {
						//driver = DriverFactory.getDriver();
						DataStructurePage Dp = new DataStructurePage(driver); 
					    	Dp.TimeComplexity();
					    	Thread.sleep(500);
					    	System.out.println("User clicked on  Time Complexity ");
					   
					}
					
					@Then("User navigate back to Data Structure")
					public void user_navigate_back_to_data_structure() throws InterruptedException {
						DataStructurePage Dp = new DataStructurePage(driver); 
				    	Dp.backToDataStructure();
				    	Thread.sleep(500);
				    	System.out.println("User navigate back to  - https://dsportalapp.herokuapp.com/Data Structure");
					}


}
