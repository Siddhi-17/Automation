package day5Assignment22;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class cexample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.className("orangehrm-login-button")).click();
		String expectedpagetitileis = "OragneHRM";
		String actualpagetitleis = driver.getTitle();
		System.out.println("The expected page titile is: " + expectedpagetitileis);
		System.out.println("The actual page title is: " + actualpagetitleis);
		System.out.println("Is login successful? " + actualpagetitleis.equals(expectedpagetitileis));

		driver.findElement(By.className("oxd-userdropdown-img")).click();
		
		//
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		//wait.until(ExpectedConditions.elementToBeClickable(By.linkText("https://opensource-demo.orangehrmlive.com/web/index.php/auth/logout")));//0-20sec

		//driver.findElement(By.linkText("https://opensource-demo.orangehrmlive.com/web/index.php/auth/logout")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.className("oxd-userdropdown-link")));//0-20sec

		driver.findElement(By.className("oxd-userdropdown-link")).click();
	}

}
