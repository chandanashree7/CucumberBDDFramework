package stepdefinations;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GraphPage;

public class GraphStep {
	
	WebDriver driver;
	
				@When("user click on Get Started button on Graph")
				public void user_click_on_get_started_button_on_graph() {
					driver = DriverFactory.getDriver();
					GraphPage Gp= new GraphPage (driver);
					Gp.GraphGetStarted();
					System.out.println("cliced on link -  GraphGetStarted");
				}
				
				@When("It should navigate to Graph page with title {string}")
				public void it_should_navigate_to_graph_page_with_title(String string) {
				    
					driver = DriverFactory.getDriver();
					String ExpectedTitle = "Graph";
					String ActualTitle = driver.getTitle();
					System.out.println(ActualTitle);
				  	System.out.println(ExpectedTitle);
					Assert.assertEquals(ActualTitle, ExpectedTitle);
				}

			
				@When("user click on Operations in Graph")
				public void user_click_on_operations_in_graph() {
					driver = DriverFactory.getDriver();
					GraphPage Gp= new GraphPage (driver);
					Gp.Graphlink();
					System.out.println("cliced on link - Graphlink");
				}
			
				
				@Then("User navigate back to Graph")
				public void user_navigate_back_to_graph() {
					driver = DriverFactory.getDriver();
					GraphPage Gp= new GraphPage (driver);
					Gp.backToGraph();
					//Thread.sleep(2000);
			    	System.out.println("User navigate back to Stack - https://dsportalapp.herokuapp.com/graph");
				}
			
				@When("user click on Graph Representations")
				public void user_click_on_graph_representations() {
					driver = DriverFactory.getDriver();
					GraphPage Gp= new GraphPage (driver);
					Gp.GraphRepresentations();
					System.out.println("Cliced on link - GraphRepresentations ");
				}

		}
