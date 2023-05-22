package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage {
	
	WebDriver driver;

	@FindBy(xpath = "//a[@href='/register']")
	WebElement clickRegisterLink;

	@FindBy(id = "id_username")
	WebElement usernameText;

	@FindBy(id = "id_password1")
	WebElement passwordText1;

	@FindBy(id = "id_password2")
	WebElement passwordText2;

	@FindBy(xpath = "//input[@value='Register']")
	WebElement clickRegisterButton;

	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	

	public void clickOnRegisterLink(String string) {
		clickRegisterLink.click();
	}

	public void clickOnRegisterButton(String string) {

		clickRegisterButton.click();
	}

	public String validationEmptyFieldsusername() throws InterruptedException {
		String mesg = usernameText.getAttribute("validationMessage");
		System.out.println("Error Message--" + mesg);
		return mesg;
	}

	public String validationEmptyFieldspassword1() throws InterruptedException {
		String mesg = passwordText1.getAttribute("validationMessage");
		return mesg;
	}

	public String validationEmptyFieldspassword2() throws InterruptedException {
		String mesg = passwordText2.getAttribute("validationMessage");
		return mesg;
	}

	public String getRegisterPageTitle() {
		String title = driver.getTitle();
		return title;
	}

	public void enterUsernameText(String username) {
		usernameText.clear();
		usernameText.sendKeys(username);

	}

	public void enterPassword1Text(String password1) {
		passwordText1.clear();
		passwordText1.sendKeys(password1);
	}

	public void enterPassword2Text(String password2) {
		passwordText2.clear();
		passwordText2.sendKeys(password2);
	}
	
}

