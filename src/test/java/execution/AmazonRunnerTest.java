package execution;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\execution"},
		
		glue = {"execution"},
		
		plugin = {"pretty"},
		
		tags = "@functional"
			
		)
public class AmazonRunnerTest extends AbstractTestNGCucumberTests {

}
