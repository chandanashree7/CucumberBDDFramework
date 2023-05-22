package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommanPage {


	public WebDriver driver ;
 	
	 // Define a constructor first 
		public CommanPage (WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
 	  //@FindBy(xpath=".//a[@href='queue'][contains(text(),'Get Started')]")WebElement QueueGetStarted;
		@FindBy(xpath="//a[@href='/home']")WebElement getstart;
		@FindBy(xpath=".//a[@class='btn btn-info'][contains(text(),'Try here>>>')]")WebElement CommanTryHere;
		@FindBy(xpath="//*[@id='answer_form']/div/div/div[6]/div[1]")WebElement ComAssignment ;
		@FindBy(xpath="//*[@id='answer_form']/button[contains(text(),'Run')]")WebElement ComRun;
		@FindBy(xpath = "//textarea[@tabindex='0']")WebElement PythonAssCodeText;
		@FindBy(xpath = "//a[@href='/home']")WebElement clickGetStarted;
		@FindBy(xpath = "//a[@class='navbar-brand'][contains(text(),'NumpyNinja')]") WebElement NumpyNinjaHome;
		
		
		@FindBy(xpath= "//a[@href='/login']")WebElement SigninLINK ;
		
		public void  CommanTryHere() {
			CommanTryHere.click();
	    } 
		
		
		public void clickOnGetStart() {
			getstart.click();
		}
		
		public void PythonAssCode(String pythoncode) {
			System.out.println("********* code **********");
			PythonAssCodeText.sendKeys(pythoncode);
		
		}
		
		public void clickOnGetStarted(String string) {
			clickGetStarted.click();
		}
		
		
		public void ComRun() throws InterruptedException {
			ComRun.click();
			Thread.sleep(2000);
	    }
		
		public void backToHomePage() {
		 driver.get("https://dsportalapp.herokuapp.com/home");	
		}
		
		public void  SigninLINK() {
			SigninLINK.click();
	    }
	    
		public void NumpyNinjaHome() {
			NumpyNinjaHome.click();
		}
	     
}
