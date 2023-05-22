package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
public class SignOutPage {
	
	//WebDriver driver = null;
		WebDriver driver ;
		
	    // Define a constructor first 
		public SignOutPage (WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
	
		@FindBy(xpath="//a[@href='/logout']")WebElement SignOutlink;
		
		public void SignOutlink(){
			
			SignOutlink.click();
		}
	

}
