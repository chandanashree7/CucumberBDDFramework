/* Project-DSAlgo
 * CommanStep Defination Pakage *
 * This package is used for all*
 * Comman steps/ Scenarious defenation *
 * Created by - User *
 * verssion - 0.1 *
 * Update Date - *
 */ 
package stepdefinations;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import factory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CommanPage;
//import pages.QueuePage;
import pages.LoginPage;
//import pages.RegistrationPage;
//import pages.HomePage; 

public class CommanStep {

	WebDriver driver;
	
	
	@Given("user opens browser and launch the url {string}")
	public void user_opens_browser_and_launch_the_url(String string) {
		driver = DriverFactory.getDriver();
		//CommanPage Cp = new CommanPage(driver);
		System.out.println("Lounch main page  -"+ string );
		driver.navigate().refresh();
	}
	
	@When("The user is in home page")
	public void the_user_is_in_home_page()throws InterruptedException {
		driver = DriverFactory.getDriver();
		CommanPage Cp = new CommanPage(driver);
		String Current_URL= driver.getCurrentUrl();
		System.out.println("You are on this URL main page  -"+Current_URL);
	}
	
	/*@When("^The user clicks the \"([^\"]*)\" button$")
	public void the_user_clicks_the_something_button(String strArg1) throws Throwable {
		//HomePage home = new HomePage(driver);
		//home.clickOnGetStart();
		CommanPage Cp = new CommanPage(driver);
    	Cp.clickOnGetStart();
		System.out.println("User click on --- " + strArg1 + "button");
	}*/
	
	@When("user clicks on {string} button")
	public void user_clicks_on_button(String string) throws InterruptedException {
		CommanPage Cp = new CommanPage(driver);
    	Cp.clickOnGetStart();
    	System.out.println("User click on --- " + string + "button");
    	System.out.println("cliced on clickOnGetStart- Lounch the home page");
		Thread.sleep(800);
	}

	/*@Given("^The user is in home pages$")
    	public void the_user_is_in_home_pages () throws InterruptedException
    		{
			 //driver = DriverFactory.getDriver();
			 LoginPage lp = new LoginPage(driver);   
			// System.out.println("*************CommanStep************");  
			 //lp.clickOnGetStart();
			 System.out.println("clicked on get strted button ");
		     lp.Signin();
		     System.out.println("clicked on Sgnin button ");
		     //lp.Username(username);
		     //lp.Password(password);
		     lp.Username();
		     lp.Password();
		     lp.Login();
		     //System.out.println("Clicked on login Page");
			}*/
	
			
	
		@When("It should navigate to corresponding page with title {string}")
			public void it_should_navigate_to_corresponding_page_with_title(String ExpectedText) {
			driver = DriverFactory.getDriver();
			System.out.println("***"+ ExpectedText);
	    	String ExpectedTitle = ExpectedText ;
	    	String ActualTitle = driver.getTitle();
	    	System.out.println("Actual--"+ActualTitle);
	      	System.out.println("Expected--"+ExpectedTitle);
	    	Assert.assertEquals(ActualTitle, ExpectedTitle);
	    	}
	
		@When("^user clicks on Try here$")
	    public void user_clicks_on_try_here() throws InterruptedException 
		{
			driver = DriverFactory.getDriver();
			CommanPage Cp = new CommanPage(driver);
	    	Cp.CommanTryHere();
	    	System.out.println("user clicked on Try here");
	    	Thread.sleep(800);
	    }
			
		@And("^It should navigate to Assessment page with title \"([^\"]*)\"$")
			    public void it_should_navigate_to_assessment_page_with_title(String strArg1)  
		        {
			        driver = DriverFactory.getDriver();
			    	String ExpectedTitle = "Assessment";
			    	String ActualTitle = driver.getTitle();
			    	System.out.println(ActualTitle);
			      	System.out.println(ExpectedTitle);
			    	Assert.assertEquals(ActualTitle, ExpectedTitle);
			     }
			 
		/*
		   @When("^user enter the Python code$")
			    public void user_enter_the_python_code()throws InterruptedException {
		  	       CommanPage Cp = new CommanPage(driver);
			    	System.out.println("code after in editor ");
			    	Cp.PythonAssCode();
		   }*/
			    	
		//----minal 
		
		@When("^user enter the Python code$")
			   public void user_enter_the_python_code(DataTable Pythoncode)throws InterruptedException 
		       {
			        driver = DriverFactory.getDriver();
					CommanPage cp = new CommanPage (driver);
			    	System.out.println(" *** Enter the code in comman editor ***");
					List<List<String>> userList = Pythoncode.asLists(String.class);
					cp.PythonAssCode(userList.get(0).get(0));
					for (List<String> e : userList) {
						System.out.println(e);
					}
					System.out.println("comman code");
					
				}

		@And("^click on run button$")
			    public void click_on_run_button() throws InterruptedException {
					driver = DriverFactory.getDriver();
					CommanPage Cp = new CommanPage(driver);
			    	Cp.ComRun();
			    	System.out.println("Clicked on Run Button");
		    		Thread.sleep(1000);
		    		//driver.switchTo().alert().accept();
			    }			 
	
		@Then("user is navigated to home page {string}")
			    public void user_is_navigated_to_home_page(String string)
			    throws InterruptedException {
			     driver = DriverFactory.getDriver();
				 CommanPage Cp = new CommanPage(driver);
			        Cp.backToHomePage();
			        Thread.sleep(500);
			       	System.out.println("User navigate back to Home - https://dsportalapp.herokuapp.com/home");
			   }
		
		
		@Then("User navigate back to HomePage")
		public void user_navigate_back_to_home_page()
				throws InterruptedException {
			driver = DriverFactory.getDriver();
			CommanPage Cp = new CommanPage(driver);
	        Cp.NumpyNinjaHome();
	    	System.out.println("Clicked on NumpyNinjaHome Button");
	    	//Thread.sleep(1000);
		}
			 
			 
}
