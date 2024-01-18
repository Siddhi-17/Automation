package day5Assignment2;

import java.time.Duration;

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

		// maximise the screen
		driver.manage().window().maximize();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// url
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");

		// locate and clear
		WebElement username = driver.findElement(By.id("username"));
		username.clear();
		username.sendKeys("admin");
		WebElement password = driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys("admin");

		// click on login button
		driver.findElement(By.tagName("button")).click();

		// validate the home page
		String expectedhomepagetitleresult = "Dashboard";
		// need to use conditional wait as page title taking time to update
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.titleIs(expectedhomepagetitleresult));

		// actual title
		String actualhomepagetitleis = driver.getTitle();
		System.out.println("The actual homepage title is: " + actualhomepagetitleis);
		System.out.println("is login successful? " + actualhomepagetitleis.equals(expectedhomepagetitleresult));

		// signout
		driver.findElement(By.className("userName")).click();
		driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();

		driver.close();

	}

}
