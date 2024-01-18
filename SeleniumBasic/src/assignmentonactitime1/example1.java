package assignmentonactitime1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// opening browser
		WebDriver driver = new ChromeDriver();
//maximizing screen
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//getting url
		driver.get("https://online.actitime.com/testing/login.do");

//find elements and send keys.
		driver.findElement(By.id("username")).sendKeys("tester01@vomoto.com");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		wait.until(ExpectedConditions.elementToBeClickable(By.id("logoutLink")));
		driver.findElement(By.id("logoutLink")).click();

		// close the browser.
		driver.close();

	}

}
