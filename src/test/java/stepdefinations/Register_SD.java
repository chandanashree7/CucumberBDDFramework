package stepdefinations;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import factory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.RegisterPage;
import utils.ConfiReader;
import utils.ExcelReader;

public class Register_SD {

	WebDriver driver;
	RegisterPage register = new RegisterPage(DriverFactory.getDriver());
	HomePage home = new HomePage(DriverFactory.getDriver());
	
	//String Excelpath = ConfiReader.getexcelfilepath();
	//static String excelusername;
	//static String excelpassword;
	
	@When("The user clicks {string} Link")
	public void the_user_clicks_link(String string)
	throws InterruptedException {
		register.clickOnRegisterLink(string);
		Thread.sleep(500);
		System.out.println("User click on --- " + string + "Link");
	}

	@Then("The user should be redirected to Register form")
	public void the_user_should_be_redirected_to_register_form() throws InterruptedException  {
		String Title = register.getRegisterPageTitle();
		Thread.sleep(500);
		System.out.println("Print Registrationpage title --- " + Title);
	}

	@When("^user click \"([^\"]*)\" button without entering anything$")
	public void user_click_something_button_without_entering_anything(String strArg1) 
	throws Throwable {
		register.clickOnRegisterButton(strArg1);
		System.out.println("User click on --- " + strArg1 + "button");
		Thread.sleep(500);

	}

	@Then("^user should get fillout field error message \"([^\"]*)\" below username field.$")
	public void user_should_get_fillout_field_error_message_something_below_username_field(String strArg1)
			throws Throwable {
		Assert.assertEquals(register.validationEmptyFieldsusername(), strArg1);
		Thread.sleep(500);
	}

	@When("user enters username")
	public void user_enters_username(DataTable dataTable)
	throws Throwable {
		Map<String, String> dataMap = dataTable.asMap(String.class, String.class);
		register.enterUsernameText(dataMap.get("username"));
		System.out.println("**@When - user enters username ");
		Thread.sleep(500);
	}

	@And("^click on \"([^\"]*)\" button$")
	public void click_on_something_button(String strArg1) 
	throws Throwable {
		register.clickOnRegisterButton(strArg1);
		Thread.sleep(500);
	}

	@Then("^user should get fillout field error message \"([^\"]*)\" below password field.$")
	public void user_should_get_fillout_field_error_message_something_below_password_field(String strArg1)
	throws Throwable {
		Assert.assertEquals(register.validationEmptyFieldspassword1(), strArg1);
	}

	@When("user enters username and password")
	public void user_enters_username_and_password(DataTable dataTable)
	throws InterruptedException{
		Map<String, String> dataMap = dataTable.asMap(String.class, String.class);
		register.enterUsernameText(dataMap.get("username"));
		register.enterPassword1Text(dataMap.get("password1"));
		Thread.sleep(500);
		
		System.out.println("@When(\"user enters username and password\")");
		
	}

	@And("^click \"([^\"]*)\" button$")
	public void click_something_button(String strArg1) 
	throws Throwable {
		register.clickOnRegisterButton(strArg1);
	}

	@Then("^user should get fillout field error message \"([^\"]*)\" below passwordconfirmation field.$")
	public void user_should_get_fillout_field_error_message_something_below_passwordconfirmation_field(String strArg1)
	throws Throwable {
		Assert.assertEquals(register.validationEmptyFieldspassword2(), strArg1);
		Thread.sleep(500);
	}

	@When("user enters a valid username password and passwordconfirmation")
	public void user_enters_a_valid_username_password_and_passwordconfirmation(DataTable dataTable) 
	throws InterruptedException {
		Map<String, String> dataMap = dataTable.asMap(String.class, String.class);
		register.enterUsernameText(dataMap.get("username"));
		register.enterPassword1Text(dataMap.get("password1"));
		Thread.sleep(1000);
		register.enterPassword2Text(dataMap.get("password2"));
		Thread.sleep(500);
		System.out.println(dataTable);
		String myvalidUser = dataMap.get("username");
		String mypassword1 = dataMap.get("password1");
		System.out.println("myvalidUser--"+myvalidUser);
		System.out.println("mypassword1--"+mypassword1);
	}

	@When("click {string} button with valid data")
	public void click_button_with_valid_data(String string)
	throws InterruptedException {
		register.clickOnRegisterButton(string);
		Thread.sleep(1000);
	}

	@Then("The user should be redirected to Homepage with the message {string}")
	public void the_user_should_be_redirected_to_homepage_with_the_message(String string) 
	throws InterruptedException {
		 String Title = home.getHomePageTitle();
		 Thread.sleep(1000);
		 System.out.println("Print Homepage title --- " + Title);
	}
	
	
}
