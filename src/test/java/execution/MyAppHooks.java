package execution;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import io.cucumber.java.Before;
import qa.DriverFactory;

public class MyAppHooks {

	
	
	@Before
	public void launchBrowser() throws IOException
	{
		Properties prop = new Properties();
		
		String path = System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties";
		
		FileInputStream fis = new FileInputStream(path);
		
		prop.load(fis);
		
		DriverFactory df = new DriverFactory();
		
		String browsername = prop.getProperty("browser");
		
		df.initBrowser(browsername);
	}
	
	
}
