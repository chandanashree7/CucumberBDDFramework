package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	 
	@FindBy(xpath="//a[@href='/home']")
	WebElement getstart;
	
	@FindBy(xpath="//div[@class='nav-item dropdown']")
	WebElement dropdown;
	
	@FindBy(xpath="//div[@class='dropdown-menu show']/a[3]")
	WebElement selectdrop;
	
	@FindBy(xpath="//div[@class='alert alert-primary'")
	WebElement  mesg;
	
	@FindBy(xpath="//div[@class='row row-cols-1 row-cols-md-3 g-4']/div[2]//a")
	WebElement getStartedbtn;
	
	@FindBy(xpath="//div[@class='navbar-nav'][2]/ul/a[2]")
	WebElement register;
	
	public void dropdownItem() {
		dropdown.click();
}
	public void selectdropdown() {
		selectdrop.click();
}
	public void mesg1() {
		mesg.getText();
}
	public void  registration() {
		 register.click();
}
	public String getHomePageTitle() {
		String title = driver.getTitle();
		return title;
	}
}
