package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ArrayPage {

	
	public WebDriver driver ;
	
	 // Define a constructor first 
		public ArrayPage (WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
		
		
		@FindBy(xpath=".//a[@href='array'][contains(text(),'Get Started')]")WebElement ArrayGetStarted;
		
		@FindBy(xpath=".//a[@href='arrays-in-python'][contains(text(),'Arrays in Python')]")
		WebElement ArraysInPython;
		
		@FindBy(xpath=".//a[@href='arrays-using-list'][contains(text(),'Arrays Using List')]")
		WebElement ArraysUsingList;
		
		@FindBy(xpath=".//a[@href='basic-operations-in-lists'][contains(text(),'Basic Operations in Lists')]")
		WebElement BasicOperationsLists;
		
		@FindBy(xpath=".//a[@href='applications-of-array'][contains(text(),'Applications of Array')]")
		WebElement ApplicationsOfArray;
		
		public void ArrayGetStarted() {
			ArrayGetStarted.click();
		}
	
		public void ArraysInPython() {
			ArraysInPython.click();
		}
		
		public void ArraysUsingList() {
			ArraysUsingList.click();
		}
		
		
		public void BasicOperationsLists() {
			BasicOperationsLists.click();
		}
		
		public void ApplicationsOfArray() {
			ApplicationsOfArray.click();
		}
		
		public void backToArray() {
			 driver.get("https://dsportalapp.herokuapp.com/array");	
			}
		
		
		
}
