package multipleElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// open browser
				WebDriver driver = new ChromeDriver();
				// maximize browser window
				driver.manage().window().maximize();
				// implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				// enter application URL
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				//trying to identify username and password with single locator
				List<WebElement> elements=driver.findElements(By.className("oxd-input"));
				
				System.out.println("Identified element count: "+elements.size());
				System.out.println("1st Element is: "+elements.get(0).getAttribute("placeholder"));
				System.out.println("2st Element is: "+elements.get(1).getAttribute("placeholder"));
				
				elements.get(0).sendKeys("Admin");
				elements.get(1).sendKeys("admin123");
				
				driver.findElement(By.className("orangehrm-login-button")).click();
				
				driver.quit();
	}

}
