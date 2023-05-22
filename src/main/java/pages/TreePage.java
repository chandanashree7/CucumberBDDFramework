package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TreePage {

	public WebDriver driver ;
    
	
	 // Define a constructor first 
		public TreePage (WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
		
		@FindBy(xpath = "//a[@href='tree'][contains(text(),'Get Started')]")WebElement TreeGetStarted;
		
		public void  TreeGetStarted() {
			TreeGetStarted.click();
	    }
		
		@FindBy(xpath = "//a[@href='overview-of-trees'][contains(text(),'Overview of Trees')]")WebElement OverviewOfTree;
		
		public void OverviewOfTree() {
			OverviewOfTree.click();
		}
		
		@FindBy(xpath = "//a[@href='terminologies'][contains(text(),'Terminologies')]")WebElement TerminologiesOfTree;
		
		public void TerminologiesOfTree() {
			TerminologiesOfTree.click();
		}
		
		
    	@FindBy(linkText = "Types of Trees") WebElement typesoftree;
    	public void typesoftree() {
			typesoftree.click();
		}
    	
    	@FindBy(linkText = "Tree Traversals")WebElement treeTraversals;
    	public void treeTraversals() {
			treeTraversals.click();
		}
    	
    	@FindBy(xpath="//a[contains(text(),'Binary Trees')]")WebElement binaryTree;
    	//@FindBy(linkText = "Binary Trees")WebElement binaryTree;
    	public void binaryTree() {
			binaryTree.click();
		}
    	
    	@FindBy(xpath = "//a[contains(text(),'Types of Binary Trees')]") WebElement typesofBT;		
    	public void typesofBT() {
			typesofBT.click();
		}
		
		
		@FindBy(xpath="//a[contains(text(),'Binary Tree Traversals')]") WebElement  binarytreeTraversals;
		public void binarytreeTraversals () {
			binarytreeTraversals.click();
		}
		
		@FindBy(xpath="//a[contains(text(),'Implementation in Python')]") WebElement implemeentationofPython;
		public void implemeentationofPython() {
			implemeentationofPython.click();
		}
		
    	@FindBy(xpath="//a[contains(text(),'Implementation of Binary Trees')]") WebElement implementaionofBtree ;
    	public void implementaionofBtree() {
    		implementaionofBtree.click();
    	}
    	
    	@FindBy(xpath="//a[contains(text(),'Applications of Binary trees')]") WebElement applicationofBtree;
    	public void applicationofBtree() {
    		applicationofBtree.click();
    	}
    	
    	@FindBy(xpath="//a[contains(text(),'Binary Search Trees')]") WebElement binarysearchTree;
    	public void binarysearchTree() {
    		binarysearchTree.click();
    	}
    	
    	@FindBy(xpath = "//a[contains(text(),'Traversals-Illustration')]") WebElement illustration;
    	public void illustration() {
    		illustration.click();
    	}
    	
    	
    	@FindBy(xpath = "//a[contains(text(),'Implementation Of BST')]") WebElement ImpOfBST;
    	public void ImpOfBST() {
    		ImpOfBST.click();
    	}
    	
    	
    	public void backToTree() {
			 driver.get("https://dsportalapp.herokuapp.com/tree/");
			}
		

		
		
		
}
