package execution;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import qa.DriverFactory;
import utility.Screenshots;

public class MyAppHooks {

	WebDriver driver;
	DriverFactory df;
	
	@Before
	public void launchBrowser() throws IOException
	{
		Properties prop = new Properties();
		
		String path = System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties";
		
		FileInputStream fis = new FileInputStream(path);
		
		prop.load(fis);
		
		 df = new DriverFactory();
		
		String browsername = prop.getProperty("browser");// reading the value from properties file
		
		String maven_browserName = System.getProperty("clibrowser");
		String enteredurl = System.getProperty("url");
		
		System.out.println(enteredurl);
		
		
		if(maven_browserName!= null)
		{
			browsername = maven_browserName;
		}
		
		
		driver = df.initBrowser(browsername);// launching the browser
		
		driver.manage().window().maximize();
	}
	
	@After(order = 2)
	public void tearDown(Scenario scenario) throws FileNotFoundException, IOException
	{
		boolean isfailed = scenario.isFailed();
		
		if(isfailed)
		{
			String scenarioName = scenario.getName();
			String name = scenarioName.replaceAll(" ", "_");
			
			TakesScreenshot ts = (TakesScreenshot)driver;
			
			byte[] source = ts.getScreenshotAs(OutputType.BYTES);
			
			scenario.attach(source, "image/png", name);
			
		}
	}
	
	@After(order = 1)
	public void quitBrowser()
	{
		driver.quit();
	}
	
	
}
