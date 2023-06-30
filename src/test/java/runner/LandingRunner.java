package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\applicationfeature\\LandingPage.feature"},
		
		glue = {"steps"}
		
		)




public class LandingRunner extends AbstractTestNGCucumberTests {

}
