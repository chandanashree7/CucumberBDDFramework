package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory; 

public class LoginPage {
	
//WebDriver driver = null;
WebDriver driver ;
	
    // Define a constructor first 
	public LoginPage (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	// Variables / WebElement declaration with path / id 
	
	@FindBy(xpath="//a[@href='/home']")WebElement getstart;
	
	@FindBy(xpath= "//a[@href='/login']")WebElement Signinlink ;
	
	
	@FindBy(id = "id_username" ) WebElement Validusername;
	
	@FindBy(id = "id_password" ) WebElement ValidPassword;
	
	@FindBy(xpath= ".//input[@value='Login']")WebElement Login ;
	
	//driver.findElement(By.xpath( ".//input[@value='Login']")).click();
	
	@FindBy(xpath="//*[@id='id_username']")
	WebElement signinusernametxt;
	
	@FindBy(xpath="//*[@id='id_password']")
	WebElement signinpasswordtxt;
	
	
	public void  Signinlink() {
		Signinlink.click();
    }
	
	
	public void enterValidusername(String username) {
		Validusername.clear();
		Validusername.sendKeys(username);
		
	}
	
	public void enterValidPassword(String password1) {
		ValidPassword.clear();
		ValidPassword.sendKeys(password1);
	}
	
	public void  Login() throws InterruptedException  {
		Login.click();
		Thread.sleep(2000);
    }
	
	public void enterSigninUsernameText(String username) {
		signinusernametxt.clear();
		signinusernametxt.sendKeys(username);

	}
	
	public void enterSigninpasswordText(String password) {
		signinpasswordtxt.clear();
		signinpasswordtxt.sendKeys(password);

	}
  }



