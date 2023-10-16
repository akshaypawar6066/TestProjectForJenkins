package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Base64;

import org.apache.commons.io.IOUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshots {

	public static String captureScreenShots(WebDriver driver, String filename) throws FileNotFoundException, IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;

		File screenshot = ts.getScreenshotAs(OutputType.FILE);

		String path = System.getProperty("user.dir") + "//Screenshots//" + filename + ".png";

		File destinationpath = new File(path);
		
		FileHandler.copy(screenshot, destinationpath);
		byte[] byteArray = IOUtils.toByteArray(new FileInputStream(path));

		return Base64.getEncoder().encodeToString(byteArray);
	}

}
