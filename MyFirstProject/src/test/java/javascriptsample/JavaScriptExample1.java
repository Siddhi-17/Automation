package javascriptsample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class JavaScriptExample1 extends SeleniumUtility {

	@Test
	public void testLoginWithoutClick() {
		driver = setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
		// Creating reference variable of JavascriptExecutor by casting from WebDriver
		// interface
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// identify the required element from the UI and perform required action 0-30
		WebElement element = driver.findElement(By.id("username"));
		js.executeScript("arguments[0].value='admin';", element);
		// or
		// js.executeScript("document.getElementById('username').value='admin';");

		// identify the required element from the UI and perform reqiored action 0-30
		// driver.findElement(By.id("password")).sendKeys("admin");
		js.executeScript("document.getElementById('password').value='admin';");
		// js.executeScript("document.getElementsByName('pwd').value='manager';");
		// identify the required element from the UI and perform reqiored action

		js.executeScript("document.getElementsByClassName('button buttonBlue')[0].click();");
		// close browser
		// driver.close();
	}
}