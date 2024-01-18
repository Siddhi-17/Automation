package day2Assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class vtiger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
//url
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
//locate and clear
		WebElement username = driver.findElement(By.id("username"));
		username.clear();
		username.sendKeys("admin");
		WebElement password = driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys("admin");
//WebElement loginbutton=driver.findElement(By.tagName("button"));
//loginbutton.click();
		driver.findElement(By.tagName("button")).click();
		driver.close();
	}

}
