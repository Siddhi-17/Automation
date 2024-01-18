package day7assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// open browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// enter application url
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		// click on login button.
		driver.findElement(By.className("orangehrm-login-button")).click();

		// validate error message color
		WebElement requiredbtn = driver.findElement(By.className("oxd-input-field-error-message"));
		System.out.println("Required button font color: " + requiredbtn.getCssValue("color"));

		// Validate error below username input field

		WebElement username = driver.findElement(By.name("username"));
		Point usernamecords = username.getLocation();
		int username_Y = usernamecords.getY();

		System.out.println("username 'Y' cordinte: " + username_Y);

		WebElement required = driver.findElement(By.className("oxd-input-field-error-message"));
		Point requiredcords = required.getLocation();
		int required_Y = requiredcords.getY();

		System.out.println("required 'Y' cordinate: " + required_Y);

		System.out.println(
				"is 'required' error message is displayed below the username field? " + (username_Y < required_Y));

		// Get the username and password from UI
		String usernameis = "Admin";
		System.out.println("the username is: " + usernameis);
		// enter username and password in inputfield
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.className("orangehrm-login-button")).click();

	}

}
