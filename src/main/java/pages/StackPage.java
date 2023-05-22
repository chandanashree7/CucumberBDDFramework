package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StackPage {
	
			public WebDriver driver ;
			
			 // Define a constructor first 
				public StackPage (WebDriver driver) {
					this.driver=driver;
					PageFactory.initElements(driver,this);
				}
		
				
		@FindBy(xpath=".//a[@href='stack'][contains(text(),'Get Started')]")
		WebElement StackGetStarted;
						
		@FindBy(xpath=".//a[@href='operations-in-stack'][contains(text(),'Operations in Stack')]")
		WebElement OperationsINStack;
		
		@FindBy(xpath=".//a[@href='implementation'][contains(text(),'Implementation')]")
		WebElement ImplementationINStack;
		
		@FindBy(xpath=".//a[@href='stack-applications'][contains(text(),'Applications')]")
		WebElement ApplicationsINStack;
		
		
		
		public void  StackGetStarted() {
			StackGetStarted.click();
	    }
		
		public void  OperationsINStack() {
			OperationsINStack.click();;
	    }
		
		public void ImplementationINStack() {
			ImplementationINStack.click();
		}
		
		public void ApplicationsINStack() {
			ApplicationsINStack.click();
		}
		
		public void backToStack() {
			 driver.get("https://dsportalapp.herokuapp.com/stack");	
			}
		
		
		
}
