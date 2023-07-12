package execution;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\execution"},
		
		
//		features = {"@target/failedrun.txt"},
		
		glue = {"execution"},
		
		plugin = {"pretty", "rerun:target/failedrun.txt"}
				
		)
public class AmazonFailedRunnerTest extends AbstractTestNGCucumberTests {

}
