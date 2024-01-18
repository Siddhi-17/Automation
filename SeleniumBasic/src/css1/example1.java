package css1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String title = driver.getTitle();
		System.out.println("the page title is: " + title);
		driver.findElement(By.className("orangehrm-login-button")).click();

//explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.className("oxd-input-field-error-message")));
		WebElement errormsg = driver.findElement(By.className("oxd-input-field-error-message"));

		System.out.println("the color of the error message is: " + errormsg.getCssValue("color"));
		System.out.println("the font size of the error message is: " + errormsg.getCssValue("font-size"));
		System.out.println("the font wait of the error message is: " + errormsg.getCssValue("font-weight"));

		System.out.println("*************************************************************************************");

		List<WebElement> UI = driver.findElements(By.cssSelector(
				"div.oxd-sheet.oxd-sheet--rounded.oxd-sheet--gutters.oxd-sheet--gray-lighten-2.orangehrm-demo-credentials>*:nth-child(1)"));
		List<WebElement> UI1 = driver.findElements(By.cssSelector(
				"div.oxd-sheet.oxd-sheet--rounded.oxd-sheet--gutters.oxd-sheet--gray-lighten-2.orangehrm-demo-credentials>*:nth-child(2)"));

		System.out.println("the 1st ui is: " + UI.get(0).getText());
		System.out.println("the 1st ui1 is: " + UI1.get(0).getText());

	}

}
