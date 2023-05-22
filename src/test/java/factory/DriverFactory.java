package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
    static WebDriver driver = null;
	
	public static void  init_driver(String browser) {
				
		
		ChromeOptions options = new ChromeOptions();	
		options.addArguments("--remote-allow-origins=*");
		
		if(browser.equals("Chrome")) {
			driver = new ChromeDriver(options);
			
		}else if(browser.equals("firefox")){
		   driver = new FirefoxDriver();
			
		}else if(browser.equals("edge")) {
		   driver = new EdgeDriver();
			
			
		}else if(browser.equals("safari")) {
		 driver = new SafariDriver();
		}
		
		
	}
	
	public static WebDriver getDriver() {
		return driver;
		
	}
		
		
		
	}


