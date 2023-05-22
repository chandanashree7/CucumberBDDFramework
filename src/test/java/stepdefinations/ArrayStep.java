package stepdefinations;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ArrayPage;


public class ArrayStep {

	WebDriver driver;

	@When("^user click on Get Started button on Arrays$")
    public void user_click_on_get_started_button_on_arrays() throws InterruptedException {
					driver = DriverFactory.getDriver();
					ArrayPage Ap = new ArrayPage(driver);
					Ap.ArrayGetStarted();
					Thread.sleep(500);
				}
	
	

	@When("It should navigate to Array page with title {string}")
	public void it_should_navigate_to_array_page_with_title(String string) {
					//String ExpectedTitle = "Array";
					driver = DriverFactory.getDriver();
					ArrayPage Ap = new ArrayPage(driver);
					System.out.println(" Array page title -- " + string);
					String ExpectedTitle = string;
					String ActualTitle = driver.getTitle();
					System.out.println("ActualTitle -- "+ActualTitle);
				  	System.out.println("ExpectedTitle -- "+ExpectedTitle);
					Assert.assertEquals(ActualTitle, ExpectedTitle);
				}
				
				@When("Navigate to Operations in page with title {string}")
				public void navigate_to_operations_in_page_with_title(String stringtext) {
					System.out.println(" Operations page title -- " + stringtext);
					String ExpectedTitle2 = stringtext ;
					String ActualTitle2 = driver.getTitle();
					System.out.println("ActualTitle--"+ActualTitle2);
					Assert.assertEquals(ActualTitle2,ExpectedTitle2);
				}
				
				@When("user click on Operations in  Arrays in Python")
				public void user_click_on_operations_in_arrays_in_python() throws InterruptedException {
					driver = DriverFactory.getDriver();
					ArrayPage Ap = new ArrayPage(driver);
					Ap.ArraysInPython();
					Thread.sleep(500);
					System.out.println("cliced on link - Arrays in Python");
				}
				
				@When("user click on Operations in  Arrays Using List")
				public void user_click_on_operations_in_arrays_using_list() throws InterruptedException {
					driver = DriverFactory.getDriver();
					ArrayPage Ap = new ArrayPage(driver);
					Ap.ArraysUsingList();
					System.out.println("cliced on link - Arrays Using List");
				}
				
				@When("user click on Operations in  Basic Operations in Lists")
				public void user_click_on_operations_in_basic_operations_in_lists() throws InterruptedException {
					ArrayPage Ap = new ArrayPage(driver);
					Ap.BasicOperationsLists();
					Thread.sleep(500);
					System.out.println("cliced on link - Basic Operations in Lists");
				}
				
				@When("user click on Operations in  Applications of Array")
				public void user_click_on_operations_in_applications_of_array() {
					ArrayPage Ap = new ArrayPage(driver);
					Ap.ApplicationsOfArray();
				}
				
				@Then("User navigate back to Arrays")
				public void user_navigate_back_to_arrays() throws InterruptedException  {
					ArrayPage Ap = new ArrayPage(driver);
					Ap.backToArray();
					Thread.sleep(500);
			    	System.out.println("User navigate back to Array - https://dsportalapp.herokuapp.com/array ");
				}
	
}
