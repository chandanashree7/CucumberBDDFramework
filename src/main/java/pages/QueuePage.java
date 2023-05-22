package pages;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QueuePage {
	
	public WebDriver driver ;
    	
	 // Define a constructor first 
		public QueuePage (WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
		
       @FindBy(xpath=".//a[@href='queue'][contains(text(),'Get Started')]")WebElement QueueGetStarted;
       
       //a[@href="queue"]
       
       @FindBy(xpath="/html/body/div[2]/ul[1]/a")WebElement ImplementationQPythonLink;
	     	
       //@FindBy(xpath="//a[@href='/tryEditor'][contains(text(),'Try here>>>')]")WebElement collectionsTryHere;
	
       @FindBy(xpath="//a[@href='implementation-collections'][contains(text(),'Implementation using collections.deque')]")WebElement impQCollectionLink;
		
		@FindBy(xpath="//a[text()='Implementation using array']") WebElement impArrayLink;
		
		@FindBy(xpath="//a[text()='Queue Operations']")WebElement queueOperationsLink;
		
		@FindBy(linkText = "Practice Questions")WebElement PracticeQuestionsLink;
		
		@FindBy(xpath = "//textarea[@tabindex='0']")WebElement editorInput;
				
		@FindBy(id = "output")WebElement output;
		
		public void  QueueGetStarted() {
			QueueGetStarted.click();
	    }

		public void  ImpQPython() {
			ImplementationQPythonLink.click();
	    }

		public void backToQueue() {
		 driver.get("https://dsportalapp.herokuapp.com/queue");	
		}
		

		
		public void impQCollectionLink() throws InterruptedException {
			impQCollectionLink.click();
			Thread.sleep(2000);
		}
				
		public void impArrayLink() {
			impArrayLink.click();
		}
		
		public void queueOperationsLink() {
			queueOperationsLink.click();
		}
		
}
