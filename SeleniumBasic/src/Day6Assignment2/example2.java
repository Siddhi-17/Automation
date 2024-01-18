package Day6Assignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Assignment2
		// * Check box and 'Keep me logged in' position validation
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://online.actitime.com/testing/login.do");

		// keep me login msg
		WebElement keepmelogin = driver.findElement(By.id("keepLoggedInLabel"));
		Point keepmelogincords = keepmelogin.getLocation();
		int keepmelogin_X = keepmelogincords.getX();

		System.out.println("keepmelogin 'X' cordinte: " + keepmelogin_X);

		WebElement checkbox = driver.findElement(By.name("remember"));
		Point checkboxcords = checkbox.getLocation();
		int checkbox_X = checkboxcords.getX();

		System.out.println("checkbox 'X' cordinate: " + checkbox_X);

		System.out.println("is checkbox is displayed before keepmelogin msg? " + (checkbox_X < keepmelogin_X));

	}

}
