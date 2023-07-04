package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\applicationfeature\\Profile.feature"},
		
		glue = {"steps", "hooks" },
		
		plugin = {"pretty"}
	
				
		)



public class ProfileRunner extends AbstractTestNGCucumberTests {

}
