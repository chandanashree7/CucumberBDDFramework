package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkedListPage {
	
			public WebDriver driver ;

				public LinkedListPage (WebDriver driver) {
					this.driver=driver;
					PageFactory.initElements(driver,this);
				}
					
	          @FindBy(linkText = "Get Started")WebElement getStarted;
			  @FindBy(xpath = "//a[@href='data-structures-introduction']")WebElement getStartDataStructures;
			  @FindBy(xpath = "//a[@href='linked-list']")WebElement getstart_linkedlist;
			  
		
			@FindBy (xpath="//a[@href='introduction']")WebElement introductionLink;  
			@FindBy (xpath="//a[@href='creating-linked-list']")WebElement creatinglinkedlistLink; 
			@FindBy (xpath="//a[@href='types-of-linked-list']")WebElement typesOfLLLink;  
			@FindBy (xpath="//a[@href='implement-linked-list-in-python']")WebElement implementLLInPythonLink; 
			@FindBy (xpath="//a[@href='traversal']")WebElement traversalLink; 
			@FindBy (xpath="//a[@href='insertion-in-linked-list']")WebElement insertionLink; 
			@FindBy (xpath="//a[@href='deletion-in-linked-list']")WebElement deletionLink;  
			@FindBy(xpath = "//a[@href='/tryEditor']")WebElement tryHereLink;
			

			public void  getStarted() {
				//getStarted.click(); minal
				getstart_linkedlist.click();
		    }
			
			public void introductionLink() {
				introductionLink.click();
				}
			public void click_creatingLinkedListLink() {
				creatinglinkedlistLink.click();
			}

			public void click_typesOfLLList() {
				typesOfLLLink.click();
			}

			public void click_implementLLInPythonLink() {
				implementLLInPythonLink.click();
			}

			public void traversalLink() {
		        traversalLink.click();
			}

			public void insertionLink() {
				insertionLink.click();
				
			}

			public void deletionLink() {
				deletionLink.click();
			}
			
			//-- minal
			public void backToLinkList() {
				 driver.get("https://dsportalapp.herokuapp.com/linked-list/");	
				}
			

	
				
			}
