package stepdefinations;

import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.en.When;
//import pages.LoginPage;
import pages.SignOutPage;

public class SignOutStep {
	
	
	WebDriver driver;
	//SignOutPage SignOut = new SignOutPage(DriverFactory.getDriver());
	

			@When("The user clicks logOut Link")
			public void the_user_clicks_log_out_link() {
				driver = DriverFactory.getDriver();
				SignOutPage Op = new SignOutPage(driver);
				String GetURL = driver.getCurrentUrl();
				System.out.println("user is on the sign OUT --" + GetURL);
				Op.SignOutlink();
				System.out.println("clicked on - SignOut ");
				
			}
			
			@When("it should give the Messege with signout suceesfuly")
			public void it_should_give_the_messege_with_signout_suceesfuly() {
				System.out.println(" User is signout Suceesfuly ");
			}


}
