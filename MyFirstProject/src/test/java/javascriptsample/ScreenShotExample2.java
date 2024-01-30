package javascriptsample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class ScreenShotExample2 extends SeleniumUtility {

	@Test
	public void testScreenShot() throws IOException {
		WebDriver driver = setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");

		TakesScreenshot ts = (TakesScreenshot) driver;
		// get screenshot in file format
		File screenshot = ts.getScreenshotAs(OutputType.FILE);
		// store screenshot into required location
		FileUtils.copyFile(screenshot, new File(".//screenshots//vtiger.jpg"));
	}

	public void getScreenshot(WebDriver driver, String filePath) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		// get screenshot in file format
		File screenshot = ts.getScreenshotAs(OutputType.FILE);
		// store screenshot into required location
		try {
			FileUtils.copyFile(screenshot, new File(".//screenshots//vtiger.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}