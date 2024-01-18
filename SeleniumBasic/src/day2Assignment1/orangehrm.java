package day2Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangehrm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//find element
WebElement user=driver.findElement(By.className("oxd-input oxd-input--active"));
user.sendKeys("Admin");
WebElement password=driver.findElement(By.name("password"));
user.sendKeys("admin123");
}

}
