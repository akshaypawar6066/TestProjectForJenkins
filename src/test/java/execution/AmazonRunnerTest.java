package execution;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\execution"},
		
		glue = {"execution"},
		
		plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }
		
			
		)
public class AmazonRunnerTest extends AbstractTestNGCucumberTests {
	
	@DataProvider(parallel = true)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}

}
