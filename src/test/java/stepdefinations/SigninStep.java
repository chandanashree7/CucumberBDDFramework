package stepdefinations;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import pages.LoginPage;
import utils.ExcelReader;

public class SigninStep {

	WebDriver driver;
	LoginPage signin = new LoginPage(DriverFactory.getDriver());

	@When("The user clicks Signin Link")
	public void the_user_clicks_signin_link() {
		driver = DriverFactory.getDriver();
		LoginPage lp = new LoginPage(driver);
		String GetURL = driver.getCurrentUrl();
		System.out.println("user is on the sign in --" + GetURL);
		lp.Signinlink();
		System.out.println("clicked on - Signin ");
	}

	@Given("The user is on signin page")
	public void the_user_is_on_signin_page() {
		driver = DriverFactory.getDriver();
		String GetURL = driver.getCurrentUrl();
		System.out.println("user is on the sign in --" + GetURL);

	}

	@When("The user enter sheet {string} and rownumber {int}")
	public void the_user_enter_sheet_and_rownumber(String sheetName, Integer RowNumber)
		throws InvalidFormatException, IOException {
		driver = DriverFactory.getDriver();
		ExcelReader reader = new ExcelReader();

		List<Map<String, String>> testData = reader.getData("./src/test/resources/ExcelData/LoginData.xlsx", sheetName);

		String username = testData.get(RowNumber).get("username");
		System.out.println("print username" + username);
		signin.enterSigninUsernameText(username);
		String password = testData.get(RowNumber).get("password");
		System.out.println("print username" + password);
		signin.enterSigninpasswordText(password);

	}

	@When("click on Login")
	public void click_on_login() throws InterruptedException {
		//driver = DriverFactory.getDriver();
		LoginPage lp = new LoginPage(driver);
	  	  lp.Login();
	  	  //MINAL---
	  	  String strurl = driver.getCurrentUrl();
	  	  Thread.sleep(1000);
	  	  System.out.println("Now curret url is ---- ");
	  	  System.out.println(strurl);
	  	  Thread.sleep(500);
	}

}
