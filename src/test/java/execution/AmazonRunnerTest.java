package execution;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\execution"},
		
		glue = {"execution"},
		
		plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" , 
					"json:target/cucumber-report.json",
					"html:target/cucumber-reports/reports.html"},
		
		tags = "@sanity"
		
			
		)
public class AmazonRunnerTest extends AbstractTestNGCucumberTests {
	
	@DataProvider(parallel = false)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}

}
