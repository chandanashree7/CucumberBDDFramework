package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DataStructurePage {
	
	
	public WebDriver driver ;
	
	 // Define a constructor first 
		public DataStructurePage (WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
		
		@FindBy(xpath=".//a[@href='data-structures-introduction'][contains(text(),'Get Started')]")WebElement DataStructure;
		
		public void DataStructure() {
			DataStructure.click();
		}
		
		@FindBy(xpath=".//a[@href='time-complexity'][contains(text(),'Time Complexity')]")WebElement TimeComplexity;
		
		public void TimeComplexity() {
			TimeComplexity.click();
		}
		
		public void backToDataStructure() {
			 driver.get("https://dsportalapp.herokuapp.com/data-structures-introduction/time-complexity/");	
			}

	

}
