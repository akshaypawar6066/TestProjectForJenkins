package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\applicationfeature\\Campaigns.feature"},
		
		glue = {"steps"}, 
		
		plugin = {"pretty"},
		
		tags = "@feature1"
		
		
		)



public class CampaignRunner extends AbstractTestNGCucumberTests {

}
