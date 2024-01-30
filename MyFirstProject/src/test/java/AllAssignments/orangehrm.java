package AllAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class orangehrm {
	@Test
	public void PIM() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		// login into the application
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.className("orangehrm-login-button")).click();

		// click on PIM button
		driver.findElement(By.xpath("//span[text()='PIM']")).click();

		// click on Add employee button
		driver.findElement(By.xpath("//a[text()='Add Employee']")).click();

		// enter the field (first name and last name)
		driver.findElement(By.name("firstName")).sendKeys("tara");
		driver.findElement(By.name("lastName")).sendKeys("singh");

		// save
		driver.findElement(By.className("orangehrm-left-space")).click();

		System.out.println("info saved sucessfully!!!!");

		// click on employee list
		driver.findElement(By.xpath("//a[text()='Employee List']")).click();

		// search for created account
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("tara singh");
		// click on search button
		driver.findElement(By.className("orangehrm-left-space")).click();

		// checkbox
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div/div[1]/div/div/label/span/i"))
				.click();

		// click on edit button
		driver.findElement(By.cssSelector(
				"#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.orangehrm-paper-container > div.orangehrm-container > div > div.oxd-table-body > div:nth-child(1) > div > div:nth-child(9) > div > button:nth-child(2) > i"))
				.click();

		// edit profile
		// driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div[1]/div/div/div[2]/div[2]/div[2]/input")).sendKeys("bb",Keys.ENTER);
		driver.findElement(By.name("firstName")).sendKeys("star");

		// driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div[2]/div/div/div[2]/input")).sendKeys("sonu");
		Thread.sleep(1000);
		// save changes
		// driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[5]/button")).click();

		// click on employee list
		driver.findElement(By.xpath("//a[text()='Employee List']")).click();

		// search for EDITED account
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("star singh");

		// click on search button
		driver.findElement(By.className("orangehrm-left-space")).click();

		driver.findElement(By.className("bi-trash")).click();
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[3]/button[2]")).click();
	}
}
