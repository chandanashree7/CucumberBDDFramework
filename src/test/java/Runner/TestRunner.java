package Runner;
// DS_Algo 
//import org.junit.runner.RunWith;

//import io.cucumber.junit.Cucumber; 
//import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber; 
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
			features = {"src/test/resources/features"},
		    glue = {"stepdefinations","hooks"},
			plugin= {//"pretty","html:target/cucumber.html",					 
					"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
					"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
			})
		
public class TestRunner {
	
	
}

