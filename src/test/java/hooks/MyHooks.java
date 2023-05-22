package hooks;

import java.time.Duration;


import java.util.Properties;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
//import io.cucumber.java.BeforeAll;
import utils.ConfiReader;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import java.io.ByteArrayInputStream;

public class MyHooks {
	
	
	public static String strurl ;
	
    static WebDriver driver;
    
	@BeforeAll
	public static void setup(){
    	//System.out.println(myFlag);
		System.out.println("-- @BeforeAll hook executed  ");
		System.setProperty("extent.reporter.html.out","test-output/HtmlReport/");
		Properties prop = ConfiReader.init_Properties();
		DriverFactory.init_driver(prop.getProperty("browser")); 
		//driver = DriverFactory.getDriver();
		driver = DriverFactory.getDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get(prop.getProperty("url"));}
	
	   
	@After
	public void afterstep(Scenario scenario) {
		if (scenario.isFailed()) {
			//Loggerload.error("Steps Failed , Taking Screenshot");
			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "My screenshot");
			System.out.println("-- @After-- failed  Scenario ");
			Allure.addAttachment("Myscreenshot",
				new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));}
		
		}

	
	
	@AfterAll
	public static void tearDown() {
		//driver.quit(); 
		System.out.println("-- @AfterAll hook executed ");
		}

	

}
