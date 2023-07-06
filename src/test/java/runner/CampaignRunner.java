package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\applicationfeature\\Campaigns.feature"},
		
		glue = {"steps", "hooks" }, 
		
		plugin = {"pretty"},
		
		dryRun = true
		
		
		)



public class CampaignRunner extends AbstractTestNGCucumberTests {

}
