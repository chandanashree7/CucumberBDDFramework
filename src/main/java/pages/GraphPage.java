package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GraphPage {

	public WebDriver driver ;
	
	 // Define a constructor first 
		public GraphPage (WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
	
		@FindBy(xpath="//a[@href='graph'][contains(text(),'Get Started')]")
		WebElement GraphGetStarted;
	
		public void GraphGetStarted (){
			GraphGetStarted.click();
		}
		
		@FindBy(xpath="//a[@href='graph'][contains(text(),'Graph')]") 
		WebElement Graphlink;
		
		public void Graphlink() {
			Graphlink.click();
		}
		
		@FindBy(xpath="//a[@href='graph-representations'][contains(text(),'Graph Representations')]")
		WebElement GraphRepresentations;
		
		public void GraphRepresentations () {
			GraphRepresentations.click();
		}
		
		public void backToGraph() {
			 driver.get("https://dsportalapp.herokuapp.com/graph");	
			}
		
}
